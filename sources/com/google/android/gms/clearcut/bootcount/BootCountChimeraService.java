package com.google.android.gms.clearcut.bootcount;

import android.content.Intent;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BootCountChimeraService extends zzx {
    public BootCountChimeraService() {
        super(124, "com.google.android.gms.clearcut.bootcount.service.START", Collections.emptySet(), 2, 10);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        aaac.mo16652a(new qxt(this));
    }

    public final boolean onUnbind(Intent intent) {
        return true;
    }
}
