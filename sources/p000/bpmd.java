package p000;

/* renamed from: bpmd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpmd extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bpmd f138225g;

    /* renamed from: h */
    private static volatile bxxk f138226h;

    /* renamed from: a */
    public int f138227a;

    /* renamed from: b */
    public long f138228b;

    /* renamed from: c */
    public int f138229c;

    /* renamed from: d */
    public int f138230d;

    /* renamed from: e */
    public float f138231e;

    /* renamed from: f */
    public float f138232f;

    static {
        bpmd bpmd = new bpmd();
        f138225g = bpmd;
        GeneratedMessageLite.m124024a(bpmd.class, bpmd);
    }

    private bpmd() {
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
            return GeneratedMessageLite.m124022a(f138225g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001စ\u0000\u0002င\u0001\u0003င\u0002\u0004ခ\u0003\u0005ခ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bpmd();
        } else {
            if (i2 == 4) {
                return new bxvd(f138225g);
            }
            if (i2 == 5) {
                return f138225g;
            }
            bxxk bxxk = f138226h;
            if (bxxk == null) {
                synchronized (bpmd.class) {
                    bxxk = f138226h;
                    if (bxxk == null) {
                        bxxk = new bxve(f138225g);
                        f138226h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
