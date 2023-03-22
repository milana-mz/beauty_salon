package data

data class OrderDto(val id: Int, val clientId: Int, val services: List<ServiceDto>)