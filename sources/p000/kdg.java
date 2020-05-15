package p000;

/* renamed from: kdg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kdg extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final kdg f23871j;

    /* renamed from: k */
    private static volatile bxxk f23872k;

    /* renamed from: a */
    public int f23873a;

    /* renamed from: b */
    public String f23874b = "";

    /* renamed from: c */
    public String f23875c = "";

    /* renamed from: d */
    public String f23876d = "";

    /* renamed from: e */
    public String f23877e = "";

    /* renamed from: f */
    public String f23878f = "";

    /* renamed from: g */
    public String f23879g = "";

    /* renamed from: h */
    public bxwc f23880h = bxxn.f165040b;

    /* renamed from: i */
    public String f23881i = "";

    static {
        kdg kdg = new kdg();
        f23871j = kdg;
        GeneratedMessageLite.m124024a(kdg.class, kdg);
    }

    private kdg() {
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
            return GeneratedMessageLite.m124022a(f23871j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\b\u001a\tဈ\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
        } else if (i2 == 3) {
            return new kdg();
        } else {
            if (i2 == 4) {
                return new bxvd(f23871j);
            }
            if (i2 == 5) {
                return f23871j;
            }
            bxxk bxxk = f23872k;
            if (bxxk == null) {
                synchronized (kdg.class) {
                    bxxk = f23872k;
                    if (bxxk == null) {
                        bxxk = new bxve(f23871j);
                        f23872k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
