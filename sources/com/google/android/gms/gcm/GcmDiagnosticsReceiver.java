package com.google.android.gms.gcm;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GcmDiagnosticsReceiver extends aacn {
    public GcmDiagnosticsReceiver() {
        super("gcm");
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        intent.setClassName(context, "com.google.android.gms.gcm.GcmDiagnostics");
        intent.setFlags(268435456);
        context.startActivity(intent);
    }
}
