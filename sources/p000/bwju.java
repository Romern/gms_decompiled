package p000;

/* renamed from: bwju */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwju extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bwju f159870f;

    /* renamed from: h */
    private static volatile bxxk f159871h;

    /* renamed from: a */
    public bmaq f159872a;

    /* renamed from: b */
    public bmav f159873b;

    /* renamed from: c */
    public bmar f159874c;

    /* renamed from: d */
    public bwjs f159875d;

    /* renamed from: e */
    public int f159876e;

    /* renamed from: g */
    private int f159877g;

    static {
        bwju bwju = new bwju();
        f159870f = bwju;
        bxvk.m124024a(bwju.class, bwju);
    }

    private bwju() {
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
            return bxvk.m124022a(f159870f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0003\u0004ဌ\u0004\u0005ဉ\u0002", new Object[]{"g", "a", "b", "d", "e", bwgz.m121953b(), "c"});
        } else if (i2 == 3) {
            return new bwju();
        } else {
            if (i2 == 4) {
                return new bxvd(f159870f);
            }
            if (i2 == 5) {
                return f159870f;
            }
            bxxk bxxk = f159871h;
            if (bxxk == null) {
                synchronized (bwju.class) {
                    bxxk = f159871h;
                    if (bxxk == null) {
                        bxxk = new bxve(f159870f);
                        f159871h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
