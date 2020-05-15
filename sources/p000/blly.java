package p000;

/* renamed from: blly */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blly extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final blly f126820h;

    /* renamed from: i */
    private static volatile bxxk f126821i;

    /* renamed from: a */
    public int f126822a;

    /* renamed from: b */
    public int f126823b;

    /* renamed from: c */
    public int f126824c;

    /* renamed from: d */
    public String f126825d = "";

    /* renamed from: e */
    public boolean f126826e;

    /* renamed from: f */
    public float f126827f;

    /* renamed from: g */
    public double f126828g;

    static {
        blly blly = new blly();
        f126820h = blly;
        GeneratedMessageLite.m124024a(blly.class, blly);
    }

    private blly() {
        ByteString bxtx = bxtx.f164797b;
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
            return GeneratedMessageLite.m124022a(f126820h, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0003င\u0002\u0005ဈ\u0004\u0006ဇ\u0005\u0007ခ\u0006\bက\u0007", new Object[]{"a", "b", bllx.m107352b(), "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new blly();
        } else {
            if (i2 == 4) {
                return new bxvd(f126820h);
            }
            if (i2 == 5) {
                return f126820h;
            }
            bxxk bxxk = f126821i;
            if (bxxk == null) {
                synchronized (blly.class) {
                    bxxk = f126821i;
                    if (bxxk == null) {
                        bxxk = new bxve(f126820h);
                        f126821i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
