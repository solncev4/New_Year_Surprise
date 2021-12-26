fun main() {

    //Пополняйте список своими подарками
    val present = mutableListOf("",
        "Набор конфет",
        "Новогодние носки с оленями",
        "Худи",
        "Электрощетка(OralB)",
        "Имбирное новогоднее печенье",
        "Портативная колонка(JBL)",
        "Гуль - Старый Седой Дед Внутри",
        "Графический планшет",
        "3D-ручка"
    )
    while (true) {
        print("Выберите примерный бюджет для подарка: ")
        var money = readLine()!!.toInt()
        println("Советник по подаркам советует присмотреться к этим вариантам:\n ")
        /*when (money) {
            in 100..199 -> println(present[1])
            in 200..399 -> println(present[2])
            in 2600..4000 -> println(present[3])
            in 1900..2500 -> println(present[4])
            in 350..450 -> println(present[5])
            in 2000..5500 -> println(present[6])
            993 -> println("${present[7]} сказал:\n \"Всегда должен быть гуль\"\n*Вы стали гулем!*")
            in 1300..5000 -> println(present[8])
            in 2500..4100 -> println(present[9])
            else -> ("Советник по подаркам запутался.")

        }*/
        if(money in 100..199){println(present[1])}
        if(money in 200..399){println(present[2])}
        if(money in 2600..4000){println(present[3])}
        if(money in 1900..2500){println(present[4])}
        if(money in 350..450){println(present[5])}
        if(money in 2000..5500){println(present[6])}
        if(money ==(1000-7)){println(present[7])}
        if(money in 1300..5000){println(present[8])}
        if(money in 2500..4100){println(present[9])}
    }
}