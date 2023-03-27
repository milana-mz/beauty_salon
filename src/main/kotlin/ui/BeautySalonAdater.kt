package ui

import domain.EmployeePriceData
import domain.GetAllPriceUseCase
import domain.GetCostOfServicesByEmployeeUseCase
import domain.Service

class BeautySalonAdater(
        private val getAllPriceUseCase: GetAllPriceUseCase,
        private val stringFormatter: StringFormatter,
        private val getCostOfServicesByEmployeeUseCase: GetCostOfServicesByEmployeeUseCase
) {
    fun getAllPrice() = stringFormatter.format(
            ALL_PRICE, arrayOf(getAllPriceUseCase.get())
    )

    fun getServiceCost(service: List<Service>): List<String> = getCostOfServicesByEmployeeUseCase.calculateServicesCostByEmployee(service).map {
        stringFormatter.format(SERVICES_COST, arrayOf(it.name, it.price))
    }

    companion object {
        private const val ALL_PRICE = "Общая стоимость оказанных услуг %d"
        private const val SERVICES_COST = "Работник %s оказал услуги стоиммостью %d"
    }
}