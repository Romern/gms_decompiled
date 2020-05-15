package p000;

/* renamed from: bvuj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvuj extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bvuj f157698c;

    /* renamed from: e */
    private static volatile bxxk f157699e;

    /* renamed from: a */
    public bxwc f157700a = bxxn.f165040b;

    /* renamed from: b */
    public bxwc f157701b = bxxn.f165040b;

    /* renamed from: d */
    private byte f157702d = 2;

    static {
        bvuj bvuj = new bvuj();
        f157698c = bvuj;
        bxvk.m124024a(bvuj.class, bvuj);
    }

    private bvuj() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f157702d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f157702d = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f157698c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0001\u0001\u001b\u0002Л", new Object[]{"a", bvnp.class, "b", bvoa.class});
        } else if (i2 == 3) {
            return new bvuj();
        } else {
            if (i2 == 4) {
                return new bxvd(f157698c);
            }
            if (i2 == 5) {
                return f157698c;
            }
            bxxk bxxk = f157699e;
            if (bxxk == null) {
                synchronized (bvuj.class) {
                    bxxk = f157699e;
                    if (bxxk == null) {
                        bxxk = new bxve(f157698c);
                        f157699e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
