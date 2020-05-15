package p000;

import android.content.Context;

/* renamed from: bfhb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfhb {

    /* renamed from: a */
    public static final int[] f113862a = {1, 2, 4};

    /* renamed from: b */
    public final bgns f113863b;

    /* renamed from: c */
    public final bgmk f113864c;

    /* renamed from: d */
    public final Object f113865d = new Object();

    /* renamed from: e */
    public boolean f113866e = false;

    /* renamed from: f */
    bfha f113867f;

    /* renamed from: g */
    public boolean f113868g = false;

    /* renamed from: h */
    public long f113869h = 0;

    /* renamed from: i */
    final Runnable f113870i = new bfgz(this);

    /* renamed from: j */
    public final bffr f113871j;

    public bfhb(Context context, bgns bgns, bgmk bgmk) {
        this.f113871j = new bffr(context);
        this.f113864c = bgmk;
        int i = bfib.f113998b;
        this.f113863b = bgns;
    }

    /* renamed from: a */
    public final void mo61685a(boolean z, long j) {
        synchronized (this.f113865d) {
            bfha bfha = this.f113867f;
            if (bfha != null) {
                this.f113871j.mo61625a(bfha);
            }
            this.f113866e = z;
            this.f113868g = false;
            this.f113869h = j;
            this.f113863b.mo62925c(bgnq.COLLECTIONLIB);
        }
    }

    /* renamed from: b */
    public final long mo61687b() {
        long j;
        synchronized (this.f113865d) {
            j = this.f113869h;
        }
        return j;
    }

    /* renamed from: a */
    public final boolean mo61686a() {
        boolean z;
        synchronized (this.f113865d) {
            z = this.f113866e;
        }
        return z;
    }
}
