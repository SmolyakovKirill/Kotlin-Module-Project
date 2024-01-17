import java.util.Scanner

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    while (true){
        println("1.Выбрать архив\n2.Создать архив\n3.Выйти из программы")

        when(scan.nextLine().toInt()){
            1 -> selectArch()
            2 -> createArch()
            3 -> break
        }

    }
}

fun selectArch(){

    val scan = Scanner(System.`in`)

    while (true) {
        println("1.Выбрать заметку\n2.Создать заметку\n3.Выйти в главное меню")
        when (scan.nextLine().toInt()) {
            1 -> selectNote()
            2 -> createNote()
            3 -> break
        }
    }
}

fun createArch(){
    println("Создать архив")
}

fun selectNote() {
    val scan = Scanner(System.`in`)
    println("Просматриваем содержимое заметки")
    while (true) {
        when (scan.nextLine().toInt()) {
            1 -> break
        }
    }
}

fun createNote(){
    println("Создаем заметку")
}