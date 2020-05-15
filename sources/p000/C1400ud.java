package p000;

/* renamed from: ud */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1400ud implements C1411uo {

    /* renamed from: a */
    final C1411uo f27241a;

    /* renamed from: b */
    int f27242b = 0;

    /* renamed from: c */
    int f27243c = -1;

    /* renamed from: d */
    int f27244d = -1;

    /* renamed from: e */
    Object f27245e = null;

    public C1400ud(C1411uo uoVar) {
        this.f27241a = uoVar;
    }

    /* renamed from: a */
    public final void mo16079a() {
        int i = this.f27242b;
        if (i != 0) {
            if (i == 1) {
                this.f27241a.mo8384a(this.f27243c, this.f27244d);
            } else if (i != 2) {
                this.f27241a.mo8385a(this.f27243c, this.f27244d, this.f27245e);
            } else {
                this.f27241a.mo8386b(this.f27243c, this.f27244d);
            }
            this.f27245e = null;
            this.f27242b = 0;
        }
    }

    /* renamed from: b */
    public final void mo8386b(int i, int i2) {
        int i3;
        if (this.f27242b == 2 && (i3 = this.f27243c) >= i && i3 <= i + i2) {
            this.f27244d += i2;
            this.f27243c = i;
            return;
        }
        mo16079a();
        this.f27243c = i;
        this.f27244d = i2;
        this.f27242b = 2;
    }

    /* renamed from: c */
    public final void mo8387c(int i, int i2) {
        mo16079a();
        this.f27241a.mo8387c(i, i2);
    }

    /* renamed from: a */
    public final void mo8384a(int i, int i2) {
        int i3;
        if (this.f27242b == 1 && i >= (i3 = this.f27243c)) {
            int i4 = this.f27244d;
            if (i <= i3 + i4) {
                this.f27244d = i4 + i2;
                this.f27243c = Math.min(i, i3);
                return;
            }
        }
        mo16079a();
        this.f27243c = i;
        this.f27244d = i2;
        this.f27242b = 1;
    }

    /* renamed from: a */
    public final void mo8385a(int i, int i2, Object obj) {
        int i3;
        int i4;
        int i5;
        if (this.f27242b != 3 || i > (i4 = this.f27244d + (i3 = this.f27243c)) || (i5 = i + i2) < i3 || this.f27245e != obj) {
            mo16079a();
            this.f27243c = i;
            this.f27244d = i2;
            this.f27245e = obj;
            this.f27242b = 3;
            return;
        }
        this.f27243c = Math.min(i, i3);
        this.f27244d = Math.max(i4, i5) - this.f27243c;
    }
}
