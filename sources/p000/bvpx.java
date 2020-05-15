package p000;

/* renamed from: bvpx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvpx extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bvpx f157351a;

    /* renamed from: b */
    private static volatile bxxk f157352b;

    static {
        bvpx bvpx = new bvpx();
        f157351a = bvpx;
        GeneratedMessageLite.m124024a(bvpx.class, bvpx);
    }

    private bvpx() {
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
            return GeneratedMessageLite.m124022a(f157351a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvpx();
        }
        if (i2 == 4) {
            return new bxvd(f157351a);
        }
        if (i2 == 5) {
            return f157351a;
        }
        bxxk bxxk = f157352b;
        if (bxxk == null) {
            synchronized (bvpx.class) {
                bxxk = f157352b;
                if (bxxk == null) {
                    bxxk = new bxve(f157351a);
                    f157352b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
