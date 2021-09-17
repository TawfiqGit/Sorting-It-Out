package tasks

fun createListBall(numberBall : Int ): Array<Int> {
    val listBall = Array(numberBall){0}
    for (x in 0 until numberBall)
        listBall[x] = x
    return listBall
}

fun rand(start: Int, end: Int): Int {
    require(start <= end) { "Illegal Argument" }
    return (start..end).random()
}

class BulletPuller : Runnable {

    override fun run() {
        val listCreateBall = createListBall(60)
        val listRacks = mutableListOf<Int>()

        for (i in 0 until rand(0,15)){
            listRacks.add(i,listCreateBall.random())
            println("position "+i+" list "+listRacks.get(i))
        }
        println(mutableListOf(listRacks))
    }
}