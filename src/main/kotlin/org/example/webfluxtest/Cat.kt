package org.example.webfluxtest

data class Cat(private val id: Long, private val name: String, private var age: Int) {
    fun getName(): String {
        return name
    }

    fun getAge(): Int {
        return age
    }
    fun getId(): Long {
        return id
    }

    fun setAge(newAge: Int) {
        age = newAge
    }

    fun toDto(): CatDto = CatDto(name, age);
}