package p000;

/* renamed from: bsqw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsqw extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bsqw f146695g;

    /* renamed from: h */
    private static volatile bxxk f146696h;

    /* renamed from: a */
    public int f146697a;

    /* renamed from: b */
    public bxwc f146698b = bxxn.f165040b;

    /* renamed from: c */
    public bsrc f146699c;

    /* renamed from: d */
    public bsrc f146700d;

    /* renamed from: e */
    public bsrf f146701e;

    /* renamed from: f */
    public bssm f146702f;

    static {
        bsqw bsqw = new bsqw();
        f146695g = bsqw;
        bxvk.m124024a(bsqw.class, bsqw);
    }

    private bsqw() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            return bxvk.m124022a(f146695g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0002\u0003ဉ\u0003\u0004ဉ\u0000\u0005ဉ\u0001", new Object[]{"a", "b", bsre.class, "e", "f", "c", "d"});
        } else if (i2 == 3) {
            return new bsqw();
        } else {
            if (i2 == 4) {
                return new bsqv();
            }
            if (i2 == 5) {
                return f146695g;
            }
            bxxk bxxk = f146696h;
            if (bxxk == null) {
                synchronized (bsqw.class) {
                    bxxk = f146696h;
                    if (bxxk == null) {
                        bxxk = new bxve(f146695g);
                        f146696h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo70708a() {
        if (!this.f146698b.mo73666a()) {
            this.f146698b = bxvk.m124021a(this.f146698b);
        }
    }
}
