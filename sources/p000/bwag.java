package p000;

/* renamed from: bwag */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwag extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bwag f158636f;

    /* renamed from: g */
    private static volatile bxxk f158637g;

    /* renamed from: a */
    public int f158638a;

    /* renamed from: b */
    public long f158639b;

    /* renamed from: c */
    public String f158640c = "";

    /* renamed from: d */
    public String f158641d = "";

    /* renamed from: e */
    public String f158642e = "";

    static {
        bwag bwag = new bwag();
        f158636f = bwag;
        GeneratedMessageLite.m124024a(bwag.class, bwag);
    }

    private bwag() {
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
            return GeneratedMessageLite.m124022a(f158636f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bwag();
        } else {
            if (i2 == 4) {
                return new bxvd(f158636f);
            }
            if (i2 == 5) {
                return f158636f;
            }
            bxxk bxxk = f158637g;
            if (bxxk == null) {
                synchronized (bwag.class) {
                    bxxk = f158637g;
                    if (bxxk == null) {
                        bxxk = new bxve(f158636f);
                        f158637g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
