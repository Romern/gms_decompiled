package com.google.android.gms.security.snet;

import android.content.Intent;
import android.os.IBinder;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SafeBrowsingUpdateTaskChimeraService extends aeah {

    /* renamed from: a */
    private IBinder f107557a = new aqdl();

    static {
        SafeBrowsingUpdateTaskChimeraService.class.getSimpleName();
    }

    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        SafeBrowsingUpdateChimeraIntentService.m92411a(this);
        return 0;
    }

    /* renamed from: aZ */
    public final void mo7135aZ() {
        SafeBrowsingUpdateChimeraIntentService.m92412b(this);
    }

    public final IBinder onBind(Intent intent) {
        IBinder onBind = super.onBind(intent);
        return onBind == null ? this.f107557a : onBind;
    }
}
