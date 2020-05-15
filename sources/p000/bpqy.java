package p000;

/* renamed from: bpqy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpqy extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final bpqy f138801i;

    /* renamed from: j */
    private static volatile bxxk f138802j;

    /* renamed from: a */
    public int f138803a;

    /* renamed from: b */
    public bpph f138804b;

    /* renamed from: c */
    public int f138805c;

    /* renamed from: d */
    public boolean f138806d;

    /* renamed from: e */
    public long f138807e;

    /* renamed from: f */
    public int f138808f;

    /* renamed from: g */
    public int f138809g;

    /* renamed from: h */
    public int f138810h;

    static {
        bpqy bpqy = new bpqy();
        f138801i = bpqy;
        GeneratedMessageLite.m124024a(bpqy.class, bpqy);
    }

    private bpqy() {
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
            return GeneratedMessageLite.m124022a(f138801i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဌ\u0002\u0004ဇ\u0003\u0005ဂ\u0004\u0006ဌ\u0005\u0007င\u0006\bဌ\u0007", new Object[]{"a", "b", "c", bpqx.f138800a, "d", "e", "f", bpqw.f138799a, "g", "h", bpor.f138568a});
        } else if (i2 == 3) {
            return new bpqy();
        } else {
            if (i2 == 4) {
                return new bxvd(f138801i);
            }
            if (i2 == 5) {
                return f138801i;
            }
            bxxk bxxk = f138802j;
            if (bxxk == null) {
                synchronized (bpqy.class) {
                    bxxk = f138802j;
                    if (bxxk == null) {
                        bxxk = new bxve(f138801i);
                        f138802j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
