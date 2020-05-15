package com.google.android.gms.wearable.init;

import android.content.Intent;
import android.util.Log;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WearableInitIntentOperation extends qlf {
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
        if (Log.isLoggable("WearableInitOperation", 3)) {
            Log.d("WearableInitOperation", "onInitRuntimeState");
        }
        if ((i & 14) != 0) {
            aygy.m83985a();
            if (aygy.m83989b(this)) {
                Log.i("Wear_Controller", "Starting control service to bring up the Wear module.");
                aygy.m83986a(this);
                Intent intent2 = new Intent("com.google.android.gms.wearable.ACTION_STARTUP");
                intent2.setClassName(this, "com.google.android.gms.wearable.service.WearableControlService");
                startService(intent2);
            } else {
                Log.i("Wear_Controller", "onStartup - Wear is not available on this device.");
            }
        }
        sre.m36089i(this);
    }
}
