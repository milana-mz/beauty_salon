package domain

import java.math.BigDecimal

class GetAllPriceUseCase(private val repository: BeautySalonRepository) {
    fun get(): Int {
        return repository.getOrders().sumOf { getSumForServices(it.services) }
    }

    private fun getSumForServices(list: List<Service>): Int {
        return list.sumOf { it.price }
    }
}