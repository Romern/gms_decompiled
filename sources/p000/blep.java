package p000;

/* renamed from: blep */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blep extends bxvk implements bxxd {

    /* renamed from: e */
    public static final blep f126239e;

    /* renamed from: f */
    private static volatile bxxk f126240f;

    /* renamed from: a */
    public int f126241a;

    /* renamed from: b */
    public bleu f126242b;

    /* renamed from: c */
    public String f126243c = "";

    /* renamed from: d */
    public String f126244d = "";

    static {
        blep blep = new blep();
        f126239e = blep;
        bxvk.m124024a(blep.class, blep);
    }

    private blep() {
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
            return bxvk.m124022a(f126239e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new blep();
        } else {
            if (i2 == 4) {
                return new bxvd(f126239e);
            }
            if (i2 == 5) {
                return f126239e;
            }
            bxxk bxxk = f126240f;
            if (bxxk == null) {
                synchronized (blep.class) {
                    bxxk = f126240f;
                    if (bxxk == null) {
                        bxxk = new bxve(f126239e);
                        f126240f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
