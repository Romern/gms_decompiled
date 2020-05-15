package p000;

/* renamed from: bqlh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqlh extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bqlh f141092e;

    /* renamed from: f */
    private static volatile bxxk f141093f;

    /* renamed from: a */
    public String f141094a = "";

    /* renamed from: b */
    public String f141095b = "";

    /* renamed from: c */
    public bxtx f141096c = bxtx.f164797b;

    /* renamed from: d */
    public long f141097d;

    static {
        bqlh bqlh = new bqlh();
        f141092e = bqlh;
        bxvk.m124024a(bqlh.class, bqlh);
    }

    private bqlh() {
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
            return bxvk.m124022a(f141092e, "\u0000\u0004\u0000\u0000\u0001\u0007\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\n\u0007\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bqlh();
        } else {
            if (i2 == 4) {
                return new bxvd(f141092e);
            }
            if (i2 == 5) {
                return f141092e;
            }
            bxxk bxxk = f141093f;
            if (bxxk == null) {
                synchronized (bqlh.class) {
                    bxxk = f141093f;
                    if (bxxk == null) {
                        bxxk = new bxve(f141092e);
                        f141093f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
