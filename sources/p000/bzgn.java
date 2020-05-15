package p000;

/* renamed from: bzgn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzgn extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bzgn f169952f;

    /* renamed from: g */
    public static final bxvj f169953g;

    /* renamed from: h */
    private static volatile bxxk f169954h;

    /* renamed from: a */
    public int f169955a;

    /* renamed from: b */
    public bzex f169956b;

    /* renamed from: c */
    public bxwc f169957c = bxxn.f165040b;

    /* renamed from: d */
    public bxwc f169958d = bxxn.f165040b;

    /* renamed from: e */
    public bzgm f169959e;

    static {
        bzgn bzgn = new bzgn();
        f169952f = bzgn;
        GeneratedMessageLite.m124024a(bzgn.class, bzgn);
        blcc blcc = blcc.f125904a;
        bzgn bzgn2 = f169952f;
        f169953g = GeneratedMessageLite.m124006a(blcc, bzgn2, bzgn2, 96705961, bxzf.MESSAGE);
    }

    private bzgn() {
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
            return GeneratedMessageLite.m124022a(f169952f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u001b\u0004ဉ\u0001", new Object[]{"a", "b", "c", bzfx.class, "d", bzfx.class, "e"});
        } else if (i2 == 3) {
            return new bzgn();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[]) null, (int[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f169952f;
            }
            bxxk bxxk = f169954h;
            if (bxxk == null) {
                synchronized (bzgn.class) {
                    bxxk = f169954h;
                    if (bxxk == null) {
                        bxxk = new bxve(f169952f);
                        f169954h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
