package p000;

/* renamed from: byyj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byyj extends bxvk implements bxxd {

    /* renamed from: c */
    public static final byyj f168939c;

    /* renamed from: d */
    private static volatile bxxk f168940d;

    /* renamed from: a */
    public int f168941a;

    /* renamed from: b */
    public boolean f168942b = true;

    static {
        byyj byyj = new byyj();
        f168939c = byyj;
        bxvk.m124024a(byyj.class, byyj);
    }

    private byyj() {
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
            return bxvk.m124022a(f168939c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new byyj();
        } else {
            if (i2 == 4) {
                return new byyi();
            }
            if (i2 == 5) {
                return f168939c;
            }
            bxxk bxxk = f168940d;
            if (bxxk == null) {
                synchronized (byyj.class) {
                    bxxk = f168940d;
                    if (bxxk == null) {
                        bxxk = new bxve(f168939c);
                        f168940d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
