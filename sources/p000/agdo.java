package p000;

import android.os.Handler;

/* renamed from: agdo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class agdo {

    /* renamed from: c */
    private static volatile Handler f65314c;

    /* renamed from: a */
    public volatile long f65315a;

    /* renamed from: b */
    private final agjw f65316b;

    /* renamed from: d */
    private final Runnable f65317d;

    public agdo(agjw agjw) {
        sdo.m34959a(agjw);
        this.f65316b = agjw;
        this.f65317d = new agdn(this, agjw);
    }

    /* renamed from: d */
    private final Handler m54097d() {
        Handler handler;
        if (f65314c != null) {
            return f65314c;
        }
        synchronized (agdo.class) {
            if (f65314c == null) {
                f65314c = new adzt(((agje) this.f65316b).f65685a.getMainLooper());
            }
            handler = f65314c;
        }
        return handler;
    }

    /* renamed from: a */
    public abstract void mo35367a();

    /* renamed from: a */
    public final void mo35368a(long j) {
        mo35370c();
        if (j >= 0) {
            sqv sqv = ((agje) this.f65316b).f65696l;
            this.f65315a = System.currentTimeMillis();
            if (!m54097d().postDelayed(this.f65317d, j)) {
                this.f65316b.mo35497E().f65564c.mo35436a("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }

    /* renamed from: b */
    public final boolean mo35369b() {
        return this.f65315a != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo35370c() {
        this.f65315a = 0;
        m54097d().removeCallbacks(this.f65317d);
    }
}
