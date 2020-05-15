package p000;

/* renamed from: bltc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bltc extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bltc f127663f;

    /* renamed from: g */
    private static volatile bxxk f127664g;

    /* renamed from: a */
    public int f127665a;

    /* renamed from: b */
    public ByteString f127666b = ByteString.f164797b;

    /* renamed from: c */
    public ByteString f127667c = ByteString.f164797b;

    /* renamed from: d */
    public bltb f127668d;

    /* renamed from: e */
    public blsy f127669e;

    static {
        bltc bltc = new bltc();
        f127663f = bltc;
        GeneratedMessageLite.m124024a(bltc.class, bltc);
    }

    private bltc() {
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
            return GeneratedMessageLite.m124022a(f127663f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bltc();
        } else {
            if (i2 == 4) {
                return new bxvd(f127663f);
            }
            if (i2 == 5) {
                return f127663f;
            }
            bxxk bxxk = f127664g;
            if (bxxk == null) {
                synchronized (bltc.class) {
                    bxxk = f127664g;
                    if (bxxk == null) {
                        bxxk = new bxve(f127663f);
                        f127664g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
