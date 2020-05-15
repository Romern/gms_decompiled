package p000;

import java.io.InputStream;

/* renamed from: bwdg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bwdg extends bwcv implements bwcg {

    /* renamed from: a */
    protected bwdf f158888a;

    /* renamed from: b */
    public long f158889b = -1;

    /* renamed from: c */
    public long f158890c = -1;

    /* renamed from: d */
    public long f158891d = -1;

    /* renamed from: e */
    public boolean f158892e = false;

    /* renamed from: f */
    private int f158893f = 1;

    /* renamed from: g */
    private int f158894g = -1;

    /* renamed from: a */
    public abstract int mo73458a();

    /* renamed from: a */
    public final synchronized void mo73504a(bwdf bwdf) {
        this.f158888a = bwdf;
    }

    /* renamed from: a */
    public final synchronized boolean mo73505a(long j) {
        if (this.f158891d + 20000 >= j) {
            return this.f158893f > 0;
        }
        return false;
    }

    /* renamed from: b */
    public abstract InputStream mo73459b();

    /* renamed from: b */
    public final synchronized void mo73506b(int i) {
        this.f158894g = i;
    }

    /* renamed from: d */
    public abstract void mo73500d();

    /* renamed from: g */
    public final synchronized bwdf mo73508g() {
        return this.f158888a;
    }

    /* renamed from: h */
    public final synchronized void mo73509h() {
        this.f158893f--;
    }

    /* renamed from: i */
    public final synchronized int mo73510i() {
        return this.f158894g;
    }

    /* renamed from: j */
    public final synchronized boolean mo73511j() {
        if (this.f158892e) {
            return false;
        }
        this.f158892e = true;
        return true;
    }

    /* renamed from: b */
    public final synchronized void mo73507b(long j) {
        long j2 = 3000 + j;
        this.f158889b = j2;
        long j3 = j + 5000;
        this.f158890c = j3;
        this.f158890c = Math.max(j3, j2);
    }
}
