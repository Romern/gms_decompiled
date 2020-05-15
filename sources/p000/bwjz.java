package p000;

/* renamed from: bwjz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwjz extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bwjz f159921g;

    /* renamed from: h */
    private static volatile bxxk f159922h;

    /* renamed from: a */
    public int f159923a;

    /* renamed from: b */
    public bmfv f159924b;

    /* renamed from: c */
    public ByteString f159925c = ByteString.f164797b;

    /* renamed from: d */
    public bmkm f159926d;

    /* renamed from: e */
    public bxwc f159927e = bxxn.f165040b;

    /* renamed from: f */
    public bmdk f159928f;

    static {
        bwjz bwjz = new bwjz();
        f159921g = bwjz;
        GeneratedMessageLite.m124024a(bwjz.class, bwjz);
    }

    private bwjz() {
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
            return GeneratedMessageLite.m124022a(f159921g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ဉ\u0002\u0004\u001b\u0005ဉ\u0003", new Object[]{"a", "b", "c", "d", "e", bmed.class, "f"});
        } else if (i2 == 3) {
            return new bwjz();
        } else {
            if (i2 == 4) {
                return new bxvd((char[]) null, (int[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f159921g;
            }
            bxxk bxxk = f159922h;
            if (bxxk == null) {
                synchronized (bwjz.class) {
                    bxxk = f159922h;
                    if (bxxk == null) {
                        bxxk = new bxve(f159921g);
                        f159922h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
