package com.google.android.gms.gcm.topics;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class EarthquakeTopicIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        aakb a = aakb.m21381a();
        if (cecz.m136058f()) {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                a.mo16923h().mo17205b();
                return;
            }
            ArrayList<String> stringArrayList = extras.getStringArrayList("com.google.android.gms.location.REGIONS");
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                String valueOf = String.valueOf(extras);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
                sb.append("Dropping intent with unexpected extras: ");
                sb.append(valueOf);
                Log.w("GCM", sb.toString());
                return;
            }
            a.mo16923h().mo17204a(stringArrayList);
        }
    }
}
