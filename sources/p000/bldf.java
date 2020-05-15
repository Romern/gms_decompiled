package p000;

/* renamed from: bldf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bldf extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bldf f126055d;

    /* renamed from: f */
    private static volatile bxxk f126056f;

    /* renamed from: a */
    public int f126057a;

    /* renamed from: b */
    public String f126058b = "";

    /* renamed from: c */
    public bxwc f126059c = bxxn.f165040b;

    /* renamed from: e */
    private byte f126060e = 2;

    static {
        bldf bldf = new bldf();
        f126055d = bldf;
        GeneratedMessageLite.m124024a(bldf.class, bldf);
    }

    private bldf() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f126060e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f126060e = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f126055d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0001\u0001ဈ\u0000\u0003Л", new Object[]{"a", "b", "c", blci.class});
        } else if (i2 == 3) {
            return new bldf();
        } else {
            if (i2 == 4) {
                return new bxvd(f126055d);
            }
            if (i2 == 5) {
                return f126055d;
            }
            bxxk bxxk = f126056f;
            if (bxxk == null) {
                synchronized (bldf.class) {
                    bxxk = f126056f;
                    if (bxxk == null) {
                        bxxk = new bxve(f126055d);
                        f126056f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
