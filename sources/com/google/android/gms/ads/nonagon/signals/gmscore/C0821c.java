package com.google.android.gms.ads.nonagon.signals.gmscore;

import android.content.Context;
import com.google.android.gms.ads.internal.config.C0371o;
import com.google.android.gms.ads.internal.spamsignals.C0593a;
import com.google.android.gms.ads.nonagon.signals.C0787d;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.ads.nonagon.signals.gmscore.c */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0821c implements C0787d {

    /* renamed from: a */
    public final Context f9271a;

    /* renamed from: b */
    private final C0593a f9272b;

    /* renamed from: c */
    private final ScheduledExecutorService f9273c;

    /* renamed from: d */
    private final Executor f9274d;

    public C0821c(C0593a aVar, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.f9272b = aVar;
        this.f9271a = context;
        this.f9273c = scheduledExecutorService;
        this.f9274d = executor;
    }

    /* renamed from: a */
    public final bqgg mo7055a() {
        if (!((Boolean) C0371o.f8192F.mo6604a()).booleanValue()) {
            return bqga.m112777a((Throwable) new Exception("Did not ad Ad ID into query param."));
        }
        return bqdf.m112619a(((bqfl) bqdx.m112673a(bqfl.m112747c(this.f9272b.mo6380a(this.f9271a)), C0791a.f9226a, this.f9274d)).mo69206a(((Long) C0371o.f8193G.mo6604a()).longValue(), TimeUnit.MILLISECONDS, this.f9273c), Throwable.class, new C0818b(this), this.f9274d);
    }
}
