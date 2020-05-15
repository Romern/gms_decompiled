package p000;

/* renamed from: bmjk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmjk extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bmjk f129713f;

    /* renamed from: g */
    private static volatile bxxk f129714g;

    /* renamed from: a */
    public int f129715a;

    /* renamed from: b */
    public String f129716b = "";

    /* renamed from: c */
    public long f129717c;

    /* renamed from: d */
    public bxtx f129718d = bxtx.f164797b;

    /* renamed from: e */
    public bxwc f129719e = bxxn.f165040b;

    static {
        bmjk bmjk = new bmjk();
        f129713f = bmjk;
        bxvk.m124024a(bmjk.class, bmjk);
    }

    private bmjk() {
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
            return bxvk.m124022a(f129713f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ည\u0002\u0004ဂ\u0001", new Object[]{"a", "b", "e", bmqk.class, "d", "c"});
        } else if (i2 == 3) {
            return new bmjk();
        } else {
            if (i2 == 4) {
                return new bmjj();
            }
            if (i2 == 5) {
                return f129713f;
            }
            bxxk bxxk = f129714g;
            if (bxxk == null) {
                synchronized (bmjk.class) {
                    bxxk = f129714g;
                    if (bxxk == null) {
                        bxxk = new bxve(f129713f);
                        f129714g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
