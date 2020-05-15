package p000;

/* renamed from: bmkw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmkw extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bmkw f129898c;

    /* renamed from: f */
    private static volatile bxxk f129899f;

    /* renamed from: a */
    public bmki f129900a;

    /* renamed from: b */
    public String f129901b = "";

    /* renamed from: d */
    private int f129902d;

    /* renamed from: e */
    private byte f129903e = 2;

    static {
        bmkw bmkw = new bmkw();
        f129898c = bmkw;
        bxvk.m124024a(bmkw.class, bmkw);
    }

    private bmkw() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f129903e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f129903e = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f129898c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bmkw();
        } else {
            if (i2 == 4) {
                return new bxvd(f129898c);
            }
            if (i2 == 5) {
                return f129898c;
            }
            bxxk bxxk = f129899f;
            if (bxxk == null) {
                synchronized (bmkw.class) {
                    bxxk = f129899f;
                    if (bxxk == null) {
                        bxxk = new bxve(f129898c);
                        f129899f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
