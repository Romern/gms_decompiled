package com.google.firebase.auth.api.gms;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DeviceStateChangedIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final sek f152494a = new sek("FirebaseAuth", "DeviceStateChangedIntentOperation");

    public DeviceStateChangedIntentOperation() {
    }

    public final void onHandleIntent(Intent intent) {
        f152494a.mo25409a("Handle intent-operations: %s", intent);
        if (intent != null && "android.intent.action.SIM_STATE_CHANGED".equals(intent.getAction())) {
            brla.f142902a.mo69672a(getBaseContext());
        }
    }

    protected DeviceStateChangedIntentOperation(Context context) {
        attachBaseContext(context);
    }
}
