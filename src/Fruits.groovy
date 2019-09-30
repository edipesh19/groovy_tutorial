class Fruits {

    private String name
    private String color

    def setName(name){
        this.name = name
    }

    def setColor(color){
        this.color = color
    }


    String getName() {
        return name
    }

    String getColor() {
        return color
    }

    public static void main(String[] args) {
        Fruits f1 = new Fruits();
        f1.setColor("Green")
        f1.setName("Green Apple")

        println f1.getName()
        println f1.getColor()
    }
}
