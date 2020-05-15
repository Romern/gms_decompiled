package p000;

/* renamed from: bzrh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzrh extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bzrh f171129d;

    /* renamed from: f */
    private static volatile bxxk f171130f;

    /* renamed from: a */
    public String f171131a = "";

    /* renamed from: b */
    public String f171132b = "";

    /* renamed from: c */
    public String f171133c = "";

    /* renamed from: e */
    private int f171134e;

    static {
        bzrh bzrh = new bzrh();
        f171129d = bzrh;
        GeneratedMessageLite.m124024a(bzrh.class, bzrh);
    }

    private bzrh() {
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
            return GeneratedMessageLite.m124022a(f171129d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"e", "a", "b", "c"});
        } else if (i2 == 3) {
            return new bzrh();
        } else {
            if (i2 == 4) {
                return new bxvd(f171129d);
            }
            if (i2 == 5) {
                return f171129d;
            }
            bxxk bxxk = f171130f;
            if (bxxk == null) {
                synchronized (bzrh.class) {
                    bxxk = f171130f;
                    if (bxxk == null) {
                        bxxk = new bxve(f171129d);
                        f171130f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
