package p000;

/* renamed from: bldi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bldi extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bldi f126081f;

    /* renamed from: g */
    private static volatile bxxk f126082g;

    /* renamed from: a */
    public int f126083a;

    /* renamed from: b */
    public bleu f126084b;

    /* renamed from: c */
    public long f126085c;

    /* renamed from: d */
    public bzru f126086d;

    /* renamed from: e */
    public String f126087e = "";

    static {
        bldi bldi = new bldi();
        f126081f = bldi;
        bxvk.m124024a(bldi.class, bldi);
    }

    private bldi() {
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
            return bxvk.m124022a(f126081f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0004ဈ\u0004\u0005ဉ\u0003", new Object[]{"a", "b", "c", "e", "d"});
        } else if (i2 == 3) {
            return new bldi();
        } else {
            if (i2 == 4) {
                return new bxvd(f126081f);
            }
            if (i2 == 5) {
                return f126081f;
            }
            bxxk bxxk = f126082g;
            if (bxxk == null) {
                synchronized (bldi.class) {
                    bxxk = f126082g;
                    if (bxxk == null) {
                        bxxk = new bxve(f126081f);
                        f126082g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
