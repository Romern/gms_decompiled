package p000;

/* renamed from: bmee */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmee extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bmee f128922e;

    /* renamed from: g */
    private static volatile bxxk f128923g;

    /* renamed from: a */
    public int f128924a;

    /* renamed from: b */
    public bmdn f128925b;

    /* renamed from: c */
    public bxwc f128926c = bxxn.f165040b;

    /* renamed from: d */
    public bmjf f128927d;

    /* renamed from: f */
    private byte f128928f = 2;

    static {
        bmee bmee = new bmee();
        f128922e = bmee;
        GeneratedMessageLite.m124024a(bmee.class, bmee);
    }

    private bmee() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f128928f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f128928f = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f128922e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ဉ\u0001", new Object[]{"a", "b", "c", bmdx.class, "d"});
        } else if (i2 == 3) {
            return new bmee();
        } else {
            if (i2 == 4) {
                return new bxvd(f128922e);
            }
            if (i2 == 5) {
                return f128922e;
            }
            bxxk bxxk = f128923g;
            if (bxxk == null) {
                synchronized (bmee.class) {
                    bxxk = f128923g;
                    if (bxxk == null) {
                        bxxk = new bxve(f128922e);
                        f128923g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
