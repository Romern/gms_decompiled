package p000;

/* renamed from: bqml */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqml extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bqml f141226f;

    /* renamed from: g */
    private static volatile bxxk f141227g;

    /* renamed from: a */
    public bxtx f141228a = bxtx.f164797b;

    /* renamed from: b */
    public bxtx f141229b = bxtx.f164797b;

    /* renamed from: c */
    public bxwc f141230c = bxxn.f165040b;

    /* renamed from: d */
    public bqlp f141231d;

    /* renamed from: e */
    public int f141232e;

    static {
        bqml bqml = new bqml();
        f141226f = bqml;
        bxvk.m124024a(bqml.class, bqml);
    }

    private bqml() {
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
            return bxvk.m124022a(f141226f, "\u0000\u0005\u0000\u0000\u0001\u0006\u0005\u0000\u0001\u0000\u0001\n\u0002\n\u0003\u001b\u0004\t\u0006\f", new Object[]{"a", "b", "c", bqmk.class, "d", "e"});
        } else if (i2 == 3) {
            return new bqml();
        } else {
            if (i2 == 4) {
                return new bxvd(f141226f);
            }
            if (i2 == 5) {
                return f141226f;
            }
            bxxk bxxk = f141227g;
            if (bxxk == null) {
                synchronized (bqml.class) {
                    bxxk = f141227g;
                    if (bxxk == null) {
                        bxxk = new bxve(f141226f);
                        f141227g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
