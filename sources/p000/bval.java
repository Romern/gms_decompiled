package p000;

/* renamed from: bval */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bval extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bval f155487d;

    /* renamed from: f */
    private static volatile bxxk f155488f;

    /* renamed from: a */
    public int f155489a;

    /* renamed from: b */
    public buzo f155490b;

    /* renamed from: c */
    public buzq f155491c;

    /* renamed from: e */
    private byte f155492e = 2;

    static {
        bval bval = new bval();
        f155487d = bval;
        bxvk.m124024a(bval.class, bval);
    }

    private bval() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f155492e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f155492e = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f155487d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bval();
        } else {
            if (i2 == 4) {
                return new bxvd(f155487d);
            }
            if (i2 == 5) {
                return f155487d;
            }
            bxxk bxxk = f155488f;
            if (bxxk == null) {
                synchronized (bval.class) {
                    bxxk = f155488f;
                    if (bxxk == null) {
                        bxxk = new bxve(f155487d);
                        f155488f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
