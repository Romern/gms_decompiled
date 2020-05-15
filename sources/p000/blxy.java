package p000;

/* renamed from: blxy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blxy extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final blxy f128171d;

    /* renamed from: e */
    private static volatile bxxk f128172e;

    /* renamed from: a */
    public int f128173a;

    /* renamed from: b */
    public bmaj f128174b;

    /* renamed from: c */
    public bxwc f128175c = bxxn.f165040b;

    static {
        blxy blxy = new blxy();
        f128171d = blxy;
        GeneratedMessageLite.m124024a(blxy.class, blxy);
    }

    private blxy() {
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
            return GeneratedMessageLite.m124022a(f128171d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001c", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new blxy();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][][]) null, (byte[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f128171d;
            }
            bxxk bxxk = f128172e;
            if (bxxk == null) {
                synchronized (blxy.class) {
                    bxxk = f128172e;
                    if (bxxk == null) {
                        bxxk = new bxve(f128171d);
                        f128172e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
