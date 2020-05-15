package p000;

/* renamed from: blco */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blco extends bxvk implements bxxd {

    /* renamed from: g */
    public static final blco f125949g;

    /* renamed from: h */
    private static volatile bxxk f125950h;

    /* renamed from: a */
    public int f125951a;

    /* renamed from: b */
    public String f125952b = "";

    /* renamed from: c */
    public String f125953c = "";

    /* renamed from: d */
    public long f125954d;

    /* renamed from: e */
    public String f125955e = "";

    /* renamed from: f */
    public String f125956f = "";

    static {
        blco blco = new blco();
        f125949g = blco;
        bxvk.m124024a(blco.class, blco);
    }

    private blco() {
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
            return bxvk.m124022a(f125949g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new blco();
        } else {
            if (i2 == 4) {
                return new bxvd(f125949g);
            }
            if (i2 == 5) {
                return f125949g;
            }
            bxxk bxxk = f125950h;
            if (bxxk == null) {
                synchronized (blco.class) {
                    bxxk = f125950h;
                    if (bxxk == null) {
                        bxxk = new bxve(f125949g);
                        f125950h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
