package com.google.android.gms.gcm.gmsproc;

import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GcmInstanceIdIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        Log.i("GCM", "Refreshing GMS registration due to token refresh");
        aeat a = aeat.m51532a(this);
        aakw.m21417b(this).edit().remove("regId").commit();
        aaoe.m21745a(this, a);
    }
}
