package p000;

/* renamed from: bmvf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmvf extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bmvf f131032d;

    /* renamed from: e */
    private static volatile bxxk f131033e;

    /* renamed from: a */
    public int f131034a;

    /* renamed from: b */
    public String f131035b = "";

    /* renamed from: c */
    public bmvg f131036c;

    static {
        bmvf bmvf = new bmvf();
        f131032d = bmvf;
        bxvk.m124024a(bmvf.class, bmvf);
    }

    private bmvf() {
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
            return bxvk.m124022a(f131032d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0002", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bmvf();
        } else {
            if (i2 == 4) {
                return new bxvd(f131032d);
            }
            if (i2 == 5) {
                return f131032d;
            }
            bxxk bxxk = f131033e;
            if (bxxk == null) {
                synchronized (bmvf.class) {
                    bxxk = f131033e;
                    if (bxxk == null) {
                        bxxk = new bxve(f131032d);
                        f131033e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
