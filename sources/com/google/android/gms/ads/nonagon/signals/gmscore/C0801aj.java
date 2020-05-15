package com.google.android.gms.ads.nonagon.signals.gmscore;

import android.content.pm.ApplicationInfo;
import com.google.android.gms.ads.internal.config.C0371o;
import com.google.android.gms.ads.internal.flag.C0391d;
import com.google.android.gms.ads.internal.location.C0509a;
import com.google.android.gms.ads.internal.util.future.C0645d;
import com.google.android.gms.ads.nonagon.signals.C0787d;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.ads.nonagon.signals.gmscore.aj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0801aj implements C0787d {

    /* renamed from: a */
    final C0509a f9242a;

    /* renamed from: b */
    final ScheduledExecutorService f9243b;

    /* renamed from: c */
    final boolean f9244c;

    /* renamed from: d */
    final ApplicationInfo f9245d;

    public C0801aj(C0509a aVar, ScheduledExecutorService scheduledExecutorService, boolean z, ApplicationInfo applicationInfo) {
        this.f9242a = aVar;
        this.f9243b = scheduledExecutorService;
        this.f9244c = z;
        this.f9245d = applicationInfo;
    }

    /* renamed from: a */
    public final bqgg mo7055a() {
        if (!((Boolean) C0391d.f8325a.mo6621a()).booleanValue()) {
            return bqga.m112777a((Throwable) new Exception("Auto Collect Location by gms is disabled."));
        }
        if (this.f9244c) {
            return bqdx.m112673a(bqga.m112773a(this.f9242a.mo6698a(this.f9245d), ((Long) C0371o.f8225ac.mo6604a()).longValue(), TimeUnit.MILLISECONDS, this.f9243b), C0800ai.f9241a, C0645d.f8973a);
        }
        return bqga.m112777a((Throwable) new Exception("Auto Collect Location is false."));
    }
}
