package p000;

/* renamed from: bkzw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkzw extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bkzw f125704a;

    /* renamed from: e */
    private static volatile bxxk f125705e;

    /* renamed from: b */
    private int f125706b;

    /* renamed from: c */
    private int f125707c;

    /* renamed from: d */
    private byte f125708d = 2;

    static {
        bkzw bkzw = new bkzw();
        f125704a = bkzw;
        bxvk.m124024a(bkzw.class, bkzw);
    }

    private bkzw() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f125708d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f125708d = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f125704a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔌ\u0000", new Object[]{"b", "c", blgc.f126419a});
        } else if (i2 == 3) {
            return new bkzw();
        } else {
            if (i2 == 4) {
                return new bxvd(f125704a);
            }
            if (i2 == 5) {
                return f125704a;
            }
            bxxk bxxk = f125705e;
            if (bxxk == null) {
                synchronized (bkzw.class) {
                    bxxk = f125705e;
                    if (bxxk == null) {
                        bxxk = new bxve(f125704a);
                        f125705e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
