package p000;

/* renamed from: bzce */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzce extends bxvg implements bxvh {

    /* renamed from: c */
    public static final bzce f169306c;

    /* renamed from: f */
    private static volatile bxxk f169307f;

    /* renamed from: a */
    public int f169308a;

    /* renamed from: b */
    public bxwc f169309b = bxxn.f165040b;

    /* renamed from: d */
    private int f169310d;

    /* renamed from: e */
    private byte f169311e = 2;

    static {
        bzce bzce = new bzce();
        f169306c = bzce;
        GeneratedMessageLite.m124024a(bzce.class, bzce);
    }

    private bzce() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f169311e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f169311e = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f169306c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0003\u001b", new Object[]{"d", "a", bxbf.m122515b(), "b", byzg.class});
        } else if (i2 == 3) {
            return new bzce();
        } else {
            if (i2 == 4) {
                return new bxvf(f169306c);
            }
            if (i2 == 5) {
                return f169306c;
            }
            bxxk bxxk = f169307f;
            if (bxxk == null) {
                synchronized (bzce.class) {
                    bxxk = f169307f;
                    if (bxxk == null) {
                        bxxk = new bxve(f169306c);
                        f169307f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
