package p000;

/* renamed from: aqar */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqar extends bxvk implements bxxd {

    /* renamed from: d */
    public static final aqar f85467d;

    /* renamed from: e */
    private static volatile bxxk f85468e;

    /* renamed from: a */
    public int f85469a;

    /* renamed from: b */
    public String f85470b = "";

    /* renamed from: c */
    public String f85471c = "";

    static {
        aqar aqar = new aqar();
        f85467d = aqar;
        bxvk.m124024a(aqar.class, aqar);
    }

    private aqar() {
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
            return bxvk.m124022a(f85467d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new aqar();
        } else {
            if (i2 == 4) {
                return new bxvd(f85467d);
            }
            if (i2 == 5) {
                return f85467d;
            }
            bxxk bxxk = f85468e;
            if (bxxk == null) {
                synchronized (aqar.class) {
                    bxxk = f85468e;
                    if (bxxk == null) {
                        bxxk = new bxve(f85467d);
                        f85468e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
