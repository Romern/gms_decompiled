package p000;

/* renamed from: bklj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bklj extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bklj f124780d;

    /* renamed from: e */
    private static volatile bxxk f124781e;

    /* renamed from: a */
    public int f124782a;

    /* renamed from: b */
    public String f124783b = "";

    /* renamed from: c */
    public String f124784c = "";

    static {
        bklj bklj = new bklj();
        f124780d = bklj;
        bxvk.m124024a(bklj.class, bklj);
    }

    private bklj() {
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
            return bxvk.m124022a(f124780d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bklj();
        } else {
            if (i2 == 4) {
                return new bxvd(f124780d);
            }
            if (i2 == 5) {
                return f124780d;
            }
            bxxk bxxk = f124781e;
            if (bxxk == null) {
                synchronized (bklj.class) {
                    bxxk = f124781e;
                    if (bxxk == null) {
                        bxxk = new bxve(f124780d);
                        f124781e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
