package p000;

/* renamed from: bioz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bioz extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bioz f121125c;

    /* renamed from: e */
    private static volatile bxxk f121126e;

    /* renamed from: a */
    public int f121127a;

    /* renamed from: b */
    public String f121128b = "";

    /* renamed from: d */
    private byte f121129d = 2;

    static {
        bioz bioz = new bioz();
        f121125c = bioz;
        GeneratedMessageLite.m124024a(bioz.class, bioz);
    }

    private bioz() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121129d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121129d = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f121125c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bioz();
        } else {
            if (i2 == 4) {
                return new bxvd(f121125c);
            }
            if (i2 == 5) {
                return f121125c;
            }
            bxxk bxxk = f121126e;
            if (bxxk == null) {
                synchronized (bioz.class) {
                    bxxk = f121126e;
                    if (bxxk == null) {
                        bxxk = new bxve(f121125c);
                        f121126e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
