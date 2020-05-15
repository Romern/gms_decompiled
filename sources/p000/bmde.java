package p000;

/* renamed from: bmde */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmde extends GeneratedMessageLite implements bxxd {

    /* renamed from: k */
    public static final bmde f128780k;

    /* renamed from: l */
    private static volatile bxxk f128781l;

    /* renamed from: a */
    public int f128782a;

    /* renamed from: b */
    public long f128783b;

    /* renamed from: c */
    public long f128784c;

    /* renamed from: d */
    public long f128785d;

    /* renamed from: e */
    public String f128786e = "";

    /* renamed from: f */
    public bxwc f128787f = bxxn.f165040b;

    /* renamed from: g */
    public bmnr f128788g;

    /* renamed from: h */
    public String f128789h = "";

    /* renamed from: i */
    public String f128790i = "";

    /* renamed from: j */
    public int f128791j;

    static {
        bmde bmde = new bmde();
        f128780k = bmde;
        GeneratedMessageLite.m124024a(bmde.class, bmde);
    }

    private bmde() {
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
            return GeneratedMessageLite.m124022a(f128780k, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0001\u0000\u0001ဈ\u0003\u0003ဉ\u0004\u0004ဈ\u0005\u0005ဈ\u0006\u0006\u001b\u0007ဂ\u0000\bဌ\u0007\tဂ\u0001\nဂ\u0002", new Object[]{"a", "e", "g", "h", "i", "f", bmnr.class, "b", "j", bmdc.f128779a, "c", "d"});
        } else if (i2 == 3) {
            return new bmde();
        } else {
            if (i2 == 4) {
                return new bxvd((float[]) null, (boolean[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f128780k;
            }
            bxxk bxxk = f128781l;
            if (bxxk == null) {
                synchronized (bmde.class) {
                    bxxk = f128781l;
                    if (bxxk == null) {
                        bxxk = new bxve(f128780k);
                        f128781l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
