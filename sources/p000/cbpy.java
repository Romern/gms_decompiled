package p000;

/* renamed from: cbpy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbpy extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final cbpy f177968h;

    /* renamed from: i */
    private static volatile bxxk f177969i;

    /* renamed from: a */
    public cbqj f177970a;

    /* renamed from: b */
    public cbpq f177971b;

    /* renamed from: c */
    public bxwc f177972c = bxxn.f165040b;

    /* renamed from: d */
    public bxwc f177973d = bxxn.f165040b;

    /* renamed from: e */
    public cbqt f177974e;

    /* renamed from: f */
    public int f177975f;

    /* renamed from: g */
    public boolean f177976g;

    static {
        cbpy cbpy = new cbpy();
        f177968h = cbpy;
        GeneratedMessageLite.m124024a(cbpy.class, cbpy);
    }

    private cbpy() {
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
            return GeneratedMessageLite.m124022a(f177968h, "\u0000\u0007\u0000\u0000\u0001\b\u0007\u0000\u0002\u0000\u0001\t\u0002\u001b\u0004\t\u0005\u001b\u0006\f\u0007\t\b\u0007", new Object[]{"b", "c", cbpw.class, "a", "d", cbqe.class, "f", "e", "g"});
        } else if (i2 == 3) {
            return new cbpy();
        } else {
            if (i2 == 4) {
                return new cbpx();
            }
            if (i2 == 5) {
                return f177968h;
            }
            bxxk bxxk = f177969i;
            if (bxxk == null) {
                synchronized (cbpy.class) {
                    bxxk = f177969i;
                    if (bxxk == null) {
                        bxxk = new bxve(f177968h);
                        f177969i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
