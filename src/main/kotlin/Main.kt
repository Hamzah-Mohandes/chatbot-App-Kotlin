import kotlin.system.exitProcess

fun main() {
    val chatbot = Chatbot()

    // Starte den Chatbot
    chatbot.start()

    // Benutzereingabe zum Chatten
    println("Möchtest du chatten? (Ja/Nein)")
    val input = readln()

    if (input.equals("Ja", ignoreCase = true)) {
        chatbot.chat()
    } else {
        println("Auf Wiedersehen! Bis zum nächsten Mal.")
        exitProcess(0)
    }
}

class Chatbot {
    fun start() {
        println("Willkommen beim Chatbot!")
        // Initialisierung und Vorbereitung des Chatbots
    }

    fun chat() {
        println("Du kannst jetzt mit dem Chatbot chatten. Tippe 'Tschüss', um den Chat zu beenden.")

        while (true) {
            val userInput = readln()

            if (userInput.equals("Tschüss", ignoreCase = true)) {
                break
            }

            // Verarbeite die Benutzereingabe und generiere eine Antwort
            val response = generateResponse(userInput)
            println(response)
        }

        println("Der Chat wurde beendet. Auf Wiedersehen!")
    }

    private fun generateResponse(userInput: String): String {
        // Logik zur Generierung einer Antwort basierend auf der Benutzereingabe
        return "Antwort des Chatbots"
    }

    // Weitere Methoden und Eigenschaften des Chatbots
}
