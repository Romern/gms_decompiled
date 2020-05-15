package p000;

/* renamed from: bzrn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzrn extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bzrn f171170d;

    /* renamed from: e */
    private static volatile bxxk f171171e;

    /* renamed from: a */
    public int f171172a;

    /* renamed from: b */
    public String f171173b = "";

    /* renamed from: c */
    public String f171174c = "";

    static {
        bzrn bzrn = new bzrn();
        f171170d = bzrn;
        GeneratedMessageLite.m124024a(bzrn.class, bzrn);
    }

    private bzrn() {
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
            return GeneratedMessageLite.m124022a(f171170d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bzrn();
        } else {
            if (i2 == 4) {
                return new bxvd(f171170d);
            }
            if (i2 == 5) {
                return f171170d;
            }
            bxxk bxxk = f171171e;
            if (bxxk == null) {
                synchronized (bzrn.class) {
                    bxxk = f171171e;
                    if (bxxk == null) {
                        bxxk = new bxve(f171170d);
                        f171171e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
