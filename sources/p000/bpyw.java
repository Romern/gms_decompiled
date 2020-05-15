package p000;

/* renamed from: bpyw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpyw extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bpyw f139949e;

    /* renamed from: f */
    private static volatile bxxk f139950f;

    /* renamed from: a */
    public int f139951a;

    /* renamed from: b */
    public bpyz f139952b;

    /* renamed from: c */
    public int f139953c;

    /* renamed from: d */
    public long f139954d;

    static {
        bpyw bpyw = new bpyw();
        f139949e = bpyw;
        GeneratedMessageLite.m124024a(bpyw.class, bpyw);
    }

    private bpyw() {
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
            return GeneratedMessageLite.m124022a(f139949e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0003ဂ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bpyw();
        } else {
            if (i2 == 4) {
                return new bxvd(f139949e);
            }
            if (i2 == 5) {
                return f139949e;
            }
            bxxk bxxk = f139950f;
            if (bxxk == null) {
                synchronized (bpyw.class) {
                    bxxk = f139950f;
                    if (bxxk == null) {
                        bxxk = new bxve(f139949e);
                        f139950f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
