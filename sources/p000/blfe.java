package p000;

/* renamed from: blfe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blfe extends bxvk implements bxxd {

    /* renamed from: e */
    public static final blfe f126345e;

    /* renamed from: f */
    private static volatile bxxk f126346f;

    /* renamed from: a */
    public int f126347a;

    /* renamed from: b */
    public bleu f126348b;

    /* renamed from: c */
    public String f126349c = "";

    /* renamed from: d */
    public String f126350d = "";

    static {
        blfe blfe = new blfe();
        f126345e = blfe;
        bxvk.m124024a(blfe.class, blfe);
    }

    private blfe() {
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
            return bxvk.m124022a(f126345e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new blfe();
        } else {
            if (i2 == 4) {
                return new bxvd(f126345e);
            }
            if (i2 == 5) {
                return f126345e;
            }
            bxxk bxxk = f126346f;
            if (bxxk == null) {
                synchronized (blfe.class) {
                    bxxk = f126346f;
                    if (bxxk == null) {
                        bxxk = new bxve(f126345e);
                        f126346f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
