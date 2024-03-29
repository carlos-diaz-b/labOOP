package example.myapp



    interface FishColor {
        val color: String
    }
    interface FishAction {
        fun eat()
    }

    class Shark: FishAction, FishColor{
        override val color = "gray"
        override fun eat() {
            println("hunt and eat fish ")

        }

    }
        object Goldcolor : FishColor{
        override val color = "gold"

}
    class Plecostomus(fishColor: FishColor = Goldcolor):
        FishAction by PrintingFishAction("eat algae"),
            FishColor by fishColor




    class PrintingFishAction(val food : String): FishAction {
            override fun eat() {
                println(food)
            }


        }
    sealed class Seal
    class SeaLion : Seal()
    class Walrus : Seal()
        fun matchSeal(seal: Seal): String {
            return when (seal) {
            is Walrus -> "walrus"
            is SeaLion -> "sea lion"
    }
}







