// Read file
String filePath = "file.txt"
File file = new File(filePath)

println file.text

// Collect lines into List
def list = file.collect {it}

println list


// Store File contents into an array
def array = file as String[]
println array


// Read files as lined readLines
// Read line by line
file.eachLine {line -> println line}

// withReader

// newReader -> Manually close the file
def outputFile = 'data2.txt'
def reader = file.newReader()
new File(outputFile).append(reader)
reader.close()


// When working with Binary files
byte[] contents = file.bytes
println contents

// Check if is a file or dir
// isFile
// isDirectory
// eachFile, eachFileRecurse

// Copy file data in to another file
// newFile << oldFile.text

// newFile.delete()
