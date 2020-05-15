package p000;

import android.util.Pair;

/* renamed from: bbvs */
final /* synthetic */ class bbvs implements Runnable {

    /* renamed from: a */
    private final bbwq f103540a;

    /* renamed from: b */
    private final Pair f103541b;

    public bbvs(bbwq bbwq, Pair pair) {
        this.f103540a = bbwq;
        this.f103541b = pair;
    }

    public final void run() {
        bbwq bbwq = this.f103540a;
        Pair pair = this.f103541b;
        synchronized (bbwq.f103611i) {
            bbwq.f103615m.remove(pair);
        }
    }
}
