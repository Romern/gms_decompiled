package p000;

/* renamed from: bvtd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvtd extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bvtd f157558a;

    /* renamed from: b */
    private static volatile bxxk f157559b;

    static {
        bvtd bvtd = new bvtd();
        f157558a = bvtd;
        GeneratedMessageLite.m124024a(bvtd.class, bvtd);
    }

    private bvtd() {
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
            return GeneratedMessageLite.m124022a(f157558a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvtd();
        }
        if (i2 == 4) {
            return new bxvd(f157558a);
        }
        if (i2 == 5) {
            return f157558a;
        }
        bxxk bxxk = f157559b;
        if (bxxk == null) {
            synchronized (bvtd.class) {
                bxxk = f157559b;
                if (bxxk == null) {
                    bxxk = new bxve(f157558a);
                    f157559b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
