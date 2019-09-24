// Nested list is possible
// Heterogeneous list is possible

def fruits = ["Banaba", "Apple", "Mango"]

println fruits[1]
println fruits.get(2)

// Heterogeneous list

def hList = [1,2,3,["A", "B", "Groovy"],4]

println hList[2]
println hList[3][2]
println hList.get(3).get(2)

println hList[0..2]
println hList[4..2]

println hList.contains(2)
println hList.contains("Groovy") // false
println hList[3].contains("Groovy") // true
hList.add(10)
println hList

hList.add(2, 22)
println hList

hList.remove(2)
println hList

hList = hList+[30,40]
println hList

hList = hList.plus([50])
println hList

hList = hList.minus([30,40])
println hList

// Can be user as an stack

hList.pop()
println hList

hList.removeLast()
println hList

println hList.intersect([1,2,3])

hList = hList.reverse()
println hList

hList.sort()
println hList

println hList.isEmpty()

hList.clear()
println hList.isEmpty()
