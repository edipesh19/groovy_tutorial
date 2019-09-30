// Ket value pair
// Unordered collection
['key' : 'value']

[:] // empty map

def employee = ['name' : 'john',
                 'age' : '35']

println employee
println employee.name
println employee['name']
println employee.get('age')
println employee.getAt('age')

println employee.size()

employee.put('Deepika', '35')
println employee.size()
// ContainesKey
// ContainesValue

println employee.getClass()

def emp2 = employee.clone()
println emp2

employee.each { k,v -> println "$k -> $v" }
// Each with Index

// entrySet
// clear