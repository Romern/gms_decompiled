package p000;

/* renamed from: bpws */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpws extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final bpws f139558h;

    /* renamed from: i */
    private static volatile bxxk f139559i;

    /* renamed from: a */
    public int f139560a;

    /* renamed from: b */
    public int f139561b;

    /* renamed from: c */
    public bpwr f139562c;

    /* renamed from: d */
    public double f139563d;

    /* renamed from: e */
    public double f139564e;

    /* renamed from: f */
    public boolean f139565f;

    /* renamed from: g */
    public boolean f139566g;

    static {
        bpws bpws = new bpws();
        f139558h = bpws;
        GeneratedMessageLite.m124024a(bpws.class, bpws);
    }

    private bpws() {
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
            return GeneratedMessageLite.m124022a(f139558h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003က\u0002\u0004က\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"a", "b", bpzb.f139978a, "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new bpws();
        } else {
            if (i2 == 4) {
                return new bxvd(f139558h);
            }
            if (i2 == 5) {
                return f139558h;
            }
            bxxk bxxk = f139559i;
            if (bxxk == null) {
                synchronized (bpws.class) {
                    bxxk = f139559i;
                    if (bxxk == null) {
                        bxxk = new bxve(f139558h);
                        f139559i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
