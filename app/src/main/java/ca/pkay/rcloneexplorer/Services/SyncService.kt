package ca.pkay.rcloneexplorer.Services

import android.app.IntentService
import android.content.Intent
import ca.pkay.rcloneexplorer.Database.DatabaseHandler
import ca.pkay.rcloneexplorer.workmanager.SyncManager


/**
 * This service is only meant to provide other apps
 * the ability to start a task.
 * Do not actually implement any sync changes, they only belong in the SyncManager/Worker!
 */
@Suppress("DEPRECATION")
class SyncService: IntentService("ca.pkay.rcexplorer.SYNC_SERCVICE"){
    override fun onHandleIntent(intent: Intent?) {
        if(intent == null){
            return
        }

        val action = intent.action
        val taskId = intent.getIntExtra("task", -1)


        if (action.equals("START_TASK")) {
            val db = DatabaseHandler(this)
            for (task in db.allTasks) {
                if (task.id == taskId.toLong()) {
                    SyncManager(this).queue(task)
                }
            }
        }
    }
}