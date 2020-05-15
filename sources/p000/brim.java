package p000;

import android.os.Handler;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

/* renamed from: brim */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class brim implements Executor, aubq {

    /* renamed from: a */
    public final rjx f142874a;

    /* renamed from: b */
    public final Queue f142875b = new ArrayDeque();

    /* renamed from: c */
    public int f142876c = 0;

    /* renamed from: d */
    private final Handler f142877d;

    public brim(rjx rjx) {
        this.f142874a = rjx;
        this.f142877d = new adzt(rjx.f43163B);
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        bril bril;
        boolean z;
        synchronized (this.f142875b) {
            if (this.f142876c == 2) {
                bril = (bril) this.f142875b.peek();
                if (bril != null) {
                    z = true;
                } else {
                    z = false;
                }
                sdo.m34970a(z);
            } else {
                bril = null;
            }
            this.f142876c = 0;
        }
        if (bril != null) {
            bril.mo69564a();
        }
    }

    public final void execute(Runnable runnable) {
        this.f142877d.post(runnable);
    }
}
