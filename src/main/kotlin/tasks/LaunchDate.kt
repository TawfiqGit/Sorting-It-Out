package tasks

import java.util.*

class LaunchDate : TimerTask() {

    private val timeJours = (1000 * 60 * 60 * 24).toLong()
    private val timeSemaine = timeJours * 7
    private val timeMois = timeSemaine * 30
    private val timeAnnee = timeMois * 12

    override fun run() {
        println("jours $timeJours")
        println("semaine $timeSemaine")
        println("mois  $timeMois")
        println("annee  $timeAnnee")

        println("Debut execution tache " + Date())
        try {
            Thread.sleep(1000)//1 s
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }

        val thread = Thread(BulletPuller())
        thread.start()
        println("Fin execution tache " + Date())
    }
}