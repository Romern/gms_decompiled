package p000;

/* renamed from: mps */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mps extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final mps f34215e;

    /* renamed from: f */
    private static volatile bxxk f34216f;

    /* renamed from: a */
    public int f34217a;

    /* renamed from: b */
    public int f34218b;

    /* renamed from: c */
    public int f34219c;

    /* renamed from: d */
    public boolean f34220d;

    static {
        mps mps = new mps();
        f34215e = mps;
        GeneratedMessageLite.m124024a(mps.class, mps);
    }

    private mps() {
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
            return GeneratedMessageLite.m124022a(f34215e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003ဇ\u0002", new Object[]{"a", "b", mpt.f34221a, "c", "d"});
        } else if (i2 == 3) {
            return new mps();
        } else {
            if (i2 == 4) {
                return new bxvd(f34215e);
            }
            if (i2 == 5) {
                return f34215e;
            }
            bxxk bxxk = f34216f;
            if (bxxk == null) {
                synchronized (mps.class) {
                    bxxk = f34216f;
                    if (bxxk == null) {
                        bxxk = new bxve(f34215e);
                        f34216f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
