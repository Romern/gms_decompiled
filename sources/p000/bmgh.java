package p000;

/* renamed from: bmgh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmgh extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bmgh f129239d;

    /* renamed from: e */
    private static volatile bxxk f129240e;

    /* renamed from: a */
    public int f129241a;

    /* renamed from: b */
    public bmnr f129242b;

    /* renamed from: c */
    public bxvw f129243c = bxwq.f165002b;

    static {
        bmgh bmgh = new bmgh();
        f129239d = bmgh;
        GeneratedMessageLite.m124024a(bmgh.class, bmgh);
    }

    private bmgh() {
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
            return GeneratedMessageLite.m124022a(f129239d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002%", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bmgh();
        } else {
            if (i2 == 4) {
                return new bmgg();
            }
            if (i2 == 5) {
                return f129239d;
            }
            bxxk bxxk = f129240e;
            if (bxxk == null) {
                synchronized (bmgh.class) {
                    bxxk = f129240e;
                    if (bxxk == null) {
                        bxxk = new bxve(f129239d);
                        f129240e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
