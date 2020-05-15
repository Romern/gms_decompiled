package p000;

/* renamed from: bwof */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwof extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bwof f160430f;

    /* renamed from: g */
    private static volatile bxxk f160431g;

    /* renamed from: a */
    public int f160432a;

    /* renamed from: b */
    public int f160433b = 1;

    /* renamed from: c */
    public int f160434c;

    /* renamed from: d */
    public int f160435d;

    /* renamed from: e */
    public int f160436e = 4;

    static {
        bwof bwof = new bwof();
        f160430f = bwof;
        GeneratedMessageLite.m124024a(bwof.class, bwof);
    }

    private bwof() {
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
            return GeneratedMessageLite.m124022a(f160430f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဌ\u0003\u0004ဌ\u0001\u0005င\u0002", new Object[]{"a", "b", bwnz.f160427a, "e", bwod.f160429a, "c", bwob.f160428a, "d"});
        } else if (i2 == 3) {
            return new bwof();
        } else {
            if (i2 == 4) {
                return new bxvd(f160430f);
            }
            if (i2 == 5) {
                return f160430f;
            }
            bxxk bxxk = f160431g;
            if (bxxk == null) {
                synchronized (bwof.class) {
                    bxxk = f160431g;
                    if (bxxk == null) {
                        bxxk = new bxve(f160430f);
                        f160431g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
