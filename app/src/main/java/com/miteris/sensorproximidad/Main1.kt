package com.miteris.sensorproximidad

class Main1 {
}

/*1. ¿Cuáles de las siguientes son cajas de la arquitectura de Android?
ª- Kernel de linux, Android Runtime, Librerías y Aplicaciones
- Kernel, capa de red, Aplicaciones
- Controler, View - layouts
- Capa de datos, capa de transporte, capa de aplicaciones

2. En él se integran las librerías multimedia de Android.
ª- SDK
- KDS
- DSK
- SKD

3.- ¿En que directorios podemos almacenar ficheros de imágenes para poder ser cargadas desde el código de una activity?
- res/draw
ª- res/drawable
- src/values/images
- ninguna es correcta

4. ¿Dónde y qué propiedades debemos declarar para hacer uso de la cámara?
ª- En el Android Manifest y la propiedad <uses-permission android:name=’android.permission.CAMERA”/>**
- En el values xml y la propiedad <uses-permission android:name=’android.permission.CAMERA”/>
- En el Android Manifest <uses-permission android:name=’android.permission.CAMERA”/>
- En el layout y <uses-permission android:name=’android.permission.CAMERA”/>

5. ¿Cuál es la ruta completa en el que se ubica el archivo de cadenas para internacionalización con el que un proyecto de Android puede brindar compatibilidad con diferentes idiomas y culturas?
ª- /res/values/strings.xml
- /res/values/lang/strings.xml
- /res/layout/strings.xml
- /res/xml/strings.xml


6.- Un toast es…
un Widget de interfaz de usuario que aparece en la pantalla durante algún tiempo en la barra de notificación
un Widget de interfaz de usuario que no aparece en la pantalla en forma de notificación
un Widget de interfaz de usuario que bloquea la pantalla durante algún tiempo en forma de notificación
ªun Widget de interfaz de usuario que aparece en la pantalla durante algún tiempo en forma de notificación

7. La propiedad width:
ªSirve para controlar el ancho
Solo puede tener los valores 0 y 1
Sirve para comprobar el alto
A y C son correctas

8. La capa de Linux Kernel…
es la capa donde se maneja toda la magia de nuestras apps con el S.O Android
es la capa más baja. Se encarga de manejar toda la compatibilidad entre software
ªes la capa más baja. Se encarga de manejar toda la compatibilidad entre hardware
es la última capa, donde actúa el usuario final


9.- ¿Cual de las siguientes afirmaciones es verdadera respecto de brindar seguridad de valores nulos en kotlin?
En kotlin no existe ·nulo”
ºDe forma predeterminada, las variables de kotlin no pueden contener valores nulos
ºSi quieres que una variable retenga un valor nulo usa “?” en el tipo de datos para especificar que es de un tipo que acepta valores nulos
En kotlin, nulo significa 0 para valores enteros o una string vacía para strings
ºEl compilador de Kotlin nos obliga a comprobar si una variable está definida como NULLable o que pueda ser nula antes de emplear una propuesta o método de la misma


10. Supongamos que declaraste una función en Kotlin que contiene valores predeterminados para sus tres parámetros. ¿Cuál de las siguientes afirmaciones es verdadera para llamar a una función como esta?
ºPodrás llamar a la función sin argumentos
ºPodrás llamar a la función con parte de los parámetros y usar argumentos con nombre.
ºPodrás llamar a la función con todos los argumentos presentes
No se compilará la declaración de la función, por lo que no podrás llamar a esa función

11.Señala las afirmaciones correctas
ºUn layout puede contener a otro layout
ºSi queremos combinar varios elementos de tipo vista tendremos que aplicar un objeto de tipo layout
No es necesario utilizar layouts para crear una vista
ºEstos componentes extienden a la clase base ViewGroup


12.- Asset Studio te permite
ºCrear iconos de aplicación adaptativos con todas las resoluciones de dispositivos
ºCrear iconos de notificaciones igualmente adaptativos
ºCrear iconos para botones igualmente adaptativos
Diseñar los layouts personalizados


13. Las data class en Kotlin…
ºa diferencia de una clase normal esta no lleva llaves y la clase va procedida por <data>
ºson sencillas pero Kotlin por detrás nos ha generado funciones para poder recuperar el valor de cada uno de los atributos, sustituirlos, compararlos…
no existen
es una clase que contiene solamente atributos y métodos


14.- Para un recicled View necesitamos
Un layout base, un layout de detalle y un content_provider
ºUn layout base, un Layout de detalle y un adapter
Un layout base un layout de detalle y un adapter
Varios Layout y un recicled_view

15. Señala todas las afirmaciones correctas
Todos los permisos son del mismo nivel y se tratan por igual
ºLos permisos se declaran en el AndroidManifest
Los permisos se declaran en el AndroidPermissions
ºEl diálogo que pide permisos no se puede manipular

16.- ¿Como sería el listener de myButton?
ºmyButton.setOnClickListener ( //La acción que quisieramos hacer )
myButton.setOnClickListener {  //La acción que quisieramos hacer }
myButton.OnClickListener {  //La acción que quisieramos hacer }
myButton.OnClickListener (  //La acción que quisieramos hacer )

17.¿Cuáles serían las dos formas correctas de colocar un color de fondo a un botón?
ºapp:background=”@color/design_default_color_secondary”
app:backgroundColor=”@color/design_default_color_secondary”
ºapp:background=”#112233”
app:backgroundColor=”112233”


18.- ¿Un Data Picker es?
en el layout se añade un data_picker
ºen el layout se añade un textView
en el layout no hace falta añadir nada especial
el layout no tiene que ser de tipo data_picker

19. ¿Cuál sería el resultado de esta operación?
var c: Float = 10.5f
var d: Int= 5
var resultado = c + d
Daría error no se pueden sumar
º15.5
10
10.10

20.- ¿Cuales son formas correctas de declarar una lista mutable con los días de las semana?
val mutableList: List<String> = listOf{“Lunes”, “Martes”, “Miércoles”, “Jueves”, “Viernes”, “Sábado”, “Domingo”}
ºvar mutableList: MutableList<String> = mutableListOf{“Lunes”, “Martes”, “Miércoles”, “Jueves”, “Viernes”, “Sábado”, “Domingo”}
ºvar mutableListx = mutableListOf{“Lunes”, “Martes”, “Miércoles”, “Jueves”, “Viernes”, “Sábado”, “Domingo”}
mutableList.add{“Lunes”, “Martes”, “Miércoles”, “Jueves”, “Viernes”, “Sábado”, “Domingo”}

21. ¿Qué resultado se imprimirá?
var month = 1
val response: String = when (month) {
	in 1..6 → “Primer Semestre”
	in 7..12 → “Segundo Semestre”
	in1..12 →  “no es un mes válido”
	else → “error”
}
println(response)
No compilará
Error
ºPrimer semestre
No es un mes válido

22.- Los arrays….
º…son secuencias de datos, del mismo tipo e identificados por un nombre común
…son secuencias de datos, del distinto tipo e identificados por un nombre común
…son secuencias de datos, del mismo tipo e identificados por diferentes nombres
…son secuencias de datos, del distinto tipo e identificados por diferentes nombres


1
fun ticketPrice(age: Int, isMonday: Boolean): Int {
    return when(age) {
        in 0..12 -> 15
        in 13..60 -> if (isMonday) 25 else 30
        in 61..100 -> 20
        else -> -1
    }

2
class FoldablePhone(var isFolded: Boolean = true): Phone() {
    override fun switchOn() {
        if (!isFolded) {
            isScreenLightOn = true
        }
    }

    fun fold() {
        isFolded = true
    }

    fun unfold() {
        isFolded = false
    }
}

fun main() {
    val newFoldablePhone = FoldablePhone()

    newFoldablePhone.switchOn()
    newFoldablePhone.checkPhoneScreenLight()
    newFoldablePhone.unfold()
    newFoldablePhone.switchOn()
    newFoldablePhone.checkPhoneScreenLight()
}

 */
