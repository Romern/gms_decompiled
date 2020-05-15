package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.Locale;

/* renamed from: pug */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pug {

    /* renamed from: d */
    public static final Object f40252d = new Object();

    /* renamed from: g */
    private static final ptx f40253g = new ptx("RequestTracker");

    /* renamed from: a */
    long f40254a = -1;

    /* renamed from: b */
    pue f40255b;

    /* renamed from: c */
    Runnable f40256c;

    /* renamed from: e */
    private final long f40257e;

    /* renamed from: f */
    private final Handler f40258f = new adzt(Looper.getMainLooper());

    public pug(long j) {
        this.f40257e = j;
    }

    /* renamed from: a */
    private final void m31367a(int i, Object obj, String str) {
        f40253g.mo23670a(str, new Object[0]);
        synchronized (f40252d) {
            pue pue = this.f40255b;
            if (pue != null) {
                pue.mo23351a(this.f40254a, i, obj);
            }
            this.f40254a = -1;
            this.f40255b = null;
            synchronized (f40252d) {
                Runnable runnable = this.f40256c;
                if (runnable != null) {
                    this.f40258f.removeCallbacks(runnable);
                    this.f40256c = null;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo23688a(int i) {
        synchronized (f40252d) {
            if (this.f40254a != -1) {
                m31367a(i, (Object) null, String.format(Locale.ROOT, "clearing request %d", Long.valueOf(this.f40254a)));
            }
        }
    }

    /* renamed from: a */
    public final void mo23689a(long j, pue pue) {
        pue pue2;
        synchronized (f40252d) {
            pue2 = this.f40255b;
            this.f40254a = j;
            this.f40255b = pue;
        }
        if (pue2 != null) {
            pue2.mo23352i();
        }
        synchronized (f40252d) {
            Runnable runnable = this.f40256c;
            if (runnable != null) {
                this.f40258f.removeCallbacks(runnable);
            }
            puf puf = new puf(this);
            this.f40256c = puf;
            this.f40258f.postDelayed(puf, this.f40257e);
        }
    }

    /* renamed from: a */
    public final boolean mo23690a() {
        boolean z;
        synchronized (f40252d) {
            z = this.f40254a != -1;
        }
        return z;
    }

    /* renamed from: a */
    public final boolean mo23691a(long j) {
        boolean z;
        synchronized (f40252d) {
            long j2 = this.f40254a;
            z = false;
            if (j2 != -1 && j2 == j) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public final boolean mo23692a(long j, int i) {
        return mo23693a(j, i, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        return false;
     */
    /* renamed from: a */
    public final boolean mo23693a(long j, int i, Object obj) {
        synchronized (f40252d) {
            long j2 = this.f40254a;
            if (j2 != -1 && j2 == j) {
                m31367a(i, obj, String.format(Locale.ROOT, "request %d completed", Long.valueOf(j)));
                return true;
            }
        }
    }
}
