package org.example.webfluxtest

class CatDto(private val name: String, private var age: Int) {
    fun toEntity(): Cat = Cat(0, name, age);
}
