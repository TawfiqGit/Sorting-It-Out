import tasks.BulletPuller
import tasks.LaunchDate

fun main() {
    val threadDate = Thread(LaunchDate())
    threadDate.start()
}