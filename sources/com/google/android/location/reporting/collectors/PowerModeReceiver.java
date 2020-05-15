package com.google.android.location.reporting.collectors;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PowerModeReceiver extends aacn {

    /* renamed from: a */
    public bgxg f150864a;

    /* renamed from: b */
    private final bgyg f150865b;

    /* renamed from: c */
    private final bgyf f150866c;

    public PowerModeReceiver(bgyg bgyg, bgyf bgyf) {
        super("location");
        this.f150865b = bgyg;
        this.f150866c = bgyf;
        bgyf.mo63382a(bgyg.mo63405d());
    }

    /* renamed from: a */
    private final void m117301a(boolean z) {
        int i;
        if (z != this.f150866c.f118014f) {
            this.f150865b.f118030c.edit().putBoolean("lastDeepStillModeValue", z).apply();
            this.f150866c.mo63382a(z);
            bgxg bgxg = this.f150864a;
            System.currentTimeMillis();
            if (chcs.m148225A()) {
                if (!z) {
                    i = 2;
                } else {
                    i = 1;
                }
                bgxg.mo63319c(i);
            }
            StringBuilder sb = new StringBuilder(44);
            sb.append("UlrClearcutEvents.logDeepStillChanged(");
            sb.append(z);
            sb.append(")");
            sb.toString();
            if (bgux.m100096a()) {
                bgux.f117614a.mo63261g(z);
            }
        }
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if (this.f150864a != null) {
            String action = intent.getAction();
            String valueOf = String.valueOf(action);
            if (valueOf.length() == 0) {
                new String("Received power mode change: ");
            } else {
                "Received power mode change: ".concat(valueOf);
            }
            if ("com.google.android.location.activity.DEEP_STILL_MODE_ENABLED".equals(action)) {
                m117301a(true);
            } else if ("com.google.android.location.activity.DEEP_STILL_MODE_DISABLED".equals(action)) {
                m117301a(false);
            }
            if (!chcs.m148236h() && !chcs.m148237i()) {
                this.f150864a.mo63317b(1);
            } else if (action != null && this.f150864a != null) {
                if ("com.google.android.location.activity.DEEP_STILL_MODE_ENABLED".equals(action)) {
                    this.f150864a.mo63311a(1);
                } else if ("com.google.android.location.activity.DEEP_STILL_MODE_DISABLED".equals(action)) {
                    this.f150864a.mo63311a(2);
                }
            }
        }
    }
}
