package com.google.android.gms.security.snet;

import android.content.Intent;
import android.os.IBinder;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SnetNormalTaskChimeraService extends aeah {

    /* renamed from: a */
    private IBinder f107594a = new aqdv();

    static {
        SnetNormalTaskChimeraService.class.getSimpleName();
    }

    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        String str = aecc.f63128a;
        if (((str.hashCode() == -487742654 && str.equals("event_log_collector_runner")) ? (char) 0 : 65535) == 0 && cgkt.m145941m() && cgkt.m145935g()) {
            SnetGcmSchedulerChimeraIntentService.m92426a(this);
        }
        return 0;
    }

    /* renamed from: aZ */
    public final void mo7135aZ() {
        SnetGcmSchedulerChimeraIntentService.m92427b(this);
    }

    public final IBinder onBind(Intent intent) {
        IBinder onBind = super.onBind(intent);
        return onBind == null ? this.f107594a : onBind;
    }
}
