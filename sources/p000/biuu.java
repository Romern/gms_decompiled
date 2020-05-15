package p000;

/* renamed from: biuu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biuu extends bxvk implements bxxd {

    /* renamed from: b */
    public static final biuu f121876b;

    /* renamed from: e */
    private static volatile bxxk f121877e;

    /* renamed from: a */
    public int f121878a = 1;

    /* renamed from: c */
    private int f121879c;

    /* renamed from: d */
    private byte f121880d = 2;

    static {
        biuu biuu = new biuu();
        f121876b = biuu;
        bxvk.m124024a(biuu.class, biuu);
    }

    private biuu() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121880d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121880d = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f121876b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔌ\u0000", new Object[]{"c", "a", bisf.m102782b()});
        } else if (i2 == 3) {
            return new biuu();
        } else {
            if (i2 == 4) {
                return new bxvd(f121876b);
            }
            if (i2 == 5) {
                return f121876b;
            }
            bxxk bxxk = f121877e;
            if (bxxk == null) {
                synchronized (biuu.class) {
                    bxxk = f121877e;
                    if (bxxk == null) {
                        bxxk = new bxve(f121876b);
                        f121877e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
