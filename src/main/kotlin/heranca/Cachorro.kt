package heranca

class Cachorro(nome: String, idade: Int) : Animal(nome, idade) {

    override fun emiteSom() {
        println("Au au au!")
    }

}