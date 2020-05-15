package p000;

/* renamed from: btyk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btyk extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final btyk f152930f;

    /* renamed from: g */
    private static volatile bxxk f152931g;

    /* renamed from: a */
    public int f152932a;

    /* renamed from: b */
    public int f152933b = 0;

    /* renamed from: c */
    public Object f152934c;

    /* renamed from: d */
    public int f152935d;

    /* renamed from: e */
    public int f152936e;

    static {
        btyk btyk = new btyk();
        f152930f = btyk;
        GeneratedMessageLite.m124024a(btyk.class, btyk);
    }

    private btyk() {
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
            return GeneratedMessageLite.m124022a(f152930f, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000", new Object[]{"c", "b", "a", "d", "e", btyi.f152929a, btyp.class, btyp.class, btyp.class});
        } else if (i2 == 3) {
            return new btyk();
        } else {
            if (i2 == 4) {
                return new bxvd(f152930f);
            }
            if (i2 == 5) {
                return f152930f;
            }
            bxxk bxxk = f152931g;
            if (bxxk == null) {
                synchronized (btyk.class) {
                    bxxk = f152931g;
                    if (bxxk == null) {
                        bxxk = new bxve(f152930f);
                        f152931g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
