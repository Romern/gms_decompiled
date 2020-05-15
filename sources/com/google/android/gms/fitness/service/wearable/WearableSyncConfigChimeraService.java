package com.google.android.gms.fitness.service.wearable;

import java.util.Iterator;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WearableSyncConfigChimeraService extends axpp {
    static {
        zvt.m46581a();
    }

    /* renamed from: a */
    public final void mo19178a(rtx rtx) {
        Iterator it = rtx.iterator();
        while (it.hasNext()) {
            axop axop = (axop) it.next();
            if (axop.mo53316b() != 1) {
                axop.mo53316b();
            } else if (axop.mo53315a().mo53317a().getPath().equals("/fitness/WearableSync/sync_request")) {
                sre.m36089i(getApplicationContext());
            }
        }
    }
}
