package p000;

/* renamed from: cadr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cadr extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final cadr f172717f;

    /* renamed from: g */
    private static volatile bxxk f172718g;

    /* renamed from: a */
    public int f172719a;

    /* renamed from: b */
    public caae f172720b;

    /* renamed from: c */
    public caah f172721c;

    /* renamed from: d */
    public long f172722d;

    /* renamed from: e */
    public int f172723e;

    static {
        cadr cadr = new cadr();
        f172717f = cadr;
        GeneratedMessageLite.m124024a(cadr.class, cadr);
    }

    private cadr() {
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
            return GeneratedMessageLite.m124022a(f172717f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004င\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new cadr();
        } else {
            if (i2 == 4) {
                return new bxvd(f172717f);
            }
            if (i2 == 5) {
                return f172717f;
            }
            bxxk bxxk = f172718g;
            if (bxxk == null) {
                synchronized (cadr.class) {
                    bxxk = f172718g;
                    if (bxxk == null) {
                        bxxk = new bxve(f172717f);
                        f172718g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
