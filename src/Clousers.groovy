// Functional programming

def str = "Hello "
def myClouser1 = {println "$str"}
myClouser1.call()

def myClouser2 = {name -> println "$str $name"}
myClouser2.call("Dipesh")


// Pass clouser to a method as argument

def method1( c){
    c.call("Dipesh")
}

method1(myClouser2)

def addClouser = {a,b,c -> return (a+b+c)}

def method2( c){
    println c.call(10,20,30)
}
method2(addClouser)