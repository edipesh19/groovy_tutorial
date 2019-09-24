// byte
println "============= byte ============="
byte b = 10
println b
println Byte.MIN_VALUE
println Byte.MAX_VALUE

println "============= short ============="
// short
short s = 100
println s
println Short.MIN_VALUE
println Short.MAX_VALUE

println "============= integer ============="
// Integer
int i = 1000
println i
println Integer.MIN_VALUE
println Integer.MAX_VALUE

println "============= long ============="
// Long
long l = 1000
println l
println Long.MIN_VALUE
println Long.MAX_VALUE

println "============= float ============="
//float
float f = 100.002F
println f
println Float.MIN_VALUE
println Float.MAX_VALUE

println "============= double ============="
// Double
double d = 1000.00001
println d
println Double.MIN_VALUE
println Double.MAX_VALUE

println "============= char ============="
char c = 'A'
println c

println "============= boolean ============="
boolean flag = true
println flag

println "============= String ============="
String str = "Hello World"
println str

println "============= dynamic data type ============="
def dyn = (byte)10
println dyn.getClass().getName()