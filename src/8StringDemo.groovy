
// '....'
// " ... "
// ''' ... ''' -> Multiline print
// """ ... """ -> Multiline print

// In Groovy String can be accessed as array
def name = "Dipesh"
println name.length() //6
println name[2] // p
println name[-2] // s
println name[0..2] // Dip
println name[0,2,4] // Dps
println name.substring(2) // pesh
println name.subSequence(1, 4) // ipe
println name.charAt(3) // e
println name.indexOf('s') // 4

def str = "This is groovy string"

def arr = str.split(" ")
println arr.getClass().getName()
println(arr)

println str-("groovy ")
 // replace
// lowerCase
// upperCase
// to List
// str*3
// equals
//  /..... /
//  $/ ...../$
def dd = "Dipesh"
def s1 = /This is my name $dd/ // -> Support Multiline also "" no need to use escape character used where regex is used
def s2 = $/This is my name $dd/$
println s1
println s2