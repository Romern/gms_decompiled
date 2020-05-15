package p000;

/* renamed from: amnd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amnd extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final amnd f75435f;

    /* renamed from: g */
    private static volatile bxxk f75436g;

    /* renamed from: a */
    public int f75437a;

    /* renamed from: b */
    public int f75438b;

    /* renamed from: c */
    public long f75439c;

    /* renamed from: d */
    public long f75440d;

    /* renamed from: e */
    public long f75441e;

    static {
        amnd amnd = new amnd();
        f75435f = amnd;
        GeneratedMessageLite.m124024a(amnd.class, amnd);
    }

    private amnd() {
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
            return GeneratedMessageLite.m124022a(f75435f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"a", "b", amjl.f74999a, "c", "d", "e"});
        } else if (i2 == 3) {
            return new amnd();
        } else {
            if (i2 == 4) {
                return new bxvd(f75435f);
            }
            if (i2 == 5) {
                return f75435f;
            }
            bxxk bxxk = f75436g;
            if (bxxk == null) {
                synchronized (amnd.class) {
                    bxxk = f75436g;
                    if (bxxk == null) {
                        bxxk = new bxve(f75435f);
                        f75436g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
