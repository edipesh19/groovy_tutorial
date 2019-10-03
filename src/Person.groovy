class Person {
    String theName;
    int age

    Person(String theName, int age) {
        this.theName = theName
        this.age = age
    }

    def executeInside(Closure c){
        c.delegate = this // Delegate is the context of the closure
        c()
    }

    public static void main(String[] args) {
        Person p1 = new Person("Dipesh", 35)
        p1.executeInside {println theName}
    }
}
