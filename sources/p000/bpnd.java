package p000;

/* renamed from: bpnd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpnd extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final bpnd f138387h;

    /* renamed from: i */
    private static volatile bxxk f138388i;

    /* renamed from: a */
    public int f138389a;

    /* renamed from: b */
    public int f138390b;

    /* renamed from: c */
    public int f138391c;

    /* renamed from: d */
    public int f138392d;

    /* renamed from: e */
    public int f138393e;

    /* renamed from: f */
    public boolean f138394f;

    /* renamed from: g */
    public int f138395g;

    static {
        bpnd bpnd = new bpnd();
        f138387h = bpnd;
        GeneratedMessageLite.m124024a(bpnd.class, bpnd);
    }

    private bpnd() {
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
            return GeneratedMessageLite.m124022a(f138387h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005ဇ\u0004\u0006ဌ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g", bpnc.f138386a});
        } else if (i2 == 3) {
            return new bpnd();
        } else {
            if (i2 == 4) {
                return new bxvd(f138387h);
            }
            if (i2 == 5) {
                return f138387h;
            }
            bxxk bxxk = f138388i;
            if (bxxk == null) {
                synchronized (bpnd.class) {
                    bxxk = f138388i;
                    if (bxxk == null) {
                        bxxk = new bxve(f138387h);
                        f138388i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
