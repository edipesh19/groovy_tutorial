def methodName(){
    println("Hello...")
}

methodName()

def sum(int a, int b = 2){ // Support default parameter value
    println "Sum is " + (a+b)
}
sum(10,20)
sum(10)

