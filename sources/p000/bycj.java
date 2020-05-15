package p000;

/* renamed from: bycj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bycj extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bycj f165658a;

    /* renamed from: b */
    private static volatile bxxk f165659b;

    static {
        bycj bycj = new bycj();
        f165658a = bycj;
        GeneratedMessageLite.m124024a(bycj.class, bycj);
    }

    private bycj() {
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
            return GeneratedMessageLite.m124022a(f165658a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bycj();
        }
        if (i2 == 4) {
            return new bxvd(f165658a);
        }
        if (i2 == 5) {
            return f165658a;
        }
        bxxk bxxk = f165659b;
        if (bxxk == null) {
            synchronized (bycj.class) {
                bxxk = f165659b;
                if (bxxk == null) {
                    bxxk = new bxve(f165658a);
                    f165659b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
