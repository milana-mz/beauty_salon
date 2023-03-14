package domain

enum class Skills (val title: String){
    HAIRDRESSER ("Парикмахер"),
    MANICURIST ("Маникюрщица"),
    EYERBOWS ("Бровист"),
    MAKEUPARTIST ("Визажист");

    companion object {
        fun from(source: String): Skills {
            return values().firstOrNull { it.name == source } ?: HAIRDRESSER
        }
    }

}