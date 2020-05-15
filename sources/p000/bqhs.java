package p000;

/* renamed from: bqhs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqhs extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final bqhs f140708j;

    /* renamed from: k */
    private static volatile bxxk f140709k;

    /* renamed from: a */
    public int f140710a = 0;

    /* renamed from: b */
    public Object f140711b;

    /* renamed from: c */
    public long f140712c;

    /* renamed from: d */
    public long f140713d;

    /* renamed from: e */
    public String f140714e = "";

    /* renamed from: f */
    public long f140715f;

    /* renamed from: g */
    public int f140716g;

    /* renamed from: h */
    public String f140717h = "";

    /* renamed from: i */
    public String f140718i = "";

    static {
        bqhs bqhs = new bqhs();
        f140708j = bqhs;
        GeneratedMessageLite.m124024a(bqhs.class, bqhs);
    }

    private bqhs() {
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
            return GeneratedMessageLite.m124022a(f140708j, "\u0000\n\u0001\u0000\u0001\u000b\n\u0000\u0000\u0000\u0001\u0002\u0003\u0002\u0004Ȉ\u0005\u0002\u0006\f\u0007<\u0000\bȈ\t<\u0000\n<\u0000\u000bȈ", new Object[]{"b", "a", "c", "d", "e", "f", "g", bqhm.class, "h", bqhn.class, bqho.class, "i"});
        } else if (i2 == 3) {
            return new bqhs();
        } else {
            if (i2 == 4) {
                return new bxvd(f140708j);
            }
            if (i2 == 5) {
                return f140708j;
            }
            bxxk bxxk = f140709k;
            if (bxxk == null) {
                synchronized (bqhs.class) {
                    bxxk = f140709k;
                    if (bxxk == null) {
                        bxxk = new bxve(f140708j);
                        f140709k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
