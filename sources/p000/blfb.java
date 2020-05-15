package p000;

/* renamed from: blfb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blfb extends bxvk implements bxxd {

    /* renamed from: e */
    public static final blfb f126325e;

    /* renamed from: f */
    private static volatile bxxk f126326f;

    /* renamed from: a */
    public int f126327a;

    /* renamed from: b */
    public bleu f126328b;

    /* renamed from: c */
    public String f126329c = "";

    /* renamed from: d */
    public String f126330d = "";

    static {
        blfb blfb = new blfb();
        f126325e = blfb;
        bxvk.m124024a(blfb.class, blfb);
    }

    private blfb() {
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
            return bxvk.m124022a(f126325e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0003", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new blfb();
        } else {
            if (i2 == 4) {
                return new bxvd(f126325e);
            }
            if (i2 == 5) {
                return f126325e;
            }
            bxxk bxxk = f126326f;
            if (bxxk == null) {
                synchronized (blfb.class) {
                    bxxk = f126326f;
                    if (bxxk == null) {
                        bxxk = new bxve(f126325e);
                        f126326f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
