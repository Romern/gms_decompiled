package com.google.android.gms.cast.remote_display;

import android.os.Bundle;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CastRemoteDisplayChimeraService extends zzx {

    /* renamed from: a */
    private aaag f29897a;

    /* renamed from: b */
    private pes f29898b;

    /* renamed from: k */
    private pvd f29899k;

    /* renamed from: l */
    private pvh f29900l;

    public CastRemoteDisplayChimeraService() {
        super(83, "com.google.android.gms.cast.remote_display.service.START", Collections.emptySet(), 3, 10);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        if (getServiceRequest.f30228b == 83) {
            if (this.f29899k == null) {
                this.f29899k = new pvd(getApplicationContext(), this.f29898b.f38984h, this.f29900l);
            }
            aaac.mo16652a((aaai) new pwu(getApplicationContext(), this.f29897a, getServiceRequest.f30230d, this.f29899k));
            return;
        }
        aaac.mo16650a(1, (Bundle) null);
    }

    public final void onCreate() {
        this.f29898b = pes.m30267a(getApplicationContext(), "CastRemoteDisplayService");
        this.f29897a = new aaag(this, this.f56354e, pes.m30266a());
        ScheduledExecutorService a = pes.m30266a();
        pes pes = this.f29898b;
        this.f29900l = new pvh(this, a, pes.f38985i, pes.f38984h, new qbw(), new qbv());
    }

    public final void onDestroy() {
        this.f29899k = null;
        pes pes = this.f29898b;
        if (pes != null) {
            pes.mo22984a("CastRemoteDisplayService");
            this.f29898b = null;
        }
    }
}
