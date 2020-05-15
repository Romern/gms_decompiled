package p000;

/* renamed from: bvnf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvnf extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bvnf f156854d;

    /* renamed from: f */
    private static volatile bxxk f156855f;

    /* renamed from: a */
    public int f156856a;

    /* renamed from: b */
    public int f156857b;

    /* renamed from: c */
    public ByteString f156858c = ByteString.f164797b;

    /* renamed from: e */
    private byte f156859e = 2;

    static {
        bvnf bvnf = new bvnf();
        f156854d = bvnf;
        GeneratedMessageLite.m124024a(bvnf.class, bvnf);
    }

    private bvnf() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f156859e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f156859e = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f156854d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔌ\u0000\u0002ᔊ\u0001", new Object[]{"a", "b", bvnd.f156853a, "c"});
        } else if (i2 == 3) {
            return new bvnf();
        } else {
            if (i2 == 4) {
                return new bxvd(f156854d);
            }
            if (i2 == 5) {
                return f156854d;
            }
            bxxk bxxk = f156855f;
            if (bxxk == null) {
                synchronized (bvnf.class) {
                    bxxk = f156855f;
                    if (bxxk == null) {
                        bxxk = new bxve(f156854d);
                        f156855f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
