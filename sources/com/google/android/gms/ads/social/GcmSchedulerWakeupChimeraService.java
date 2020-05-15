package com.google.android.gms.ads.social;

import com.google.android.gms.ads.internal.util.client.C0633h;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GcmSchedulerWakeupChimeraService extends aeah {
    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        C0633h.m5664a("DSID dispatcher woke up.");
        String str = aecc.f63128a;
        if (str.startsWith("ads.social.doritos")) {
            return C0902c.m6094a(this).mo7125a(str);
        }
        return 2;
    }
}
