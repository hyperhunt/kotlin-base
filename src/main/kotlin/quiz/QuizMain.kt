@file:Suppress("TYPE_INFERENCE_ONLY_INPUT_TYPES_WARNING")

package quiz

fun main() {
    val setOfWords = listOf(
        QuizDataClass("Awesome", "Потрясающий"),
        QuizDataClass("Word", "Слово"),
        QuizDataClass("Run", "Запустить"),
        QuizDataClass("Search", "Поиск"),
        QuizDataClass("Beanbag", "Погремушка"),
        QuizDataClass("Sleep", "Сон"),
        QuizDataClass("Winter", "Зима"),
        QuizDataClass("Time", "Время"),
        QuizDataClass("The sun", "Солнце"),
        QuizDataClass("Walk", "Гулять"),
        QuizDataClass("Nice", "Красивый"),
        QuizDataClass("Window", "Окно"),
        QuizDataClass("Walking", "Ходьба"),
        QuizDataClass("Bike", "Велосипед"),
        QuizDataClass("Programming", "Программирование"),
        QuizDataClass("Insect", "Насекомое"),
        QuizDataClass("Water", "Вода"),
        QuizDataClass("Sentence", "Предложение"),
        QuizDataClass("Paint", "Краска"),
        QuizDataClass("Learn", "Учиться"),
        QuizDataClass("Garden", "Сад"),
        QuizDataClass("Octopus", "Осминог"),
        QuizDataClass("Rust", "Ржавчина"),
        QuizDataClass("Sky", "Небо"),
        QuizDataClass("Crab", "Краб"),
        QuizDataClass("Singapore", "Сингапур"),
        QuizDataClass("Car", "Машина"),
    )

    val usedQuestions = mutableListOf<QuizDataClass>()

    val question = newQuestion(setOfWords, usedQuestions)
//    println(question)
//    println()
    val takeSetWords = takeSetWords(question, setOfWords)
//    takeSetWords.forEach { println(it) }
//    println(takeSetWords)
//    takeSetWords.forEach { println(it) }


}

fun takeSetWords(question: QuizDataClass, setOfWords: List<QuizDataClass>): List<QuizDataClass> {
    val setIncorrectWords = mutableListOf<QuizDataClass>()
    setIncorrectWords.add(question)
    var takeWord: QuizDataClass = setOfWords.random()
    while (setIncorrectWords.size < 4) {
//        println("takeWord: $takeWord")
//        println("question: $question")
        if (takeWord !in setIncorrectWords) {
            setIncorrectWords.add(takeWord)

        } else {
            takeWord = setOfWords.random()
        }
    }
    return setIncorrectWords.shuffled()
}

fun newQuestion(setOfWords: List<QuizDataClass>, usedQuestions: MutableList<QuizDataClass>): QuizDataClass {
    var question: QuizDataClass = setOfWords.random()
    while (question in usedQuestions) {
        question = setOfWords.random()
    }
    usedQuestions.add(question)
    return question
}

//    createNewQuestion(setOfWords, usedWords)
//    println()
//    createNewQuestion(setOfWords, usedWords)
//    println()
//    createNewQuestion(setOfWords, usedWords)
//    println()
//}
//
//fun createNewQuestion(setOfWords: List<QuizDataClass>, usedWords: MutableList<String>) {
//
//    var takeIncorrectWords = mutableListOf<String>()
//
//    var question = setOfWords.random().toString()
//    while (question in usedWords) {
//        question = setOfWords.random().toString()
//        println("+")
//    }
//    usedWords.add(question)
//    println(question)
//}


//fun takeNewWord(setOfWords: List<QuizDataClass>, usedWords: MutableList<String>): String {
//    var searchOfRandomWords = setOfWords.random().toString()

//    while (searchOfRandomWords in usedWords) {
//        println("+")
//        searchOfRandomWords = setOfWords.random().toString()
//    }
//    usedWords.add(searchOfRandomWords)
//    return searchOfRandomWords
//}

//fun createQuestion(numberOfQuestions: Int): MutableList<String> {

//    setOfCorrectWords.forEach { println(it) }
//    println()
//    val a = setOfCorrectWords.shuffled()
//    a.forEach { println(it) }

//}

fun genericNumber(badWords: List<String>) {
    val numberGeneric: Sequence<String> =
        generateSequence {
            badWords.random().toString()
        }
    numberGeneric.take(3).forEach { println(it) }
}