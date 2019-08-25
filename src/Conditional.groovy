def x = 1.1
switch (x) {
    case 0:
        println "X is zero"
        break
    case {x > 0}:
        println "X is +ve" // Condition can be evaluated in groovy switch case
        break;
    case {x < 0}:
        println "X is -ve"
        break
    default:
        println "X is invalid"
}

