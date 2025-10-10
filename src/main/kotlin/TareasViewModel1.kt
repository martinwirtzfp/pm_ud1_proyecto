package pm_ud1_proyecto.main.kotlin

class TareasViewModel1 {

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
        throw UnsupportedOperationException("A completar por el estudiante")
    }

    /**
     * Marca una tarea como completada.
     * Para ello se utiliza una copia de la lista (función copy) de tareas actual
     * y se marca la tarea con el id proporcionado como completada en el _uiState
     *
     * @param id El id de la tarea que se va a marcar como completada.
     */
    fun completarTarea(id: Int) {
        throw UnsupportedOperationException("A completar por el estudiante")
    }
    /**
     * Elimina una tarea de la lista de tareas.
     * Para ello se utiliza una copia de la lista (función copy) de tareas actual y se elimina la tarea con el id proporcionado
     * al _uiState
     *
     * @param id El id de la tarea que se va a eliminar.
     */
    fun eliminarTarea(id: Int) {
        throw UnsupportedOperationException("A completar por el estudiante")
    }

    /**
     * Contabiliza el numero de tareas pendientes en la lista de tareas dada.
     * Una tarea se considera pendiente si no ha sido completada.
     *
     * @param tareas La lista de tareas que se va a contar.
     * @return El numero de tareas pendientes.
     */
    private fun contarPendientes(tareas: List<Tarea>): Int {
        throw UnsupportedOperationException("A completar por el estudiante")
    }
}