package p000;

/* renamed from: brbu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brbu extends bxvk implements bxxd {

    /* renamed from: c */
    public static final brbu f142318c;

    /* renamed from: d */
    private static volatile bxxk f142319d;

    /* renamed from: a */
    public int f142320a;

    /* renamed from: b */
    public String f142321b = "";

    static {
        brbu brbu = new brbu();
        f142318c = brbu;
        bxvk.m124024a(brbu.class, brbu);
    }

    private brbu() {
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
            return bxvk.m124022a(f142318c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0001", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new brbu();
        } else {
            if (i2 == 4) {
                return new bxvd(f142318c);
            }
            if (i2 == 5) {
                return f142318c;
            }
            bxxk bxxk = f142319d;
            if (bxxk == null) {
                synchronized (brbu.class) {
                    bxxk = f142319d;
                    if (bxxk == null) {
                        bxxk = new bxve(f142318c);
                        f142319d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
