// Used to create a list of sequential values
// 2 types 1. Inclusive 1..10 2. Exclusive 1..<10
 def range = 1..10

println range

println range.size()

println range.getFrom()
println range.getTo()

println range.get(3)

println range[3]

println range.contains(5)

println range.isReverse()

def range2 = range.subList(3, 7)

println range2.getFrom()
println range2.getTo()

for (i in 1..10) {
 println i
}

for (i in range) {
 println i
}
