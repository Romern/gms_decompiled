package p000;

/* renamed from: biqu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biqu extends bxvk implements bxxd {

    /* renamed from: e */
    public static final biqu f121346e;

    /* renamed from: g */
    private static volatile bxxk f121347g;

    /* renamed from: a */
    public int f121348a;

    /* renamed from: b */
    public int f121349b;

    /* renamed from: c */
    public int f121350c;

    /* renamed from: d */
    public bxwc f121351d = bxxn.f165040b;

    /* renamed from: f */
    private byte f121352f = 2;

    static {
        biqu biqu = new biqu();
        f121346e = biqu;
        bxvk.m124024a(biqu.class, biqu);
    }

    private biqu() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121352f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121352f = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f121346e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001ᔄ\u0000\u0002င\u0001\u0003Л", new Object[]{"a", "b", "c", "d", biqt.class});
        } else if (i2 == 3) {
            return new biqu();
        } else {
            if (i2 == 4) {
                return new bxvd(f121346e);
            }
            if (i2 == 5) {
                return f121346e;
            }
            bxxk bxxk = f121347g;
            if (bxxk == null) {
                synchronized (biqu.class) {
                    bxxk = f121347g;
                    if (bxxk == null) {
                        bxxk = new bxve(f121346e);
                        f121347g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
