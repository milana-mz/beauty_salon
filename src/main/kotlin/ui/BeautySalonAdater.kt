package ui

import domain.GetAllPriceUseCase
import domain.GetCostOfServicesByEmployee
import domain.Service

class BeautySalonAdater(
        private val getAllPriceUseCase: GetAllPriceUseCase,
        private val stringFormatter: StringFormatter,
        private val getCostOfServicesByEmployee: GetCostOfServicesByEmployee
) {
    fun getAllPrice() = stringFormatter.format(
            ALL_PRICE, arrayOf(getAllPriceUseCase.get())
    )

    fun getServiceCost(services: List<Service>) = stringFormatter.format(
            SERVICES_COST, arrayOf(getCostOfServicesByEmployee.calculateServicesCostByEmployee(services))
    )

    companion object {
        private const val ALL_PRICE = "Общая стоимость оказанных услуг %d"
        private const val SERVICES_COST = "Работник оказал услуги стоиммостью %d"
    }
}