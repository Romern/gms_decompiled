package com.google.android.gms.gcm;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GcmServiceDiagnosticsIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        aalf aalf;
        IBinder a = C1004fv.m12454a(intent.getExtras(), "callback");
        if (a != null) {
            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.gcm.IGcmServiceDiagnosticsCallback");
            if (queryLocalInterface instanceof aalf) {
                aalf = (aalf) queryLocalInterface;
            } else {
                aalf = new aald(a);
            }
            if (aalf != null) {
                try {
                    aalf.mo16967a(new aalb(this));
                } catch (RemoteException e) {
                    Log.e("GCM", "Failed to return GcmServiceDiagnostics.", e);
                }
            }
        }
    }
}
