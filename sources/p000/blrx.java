package p000;

/* renamed from: blrx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blrx extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final blrx f127545f;

    /* renamed from: g */
    private static volatile bxxk f127546g;

    /* renamed from: a */
    public int f127547a;

    /* renamed from: b */
    public int f127548b = 0;

    /* renamed from: c */
    public Object f127549c;

    /* renamed from: d */
    public bxwc f127550d = bxxn.f165040b;

    /* renamed from: e */
    public String f127551e = "";

    static {
        blrx blrx = new blrx();
        f127545f = blrx;
        GeneratedMessageLite.m124024a(blrx.class, blrx);
    }

    private blrx() {
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
            return GeneratedMessageLite.m124022a(f127545f, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000\u0003ျ\u0000\u0004ွ\u0000", new Object[]{"c", "b", "a", "d", "e"});
        } else if (i2 == 3) {
            return new blrx();
        } else {
            if (i2 == 4) {
                return new bxvd((float[]) null, (float[][][]) null);
            }
            if (i2 == 5) {
                return f127545f;
            }
            bxxk bxxk = f127546g;
            if (bxxk == null) {
                synchronized (blrx.class) {
                    bxxk = f127546g;
                    if (bxxk == null) {
                        bxxk = new bxve(f127545f);
                        f127546g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
