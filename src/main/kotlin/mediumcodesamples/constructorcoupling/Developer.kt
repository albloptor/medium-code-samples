package mediumcodesamples.constructorcoupling

import kotlin.math.max

private const val MAX_ENERGY = 100
private const val MIN_ENERGY = 0
private const val ENERGY_EXPENDITURE = 20

class Developer(
    val name: String,
    var energy: Int
) {

    init {
        if (energy !in MIN_ENERGY..MAX_ENERGY) {
            throw EnergyOutOfRangeException()
        }
    }

    fun pretendToWork() {
        if (energy < ENERGY_EXPENDITURE) {
            throw TooTiredToEvenPretendToWorkException()
        }
        energy = max(energy - ENERGY_EXPENDITURE, MIN_ENERGY)
    }

    fun drinkCoffee() {
        energy = MAX_ENERGY
    }
}