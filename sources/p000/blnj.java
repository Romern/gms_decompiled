package p000;

/* renamed from: blnj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blnj extends bxvk implements bxxd {

    /* renamed from: j */
    public static final blnj f126981j;

    /* renamed from: k */
    private static volatile bxxk f126982k;

    /* renamed from: a */
    public int f126983a;

    /* renamed from: b */
    public String f126984b = "";

    /* renamed from: c */
    public String f126985c = "";

    /* renamed from: d */
    public String f126986d = "";

    /* renamed from: e */
    public String f126987e = "";

    /* renamed from: f */
    public String f126988f = "";

    /* renamed from: g */
    public String f126989g = "";

    /* renamed from: h */
    public String f126990h = "";

    /* renamed from: i */
    public String f126991i = "";

    static {
        blnj blnj = new blnj();
        f126981j = blnj;
        bxvk.m124024a(blnj.class, blnj);
    }

    private blnj() {
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
            return bxvk.m124022a(f126981j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0006\u0006ဈ\u0004\u0007ဈ\u0005\bဈ\u0007", new Object[]{"a", "b", "c", "d", "e", "h", "f", "g", "i"});
        } else if (i2 == 3) {
            return new blnj();
        } else {
            if (i2 == 4) {
                return new bxvd(f126981j);
            }
            if (i2 == 5) {
                return f126981j;
            }
            bxxk bxxk = f126982k;
            if (bxxk == null) {
                synchronized (blnj.class) {
                    bxxk = f126982k;
                    if (bxxk == null) {
                        bxxk = new bxve(f126981j);
                        f126982k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
