// Functional programming
/**
 * Closures are Block of code that can
 *  - take parameter
 *  - refer variable
 *  - return values
 *  - can be passed as parameter
 */

def str = "Hello "
// Closure that referring variable
def myClouser1 = {println "$str"}

// Closure that take parameter
def myClouser2 = {name -> println "$str $name"}

// Closure that return values
def addClouser = {a,b,c -> return (a+b+c)}

myClouser1.call()

myClouser2.call("Dipesh")


// Pass clouser to a method as argument

def method1( c){
    c.call("Dipesh")
}

method1(myClouser2)



def method2( c){
    println c.call(10,20,30)
}
method2(addClouser)