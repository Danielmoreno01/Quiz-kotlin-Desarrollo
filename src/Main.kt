fun main() {
    val productos = mutableListOf<Producto>()

    while (true) {
        println("\n--------------------BIENVENID@----------------------------" +
                "\n----------------------Menú----------------------- ")

        println("1. Agregar producto")
        println("2. Vender producto")
        println("3. Reponer stock")
        println("4. Aplicar 2% descuento ")
        println("5. Mostrar información de un producto")
        println("6. Aumentar precio")
        println("7. Calcular valor total en inventario")
        println("8. Eliminar producto por codigo")
        println("9. Salir")

        when (readln().toInt()) {
            1 -> {
                print("Codigo: ")
                val codigo = readln()
                print("Nombre: ")
                val nombre = readln()
                print("Precio: ")
                val precio = readln().toDouble()
                print("Cantidad en stock: ")
                val cantidadStock = readln().toInt()
                productos.add(Producto(codigo, nombre, precio, cantidadStock))
                println("Nuevo producto agregado.")
            }
            2 -> {
                print("Codigo del producto a vender: ")
                val codigo = readln()
                val producto = productos.find { it.cod == codigo }
                if (producto != null) {
                    print("Cantidad a vender: ")
                    val cantidad = readln().toInt()
                    producto.venderProducto(cantidad)
                } else {
                    println("Producto no encontrado.")
                }
            }
            3 -> {
                print("Cdigo del producto a reponer: ")
                val codigo = readln()
                val producto = productos.find { it.cod == codigo }
                if (producto != null) {
                    print("Cantidad a reponer: ")
                    val cantidad = readln().toInt()
                    producto.reponerStock(cantidad)
                } else {
                    println("Producto no encontrado.")
                }
            }
            4 -> {
                print("Codico del producto para aplicar descuento: ")
                val codigo = readln()
                productos.find { it.cod == codigo }?.aplicarDescuento() ?: println("Producto no encontrado.")
            }
            5 -> {
                print("Codiigo del producto a mostrar: ")
                val codigo = readln()
                productos.find { it.cod == codigo }?.mostrarproducto() ?: println("Producto no encontrado.")
            }
            6 -> {
                print("Codigo del producto para aumentar precio: ")
                val codigo = readln()
                productos.find { it.cod == codigo }?.aumentarPrecio() ?: println("Producto no encontrado.")
            }
            7 -> {
                print("Codigo del producto para calcular su valor en inventario: ")
                val codigo = readln()
                productos.find { it.cod == codigo }?.calcularValorInventario() ?: println("Producto no encontrado.")
            }

           /* 8 -> {
                print("Código del producto a eliminar: ")
                val codigo = readln()
                eliminar(codigo, productos)
            }
*/
            9 -> {
                println("----------------Gracias por visitarnos---------------------")
                break
            }
            else -> println("Opción no válida. Intente de nuevo.")
        }
    }
}
