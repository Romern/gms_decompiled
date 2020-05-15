package p000;

/* renamed from: bond */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bond extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final bond f133767h;

    /* renamed from: i */
    private static volatile bxxk f133768i;

    /* renamed from: a */
    public int f133769a;

    /* renamed from: b */
    public boolean f133770b;

    /* renamed from: c */
    public boolean f133771c;

    /* renamed from: d */
    public boolean f133772d;

    /* renamed from: e */
    public boolean f133773e;

    /* renamed from: f */
    public boolean f133774f;

    /* renamed from: g */
    public boolean f133775g;

    static {
        bond bond = new bond();
        f133767h = bond;
        GeneratedMessageLite.m124024a(bond.class, bond);
    }

    private bond() {
        bxxn bxxn = bxxn.f165040b;
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
            return GeneratedMessageLite.m124022a(f133767h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0005ဇ\u0003\u0006ဇ\u0004\u0007ဇ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new bond();
        } else {
            if (i2 == 4) {
                return new bxvd(f133767h);
            }
            if (i2 == 5) {
                return f133767h;
            }
            bxxk bxxk = f133768i;
            if (bxxk == null) {
                synchronized (bond.class) {
                    bxxk = f133768i;
                    if (bxxk == null) {
                        bxxk = new bxve(f133767h);
                        f133768i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
