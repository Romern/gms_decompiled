package p000;

/* renamed from: bvgo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvgo extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bvgo f156022e;

    /* renamed from: f */
    private static volatile bxxk f156023f;

    /* renamed from: a */
    public int f156024a;

    /* renamed from: b */
    public String f156025b = "";

    /* renamed from: c */
    public String f156026c = "";

    /* renamed from: d */
    public int f156027d;

    static {
        bvgo bvgo = new bvgo();
        f156022e = bvgo;
        GeneratedMessageLite.m124024a(bvgo.class, bvgo);
    }

    private bvgo() {
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
            return GeneratedMessageLite.m124022a(f156022e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bvgo();
        } else {
            if (i2 == 4) {
                return new bxvd(f156022e);
            }
            if (i2 == 5) {
                return f156022e;
            }
            bxxk bxxk = f156023f;
            if (bxxk == null) {
                synchronized (bvgo.class) {
                    bxxk = f156023f;
                    if (bxxk == null) {
                        bxxk = new bxve(f156022e);
                        f156023f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
