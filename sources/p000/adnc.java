package p000;

import android.os.SystemClock;

/* renamed from: adnc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class adnc implements aubt {

    /* renamed from: a */
    final /* synthetic */ int f62196a;

    /* renamed from: b */
    final /* synthetic */ boly f62197b;

    /* renamed from: c */
    final /* synthetic */ long f62198c;

    public adnc(int i, boly boly, long j) {
        this.f62196a = i;
        this.f62197b = boly;
        this.f62198c = j;
    }

    /* renamed from: a */
    public final void mo10476a(Exception exc) {
        adnt.m50870a(exc, "Apps indexing failed.", new Object[0]);
        adns.m50862a().mo33690a(this.f62196a);
        boly boly = this.f62197b;
        bxvd bxvd = (bxvd) boly.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) boly);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        boly boly2 = boly.f133593k;
        ((boly) bxvd.f164949b).f133602h = bolw.m111323a(4);
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f62198c;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        ((boly) bxvd.f164949b).f133603i = elapsedRealtime;
        adns.m50862a().mo33691a((boly) bxvd.mo74062i());
    }
}
