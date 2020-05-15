package p000;

/* renamed from: bmsw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmsw extends bxvk implements bxxd {

    /* renamed from: r */
    public static final bmsw f130761r;

    /* renamed from: s */
    private static volatile bxxk f130762s;

    /* renamed from: a */
    public bxtx f130763a = bxtx.f164797b;

    /* renamed from: b */
    public int f130764b;

    /* renamed from: c */
    public bxtx f130765c = bxtx.f164797b;

    /* renamed from: d */
    public bxtx f130766d = bxtx.f164797b;

    /* renamed from: e */
    public bxtx f130767e = bxtx.f164797b;

    /* renamed from: f */
    public bxtx f130768f = bxtx.f164797b;

    /* renamed from: g */
    public bxtx f130769g = bxtx.f164797b;

    /* renamed from: h */
    public bxtx f130770h = bxtx.f164797b;

    /* renamed from: i */
    public bxtx f130771i = bxtx.f164797b;

    /* renamed from: j */
    public bxtx f130772j = bxtx.f164797b;

    /* renamed from: k */
    public bxtx f130773k = bxtx.f164797b;

    /* renamed from: l */
    public bxtx f130774l = bxtx.f164797b;

    /* renamed from: m */
    public bxtx f130775m = bxtx.f164797b;

    /* renamed from: n */
    public bmsu f130776n;

    /* renamed from: o */
    public bxtx f130777o = bxtx.f164797b;

    /* renamed from: p */
    public bxtx f130778p = bxtx.f164797b;

    /* renamed from: q */
    public bxwc f130779q = bxxn.f165040b;

    static {
        bmsw bmsw = new bmsw();
        f130761r = bmsw;
        bxvk.m124024a(bmsw.class, bmsw);
    }

    private bmsw() {
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
            return bxvk.m124022a(f130761r, "\u0000\u0011\u0000\u0000\u0001\u0011\u0011\u0000\u0001\u0000\u0001\u0004\u0002\n\u0003\n\u0004\n\u0005\n\u0006\n\u0007\n\b\n\t\n\n\n\u000b\n\f\n\r\t\u000e\n\u000f\n\u0010\u001b\u0011\n", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", bmsv.class, "a"});
        } else if (i2 == 3) {
            return new bmsw();
        } else {
            if (i2 == 4) {
                return new bxvd(f130761r);
            }
            if (i2 == 5) {
                return f130761r;
            }
            bxxk bxxk = f130762s;
            if (bxxk == null) {
                synchronized (bmsw.class) {
                    bxxk = f130762s;
                    if (bxxk == null) {
                        bxxk = new bxve(f130761r);
                        f130762s = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
