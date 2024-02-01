
class Prueba {
    var mensaje: String = "Mensaje vacío"
        //get() = "Esto es el get()" Si ponemos esto, siempre se va a printear esto, no se actualiza el campo
        get() = field
        set(value) {
            field = "Mensaje establecido por el set()"
        }
    }




fun main() {
    val p = Prueba()
    println(p.mensaje)
    p.mensaje = "Esto es un mensaje 1"
    println(p.mensaje)
}