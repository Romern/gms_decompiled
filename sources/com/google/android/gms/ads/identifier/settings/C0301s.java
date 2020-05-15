package com.google.android.gms.ads.identifier.settings;

import android.content.Context;

/* renamed from: com.google.android.gms.ads.identifier.settings.s */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0301s {

    /* renamed from: a */
    private static C0301s f8044a = null;

    /* renamed from: b */
    private final aeat f8045b;

    public C0301s(aeat aeat) {
        this.f8045b = aeat;
    }

    /* renamed from: a */
    public static synchronized C0301s m5225a(Context context) {
        C0301s sVar;
        synchronized (C0301s.class) {
            if (f8044a == null) {
                C0301s sVar2 = new C0301s(aeat.m51532a(context));
                f8044a = sVar2;
                sVar2.mo6523b();
                f8044a.mo6522a();
            }
            sVar = f8044a;
        }
        return sVar;
    }

    /* renamed from: b */
    public final void mo6523b() {
        if (cbvp.m128519f()) {
            long p = cbvp.f178349a.mo6606a().mo75444p();
            aebi aebi = new aebi();
            aebi.f63097i = "com.google.android.gms.ads.jams.NegotiationService";
            aebi.mo34004a(0, p);
            aebi.f63099k = "ads.fetch_integrity_token.one_time";
            aebi.mo34023a(0);
            this.f8045b.mo33984a(aebi.mo33974b());
        }
    }

    /* renamed from: a */
    public final void mo6522a() {
        if (cbvp.m128519f()) {
            long r = cbvp.f178349a.mo6606a().mo75446r();
            long q = cbvp.f178349a.mo6606a().mo75445q();
            aebl aebl = new aebl();
            aebl.f63097i = "com.google.android.gms.ads.jams.NegotiationService";
            aebl.f63071b = q;
            aebl.f63070a = r;
            aebl.f63099k = "ads.fetch_integrity_token.periodic";
            aebl.mo34028b(0, cdny.m134342g() ? 1 : 0);
            aebl.mo34024a(0, cdny.m134342g() ? 1 : 0);
            this.f8045b.mo33984a(aebl.mo33974b());
        }
    }
}
