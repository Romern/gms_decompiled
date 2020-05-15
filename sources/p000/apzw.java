package p000;

/* renamed from: apzw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apzw extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final apzw f85318g;

    /* renamed from: h */
    private static volatile bxxk f85319h;

    /* renamed from: a */
    public int f85320a;

    /* renamed from: b */
    public int f85321b;

    /* renamed from: c */
    public String f85322c = "";

    /* renamed from: d */
    public long f85323d;

    /* renamed from: e */
    public bxwc f85324e = bxxn.f165040b;

    /* renamed from: f */
    public String f85325f = "";

    static {
        apzw apzw = new apzw();
        f85318g = apzw;
        GeneratedMessageLite.m124024a(apzw.class, apzw);
    }

    private apzw() {
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
            return GeneratedMessageLite.m124022a(f85318g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004\u001b\u0005ဈ\u0003", new Object[]{"a", "b", "c", "d", "e", apzg.class, "f"});
        } else if (i2 == 3) {
            return new apzw();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][][]) null, (boolean[][]) null);
            }
            if (i2 == 5) {
                return f85318g;
            }
            bxxk bxxk = f85319h;
            if (bxxk == null) {
                synchronized (apzw.class) {
                    bxxk = f85319h;
                    if (bxxk == null) {
                        bxxk = new bxve(f85318g);
                        f85319h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
