package com.google.android.gms.tapandpay.keyguard;

import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RemoteLockIntentOperation extends asjx {
    static {
        sgj sgj = sgj.UNKNOWN;
    }

    /* renamed from: a */
    public final void mo49205a(Intent intent) {
        try {
            new atkm(this).f90420c.edit().putBoolean("remote_lock_hold", true).apply();
            askf b = askg.m74283b(this, null);
            if (b != null) {
                atff.m75765a(b, "t/security/acknowledgeremotelock", btor.f149795a, btos.f149797a, new atfe(), null);
            }
        } catch (Exception e) {
        }
    }
}
