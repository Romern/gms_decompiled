package p000;

/* renamed from: mph */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mph extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final mph f34141f;

    /* renamed from: g */
    private static volatile bxxk f34142g;

    /* renamed from: a */
    public int f34143a;

    /* renamed from: b */
    public int f34144b = 0;

    /* renamed from: c */
    public Object f34145c;

    /* renamed from: d */
    public String f34146d = "";

    /* renamed from: e */
    public long f34147e;

    static {
        mph mph = new mph();
        f34141f = mph;
        GeneratedMessageLite.m124024a(mph.class, mph);
    }

    private mph() {
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
            return GeneratedMessageLite.m124022a(f34141f, "\u0001\u0006\u0001\u0001\u0001g\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001dြ\u0000eြ\u0000fြ\u0000gြ\u0000", new Object[]{"c", "b", "a", "d", "e", mpf.class, moy.class, mpr.class, mov.class});
        } else if (i2 == 3) {
            return new mph();
        } else {
            if (i2 == 4) {
                return new bxvd(f34141f);
            }
            if (i2 == 5) {
                return f34141f;
            }
            bxxk bxxk = f34142g;
            if (bxxk == null) {
                synchronized (mph.class) {
                    bxxk = f34142g;
                    if (bxxk == null) {
                        bxxk = new bxve(f34141f);
                        f34142g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
