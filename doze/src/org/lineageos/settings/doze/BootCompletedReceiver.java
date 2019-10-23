package org.lineageos.settings.doze;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class BootCompletedReceiver extends BroadcastReceiver {

    private static final boolean DEBUG = false;
    private static final String TAG = "XiaomiDoze";

    @Override
    public void onReceive(final Context context, Intent intent) {
        if (Utils.isDozeEnabled(context) && Utils.sensorsEnabled(context)) {
            if (DEBUG) Log.d(TAG, "Starting service");
            Utils.startService(context);
        }
    }

}
