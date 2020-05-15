package com.google.android.gms.auth.managed.intentoperations;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RevokePasswordRequirementsIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final sek f11055a = ght.m13171a("AuthManaged", "RevokePasswordRequirementsIntentOperation");

    /* renamed from: a */
    public static PendingIntent m6702a(Context context) {
        Intent startIntent = IntentOperation.getStartIntent(context, RevokePasswordRequirementsIntentOperation.class, "com.google.android.gms.auth.managed.REVOKE_PASSWORD_REQUIREMENTS");
        if (startIntent == null) {
            f11055a.mo25418e("Cannot create PendingIntent: getStartIntent returns null.", new Object[0]);
            return null;
        }
        PendingIntent pendingIntent = IntentOperation.getPendingIntent(context, RevokePasswordRequirementsIntentOperation.class, startIntent, 0, 1342177280);
        if (pendingIntent == null) {
            f11055a.mo25418e("Cannot create PendingIntent: getPendingIntent returns null.", new Object[0]);
        }
        return pendingIntent;
    }

    public final void onHandleIntent(Intent intent) {
        jhm.m16712a(this).mo13743a(7);
        jfv.m16651a().mo13706a(this);
    }
}
