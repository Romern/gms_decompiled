package p000;

/* renamed from: bufi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bufi extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bufi f153701f;

    /* renamed from: g */
    private static volatile bxxk f153702g;

    /* renamed from: a */
    public int f153703a;

    /* renamed from: b */
    public long f153704b;

    /* renamed from: c */
    public int f153705c;

    /* renamed from: d */
    public int f153706d;

    /* renamed from: e */
    public int f153707e;

    static {
        bufi bufi = new bufi();
        f153701f = bufi;
        GeneratedMessageLite.m124024a(bufi.class, bufi);
    }

    private bufi() {
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
            return GeneratedMessageLite.m124022a(f153701f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bufi();
        } else {
            if (i2 == 4) {
                return new bxvd(f153701f);
            }
            if (i2 == 5) {
                return f153701f;
            }
            bxxk bxxk = f153702g;
            if (bxxk == null) {
                synchronized (bufi.class) {
                    bxxk = f153702g;
                    if (bxxk == null) {
                        bxxk = new bxve(f153701f);
                        f153702g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
