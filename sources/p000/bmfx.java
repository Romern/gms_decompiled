package p000;

/* renamed from: bmfx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmfx extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bxvu f129183b = new bmfw();

    /* renamed from: d */
    public static final bmfx f129184d;

    /* renamed from: f */
    private static volatile bxxk f129185f;

    /* renamed from: a */
    public bxvt f129186a = bxvm.f164965b;

    /* renamed from: c */
    public String f129187c = "";

    /* renamed from: e */
    private int f129188e;

    static {
        bmfx bmfx = new bmfx();
        f129184d = bmfx;
        GeneratedMessageLite.m124024a(bmfx.class, bmfx);
    }

    private bmfx() {
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
            return GeneratedMessageLite.m124022a(f129184d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001e\u0002ဈ\u0000", new Object[]{"e", "a", bmfk.m107977b(), "c"});
        } else if (i2 == 3) {
            return new bmfx();
        } else {
            if (i2 == 4) {
                return new bxvd(f129184d);
            }
            if (i2 == 5) {
                return f129184d;
            }
            bxxk bxxk = f129185f;
            if (bxxk == null) {
                synchronized (bmfx.class) {
                    bxxk = f129185f;
                    if (bxxk == null) {
                        bxxk = new bxve(f129184d);
                        f129185f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
