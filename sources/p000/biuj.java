package p000;

/* renamed from: biuj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biuj extends bxvk implements bxxd {

    /* renamed from: b */
    public static final biuj f121795b;

    /* renamed from: e */
    private static volatile bxxk f121796e;

    /* renamed from: a */
    public int f121797a;

    /* renamed from: c */
    private int f121798c;

    /* renamed from: d */
    private byte f121799d = 2;

    static {
        biuj biuj = new biuj();
        f121795b = biuj;
        bxvk.m124024a(biuj.class, biuj);
    }

    private biuj() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121799d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121799d = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f121795b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔄ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new biuj();
        } else {
            if (i2 == 4) {
                return new bxvd(f121795b);
            }
            if (i2 == 5) {
                return f121795b;
            }
            bxxk bxxk = f121796e;
            if (bxxk == null) {
                synchronized (biuj.class) {
                    bxxk = f121796e;
                    if (bxxk == null) {
                        bxxk = new bxve(f121795b);
                        f121796e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
