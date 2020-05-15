package p000;

/* renamed from: afbj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afbj extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final afbj f64141a;

    /* renamed from: b */
    private static volatile bxxk f64142b;

    static {
        afbj afbj = new afbj();
        f64141a = afbj;
        GeneratedMessageLite.m124024a(afbj.class, afbj);
    }

    private afbj() {
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
            return GeneratedMessageLite.m124022a(f64141a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new afbj();
        }
        if (i2 == 4) {
            return new bxvd(f64141a);
        }
        if (i2 == 5) {
            return f64141a;
        }
        bxxk bxxk = f64142b;
        if (bxxk == null) {
            synchronized (afbj.class) {
                bxxk = f64142b;
                if (bxxk == null) {
                    bxxk = new bxve(f64141a);
                    f64142b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
