package p000;

/* renamed from: bmra */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmra extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bmra f130453e;

    /* renamed from: f */
    private static volatile bxxk f130454f;

    /* renamed from: a */
    public int f130455a;

    /* renamed from: b */
    public int f130456b = 0;

    /* renamed from: c */
    public Object f130457c;

    /* renamed from: d */
    public int f130458d;

    static {
        bmra bmra = new bmra();
        f130453e = bmra;
        GeneratedMessageLite.m124024a(bmra.class, bmra);
    }

    private bmra() {
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
            return GeneratedMessageLite.m124022a(f130453e, "\u0001\u0002\u0001\u0001\u0002\u0005\u0002\u0000\u0000\u0000\u0002ဌ\u0000\u0005ြ\u0000", new Object[]{"c", "b", "a", "d", bmqy.f130452a, bmqx.class});
        } else if (i2 == 3) {
            return new bmra();
        } else {
            if (i2 == 4) {
                return new bxvd(f130453e);
            }
            if (i2 == 5) {
                return f130453e;
            }
            bxxk bxxk = f130454f;
            if (bxxk == null) {
                synchronized (bmra.class) {
                    bxxk = f130454f;
                    if (bxxk == null) {
                        bxxk = new bxve(f130453e);
                        f130454f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
