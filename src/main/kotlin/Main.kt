import ui.BeautySalonAdater
import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.io.InputStream
import com.opencsv.CSVReader
import com.opencsv.CSVReaderBuilder
import data.*
import domain.*

fun main() {
    val adapter = DI.createBeautySalonAdapter()
    val service = listOf<Service>()
    println(adapter.getAllPrice())
    println(adapter.getServiceCost(service))
    val filename = "C:\\Users\\molova.mz\\Documents\\beauty\\src\\main\\kotlin\\client.csv"
//    val content = File(filename).readText()
//    content.split(",")
//    val lines = content.split(";")
//    println(content)
//    println(lines)

    val file = File(filename)

    val people = mutableListOf<Client>()

    file.bufferedReader().use { reader ->
        // Читаем каждую строку файла
        var line: String?
        while (reader.readLine().also { line = it } != null) {
            // Разбиваем строку на отдельные поля
            val fields = line!!.split(";")

            // Создаем объект класса Person и добавляем его в список
            val person = Client(fields[0].toInt(), fields[1], fields[2].toInt())
            people.add(person)
        }
    }

    // Выводим список людей
    println(people)

}