package p000;

/* renamed from: bmrk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmrk extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final bmrk f130509i;

    /* renamed from: k */
    private static volatile bxxk f130510k;

    /* renamed from: a */
    public int f130511a;

    /* renamed from: b */
    public bmaq f130512b;

    /* renamed from: c */
    public bmav f130513c;

    /* renamed from: d */
    public bmar f130514d;

    /* renamed from: e */
    public bmrl f130515e;

    /* renamed from: f */
    public bxwc f130516f = bxxn.f165040b;

    /* renamed from: g */
    public bmag f130517g;

    /* renamed from: h */
    public int f130518h;

    /* renamed from: j */
    private byte f130519j = 2;

    static {
        bmrk bmrk = new bmrk();
        f130509i = bmrk;
        GeneratedMessageLite.m124024a(bmrk.class, bmrk);
    }

    private bmrk() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f130519j);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f130519j = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f130509i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0002\u0001ဉ\u0000\u0002ဉ\u0001\u0003ᐉ\u0003\u0004ဌ\u0005\u0005ဉ\u0002\u0006Л\u0007ဉ\u0004", new Object[]{"a", "b", "c", "e", "h", bwgz.m121953b(), "d", "f", bmrl.class, "g"});
        } else if (i2 == 3) {
            return new bmrk();
        } else {
            if (i2 == 4) {
                return new bxvd(f130509i);
            }
            if (i2 == 5) {
                return f130509i;
            }
            bxxk bxxk = f130510k;
            if (bxxk == null) {
                synchronized (bmrk.class) {
                    bxxk = f130510k;
                    if (bxxk == null) {
                        bxxk = new bxve(f130509i);
                        f130510k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
