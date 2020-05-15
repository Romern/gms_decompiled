package p000;

/* renamed from: bvmu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvmu extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bvmu f156793c;

    /* renamed from: e */
    private static volatile bxxk f156794e;

    /* renamed from: a */
    public bvow f156795a;

    /* renamed from: b */
    public bxwc f156796b = bxxn.f165040b;

    /* renamed from: d */
    private int f156797d;

    static {
        bvmu bvmu = new bvmu();
        f156793c = bvmu;
        GeneratedMessageLite.m124024a(bvmu.class, bvmu);
    }

    private bvmu() {
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
            return GeneratedMessageLite.m124022a(f156793c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"d", "a", "b", bvms.class});
        } else if (i2 == 3) {
            return new bvmu();
        } else {
            if (i2 == 4) {
                return new bxvd(f156793c);
            }
            if (i2 == 5) {
                return f156793c;
            }
            bxxk bxxk = f156794e;
            if (bxxk == null) {
                synchronized (bvmu.class) {
                    bxxk = f156794e;
                    if (bxxk == null) {
                        bxxk = new bxve(f156793c);
                        f156794e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
