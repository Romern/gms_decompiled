package p000;

/* renamed from: btsf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btsf extends bxvk implements bxxd {

    /* renamed from: c */
    public static final btsf f150195c;

    /* renamed from: e */
    private static volatile bxxk f150196e;

    /* renamed from: a */
    public int f150197a = 0;

    /* renamed from: b */
    public Object f150198b;

    /* renamed from: d */
    private byte f150199d = 2;

    static {
        btsf btsf = new btsf();
        f150195c = btsf;
        bxvk.m124024a(btsf.class, btsf);
    }

    private btsf() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f150199d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f150199d = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f150195c, "\u0001\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0001\u0001ျ\u0000\u0002ျ\u0000\u0003ᐼ\u0000\u0004ျ\u0000", new Object[]{"b", "a", bsjl.class});
        } else if (i2 == 3) {
            return new btsf();
        } else {
            if (i2 == 4) {
                return new bxvd(f150195c);
            }
            if (i2 == 5) {
                return f150195c;
            }
            bxxk bxxk = f150196e;
            if (bxxk == null) {
                synchronized (btsf.class) {
                    bxxk = f150196e;
                    if (bxxk == null) {
                        bxxk = new bxve(f150195c);
                        f150196e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
