package pm_ud1_proyecto.main.kotlin

//No se debe modificar
fun main() {
    val viewModel = TareasViewModel()

    viewModel.agregarTarea(Tarea(id = 1, descripcion = "Estudiar para el examen"))
    viewModel.agregarTarea(Tarea(id = 2, descripcion = "Sacar al perro"))
    viewModel.agregarTarea(Tarea(id = 3, descripcion = "Comprar pan"))

    println(viewModel.uiState)

    viewModel.completarTarea(2)
    viewModel.eliminarTarea(3)

    println(viewModel.uiState)
}