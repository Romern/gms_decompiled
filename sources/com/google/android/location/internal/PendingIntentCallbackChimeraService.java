package com.google.android.location.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.chimera.Service;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PendingIntentCallbackChimeraService extends Service {

    /* renamed from: a */
    aki f150794a;

    /* renamed from: a */
    public static Intent m117262a(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, "com.google.android.location.internal.PendingIntentCallbackService"));
        return intent;
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        this.f150794a = aki.m919a(this);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null) {
            return 2;
        }
        String action = intent.getAction();
        String a = bvpm.m121348a(action);
        if (a != null) {
            Intent intent2 = new Intent(intent);
            intent2.setAction(a);
            intent2.setComponent(null);
            aki aki = this.f150794a;
            if (!aki.mo874a(intent2)) {
                return 2;
            }
            aki.mo871a();
            return 2;
        }
        String valueOf = String.valueOf(action);
        Log.w("PICallbackService", valueOf.length() == 0 ? new String("Unknown action: ") : "Unknown action: ".concat(valueOf));
        return 2;
    }
}
