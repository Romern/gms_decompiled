package p000;

import android.os.SystemClock;

/* renamed from: bdnu */
final /* synthetic */ class bdnu implements Runnable {

    /* renamed from: a */
    private final bdnv f106095a;

    public bdnu(bdnv bdnv) {
        this.f106095a = bdnv;
    }

    public final void run() {
        bdnv bdnv = this.f106095a;
        if (bdnv.f106096a.f106099b.f106110f == 0) {
            bdnv.f106096a.f106099b.f106110f = SystemClock.elapsedRealtime();
            bdnv.f106096a.f106099b.f106112h.f106103d = true;
        }
    }
}
