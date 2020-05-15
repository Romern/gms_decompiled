package p000;

import android.os.SystemClock;

/* renamed from: zdx */
final /* synthetic */ class zdx implements Runnable {

    /* renamed from: a */
    private final zrn f54988a;

    public zdx(zrn zrn) {
        this.f54988a = zrn;
    }

    public final void run() {
        zrn zrn = this.f54988a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long t = cdzd.f182003a.mo6606a().mo78596t();
        if (zrn.f55751e.compareAndSet(-1, elapsedRealtime + t)) {
            zrn.f55752f.postDelayed(zrn.f55750d, t);
            return;
        }
        long j = zrn.f55751e.get();
        if (j != -1 && j <= elapsedRealtime) {
            zrn.mo31406b();
        }
    }
}
