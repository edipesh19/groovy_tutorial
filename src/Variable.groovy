
    def name = "Dipesh"
    name=10 // type can be changes dynamically so groovy is dynamic typing language
    println "Name is ${name}"
    println 'Name is ${name}' // No Substitute

    def (a,b,c) = [10,20,30] // Multiple assignment
    println "${a} \t ${b} \t ${c}"

    def (String x,int y,double z) = [10,20,30] // Multiple assignment with type
    println "${x} \t ${y} \t ${z}"
