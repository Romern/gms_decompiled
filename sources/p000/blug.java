package p000;

/* renamed from: blug */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blug extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final blug f127799d;

    /* renamed from: e */
    private static volatile bxxk f127800e;

    /* renamed from: a */
    public int f127801a;

    /* renamed from: b */
    public bltw f127802b;

    /* renamed from: c */
    public bltx f127803c;

    static {
        blug blug = new blug();
        f127799d = blug;
        GeneratedMessageLite.m124024a(blug.class, blug);
    }

    private blug() {
        bxxn bxxn = bxxn.f165040b;
        bxvm bxvm = bxvm.f164965b;
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
            return GeneratedMessageLite.m124022a(f127799d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new blug();
        } else {
            if (i2 == 4) {
                return new bxvd(f127799d);
            }
            if (i2 == 5) {
                return f127799d;
            }
            bxxk bxxk = f127800e;
            if (bxxk == null) {
                synchronized (blug.class) {
                    bxxk = f127800e;
                    if (bxxk == null) {
                        bxxk = new bxve(f127799d);
                        f127800e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
