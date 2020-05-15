package p000;

/* renamed from: bkll */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkll extends bxvk implements bxxd {

    /* renamed from: h */
    public static final bkll f124790h;

    /* renamed from: j */
    private static volatile bxxk f124791j;

    /* renamed from: a */
    public int f124792a = 0;

    /* renamed from: b */
    public Object f124793b;

    /* renamed from: c */
    public int f124794c = 0;

    /* renamed from: d */
    public Object f124795d;

    /* renamed from: e */
    public String f124796e = "";

    /* renamed from: f */
    public String f124797f = "";

    /* renamed from: g */
    public bxyk f124798g;

    /* renamed from: i */
    private int f124799i;

    static {
        bkll bkll = new bkll();
        f124790h = bkll;
        bxvk.m124024a(bkll.class, bkll);
    }

    private bkll() {
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
            return bxvk.m124022a(f124790h, "\u0001\u0005\u0002\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ျ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003\u0005ျ\u0001", new Object[]{"b", "a", "d", "c", "i", "e", "f", "g"});
        } else if (i2 == 3) {
            return new bkll();
        } else {
            if (i2 == 4) {
                return new bxvd(f124790h);
            }
            if (i2 == 5) {
                return f124790h;
            }
            bxxk bxxk = f124791j;
            if (bxxk == null) {
                synchronized (bkll.class) {
                    bxxk = f124791j;
                    if (bxxk == null) {
                        bxxk = new bxve(f124790h);
                        f124791j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
