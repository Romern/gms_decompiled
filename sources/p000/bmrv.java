package p000;

/* renamed from: bmrv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmrv extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bmrv f130586g;

    /* renamed from: i */
    private static volatile bxxk f130587i;

    /* renamed from: a */
    public int f130588a;

    /* renamed from: b */
    public bmav f130589b;

    /* renamed from: c */
    public bmaq f130590c;

    /* renamed from: d */
    public bmar f130591d;

    /* renamed from: e */
    public bmrx f130592e;

    /* renamed from: f */
    public int f130593f;

    /* renamed from: h */
    private byte f130594h = 2;

    static {
        bmrv bmrv = new bmrv();
        f130586g = bmrv;
        bxvk.m124024a(bmrv.class, bmrv);
    }

    private bmrv() {
        bxtx bxtx = bxtx.f164797b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f130594h);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f130594h = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f130586g, "\u0001\u0005\u0000\u0001\u0004\n\u0005\u0000\u0000\u0001\u0004ᐉ\u0003\u0005ဉ\u0000\u0006ဉ\u0001\tဉ\u0002\nဌ\u0005", new Object[]{"a", "e", "b", "c", "d", "f", bwgz.m121953b()});
        } else if (i2 == 3) {
            return new bmrv();
        } else {
            if (i2 == 4) {
                return new bxvd(f130586g);
            }
            if (i2 == 5) {
                return f130586g;
            }
            bxxk bxxk = f130587i;
            if (bxxk == null) {
                synchronized (bmrv.class) {
                    bxxk = f130587i;
                    if (bxxk == null) {
                        bxxk = new bxve(f130586g);
                        f130587i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
