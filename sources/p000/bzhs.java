package p000;

/* renamed from: bzhs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzhs extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bzhs f170113e;

    /* renamed from: g */
    private static volatile bxxk f170114g;

    /* renamed from: a */
    public bxwc f170115a = bxxn.f165040b;

    /* renamed from: b */
    public bxwc f170116b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f170117c = bxxn.f165040b;

    /* renamed from: d */
    public String f170118d = "";

    /* renamed from: f */
    private int f170119f;

    static {
        bzhs bzhs = new bzhs();
        f170113e = bzhs;
        GeneratedMessageLite.m124024a(bzhs.class, bzhs);
    }

    private bzhs() {
        bxxn bxxn = bxxn.f165040b;
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
            return GeneratedMessageLite.m124022a(f170113e, "\u0001\u0004\u0000\u0001\u0003\u0006\u0004\u0000\u0003\u0000\u0003\u001b\u0004\u001b\u0005\u001b\u0006ဈ\u0001", new Object[]{"f", "a", bzhq.class, "b", bzhr.class, "c", bzhn.class, "d"});
        } else if (i2 == 3) {
            return new bzhs();
        } else {
            if (i2 == 4) {
                return new bxvd(f170113e);
            }
            if (i2 == 5) {
                return f170113e;
            }
            bxxk bxxk = f170114g;
            if (bxxk == null) {
                synchronized (bzhs.class) {
                    bxxk = f170114g;
                    if (bxxk == null) {
                        bxxk = new bxve(f170113e);
                        f170114g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
