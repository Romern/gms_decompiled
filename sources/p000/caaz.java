package p000;

/* renamed from: caaz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caaz extends bxvk implements bxxd {

    /* renamed from: b */
    public static final caaz f172401b;

    /* renamed from: d */
    private static volatile bxxk f172402d;

    /* renamed from: a */
    public bxwc f172403a = bxxn.f165040b;

    /* renamed from: c */
    private byte f172404c = 2;

    static {
        caaz caaz = new caaz();
        f172401b = caaz;
        bxvk.m124024a(caaz.class, caaz);
    }

    private caaz() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f172404c);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f172404c = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f172401b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", cabc.class});
        } else if (i2 == 3) {
            return new caaz();
        } else {
            if (i2 == 4) {
                return new bxvd(f172401b);
            }
            if (i2 == 5) {
                return f172401b;
            }
            bxxk bxxk = f172402d;
            if (bxxk == null) {
                synchronized (caaz.class) {
                    bxxk = f172402d;
                    if (bxxk == null) {
                        bxxk = new bxve(f172401b);
                        f172402d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
