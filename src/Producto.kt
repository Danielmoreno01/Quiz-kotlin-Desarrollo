class Producto {
    var cod: String = ""
    var name: String = ""
    var price: Double = 0.0
    var stock: Int = 0


    constructor(codigo: String, nombre: String, precio: Double, cantidadStock: Int) {   //opcion 1 crear producto
        this.cod = codigo
        this.name = nombre
        this.price = precio
        this.stock = cantidadStock
    }

    fun venderProducto(cantidad: Int) {  //op2
        if (stock >= cantidad) {
            stock -= cantidad
            println("Se vendieron $cantidad unidades de $name. Stock : $stock")
        } else {
            println("Stock insuficiente para vender $cantidad unidades de $name.")
        }
    }

    fun reponerStock(cantidad: Int) { //op3
        stock += cantidad
        println("Se repusieron $cantidad unidades de $name. Stock actual: $stock")
    }

    fun aplicarDescuento() {  //op4
        price *= 0.98
        println("Se aplicó un descuento del 2% a $name. Nuevo precio: $price")
    }

    fun mostrarproducto() {      //op5
        println("Código: $cod, Nombre: $name, Precio: $price, Stock: $stock")
    }

    fun aumentarPrecio() {   //op6
        price *= 1.06
        println("Se aumentó el precio en un 6% a $name. Nuevo precio: $price")
    }

    fun calcularValorInventario(): Double {   //op7
        val total = stock * price
        println("Valor total en inventario de $price: $total")
        return total
    }

    fun eliminar (codigo: String, productos: MutableList<Producto>) {
        val iterator = productos.iterator()
        while (iterator.hasNext()) {
            val producto = iterator.next()
            if (producto.cod == codigo) {
                iterator.remove()
                println("Producto con código $codigo eliminado.")
                return
            }
        }
        println("No se encontró un producto con código $codigo.")
    }

}
