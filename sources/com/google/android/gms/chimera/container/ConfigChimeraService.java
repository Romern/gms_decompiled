package com.google.android.gms.chimera.container;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ConfigChimeraService extends aeah {

    /* renamed from: a */
    private static volatile qlo f29972a = null;

    /* renamed from: b */
    public static qlo m22385b() {
        qlo qlo = f29972a;
        if (qlo == null) {
            synchronized (ConfigChimeraService.class) {
                qlo = f29972a;
                if (qlo == null) {
                    qlo = new qlo();
                    f29972a = qlo;
                }
            }
        }
        return qlo;
    }

    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        int i;
        int i2;
        synchronized (this) {
            qli a = qli.m32351a(this);
            Bundle bundle = aecc.f63129b;
            i = 0;
            if (bundle != null) {
                i2 = bundle.getInt("reason", 0);
            } else {
                i2 = 0;
            }
            int i3 = new int[]{1, 2, 3, 4, 5, 6}[i2];
            if (bundle != null && bundle.getBoolean("allowRetry", false)) {
                m22385b();
                a.mo24076a(0);
            }
            if (!"ChimeraConfigService_OneOffRetry".equals(aecc.f63128a)) {
                aeat.m51532a(this).mo33986a("ChimeraConfigService_OneOffRetry", "com.google.android.gms.chimera.container.ConfigService");
            }
            try {
                if (!qln.m32379a(this).mo24087a(i3, a, bngx.m109376e())) {
                    i = 2;
                }
            } finally {
                m22385b();
                qlo.m32387a(this, a);
            }
        }
        return i;
    }

    /* renamed from: aZ */
    public final void mo7135aZ() {
        Intent startIntent = IntentOperation.getStartIntent(this, InitConfigOperation.class, "com.google.android.gms.chimera.container.ACTION_START_PERIODIC_CHECKIN");
        bmzs.m108696a(startIntent);
        startService(startIntent);
    }
}
