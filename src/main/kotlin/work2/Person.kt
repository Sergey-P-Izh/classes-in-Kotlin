package work2

class Person (
    val name: String,
    var category: String,
    val age: Int,
    val phone: String,
    val mail: String,
    var inFavorites: Boolean = false,
        ) {

    fun addToFavorites(){
        println("Контакт $name добавлено в избранное")
        inFavorites = true
    }
    fun removeFromFavorites(){
        println("Контакт $name удалено из избранного")
        inFavorites = false
    }
}
