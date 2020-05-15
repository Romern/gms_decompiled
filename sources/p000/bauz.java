package p000;

/* renamed from: bauz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bauz extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bauz f101860g;

    /* renamed from: h */
    private static volatile bxxk f101861h;

    /* renamed from: a */
    public int f101862a;

    /* renamed from: b */
    public long f101863b;

    /* renamed from: c */
    public long f101864c;

    /* renamed from: d */
    public long f101865d;

    /* renamed from: e */
    public long f101866e;

    /* renamed from: f */
    public int f101867f;

    static {
        bauz bauz = new bauz();
        f101860g = bauz;
        GeneratedMessageLite.m124024a(bauz.class, bauz);
    }

    private bauz() {
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
            return GeneratedMessageLite.m124022a(f101860g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005င\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bauz();
        } else {
            if (i2 == 4) {
                return new bxvd(f101860g);
            }
            if (i2 == 5) {
                return f101860g;
            }
            bxxk bxxk = f101861h;
            if (bxxk == null) {
                synchronized (bauz.class) {
                    bxxk = f101861h;
                    if (bxxk == null) {
                        bxxk = new bxve(f101860g);
                        f101861h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
