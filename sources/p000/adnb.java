package p000;

import android.os.SystemClock;

/* renamed from: adnb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class adnb implements aubw {

    /* renamed from: a */
    final /* synthetic */ boly f62194a;

    /* renamed from: b */
    final /* synthetic */ long f62195b;

    public adnb(boly boly, long j) {
        this.f62194a = boly;
        this.f62195b = j;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10462a(Object obj) {
        Void voidR = (Void) obj;
        boly boly = this.f62194a;
        bxvd bxvd = (bxvd) boly.mo74142c(5);
        bxvd.mo73625a((bxvk) boly);
        int i = ((boly) bxvd.f164949b).f133596b;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        boly boly2 = (boly) bxvd.f164949b;
        boly boly3 = boly.f133593k;
        boly2.f133597c = i;
        boly2.f133599e = boly2.f133598d;
        boly2.f133602h = bolw.m111323a(3);
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f62195b;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        ((boly) bxvd.f164949b).f133603i = elapsedRealtime;
        adns.m50862a().mo33691a((boly) bxvd.mo74062i());
    }
}
