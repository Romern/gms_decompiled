package p000;

/* renamed from: bzre */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzre extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bzre f171108c;

    /* renamed from: e */
    private static volatile bxxk f171109e;

    /* renamed from: a */
    public String f171110a = "";

    /* renamed from: b */
    public bzrd f171111b;

    /* renamed from: d */
    private int f171112d;

    static {
        bzre bzre = new bzre();
        f171108c = bzre;
        bxvk.m124024a(bzre.class, bzre);
    }

    private bzre() {
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
            return bxvk.m124022a(f171108c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bzre();
        } else {
            if (i2 == 4) {
                return new bxvd(f171108c);
            }
            if (i2 == 5) {
                return f171108c;
            }
            bxxk bxxk = f171109e;
            if (bxxk == null) {
                synchronized (bzre.class) {
                    bxxk = f171109e;
                    if (bxxk == null) {
                        bxxk = new bxve(f171108c);
                        f171109e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
