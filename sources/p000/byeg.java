package p000;

/* renamed from: byeg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byeg extends bxvk implements bxxd {

    /* renamed from: d */
    public static final byeg f165899d;

    /* renamed from: e */
    private static volatile bxxk f165900e;

    /* renamed from: a */
    public int f165901a;

    /* renamed from: b */
    public int f165902b;

    /* renamed from: c */
    public bxww f165903c = bxww.f165013b;

    static {
        byeg byeg = new byeg();
        f165899d = byeg;
        bxvk.m124024a(byeg.class, byeg);
    }

    private byeg() {
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
            return bxvk.m124022a(f165899d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001င\u0000\u00022", new Object[]{"a", "b", "c", byef.f165898a});
        } else if (i2 == 3) {
            return new byeg();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[]) null, (int[][]) null);
            }
            if (i2 == 5) {
                return f165899d;
            }
            bxxk bxxk = f165900e;
            if (bxxk == null) {
                synchronized (byeg.class) {
                    bxxk = f165900e;
                    if (bxxk == null) {
                        bxxk = new bxve(f165899d);
                        f165900e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
