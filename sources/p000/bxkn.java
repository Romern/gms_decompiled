package p000;

/* renamed from: bxkn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxkn extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bxkn f163768d;

    /* renamed from: e */
    public static final bxvj f163769e;

    /* renamed from: f */
    private static volatile bxxk f163770f;

    /* renamed from: a */
    public int f163771a;

    /* renamed from: b */
    public bxkm f163772b;

    /* renamed from: c */
    public ByteString f163773c = ByteString.f164797b;

    static {
        bxkn bxkn = new bxkn();
        f163768d = bxkn;
        GeneratedMessageLite.m124024a(bxkn.class, bxkn);
        bxcf bxcf = bxcf.f162779a;
        bxkn bxkn2 = f163768d;
        f163769e = GeneratedMessageLite.m124006a(bxcf, bxkn2, bxkn2, 92880878, bxzf.MESSAGE);
    }

    private bxkn() {
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
            return GeneratedMessageLite.m124022a(f163768d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bxkn();
        } else {
            if (i2 == 4) {
                return new bxvd(f163768d);
            }
            if (i2 == 5) {
                return f163768d;
            }
            bxxk bxxk = f163770f;
            if (bxxk == null) {
                synchronized (bxkn.class) {
                    bxxk = f163770f;
                    if (bxxk == null) {
                        bxxk = new bxve(f163768d);
                        f163770f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
