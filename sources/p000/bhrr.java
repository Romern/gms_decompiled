package p000;

import android.os.SystemClock;

/* renamed from: bhrr */
final /* synthetic */ class bhrr implements Runnable {

    /* renamed from: a */
    private final bhrt f119398a;

    /* renamed from: b */
    private final bhqi f119399b;

    public bhrr(bhrt bhrt, bhqi bhqi) {
        this.f119398a = bhrt;
        this.f119399b = bhqi;
    }

    public final void run() {
        bhrt bhrt = this.f119398a;
        bhqi bhqi = this.f119399b;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = bhrt.f119403b;
        if (j >= 0) {
            bhrt.f119404c = elapsedRealtime - j;
        }
        bhrt.f119403b = elapsedRealtime;
        bhrt.mo64205b(bhqi);
    }
}
