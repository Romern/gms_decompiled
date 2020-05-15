package p000;

/* renamed from: blrg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blrg extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final blrg f127444d;

    /* renamed from: f */
    private static volatile bxxk f127445f;

    /* renamed from: a */
    public int f127446a;

    /* renamed from: b */
    public int f127447b = 1;

    /* renamed from: c */
    public blnu f127448c;

    /* renamed from: e */
    private byte f127449e = 2;

    static {
        blrg blrg = new blrg();
        f127444d = blrg;
        GeneratedMessageLite.m124024a(blrg.class, blrg);
    }

    private blrg() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f127449e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f127449e = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f127444d, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0001\u0001ဌ\u0000\u0004ᐉ\u0003", new Object[]{"a", "b", blrf.f127443a, "c"});
        } else if (i2 == 3) {
            return new blrg();
        } else {
            if (i2 == 4) {
                return new bxvd(f127444d);
            }
            if (i2 == 5) {
                return f127444d;
            }
            bxxk bxxk = f127445f;
            if (bxxk == null) {
                synchronized (blrg.class) {
                    bxxk = f127445f;
                    if (bxxk == null) {
                        bxxk = new bxve(f127444d);
                        f127445f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
