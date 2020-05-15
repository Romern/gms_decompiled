package p000;

/* renamed from: blts */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blts extends bxvk implements bxxd {

    /* renamed from: c */
    public static final blts f127731c;

    /* renamed from: e */
    private static volatile bxxk f127732e;

    /* renamed from: a */
    public String f127733a = "";

    /* renamed from: b */
    public String f127734b = "";

    /* renamed from: d */
    private int f127735d;

    static {
        blts blts = new blts();
        f127731c = blts;
        bxvk.m124024a(blts.class, blts);
    }

    private blts() {
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
            return bxvk.m124022a(f127731c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new blts();
        } else {
            if (i2 == 4) {
                return new bxvd(f127731c);
            }
            if (i2 == 5) {
                return f127731c;
            }
            bxxk bxxk = f127732e;
            if (bxxk == null) {
                synchronized (blts.class) {
                    bxxk = f127732e;
                    if (bxxk == null) {
                        bxxk = new bxve(f127731c);
                        f127732e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
