package p000;

import android.util.Log;

/* renamed from: bhqv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhqv implements bial {

    /* renamed from: a */
    final /* synthetic */ bhvr f119355a;

    public bhqv(bhvr bhvr) {
        this.f119355a = bhvr;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo64172a(Object obj) {
        bvuh bvuh = (bvuh) obj;
        bhvr bhvr = this.f119355a;
        bxvd da = bvmm.f156758d.mo74144da();
        bxwc bxwc = bvuh.f157690a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvmm bvmm = (bvmm) da.f164949b;
        if (!bvmm.f156760a.mo73666a()) {
            bvmm.f156760a = GeneratedMessageLite.m124021a(bvmm.f156760a);
        }
        bxsy.m123078a(bxwc, bvmm.f156760a);
        bxwc bxwc2 = bvuh.f157691b;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvmm bvmm2 = (bvmm) da.f164949b;
        if (!bvmm2.f156761b.mo73666a()) {
            bvmm2.f156761b = GeneratedMessageLite.m124021a(bvmm2.f156761b);
        }
        bxsy.m123078a(bxwc2, bvmm2.f156761b);
        bxwc bxwc3 = bvuh.f157692c;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvmm bvmm3 = (bvmm) da.f164949b;
        if (!bvmm3.f156762c.mo73666a()) {
            bvmm3.f156762c = GeneratedMessageLite.m124021a(bvmm3.f156762c);
        }
        bxsy.m123078a(bxwc3, bvmm3.f156762c);
        bhvr.mo64331a((bvmm) da.mo74062i());
    }

    /* renamed from: a */
    public final void mo64173a(Throwable th) {
        if (Log.isLoggable("Places", 5)) {
            bioi.m102661b("Places", "Failed to download inference model weights SLS", th);
        }
        this.f119355a.mo64330a();
    }
}
