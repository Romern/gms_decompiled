package p000;

/* renamed from: caly */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caly extends bxvk implements bxxd {

    /* renamed from: a */
    public static final caly f175225a;

    /* renamed from: b */
    private static volatile bxxk f175226b;

    static {
        caly caly = new caly();
        f175225a = caly;
        bxvk.m124024a(caly.class, caly);
    }

    private caly() {
        bxxn bxxn = bxxn.f165040b;
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
            return bxvk.m124022a(f175225a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new caly();
        }
        if (i2 == 4) {
            return new bxvd(f175225a);
        }
        if (i2 == 5) {
            return f175225a;
        }
        bxxk bxxk = f175226b;
        if (bxxk == null) {
            synchronized (caly.class) {
                bxxk = f175226b;
                if (bxxk == null) {
                    bxxk = new bxve(f175225a);
                    f175226b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
