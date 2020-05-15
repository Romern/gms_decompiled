package p000;

/* renamed from: bwvq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwvq extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bwvq f161154g;

    /* renamed from: h */
    public static final bxvj f161155h;

    /* renamed from: k */
    private static volatile bxxk f161156k;

    /* renamed from: a */
    public int f161157a;

    /* renamed from: b */
    public bxwc f161158b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f161159c = bxxn.f165040b;

    /* renamed from: d */
    public bwxl f161160d;

    /* renamed from: e */
    public int f161161e;

    /* renamed from: f */
    public int f161162f;

    /* renamed from: i */
    private int f161163i;

    /* renamed from: j */
    private byte f161164j = 2;

    static {
        bwvq bwvq = new bwvq();
        f161154g = bwvq;
        GeneratedMessageLite.m124024a(bwvq.class, bwvq);
        bwxl bwxl = bwxl.f161383i;
        bwvq bwvq2 = f161154g;
        f161155h = GeneratedMessageLite.m124006a(bwxl, bwvq2, bwvq2, 65148490, bxzf.MESSAGE);
    }

    private bwvq() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f161164j);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f161164j = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f161154g, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0002\u0003\u0001Л\u0002Л\u0003ᐉ\u0001\u0004ဌ\u0002\u0005ဌ\u0003\bဌ\u0000", new Object[]{"i", "b", bwxl.class, "c", bwxl.class, "d", "e", bwvm.f161152a, "f", bwvo.f161153a, "a", bwus.f161065a});
        } else if (i2 == 3) {
            return new bwvq();
        } else {
            if (i2 == 4) {
                return new bxvd(f161154g);
            }
            if (i2 == 5) {
                return f161154g;
            }
            bxxk bxxk = f161156k;
            if (bxxk == null) {
                synchronized (bwvq.class) {
                    bxxk = f161156k;
                    if (bxxk == null) {
                        bxxk = new bxve(f161154g);
                        f161156k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
