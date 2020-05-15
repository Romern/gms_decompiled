package p000;

/* renamed from: bloj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bloj extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bloj f127093e;

    /* renamed from: f */
    private static volatile bxxk f127094f;

    /* renamed from: a */
    public int f127095a;

    /* renamed from: b */
    public bxvt f127096b = bxvm.f164965b;

    /* renamed from: c */
    public int f127097c = 1;

    /* renamed from: d */
    public int f127098d;

    static {
        bloj bloj = new bloj();
        f127093e = bloj;
        GeneratedMessageLite.m124024a(bloj.class, bloj);
    }

    private bloj() {
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
            return GeneratedMessageLite.m124022a(f127093e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001\u0016\u0003ဌ\u0002\u0004င\u0003", new Object[]{"a", "b", "c", bloo.m107422b(), "d"});
        } else if (i2 == 3) {
            return new bloj();
        } else {
            if (i2 == 4) {
                return new bxvd((float[]) null, (short[][]) null);
            }
            if (i2 == 5) {
                return f127093e;
            }
            bxxk bxxk = f127094f;
            if (bxxk == null) {
                synchronized (bloj.class) {
                    bxxk = f127094f;
                    if (bxxk == null) {
                        bxxk = new bxve(f127093e);
                        f127094f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
