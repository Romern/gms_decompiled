package p000;

/* renamed from: bkt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkt extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bkt f5033a;

    /* renamed from: b */
    private static volatile bxxk f5034b;

    static {
        bkt bkt = new bkt();
        f5033a = bkt;
        bxvk.m124024a(bkt.class, bkt);
    }

    private bkt() {
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
            return bxvk.m124022a(f5033a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bkt();
        }
        if (i2 == 4) {
            return new bxvd(f5033a);
        }
        if (i2 == 5) {
            return f5033a;
        }
        bxxk bxxk = f5034b;
        if (bxxk == null) {
            synchronized (bkt.class) {
                bxxk = f5034b;
                if (bxxk == null) {
                    bxxk = new bxve(f5033a);
                    f5034b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
