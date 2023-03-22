import data.BeautySalonDataSource
import data.BeautySalonDataSourceImpl
import domain.BeautySalonRepository
import domain.Client
import domain.GetAllPriceUseCase
import domain.Service
import ui.BeautySalonAdater
import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.io.InputStream

fun readCsv(inputStream: InputStream): List<Client> {
    val reader = inputStream.bufferedReader()
    val header = reader.readLine()
    return reader.lineSequence()
            .filter { it.isNotBlank() }
            .map {
                val (id, name, age) = it.split(',', ignoreCase = false, limit = 3)
                Client(id.trim().toInt(), name.trim().removeSurrounding("\""), age.trim().toInt())
            }.toList()
}
fun main() {
//    val adapter = DI.createBeautySalonAdapter()
//    val dataSource = BeautySalonDataSourceImpl()
//    println(adapter.getAllPrice())
//    println(dataSource.csv())
    val file = "clients.csv"
    val movies = readCsv(File (file).inputStream())
    movies.forEach{ println(it) }

}