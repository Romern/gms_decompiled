package p000;

/* renamed from: btfd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btfd extends bxvk implements bxxd {

    /* renamed from: h */
    public static final btfd f148613h;

    /* renamed from: i */
    private static volatile bxxk f148614i;

    /* renamed from: a */
    public String f148615a = "";

    /* renamed from: b */
    public String f148616b = "";

    /* renamed from: c */
    public long f148617c;

    /* renamed from: d */
    public long f148618d;

    /* renamed from: e */
    public int f148619e;

    /* renamed from: f */
    public boolean f148620f;

    /* renamed from: g */
    public boolean f148621g;

    static {
        btfd btfd = new btfd();
        f148613h = btfd;
        bxvk.m124024a(btfd.class, btfd);
    }

    private btfd() {
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
            return bxvk.m124022a(f148613h, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0003\u0004\u0003\u0005\u0004\u0006\u0007\u0007\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new btfd();
        } else {
            if (i2 == 4) {
                return new bxvd(f148613h);
            }
            if (i2 == 5) {
                return f148613h;
            }
            bxxk bxxk = f148614i;
            if (bxxk == null) {
                synchronized (btfd.class) {
                    bxxk = f148614i;
                    if (bxxk == null) {
                        bxxk = new bxve(f148613h);
                        f148614i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
