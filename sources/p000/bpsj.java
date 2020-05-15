package p000;

/* renamed from: bpsj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpsj extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bpsj f138964a;

    /* renamed from: b */
    private static volatile bxxk f138965b;

    static {
        bpsj bpsj = new bpsj();
        f138964a = bpsj;
        GeneratedMessageLite.m124024a(bpsj.class, bpsj);
    }

    private bpsj() {
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
            return GeneratedMessageLite.m124022a(f138964a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bpsj();
        }
        if (i2 == 4) {
            return new bxvd(f138964a);
        }
        if (i2 == 5) {
            return f138964a;
        }
        bxxk bxxk = f138965b;
        if (bxxk == null) {
            synchronized (bpsj.class) {
                bxxk = f138965b;
                if (bxxk == null) {
                    bxxk = new bxve(f138964a);
                    f138965b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
