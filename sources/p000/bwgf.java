package p000;

/* renamed from: bwgf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwgf extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bwgf f159187f;

    /* renamed from: g */
    private static volatile bxxk f159188g;

    /* renamed from: a */
    public int f159189a;

    /* renamed from: b */
    public bmaj f159190b;

    /* renamed from: c */
    public String f159191c = "";

    /* renamed from: d */
    public ByteString f159192d = ByteString.f164797b;

    /* renamed from: e */
    public String f159193e = "";

    static {
        bwgf bwgf = new bwgf();
        f159187f = bwgf;
        GeneratedMessageLite.m124024a(bwgf.class, bwgf);
    }

    private bwgf() {
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
            return GeneratedMessageLite.m124022a(f159187f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ဈ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bwgf();
        } else {
            if (i2 == 4) {
                return new bxvd(f159187f);
            }
            if (i2 == 5) {
                return f159187f;
            }
            bxxk bxxk = f159188g;
            if (bxxk == null) {
                synchronized (bwgf.class) {
                    bxxk = f159188g;
                    if (bxxk == null) {
                        bxxk = new bxve(f159187f);
                        f159188g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
