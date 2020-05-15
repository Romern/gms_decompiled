package p000;

/* renamed from: bxal */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxal extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bxal f161712c;

    /* renamed from: d */
    public static final bxvj f161713d;

    /* renamed from: f */
    private static volatile bxxk f161714f;

    /* renamed from: a */
    public bwtg f161715a;

    /* renamed from: b */
    public bwtg f161716b;

    /* renamed from: e */
    private int f161717e;

    static {
        bxal bxal = new bxal();
        f161712c = bxal;
        GeneratedMessageLite.m124024a(bxal.class, bxal);
        bwxl bwxl = bwxl.f161383i;
        bxal bxal2 = f161712c;
        f161713d = GeneratedMessageLite.m124006a(bwxl, bxal2, bxal2, 255478364, bxzf.MESSAGE);
    }

    private bxal() {
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
            return GeneratedMessageLite.m124022a(f161712c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"e", "a", "b"});
        } else if (i2 == 3) {
            return new bxal();
        } else {
            if (i2 == 4) {
                return new bxvd(f161712c);
            }
            if (i2 == 5) {
                return f161712c;
            }
            bxxk bxxk = f161714f;
            if (bxxk == null) {
                synchronized (bxal.class) {
                    bxxk = f161714f;
                    if (bxxk == null) {
                        bxxk = new bxve(f161712c);
                        f161714f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
