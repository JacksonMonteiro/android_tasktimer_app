package space.jacksonmonteiro.taskstimer

import android.provider.BaseColumns

object TasksContract {
    internal const val TABLE_NAME = "tasks"

    object Columns {
        const val ID = BaseColumns._ID
        const val TASK_NAME = "name"
        const val TASK_DESCRIPTION = "description"
        const val TASK_SORT_ORDER = "sortOrder"
    }

}