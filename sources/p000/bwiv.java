package p000;

/* renamed from: bwiv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwiv extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bwiv f159693e;

    /* renamed from: f */
    private static volatile bxxk f159694f;

    /* renamed from: a */
    public int f159695a;

    /* renamed from: b */
    public int f159696b;

    /* renamed from: c */
    public ByteString f159697c = ByteString.f164797b;

    /* renamed from: d */
    public ByteString f159698d = ByteString.f164797b;

    static {
        bwiv bwiv = new bwiv();
        f159693e = bwiv;
        GeneratedMessageLite.m124024a(bwiv.class, bwiv);
    }

    private bwiv() {
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
            return GeneratedMessageLite.m124022a(f159693e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ည\u0001\u0004ည\u0002", new Object[]{"a", "b", bwiw.f159699a, "c", "d"});
        } else if (i2 == 3) {
            return new bwiv();
        } else {
            if (i2 == 4) {
                return new bxvd(f159693e);
            }
            if (i2 == 5) {
                return f159693e;
            }
            bxxk bxxk = f159694f;
            if (bxxk == null) {
                synchronized (bwiv.class) {
                    bxxk = f159694f;
                    if (bxxk == null) {
                        bxxk = new bxve(f159693e);
                        f159694f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
