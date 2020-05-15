package p000;

/* renamed from: apzf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apzf extends bxvk implements bxxd {

    /* renamed from: e */
    public static final apzf f85227e;

    /* renamed from: f */
    private static volatile bxxk f85228f;

    /* renamed from: a */
    public int f85229a;

    /* renamed from: b */
    public String f85230b = "";

    /* renamed from: c */
    public int f85231c;

    /* renamed from: d */
    public long f85232d;

    static {
        apzf apzf = new apzf();
        f85227e = apzf;
        bxvk.m124024a(apzf.class, apzf);
    }

    private apzf() {
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
            return bxvk.m124022a(f85227e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဂ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new apzf();
        } else {
            if (i2 == 4) {
                return new bxvd(f85227e);
            }
            if (i2 == 5) {
                return f85227e;
            }
            bxxk bxxk = f85228f;
            if (bxxk == null) {
                synchronized (apzf.class) {
                    bxxk = f85228f;
                    if (bxxk == null) {
                        bxxk = new bxve(f85227e);
                        f85228f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
