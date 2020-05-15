package p000;

/* renamed from: bexo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bexo {

    /* renamed from: a */
    int f112964a = 0;

    /* renamed from: b */
    int f112965b = 0;

    /* renamed from: c */
    int f112966c = -1;

    /* renamed from: d */
    private static final int m96038d(int i) {
        if (i == 7 || i == 8) {
            return 2;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo61234a(int i) {
        bxbm.m122544b(i != 3);
        int d = m96038d(i);
        if (d != this.f112966c) {
            this.f112966c = d;
            this.f112964a = 0;
            this.f112965b = 0;
        }
        this.f112964a++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo61235b(int i) {
        if (this.f112966c != 3) {
            this.f112966c = 3;
            this.f112964a = 0;
            this.f112965b = 0;
        }
        if (((long) i) > cesh.m138176h()) {
            this.f112965b++;
        } else {
            this.f112965b = 0;
        }
        this.f112964a++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo61236c(int i) {
        if (m96038d(i) == this.f112966c) {
            return this.f112964a;
        }
        return 0;
    }
}
