fun main(args: Array<String>) {
//   11.7 Заполнить коллекцию из двадцати элементов так, как представлено "20 , 19 ,....1"
    // Первый способ
    var list = mutableListOf<Int>()
    list.add(20)
    list.add(19)
    list.add(18)
    list.add(17)
    list.add(16)
    list.add(15)
    list.add(14)
    list.add(13)
    list.add(12)
    list.add(11)
    list.add(10)
    list.add(9)
    list.add(8)
    list.add(7)
    list.add(6)
    list.add(5)
    list.add(4)
    list.add(3)
    list.add(2)
    list.add(1)

    println(list)
    println()
// Второй способ
    var list20 = mutableListOf<Int>()
    var i =20
    while (i>=1){
        list20 +=i
        i--
    }
    println(list20)
    println()
    }






