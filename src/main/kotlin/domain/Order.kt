package domain

data class Order(val id: Int, val client: Client, val services: List<Service>)