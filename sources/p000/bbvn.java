package p000;

import android.util.Pair;

/* renamed from: bbvn */
final /* synthetic */ class bbvn implements Runnable {

    /* renamed from: a */
    private final bbwq f103522a;

    /* renamed from: b */
    private final Pair f103523b;

    public bbvn(bbwq bbwq, Pair pair) {
        this.f103522a = bbwq;
        this.f103523b = pair;
    }

    public final void run() {
        bbwq bbwq = this.f103522a;
        Pair pair = this.f103523b;
        synchronized (bbwq.f103610h) {
            bbwq.f103614l.remove(pair);
        }
    }
}
