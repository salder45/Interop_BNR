@file:JvmName("Hero")
fun main(args: Array<String>) {
    val adversary = Jhava()
    println(adversary.utterGreeting())

    val friendshipLevel = adversary.determineFriendshipLevel()
    println(friendshipLevel?.toLowerCase() ?: "It's complicated")

    val adversaryHitPoints: Int = adversary.hitPoints
    println(adversaryHitPoints.dec())
    println(adversaryHitPoints.javaClass)

    adversary.greeting = "Hello, Hero..."
    println(adversary.utterGreeting())

    adversary.offerFood()
}

fun makeProclamation() = "Greetings, beast"

@JvmOverloads
fun handOverFood(leftHand: String = "berries", rightHand: String = "beef"){
    println("Mmm... you hand over some delicious $leftHand and $rightHand")
}

class Spellbook{
    @JvmField
    val spells = listOf("Magic Ms. L", "Lay on Hans")

    companion object{
        @JvmField
        val MAX_SPELL_COUNT = 10

        @JvmStatic
        fun getSpellbookGreeting() = println("I am the Great Grimoire!")

    }
}