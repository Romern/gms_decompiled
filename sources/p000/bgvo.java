package p000;

/* renamed from: bgvo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgvo extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bgvo f117698f;

    /* renamed from: g */
    private static volatile bxxk f117699g;

    /* renamed from: a */
    public int f117700a;

    /* renamed from: b */
    public long f117701b;

    /* renamed from: c */
    public long f117702c;

    /* renamed from: d */
    public bgvw f117703d;

    /* renamed from: e */
    public String f117704e = "";

    static {
        bgvo bgvo = new bgvo();
        f117698f = bgvo;
        bxvk.m124024a(bgvo.class, bgvo);
    }

    private bgvo() {
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
            return bxvk.m124022a(f117698f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဉ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bgvo();
        } else {
            if (i2 == 4) {
                return new bxvd(f117698f);
            }
            if (i2 == 5) {
                return f117698f;
            }
            bxxk bxxk = f117699g;
            if (bxxk == null) {
                synchronized (bgvo.class) {
                    bxxk = f117699g;
                    if (bxxk == null) {
                        bxxk = new bxve(f117698f);
                        f117699g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
