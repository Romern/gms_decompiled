package p000;

/* renamed from: blse */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blse extends bxvk implements bxxd {

    /* renamed from: b */
    public static final blse f127570b;

    /* renamed from: d */
    private static volatile bxxk f127571d;

    /* renamed from: a */
    public long f127572a;

    /* renamed from: c */
    private int f127573c;

    static {
        blse blse = new blse();
        f127570b = blse;
        bxvk.m124024a(blse.class, blse);
    }

    private blse() {
        bxtx bxtx = bxtx.f164797b;
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
            return bxvk.m124022a(f127570b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဃ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new blse();
        } else {
            if (i2 == 4) {
                return new bxvd(f127570b);
            }
            if (i2 == 5) {
                return f127570b;
            }
            bxxk bxxk = f127571d;
            if (bxxk == null) {
                synchronized (blse.class) {
                    bxxk = f127571d;
                    if (bxxk == null) {
                        bxxk = new bxve(f127570b);
                        f127571d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
