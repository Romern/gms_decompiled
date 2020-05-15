package com.google.android.gms.drivingmode;

import android.content.Intent;
import android.util.Log;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DrivingModeLocationFrxIntentOperation extends vti {
    public final void onHandleIntent(Intent intent) {
        Log.i("CAR.DRIVINGMODE", "DrivingModeFrxIntentOperation onHandleIntent from location module");
        if ("com.google.android.gms.drivingmode.GEARHEAD_FRX_COMPLETED".equals(intent.getAction())) {
            vuk.m41322a();
            vuk.m41329h(getApplicationContext()).f49955a.edit().putBoolean("gearhead_frx_completed", true).apply();
        }
    }
}
