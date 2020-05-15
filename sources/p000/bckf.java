package p000;

import android.util.Pair;
import java.util.ArrayDeque;

/* renamed from: bckf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bckf {

    /* renamed from: a */
    public bqgg f104368a = null;

    /* renamed from: b */
    private final ArrayDeque f104369b = new ArrayDeque();

    /* renamed from: a */
    public final synchronized bqgg mo56955a(bqeg bqeg) {
        bqgy c;
        c = bqgy.m112818c();
        this.f104369b.add(new Pair(c, bqeg));
        if (this.f104368a == null) {
            mo56956a();
        }
        return c;
    }

    /* renamed from: a */
    public final synchronized void mo56956a() {
        Pair pair = (Pair) this.f104369b.poll();
        if (pair != null) {
            try {
                bqgg a = ((bqeg) pair.second).mo7073a();
                this.f104368a = a;
                a.mo741a(new bckd(this, pair), bqfb.INSTANCE);
            } catch (Throwable th) {
                ((bqgy) pair.first).mo69136a(th);
                this.f104368a = null;
                mo56957a(th);
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo56957a(Throwable th) {
        while (true) {
            Pair pair = (Pair) this.f104369b.poll();
            if (pair != null) {
                ((bqgy) pair.first).mo69136a((Throwable) new bcke(th));
            }
        }
    }
}
