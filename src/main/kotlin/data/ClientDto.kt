package data

data class ClientDto(val id: Int, val name: String, val age: Int)
//{
//    companion object {
//        fun fromCsvRecord(record: Array<String>): ClientDto {
//            return ClientDto(
//                    id = record[0].toInt(),
//                    name = record[1],
//                    age = record[2].toInt()
//            )
//        }
//    }
//}