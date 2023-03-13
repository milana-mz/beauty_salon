package domain

import java.math.BigDecimal

class GetAllPriceUseCase(private val repository: BeautySalonRepository) {
    fun get(): BigDecimal {
        return repository.getOrders().sumOf { getSumForServices(it.services) }
    }

    private fun getSumForServices(list: List<Service>): BigDecimal {
        return list.sumOf { it.price }
    }
}