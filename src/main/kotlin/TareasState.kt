package pm_ud1_proyecto.main.kotlin

//No se debe modificar
data class TareasState(
    val tareas: List<Tarea> = emptyList(),
    val pendientes: Int = 0
)