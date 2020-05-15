package p000;

/* renamed from: bpig */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpig extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bpig f137738g;

    /* renamed from: h */
    private static volatile bxxk f137739h;

    /* renamed from: a */
    public int f137740a;

    /* renamed from: b */
    public int f137741b;

    /* renamed from: c */
    public int f137742c = -1;

    /* renamed from: d */
    public int f137743d;

    /* renamed from: e */
    public String f137744e = "";

    /* renamed from: f */
    public bwev f137745f;

    static {
        bpig bpig = new bpig();
        f137738g = bpig;
        GeneratedMessageLite.m124024a(bpig.class, bpig);
    }

    private bpig() {
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
            return GeneratedMessageLite.m124022a(f137738g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003င\u0002\u0004ဈ\u0003\u0006ဉ\u0004", new Object[]{"a", "b", bphy.f137713a, "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bpig();
        } else {
            if (i2 == 4) {
                return new bxvd(f137738g);
            }
            if (i2 == 5) {
                return f137738g;
            }
            bxxk bxxk = f137739h;
            if (bxxk == null) {
                synchronized (bpig.class) {
                    bxxk = f137739h;
                    if (bxxk == null) {
                        bxxk = new bxve(f137738g);
                        f137739h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
