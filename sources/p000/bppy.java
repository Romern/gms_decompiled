package p000;

/* renamed from: bppy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bppy extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bppy f138674c;

    /* renamed from: d */
    private static volatile bxxk f138675d;

    /* renamed from: a */
    public int f138676a;

    /* renamed from: b */
    public int f138677b;

    static {
        bppy bppy = new bppy();
        f138674c = bppy;
        GeneratedMessageLite.m124024a(bppy.class, bppy);
    }

    private bppy() {
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
            return GeneratedMessageLite.m124022a(f138674c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bppx.f138673a});
        } else if (i2 == 3) {
            return new bppy();
        } else {
            if (i2 == 4) {
                return new bxvd(f138674c);
            }
            if (i2 == 5) {
                return f138674c;
            }
            bxxk bxxk = f138675d;
            if (bxxk == null) {
                synchronized (bppy.class) {
                    bxxk = f138675d;
                    if (bxxk == null) {
                        bxxk = new bxve(f138674c);
                        f138675d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
