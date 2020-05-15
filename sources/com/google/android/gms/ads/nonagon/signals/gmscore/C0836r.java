package com.google.android.gms.ads.nonagon.signals.gmscore;

import android.content.Context;
import com.google.android.gms.ads.internal.config.C0371o;
import com.google.android.gms.ads.internal.spamsignals.C0593a;
import com.google.android.gms.ads.internal.state.C0597d;
import com.google.android.gms.ads.nonagon.signals.C0787d;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.ads.nonagon.signals.gmscore.r */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0836r implements C0787d {

    /* renamed from: a */
    public final C0593a f9322a;

    /* renamed from: b */
    public final int f9323b;

    /* renamed from: c */
    public final Context f9324c;

    /* renamed from: d */
    public final C0597d f9325d;

    /* renamed from: e */
    private final ScheduledExecutorService f9326e;

    /* renamed from: f */
    private final Executor f9327f;

    public C0836r(C0593a aVar, int i, Context context, C0597d dVar, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.f9322a = aVar;
        this.f9323b = i;
        this.f9324c = context;
        this.f9325d = dVar;
        this.f9326e = scheduledExecutorService;
        this.f9327f = executor;
    }

    /* renamed from: a */
    public final bqgg mo7055a() {
        return bqdf.m112619a(((bqfl) bqdx.m112673a(bqfl.m112747c(bqga.m112771a(new C0833o(this), this.f9327f)), C0834p.f9320a, this.f9327f)).mo69206a(((Long) C0371o.f8193G.mo6604a()).longValue(), TimeUnit.MILLISECONDS, this.f9326e), Exception.class, new C0835q(this), bqfb.INSTANCE);
    }
}
