
package org.example


class Persona(private var nombre: String, private var apellido: String, private var edad: Int) {
    override fun toString(): String { 
        return "Persona( nombre=${nombre}, apellido=${apellido}, edad=${edad})" 
    } 
}
fun main(){
    val pers=Persona("Bautista", "Chiaramonte", 16) 
    println(pers)
}