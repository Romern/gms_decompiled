package p000;

/* renamed from: bmaw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmaw extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bmaw f128509f;

    /* renamed from: g */
    private static volatile bxxk f128510g;

    /* renamed from: a */
    public int f128511a;

    /* renamed from: b */
    public long f128512b;

    /* renamed from: c */
    public String f128513c = "";

    /* renamed from: d */
    public String f128514d = "";

    /* renamed from: e */
    public bmno f128515e;

    static {
        bmaw bmaw = new bmaw();
        f128509f = bmaw;
        GeneratedMessageLite.m124024a(bmaw.class, bmaw);
    }

    private bmaw() {
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
            return GeneratedMessageLite.m124022a(f128509f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0002\u0003ဉ\u0003\u0004ဈ\u0001", new Object[]{"a", "b", "d", "e", "c"});
        } else if (i2 == 3) {
            return new bmaw();
        } else {
            if (i2 == 4) {
                return new bxvd(f128509f);
            }
            if (i2 == 5) {
                return f128509f;
            }
            bxxk bxxk = f128510g;
            if (bxxk == null) {
                synchronized (bmaw.class) {
                    bxxk = f128510g;
                    if (bxxk == null) {
                        bxxk = new bxve(f128509f);
                        f128510g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
