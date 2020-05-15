package com.google.android.gms.ads.nonagon.signals.gmscore;

import android.content.Context;
import com.google.android.gms.ads.internal.config.C0371o;
import com.google.android.gms.ads.internal.play.C0530a;
import com.google.android.gms.ads.internal.util.future.C0645d;
import com.google.android.gms.ads.nonagon.signals.C0787d;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.ads.nonagon.signals.gmscore.an */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0805an implements C0787d {

    /* renamed from: a */
    final C0530a f9252a;

    /* renamed from: b */
    final ScheduledExecutorService f9253b;

    /* renamed from: c */
    final Context f9254c;

    public C0805an(C0530a aVar, ScheduledExecutorService scheduledExecutorService, Context context) {
        this.f9252a = aVar;
        this.f9253b = scheduledExecutorService;
        this.f9254c = context;
    }

    /* renamed from: a */
    public final bqgg mo7055a() {
        return bqdx.m112673a(bqga.m112773a(this.f9252a.mo6707a(this.f9254c), ((Long) C0371o.f8227ae.mo6604a()).longValue(), TimeUnit.MILLISECONDS, this.f9253b), C0804am.f9251a, C0645d.f8973a);
    }
}
