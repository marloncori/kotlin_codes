class Lamp {

    private var isOn: Boolean = false
    fun turnOn(){
        isOn = true
    }

    fun turnOff(){
        isOn = false
    }

    fun displayStatus(lamp: String) {
        when(isOn){
            true -> println(" The LED $lamp is ON!")
            false -> println("\n The LED $lamp is OFF!")
        }
    }
}
