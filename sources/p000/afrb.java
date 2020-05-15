package p000;

/* renamed from: afrb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afrb extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final afrb f64595e;

    /* renamed from: f */
    private static volatile bxxk f64596f;

    /* renamed from: a */
    public int f64597a;

    /* renamed from: b */
    public long f64598b;

    /* renamed from: c */
    public String f64599c = "";

    /* renamed from: d */
    public String f64600d = "";

    static {
        afrb afrb = new afrb();
        f64595e = afrb;
        GeneratedMessageLite.m124024a(afrb.class, afrb);
    }

    private afrb() {
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
            return GeneratedMessageLite.m124022a(f64595e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new afrb();
        } else {
            if (i2 == 4) {
                return new bxvd(f64595e);
            }
            if (i2 == 5) {
                return f64595e;
            }
            bxxk bxxk = f64596f;
            if (bxxk == null) {
                synchronized (afrb.class) {
                    bxxk = f64596f;
                    if (bxxk == null) {
                        bxxk = new bxve(f64595e);
                        f64596f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
