package com.google.android.gms.autofill.smsretriever;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.api.Status;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TracingSmsBroadcastReceiver extends aacn {

    /* renamed from: a */
    private final bqgy f11681a;

    public TracingSmsBroadcastReceiver(bqgy bqgy) {
        super("autofill");
        this.f11681a = bqgy;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        Status status;
        if ("com.google.android.gms.auth.api.phone.SMS_CODE_RETRIEVED".equals(intent.getAction()) && (status = (Status) intent.getParcelableExtra("com.google.android.gms.auth.api.phone.EXTRA_STATUS")) != null) {
            this.f11681a.mo69138b(lib.m19157a(intent.getStringExtra("com.google.android.gms.auth.api.phone.EXTRA_SMS_CODE"), status.f30115i));
        }
    }
}
