package work2

fun main(){
    val person1 = Person(
        name = "Петр",
        category = "Коллеги",
        age = 38,
        phone = "+7885452479",
        mail = "petrV@mail.ru",
    )

    val person2 = Person(
        name = "Мама",
        category = "Семья",
        age = 58,
        phone = "+7880417325",
        mail = "elenMsk@mail.ru"

    )

    println(person1.name)
    println(person1.category)
    println(person1.age)
    println(person1.phone)
    println(person1.mail)
    println(person2.name)
    println(person2.category)
    println(person2.age)
    println(person2.phone)
    println(person2.mail)

    person2.inFavorites = true
    println(person2.inFavorites)

    println("Действие для контакта Мама")
    person2.addToFavorites()
    println(person2.inFavorites)
}