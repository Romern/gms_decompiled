package com.google.android.gms.ads.jams;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.C0633h;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.ads.jams.b */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0729b {

    /* renamed from: a */
    public final Context f9136a;

    /* renamed from: b */
    public final adyd f9137b;

    /* renamed from: c */
    public final C0731d f9138c;

    /* renamed from: d */
    private final aeat f9139d;

    protected C0729b(Context context) {
        adyd a = adyd.m51363a(context);
        C0731d dVar = new C0731d(context);
        aeat a2 = aeat.m51532a(context);
        this.f9136a = context;
        this.f9137b = a;
        this.f9138c = dVar;
        this.f9139d = a2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Boolean mo7021a() {
        return Boolean.valueOf(this.f9138c.mo7027b() > 0);
    }

    /* renamed from: b */
    public final boolean mo7023b() {
        if (this.f9138c.mo7028c()) {
            return false;
        }
        C0633h.m5664a("[JAMS] Negotiation has been disabled");
        return true;
    }

    /* renamed from: a */
    public final void mo7022a(long j) {
        long d = cbvt.m128578d();
        aeat aeat = this.f9139d;
        aebi aebi = new aebi();
        aebi.f63097i = "com.google.android.gms.ads.jams.NegotiationService";
        aebi.mo34004a(j, d + j);
        aebi.f63099k = "jams-negotiation-task";
        aebi.mo34027b(0);
        aeat.mo33984a(aebi.mo33974b());
        this.f9138c.f9141a.edit().putLong("scheduled_next_negotiation_timestamp", System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(j)).apply();
        StringBuilder sb = new StringBuilder(62);
        sb.append("[JAMS] Next negotiation to run in ");
        sb.append(j);
        sb.append(" seconds");
        C0633h.m5664a(sb.toString());
    }
}
