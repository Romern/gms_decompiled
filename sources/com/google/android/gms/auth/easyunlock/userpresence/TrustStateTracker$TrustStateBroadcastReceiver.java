package com.google.android.gms.auth.easyunlock.userpresence;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TrustStateTracker$TrustStateBroadcastReceiver extends aacn {

    /* renamed from: a */
    private final ivr f10571a;

    public TrustStateTracker$TrustStateBroadcastReceiver(ivr ivr) {
        super("auth_easyunlock");
        sdo.m34959a(ivr);
        this.f10571a = ivr;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        Bundle extras;
        ivr.f21878f.mo25412b("Received %s.", intent);
        if ("com.google.android.gms.trustagent.TRUST_STATE_CHANGED".equals(intent.getAction()) && (extras = intent.getExtras()) != null && extras.keySet().contains("is_trusted")) {
            ivr ivr = this.f10571a;
            intent.getBooleanExtra("is_trusted", false);
            synchronized (ivr.f21880a) {
                for (ivq ivq : ivr.f21883d) {
                    ivq.mo13359e();
                }
            }
        }
    }
}
