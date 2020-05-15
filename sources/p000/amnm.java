package p000;

/* renamed from: amnm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amnm extends bxvk implements bxxd {

    /* renamed from: h */
    public static final amnm f75511h;

    /* renamed from: i */
    private static volatile bxxk f75512i;

    /* renamed from: a */
    public int f75513a;

    /* renamed from: b */
    public int f75514b;

    /* renamed from: c */
    public long f75515c;

    /* renamed from: d */
    public int f75516d;

    /* renamed from: e */
    public int f75517e;

    /* renamed from: f */
    public amnk f75518f;

    /* renamed from: g */
    public bxwc f75519g = bxxn.f165040b;

    static {
        amnm amnm = new amnm();
        f75511h = amnm;
        bxvk.m124024a(amnm.class, amnm);
    }

    private amnm() {
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
            return bxvk.m124022a(f75511h, "\u0001\u0005\u0000\u0002\n#\u0005\u0000\u0001\u0000\nဂ\u0001\u0012င\u0011\u0013င\u0012\"ဉ!#\u001b", new Object[]{"a", "b", "c", "d", "e", "f", "g", amnl.class});
        } else if (i2 == 3) {
            return new amnm();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][][]) null, (short[][][]) null);
            }
            if (i2 == 5) {
                return f75511h;
            }
            bxxk bxxk = f75512i;
            if (bxxk == null) {
                synchronized (amnm.class) {
                    bxxk = f75512i;
                    if (bxxk == null) {
                        bxxk = new bxve(f75511h);
                        f75512i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
