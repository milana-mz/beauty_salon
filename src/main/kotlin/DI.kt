import data.BeautySalonDataSource
import data.BeautySalonDataSourceImpl
import data.BeautySalonRepositoryImpl
import data.Mapper
import domain.BeautySalonRepository
import domain.GetAllPriceUseCase
import domain.GetCostOfServicesByEmployee
import ui.BeautySalonAdater
import ui.StringFormatter

object DI {
    fun createDataSource(): BeautySalonDataSource = BeautySalonDataSourceImpl()

    fun createReository(): BeautySalonRepository = BeautySalonRepositoryImpl(createDataSource(), Mapper(createDataSource()))

    fun createGetAllPriceUseCase(): GetAllPriceUseCase = GetAllPriceUseCase(createReository())

    fun createGetCostOfServicesByEmployee(): GetCostOfServicesByEmployee = GetCostOfServicesByEmployee(createReository())

    fun createStringFormatter() = StringFormatter()

    fun createBeautySalonAdapter() = BeautySalonAdater(
            getAllPriceUseCase = createGetAllPriceUseCase(),
            stringFormatter = createStringFormatter(),
            getCostOfServicesByEmployee = createGetCostOfServicesByEmployee()

    )
}