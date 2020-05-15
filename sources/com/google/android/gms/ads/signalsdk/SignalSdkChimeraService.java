package com.google.android.gms.ads.signalsdk;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.ads.internal.util.C0610ah;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.nonagon.util.concurrent.C0851d;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SignalSdkChimeraService extends zzx {
    public SignalSdkChimeraService() {
        super(203, "com.google.android.gms.ads.service.SDK_SIGNAL", Collections.singleton("android.permission.INTERNET"), 3, 10);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        fii a = fii.m11748a(this);
        Context a2 = fia.m11732a(a.f16639a);
        VersionInfoParcel b = fih.m11746b();
        String str = (String) a.f16646h.mo6445a();
        bqgj b2 = C0851d.m6032b();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) a.f16643e.mo6445a();
        C0610ah ahVar = (C0610ah) a.f16644f.mo6445a();
        aaac.mo16652a(new C0899h(a2, b, str, b2, scheduledExecutorService, a.mo10847a()));
    }

    public final IBinder onBind(Intent intent) {
        if (intent.getBooleanExtra("non_gms", false)) {
            return fii.m11748a(this).mo10849c();
        }
        return super.onBind(intent);
    }
}
