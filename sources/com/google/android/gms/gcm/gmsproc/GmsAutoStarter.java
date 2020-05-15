package com.google.android.gms.gcm.gmsproc;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GmsAutoStarter extends IntentOperation {
    /* renamed from: a */
    public static void m24332a(Context context, Intent intent) {
        aajg.m21335a(context);
        String action = intent.getAction();
        if ("com.google.android.checkin.CHECKIN_COMPLETE".equals(action) && !intent.getBooleanExtra("success", true)) {
            return;
        }
        if ("com.google.android.gms.gcm.REGISTERED".equals(action)) {
            aaof a = aaof.m21749a(context);
            aaof.m21750a(aakw.m21417b(a.f28680a));
            a.mo17172a();
            return;
        }
        aaoe.m21745a(context, aeat.m51532a(context));
        aaof.m21749a(context).mo17172a();
    }

    public final void onHandleIntent(Intent intent) {
        m24332a(this, intent);
    }
}
