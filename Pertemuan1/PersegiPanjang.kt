class PersegiPanjang(private val panjang: Int, private val lebar: Int) {
    fun hitungLuas(): Int {
        return panjang * lebar
    }

    fun hitungKeliling(): Int {
        return 2 * (panjang + lebar)
    }
}

fun main() {
    print("Panjang: ")
    val panjang = readLine()?.toIntOrNull() ?: 0

    print("Lebar: ")
    val lebar = readLine()?.toIntOrNull() ?: 0

    val persegiPanjang = PersegiPanjang(panjang, lebar)

    println("Luas: ${persegiPanjang.hitungLuas()}")
    println("Keliling: ${persegiPanjang.hitungKeliling()}")
}