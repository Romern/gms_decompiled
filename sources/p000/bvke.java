package p000;

/* renamed from: bvke */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvke extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final bvke f156393j;

    /* renamed from: k */
    private static volatile bxxk f156394k;

    /* renamed from: a */
    public ByteString f156395a = ByteString.f164797b;

    /* renamed from: b */
    public ByteString f156396b = ByteString.f164797b;

    /* renamed from: c */
    public ByteString f156397c = ByteString.f164797b;

    /* renamed from: d */
    public bxyk f156398d;

    /* renamed from: e */
    public bxyk f156399e;

    /* renamed from: f */
    public boolean f156400f;

    /* renamed from: g */
    public ByteString f156401g = ByteString.f164797b;

    /* renamed from: h */
    public ByteString f156402h = ByteString.f164797b;

    /* renamed from: i */
    public ByteString f156403i = ByteString.f164797b;

    static {
        bvke bvke = new bvke();
        f156393j = bvke;
        GeneratedMessageLite.m124024a(bvke.class, bvke);
    }

    private bvke() {
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
            return GeneratedMessageLite.m124022a(f156393j, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001\n\u0002\n\u0003\n\u0004\t\u0005\t\u0006\u0007\u0007\n\b\n\t\n", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
        } else if (i2 == 3) {
            return new bvke();
        } else {
            if (i2 == 4) {
                return new bxvd(f156393j);
            }
            if (i2 == 5) {
                return f156393j;
            }
            bxxk bxxk = f156394k;
            if (bxxk == null) {
                synchronized (bvke.class) {
                    bxxk = f156394k;
                    if (bxxk == null) {
                        bxxk = new bxve(f156393j);
                        f156394k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
