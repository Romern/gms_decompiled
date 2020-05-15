package p000;

/* renamed from: blnz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blnz extends bxvk implements bxxd {

    /* renamed from: c */
    public static final blnz f127056c;

    /* renamed from: d */
    private static volatile bxxk f127057d;

    /* renamed from: a */
    public int f127058a;

    /* renamed from: b */
    public String f127059b = "";

    static {
        blnz blnz = new blnz();
        f127056c = blnz;
        bxvk.m124024a(blnz.class, blnz);
    }

    private blnz() {
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
            return bxvk.m124022a(f127056c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new blnz();
        } else {
            if (i2 == 4) {
                return new bxvd(f127056c);
            }
            if (i2 == 5) {
                return f127056c;
            }
            bxxk bxxk = f127057d;
            if (bxxk == null) {
                synchronized (blnz.class) {
                    bxxk = f127057d;
                    if (bxxk == null) {
                        bxxk = new bxve(f127056c);
                        f127057d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
