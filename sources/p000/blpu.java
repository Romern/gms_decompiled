package p000;

/* renamed from: blpu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blpu extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final blpu f127295d;

    /* renamed from: e */
    private static volatile bxxk f127296e;

    /* renamed from: a */
    public int f127297a;

    /* renamed from: b */
    public blrk f127298b;

    /* renamed from: c */
    public bxwc f127299c = bxxn.f165040b;

    static {
        blpu blpu = new blpu();
        f127295d = blpu;
        GeneratedMessageLite.m124024a(blpu.class, blpu);
    }

    private blpu() {
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
            return GeneratedMessageLite.m124022a(f127295d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"a", "b", "c", blox.class});
        } else if (i2 == 3) {
            return new blpu();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[]) null, (int[][][]) null);
            }
            if (i2 == 5) {
                return f127295d;
            }
            bxxk bxxk = f127296e;
            if (bxxk == null) {
                synchronized (blpu.class) {
                    bxxk = f127296e;
                    if (bxxk == null) {
                        bxxk = new bxve(f127295d);
                        f127296e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
