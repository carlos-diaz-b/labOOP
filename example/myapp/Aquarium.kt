package example.myapp

open class Aquarium( open var length: Int = 100, open var  width: Int = 20, open var  height: Int = 40) {

    open val shape = "rectangle"

    open var water: Double = 0.0
        get() = volume * 0.9


    open var volume: Int
        get() = width * height * length / 1000
        set(value){
            height = (value * 1000) / (width * length)
        }

    init {
            println("aquarium initialize")
        }


    fun printSize(){
        println(shape)
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm ")
        println("Volume $volume l ")
        println("Volume: $volume l Water: $water l (${water/volume*100.0}% full)")

    }

    constructor(numberofFish: Int) : this() {
        val tank = numberofFish * 2000 * 1.1
        height = (tank / (length * width)).toInt()


    }



}