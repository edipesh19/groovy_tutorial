
// '....'
// " ... "
// ''' ... ''' -> Multiline print
// """ ... """ -> Multiline print

// In Groovy String can beb accessed as array
def name = "Dipesh"
println name.length()
println name[2]
println name[-2]
println name[0..2]
println name[0,2,4]
println name.substring(2)
println name.subSequence(1, 4)
println name.charAt(3)
println name.indexOf('s')

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