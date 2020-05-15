package p000;

/* renamed from: bsqq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsqq extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bsqq f146675b;

    /* renamed from: c */
    private static volatile bxxk f146676c;

    /* renamed from: a */
    public bxvt f146677a = bxvm.f164965b;

    static {
        bsqq bsqq = new bsqq();
        f146675b = bsqq;
        bxvk.m124024a(bsqq.class, bsqq);
    }

    private bsqq() {
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
            return bxvk.m124022a(f146675b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0016", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bsqq();
        } else {
            if (i2 == 4) {
                return new bsqp();
            }
            if (i2 == 5) {
                return f146675b;
            }
            bxxk bxxk = f146676c;
            if (bxxk == null) {
                synchronized (bsqq.class) {
                    bxxk = f146676c;
                    if (bxxk == null) {
                        bxxk = new bxve(f146675b);
                        f146676c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo70705a() {
        if (!this.f146677a.mo73666a()) {
            this.f146677a = bxvk.m124019a(this.f146677a);
        }
    }
}
