package data

import domain.Client
import java.io.File

/*
*Класс для чтения из текстового файла
* должен возвращать список строк (List<String>) где каждая строчка файла является элементом списка
*
* */

class TextFileLoader {

    fun readFile(): MutableList<Client> {
        val filename = "C:\\Users\\molova.mz\\Documents\\beauty\\src\\main\\kotlin\\service.csv"
        val file = File(filename)

        val clients = mutableListOf<Client>()

        file.bufferedReader().use { reader ->
            var line: String?
            while (reader.readLine().also { line = it } != null) {
                val fields = line!!.split(";")

                val client = Client(fields[0].toInt(), fields[1], fields[2].toInt())
                clients.add(client)
            }
        }

        return clients
    }
}