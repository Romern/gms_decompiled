package p000;

/* renamed from: bxnv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxnv extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bxnv f164096c;

    /* renamed from: d */
    public static final bxvj f164097d;

    /* renamed from: e */
    private static volatile bxxk f164098e;

    /* renamed from: a */
    public int f164099a;

    /* renamed from: b */
    public bxnu f164100b;

    static {
        bxnv bxnv = new bxnv();
        f164096c = bxnv;
        GeneratedMessageLite.m124024a(bxnv.class, bxnv);
        bxcf bxcf = bxcf.f162779a;
        bxnv bxnv2 = f164096c;
        f164097d = GeneratedMessageLite.m124006a(bxcf, bxnv2, bxnv2, 242629384, bxzf.MESSAGE);
    }

    private bxnv() {
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
            return GeneratedMessageLite.m124022a(f164096c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bxnv();
        } else {
            if (i2 == 4) {
                return new bxvd(f164096c);
            }
            if (i2 == 5) {
                return f164096c;
            }
            bxxk bxxk = f164098e;
            if (bxxk == null) {
                synchronized (bxnv.class) {
                    bxxk = f164098e;
                    if (bxxk == null) {
                        bxxk = new bxve(f164096c);
                        f164098e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
