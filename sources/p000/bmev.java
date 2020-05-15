package p000;

/* renamed from: bmev */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmev extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bmev f129037e;

    /* renamed from: g */
    private static volatile bxxk f129038g;

    /* renamed from: a */
    public long f129039a;

    /* renamed from: b */
    public String f129040b = "";

    /* renamed from: c */
    public String f129041c = "";

    /* renamed from: d */
    public String f129042d = "";

    /* renamed from: f */
    private int f129043f;

    static {
        bmev bmev = new bmev();
        f129037e = bmev;
        GeneratedMessageLite.m124024a(bmev.class, bmev);
    }

    private bmev() {
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
            return GeneratedMessageLite.m124022a(f129037e, "\u0001\u0004\u0000\u0001\u0003\b\u0004\u0000\u0000\u0000\u0003ဈ\u0001\u0004ဈ\u0003\u0005ဂ\u0000\bဈ\u0004", new Object[]{"f", "b", "c", "a", "d"});
        } else if (i2 == 3) {
            return new bmev();
        } else {
            if (i2 == 4) {
                return new bxvd(f129037e);
            }
            if (i2 == 5) {
                return f129037e;
            }
            bxxk bxxk = f129038g;
            if (bxxk == null) {
                synchronized (bmev.class) {
                    bxxk = f129038g;
                    if (bxxk == null) {
                        bxxk = new bxve(f129037e);
                        f129038g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
