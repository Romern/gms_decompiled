package p000;

/* renamed from: cang */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cang extends bxvk implements bxxd {

    /* renamed from: e */
    public static final cang f175361e;

    /* renamed from: f */
    private static volatile bxxk f175362f;

    /* renamed from: a */
    public int f175363a;

    /* renamed from: b */
    public String f175364b = "";

    /* renamed from: c */
    public String f175365c = "";

    /* renamed from: d */
    public String f175366d = "";

    static {
        cang cang = new cang();
        f175361e = cang;
        bxvk.m124024a(cang.class, cang);
    }

    private cang() {
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
            return bxvk.m124022a(f175361e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new cang();
        } else {
            if (i2 == 4) {
                return new bxvd(f175361e);
            }
            if (i2 == 5) {
                return f175361e;
            }
            bxxk bxxk = f175362f;
            if (bxxk == null) {
                synchronized (cang.class) {
                    bxxk = f175362f;
                    if (bxxk == null) {
                        bxxk = new bxve(f175361e);
                        f175362f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
