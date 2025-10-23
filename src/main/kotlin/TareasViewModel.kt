package pm_ud1_proyecto.main.kotlin

class TareasViewModel {

    //No se debe modificar
    private var _uiState: TareasState = TareasState()
    //No se debe modificar
    val uiState: TareasState
        get() = _uiState

    /**
     * Agrega una tarea a la lista de tareas.
     * Para ello se utiliza una copia de la lista (función copy) de tareas actual
     * y se agrega la nueva tarea al _uiState
     *
     * @param tarea La tarea que se va a agregar.
     */
    fun agregarTarea(tarea: Tarea) {
        // Creamos una nueva lista con la tarea añadida al final
        // Como _uiState.tareas es inmutable, no podemos usar add directamente
        val nuevasTareas = _uiState.tareas + tarea

        // Actualizamos _uiState con la nueva lista y recalculamos pendientes
        // La función copy crea una copia del data class y permite modificar solo los campos indicados
        _uiState = _uiState.copy(
            tareas = nuevasTareas,
            pendientes = contarPendientes(nuevasTareas)
        )
    }

    /**
     * Marca una tarea como completada.
     * Para ello se utiliza una copia de la lista (función copy) de tareas actual
     * y se marca la tarea con el id proporcionado como completada en el _uiState
     *
     * @param id El id de la tarea que se va a marcar como completada.
     */
    fun completarTarea(id: Int) {
        // Crear una nueva lista mutable para modificarla añadiendo las tareas
        // Recorremos la lista actual y modificamos la tarea con el id dado
        val nuevasTareas = mutableListOf<Tarea>()
        for (item in _uiState.tareas){
            if(item.id == id){
                nuevasTareas.add(item.copy(completada = true))
            }
            nuevasTareas.add(item)
        }

        // Actualizar el estado con la nueva lista y recalcular pendientes
        _uiState = _uiState.copy(
            tareas = nuevasTareas,
            pendientes = contarPendientes(nuevasTareas)
        )
    }

    /**
     * Elimina una tarea de la lista de tareas.
     * Para ello se utiliza una copia de la lista (función copy) de tareas actual
     * y se elimina la tarea con el id proporcionado en el _uiState
     *
     * @param id El id de la tarea que se va a eliminar.
     */
    fun eliminarTarea(id: Int) {
        // Filtrar la lista para eliminar la tarea con el id dado
        // it representa cada tarea en la lista
        val nuevasTareas = _uiState.tareas.filterNot { it.id == id }

        // Actualizar el estado con la lista resultante y recalcular pendientes
        _uiState = _uiState.copy(
            tareas = nuevasTareas,
            pendientes = contarPendientes(nuevasTareas)
        )
    }

    /**
     * Contabiliza el numero de tareas pendientes en la lista de tareas dada.
     * Una tarea se considera pendiente si no ha sido completada.
     *
     * @param tareas La lista de tareas que se va a contar.
     * @return El numero de tareas pendientes.
     */
    private fun contarPendientes(tareas: List<Tarea>): Int {
        // Contar cuántas tareas tienen completada == false
        return tareas.count { !it.completada }
    }
}