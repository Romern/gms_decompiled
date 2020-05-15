package p000;

import android.os.SystemClock;

/* renamed from: admx */
final /* synthetic */ class admx implements aubq {

    /* renamed from: a */
    private final long f62188a;

    /* renamed from: b */
    private final bxvd f62189b;

    public admx(bxvd bxvd, long j) {
        this.f62189b = bxvd;
        this.f62188a = j;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        bxvd bxvd = this.f62189b;
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f62188a;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        boly boly = boly.f133593k;
        ((boly) bxvd.f164949b).f133603i = elapsedRealtime;
        adns.m50862a().mo33691a((boly) bxvd.mo74062i());
    }
}
