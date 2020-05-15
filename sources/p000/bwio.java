package p000;

/* renamed from: bwio */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwio extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bwio f159659d;

    /* renamed from: e */
    private static volatile bxxk f159660e;

    /* renamed from: a */
    public int f159661a;

    /* renamed from: b */
    public long f159662b;

    /* renamed from: c */
    public bwip f159663c;

    static {
        bwio bwio = new bwio();
        f159659d = bwio;
        GeneratedMessageLite.m124024a(bwio.class, bwio);
    }

    private bwio() {
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
            return GeneratedMessageLite.m124022a(f159659d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bwio();
        } else {
            if (i2 == 4) {
                return new bxvd(f159659d);
            }
            if (i2 == 5) {
                return f159659d;
            }
            bxxk bxxk = f159660e;
            if (bxxk == null) {
                synchronized (bwio.class) {
                    bxxk = f159660e;
                    if (bxxk == null) {
                        bxxk = new bxve(f159659d);
                        f159660e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
