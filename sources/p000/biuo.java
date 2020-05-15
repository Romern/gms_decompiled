package p000;

/* renamed from: biuo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biuo extends bxvk implements bxxd {

    /* renamed from: c */
    public static final biuo f121828c;

    /* renamed from: e */
    private static volatile bxxk f121829e;

    /* renamed from: a */
    public int f121830a;

    /* renamed from: b */
    public int f121831b;

    /* renamed from: d */
    private byte f121832d = 2;

    static {
        biuo biuo = new biuo();
        f121828c = biuo;
        bxvk.m124024a(biuo.class, biuo);
    }

    private biuo() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121832d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121832d = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f121828c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔄ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new biuo();
        } else {
            if (i2 == 4) {
                return new bxvd(f121828c);
            }
            if (i2 == 5) {
                return f121828c;
            }
            bxxk bxxk = f121829e;
            if (bxxk == null) {
                synchronized (biuo.class) {
                    bxxk = f121829e;
                    if (bxxk == null) {
                        bxxk = new bxve(f121828c);
                        f121829e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
