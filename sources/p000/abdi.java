package p000;

/* renamed from: abdi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abdi extends bxvk implements bxxd {

    /* renamed from: d */
    public static final abdi f57089d;

    /* renamed from: f */
    private static volatile bxxk f57090f;

    /* renamed from: a */
    public abde f57091a;

    /* renamed from: b */
    public bxwc f57092b = bxxn.f165040b;

    /* renamed from: c */
    public String f57093c = "";

    /* renamed from: e */
    private int f57094e;

    static {
        abdi abdi = new abdi();
        f57089d = abdi;
        bxvk.m124024a(abdi.class, abdi);
    }

    private abdi() {
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
            return bxvk.m124022a(f57089d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဈ\u0001", new Object[]{"e", "a", "b", abdf.class, "c"});
        } else if (i2 == 3) {
            return new abdi();
        } else {
            if (i2 == 4) {
                return new bxvd(f57089d);
            }
            if (i2 == 5) {
                return f57089d;
            }
            bxxk bxxk = f57090f;
            if (bxxk == null) {
                synchronized (abdi.class) {
                    bxxk = f57090f;
                    if (bxxk == null) {
                        bxxk = new bxve(f57089d);
                        f57090f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
