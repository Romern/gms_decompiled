package p000;

/* renamed from: bmep */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmep extends GeneratedMessageLite implements bxxd {

    /* renamed from: k */
    public static final bmep f128978k;

    /* renamed from: l */
    private static volatile bxxk f128979l;

    /* renamed from: a */
    public int f128980a;

    /* renamed from: b */
    public int f128981b = 0;

    /* renamed from: c */
    public Object f128982c;

    /* renamed from: d */
    public long f128983d;

    /* renamed from: e */
    public String f128984e = "";

    /* renamed from: f */
    public bxwc f128985f = bxxn.f165040b;

    /* renamed from: g */
    public String f128986g = "";

    /* renamed from: h */
    public String f128987h = "";

    /* renamed from: i */
    public bmoq f128988i;

    /* renamed from: j */
    public bxwc f128989j = bxxn.f165040b;

    static {
        bmep bmep = new bmep();
        f128978k = bmep;
        GeneratedMessageLite.m124024a(bmep.class, bmep);
    }

    private bmep() {
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
            return GeneratedMessageLite.m124022a(f128978k, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0002\u0000\u0001ဂ\u0000\u0002ျ\u0000\u0003ဈ\u0002\u0004\u001b\u0005ဈ\u0003\u0006ဈ\u0004\u0007\u001b\bဉ\u0005", new Object[]{"c", "b", "a", "d", "e", "f", bmno.class, "g", "h", "j", bmno.class, "i"});
        } else if (i2 == 3) {
            return new bmep();
        } else {
            if (i2 == 4) {
                return new bxvd(f128978k);
            }
            if (i2 == 5) {
                return f128978k;
            }
            bxxk bxxk = f128979l;
            if (bxxk == null) {
                synchronized (bmep.class) {
                    bxxk = f128979l;
                    if (bxxk == null) {
                        bxxk = new bxve(f128978k);
                        f128979l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
