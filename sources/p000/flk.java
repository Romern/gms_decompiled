package p000;

import android.os.Handler;

/* renamed from: flk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class flk {

    /* renamed from: a */
    private static volatile Handler f16857a;

    /* renamed from: b */
    public final fkm f16858b;

    /* renamed from: c */
    public final Runnable f16859c = new flj(this);

    /* renamed from: d */
    public volatile long f16860d;

    public flk(fkm fkm) {
        sdo.m34959a(fkm);
        this.f16858b = fkm;
    }

    /* renamed from: a */
    public abstract void mo10965a();

    /* renamed from: a */
    public final void mo11008a(long j) {
        mo11010c();
        if (j >= 0) {
            sqv sqv = this.f16858b.f16787c;
            this.f16860d = System.currentTimeMillis();
            if (!mo11011d().postDelayed(this.f16859c, j)) {
                this.f16858b.mo10957a().mo10938e("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }

    /* renamed from: b */
    public final boolean mo11009b() {
        return this.f16860d != 0;
    }

    /* renamed from: c */
    public final void mo11010c() {
        this.f16860d = 0;
        mo11011d().removeCallbacks(this.f16859c);
    }

    /* renamed from: d */
    public final Handler mo11011d() {
        Handler handler;
        if (f16857a != null) {
            return f16857a;
        }
        synchronized (flk.class) {
            if (f16857a == null) {
                f16857a = new adzt(this.f16858b.f16785a.getMainLooper());
            }
            handler = f16857a;
        }
        return handler;
    }
}
