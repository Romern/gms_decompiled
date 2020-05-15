package p000;

/* renamed from: bsov */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsov extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bsov f146431f;

    /* renamed from: g */
    private static volatile bxxk f146432g;

    /* renamed from: a */
    public int f146433a;

    /* renamed from: b */
    public String f146434b = "";

    /* renamed from: c */
    public String f146435c = "";

    /* renamed from: d */
    public int f146436d;

    /* renamed from: e */
    public String f146437e = "";

    static {
        bsov bsov = new bsov();
        f146431f = bsov;
        bxvk.m124024a(bsov.class, bsov);
    }

    private bsov() {
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
            return bxvk.m124022a(f146431f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဈ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bsov();
        } else {
            if (i2 == 4) {
                return new bxvd(f146431f);
            }
            if (i2 == 5) {
                return f146431f;
            }
            bxxk bxxk = f146432g;
            if (bxxk == null) {
                synchronized (bsov.class) {
                    bxxk = f146432g;
                    if (bxxk == null) {
                        bxxk = new bxve(f146431f);
                        f146432g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
