package p000;

/* renamed from: bwyw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwyw extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bwyw f161544e;

    /* renamed from: g */
    private static volatile bxxk f161545g;

    /* renamed from: a */
    public int f161546a;

    /* renamed from: b */
    public int f161547b = 0;

    /* renamed from: c */
    public Object f161548c;

    /* renamed from: d */
    public bwxl f161549d;

    /* renamed from: f */
    private byte f161550f = 2;

    static {
        bwyw bwyw = new bwyw();
        f161544e = bwyw;
        bxvk.m124024a(bwyw.class, bwyw);
    }

    private bwyw() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f161550f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f161550f = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f161544e, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐼ\u0000\u0003ᐼ\u0000", new Object[]{"c", "b", "a", "d", bwyx.class, bwyv.class});
        } else if (i2 == 3) {
            return new bwyw();
        } else {
            if (i2 == 4) {
                return new bxvd(f161544e);
            }
            if (i2 == 5) {
                return f161544e;
            }
            bxxk bxxk = f161545g;
            if (bxxk == null) {
                synchronized (bwyw.class) {
                    bxxk = f161545g;
                    if (bxxk == null) {
                        bxxk = new bxve(f161544e);
                        f161545g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
