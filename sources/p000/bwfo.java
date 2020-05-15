package p000;

/* renamed from: bwfo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwfo extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final bwfo f159090h;

    /* renamed from: i */
    private static volatile bxxk f159091i;

    /* renamed from: a */
    public int f159092a;

    /* renamed from: b */
    public int f159093b;

    /* renamed from: c */
    public long f159094c;

    /* renamed from: d */
    public ByteString f159095d = ByteString.f164797b;

    /* renamed from: e */
    public bxvt f159096e = bxvm.f164965b;

    /* renamed from: f */
    public bxvt f159097f = bxvm.f164965b;

    /* renamed from: g */
    public int f159098g = 3;

    static {
        bwfo bwfo = new bwfo();
        f159090h = bwfo;
        GeneratedMessageLite.m124024a(bwfo.class, bwfo);
    }

    private bwfo() {
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
            return GeneratedMessageLite.m124022a(f159090h, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0002\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ည\u0002\u0006'\u0007'\bဌ\u0003", new Object[]{"a", "b", bwez.f159045a, "c", "d", "e", "f", "g", bwfm.f159089a});
        } else if (i2 == 3) {
            return new bwfo();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][][]) null, (int[]) null);
            }
            if (i2 == 5) {
                return f159090h;
            }
            bxxk bxxk = f159091i;
            if (bxxk == null) {
                synchronized (bwfo.class) {
                    bxxk = f159091i;
                    if (bxxk == null) {
                        bxxk = new bxve(f159090h);
                        f159091i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
