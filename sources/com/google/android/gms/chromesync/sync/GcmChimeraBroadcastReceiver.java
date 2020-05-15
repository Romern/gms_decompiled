package com.google.android.gms.chromesync.sync;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GcmChimeraBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: b */
    private static final sek f30019b = qqu.m32672c("SyncBroadcastReceiver");

    public final void onReceive(Context context, Intent intent) {
        if (!cdcx.m132659b()) {
            f30019b.mo25412b("Experiment not enabled.", new Object[0]);
        } else if (intent != null) {
            String a = aakz.m21424a(context).mo16960a(intent);
            if ("gcm".equals(a)) {
                try {
                    context.startService(SyncIntentOperation.m22435a(context, intent));
                } catch (qrp e) {
                    f30019b.mo25417e("Error in creating sync intent.", e, new Object[0]);
                }
            } else {
                f30019b.mo25412b("Received message with unhandled type: %s", a);
            }
        } else {
            f30019b.mo25412b("Received a null intent.", new Object[0]);
        }
    }
}
