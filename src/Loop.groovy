
// Java style for/while loop is also there apart from following style is also available

for(i in 1..5){
    println i
}

1.upto(5){
    println "${it}"
}

5.times { println "${it}" }

1.step(10,2){ println "${it}" }

for(i in [1,2,3,4,5,6,7,8,9,10]){
    println "$i"
}

def arr = (0..4).toArray()
for (i in arr){
    println i
}

// Iterate over Map
def map = ['abc':'Groovy', 'def':'Learning', 'ghi':'for gradle']
for(e in map){
    println  "$e.value"
}