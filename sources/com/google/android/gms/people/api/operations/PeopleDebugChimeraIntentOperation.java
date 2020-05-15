package com.google.android.gms.people.api.operations;

import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PeopleDebugChimeraIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        if (!Build.TYPE.equals("user") && "com.google.android.gms.people.api.operations.DATA_CHANGED".equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra("a");
            String stringExtra2 = intent.getStringExtra("p");
            int parseInt = Integer.parseInt(intent.getStringExtra("s"));
            Log.i("PeopleDebugChimeraIntentOperation", amdk.m62653a("DataChanged! %s/%s scopes=%d", stringExtra, stringExtra2, Integer.valueOf(parseInt)));
            almx a = almx.m61368a(this);
            a.mo40598a(stringExtra, stringExtra2, parseInt);
            a.mo40599b();
        }
    }
}
