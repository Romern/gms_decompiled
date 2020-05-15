package p000;

/* renamed from: abqd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abqd extends bxvk implements bxxd {

    /* renamed from: e */
    public static final abqd f57943e;

    /* renamed from: f */
    private static volatile bxxk f57944f;

    /* renamed from: a */
    public int f57945a;

    /* renamed from: b */
    public int f57946b;

    /* renamed from: c */
    public bxtx f57947c = bxtx.f164797b;

    /* renamed from: d */
    public abqo f57948d;

    static {
        abqd abqd = new abqd();
        f57943e = abqd;
        bxvk.m124024a(abqd.class, abqd);
    }

    private abqd() {
        bxwq bxwq = bxwq.f165002b;
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
            return bxvk.m124022a(f57943e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0003ည\u0002\u0005ဉ\u0005", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new abqd();
        } else {
            if (i2 == 4) {
                return new bxvd(f57943e);
            }
            if (i2 == 5) {
                return f57943e;
            }
            bxxk bxxk = f57944f;
            if (bxxk == null) {
                synchronized (abqd.class) {
                    bxxk = f57944f;
                    if (bxxk == null) {
                        bxxk = new bxve(f57943e);
                        f57944f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
