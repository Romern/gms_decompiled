package p000;

/* renamed from: amlb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amlb extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final amlb f75151g;

    /* renamed from: h */
    private static volatile bxxk f75152h;

    /* renamed from: a */
    public int f75153a;

    /* renamed from: b */
    public String f75154b = "";

    /* renamed from: c */
    public long f75155c;

    /* renamed from: d */
    public long f75156d;

    /* renamed from: e */
    public int f75157e;

    /* renamed from: f */
    public amla f75158f;

    static {
        amlb amlb = new amlb();
        f75151g = amlb;
        GeneratedMessageLite.m124024a(amlb.class, amlb);
    }

    private amlb() {
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
            return GeneratedMessageLite.m124022a(f75151g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004င\u0003\u0005ဉ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new amlb();
        } else {
            if (i2 == 4) {
                return new bxvd(f75151g);
            }
            if (i2 == 5) {
                return f75151g;
            }
            bxxk bxxk = f75152h;
            if (bxxk == null) {
                synchronized (amlb.class) {
                    bxxk = f75152h;
                    if (bxxk == null) {
                        bxxk = new bxve(f75151g);
                        f75152h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
