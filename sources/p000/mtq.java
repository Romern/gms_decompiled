package p000;

/* renamed from: mtq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mtq extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final mtq f34696d;

    /* renamed from: e */
    private static volatile bxxk f34697e;

    /* renamed from: a */
    public int f34698a;

    /* renamed from: b */
    public int f34699b;

    /* renamed from: c */
    public int f34700c;

    static {
        mtq mtq = new mtq();
        f34696d = mtq;
        GeneratedMessageLite.m124024a(mtq.class, mtq);
    }

    private mtq() {
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
            return GeneratedMessageLite.m124022a(f34696d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new mtq();
        } else {
            if (i2 == 4) {
                return new bxvd(f34696d);
            }
            if (i2 == 5) {
                return f34696d;
            }
            bxxk bxxk = f34697e;
            if (bxxk == null) {
                synchronized (mtq.class) {
                    bxxk = f34697e;
                    if (bxxk == null) {
                        bxxk = new bxve(f34696d);
                        f34697e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
