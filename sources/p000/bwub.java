package p000;

/* renamed from: bwub */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwub extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bwub f161008d;

    /* renamed from: e */
    public static final bxvj f161009e;

    /* renamed from: h */
    private static volatile bxxk f161010h;

    /* renamed from: a */
    public int f161011a = 0;

    /* renamed from: b */
    public Object f161012b;

    /* renamed from: c */
    public int f161013c;

    /* renamed from: f */
    private int f161014f;

    /* renamed from: g */
    private byte f161015g = 2;

    static {
        bwub bwub = new bwub();
        f161008d = bwub;
        bxvk.m124024a(bwub.class, bwub);
        bwoq bwoq = bwoq.f160480d;
        bwub bwub2 = f161008d;
        f161009e = bxvk.m124006a(bwoq, bwub2, bwub2, 234055753, bxzf.MESSAGE);
    }

    private bwub() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f161015g);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f161015g = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f161008d, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဌ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ᐼ\u0000", new Object[]{"b", "a", "f", "c", bwtz.f161007a, bwue.class, bwuc.class, bwud.class});
        } else if (i2 == 3) {
            return new bwub();
        } else {
            if (i2 == 4) {
                return new bxvd(f161008d);
            }
            if (i2 == 5) {
                return f161008d;
            }
            bxxk bxxk = f161010h;
            if (bxxk == null) {
                synchronized (bwub.class) {
                    bxxk = f161010h;
                    if (bxxk == null) {
                        bxxk = new bxve(f161008d);
                        f161010h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
