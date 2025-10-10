package pm_ud1_proyecto.test.kotlin

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import pm_ud1_proyecto.main.kotlin.Tarea
import pm_ud1_proyecto.main.kotlin.TareasViewModel

class TareasViewModelTest {
    private val tarea1 = Tarea(id = 1, descripcion = "Estudiar para el examen", completada = false)
    private val tarea2 = Tarea(id = 2, descripcion = "Sacar al perro", completada = false)
    private val tarea3 = Tarea(id = 3, descripcion = "Comprar pan", completada = false)

    @Test
    fun testAgregarTarea() {
        val viewModel = TareasViewModel()
        viewModel.agregarTarea(tarea1)
        viewModel.agregarTarea(tarea2)
        viewModel.agregarTarea(tarea3)

        assertEquals(3, viewModel.uiState.tareas.size)
    }

    @Test
    fun testCompletarTarea() {
        val viewModel = TareasViewModel()
        viewModel.agregarTarea(tarea1)
        viewModel.agregarTarea(tarea2)
        viewModel.agregarTarea(tarea3)

        viewModel.completarTarea(2)

        assertEquals(1, viewModel.uiState.tareas.count { it.completada })
    }

    @Test
    fun testEliminarTarea() {
        val viewModel = TareasViewModel()
        viewModel.agregarTarea(tarea1)
        viewModel.agregarTarea(tarea2)
        viewModel.agregarTarea(tarea3)

        viewModel.eliminarTarea(3)

        assertEquals(2, viewModel.uiState.tareas.size)
        assertEquals(tarea1, viewModel.uiState.tareas[0])
        assertEquals(tarea2, viewModel.uiState.tareas[1])
    }
}

