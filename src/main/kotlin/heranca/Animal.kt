package heranca

abstract class Animal(
    var nome: String,
    var idade: Int
) {
    abstract fun emiteSom()

    open fun locomocao(){
        println("O $nome corre! ")
    }
}