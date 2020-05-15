package p000;

/* renamed from: bvfh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvfh extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bvfh f155864c;

    /* renamed from: d */
    private static volatile bxxk f155865d;

    /* renamed from: a */
    public int f155866a;

    /* renamed from: b */
    public int f155867b;

    static {
        bvfh bvfh = new bvfh();
        f155864c = bvfh;
        GeneratedMessageLite.m124024a(bvfh.class, bvfh);
    }

    private bvfh() {
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
            return GeneratedMessageLite.m124022a(f155864c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bvjl.f156346a});
        } else if (i2 == 3) {
            return new bvfh();
        } else {
            if (i2 == 4) {
                return new bxvd(f155864c);
            }
            if (i2 == 5) {
                return f155864c;
            }
            bxxk bxxk = f155865d;
            if (bxxk == null) {
                synchronized (bvfh.class) {
                    bxxk = f155865d;
                    if (bxxk == null) {
                        bxxk = new bxve(f155864c);
                        f155865d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
