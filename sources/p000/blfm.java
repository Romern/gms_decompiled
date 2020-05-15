package p000;

/* renamed from: blfm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blfm extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final blfm f126388d;

    /* renamed from: e */
    private static volatile bxxk f126389e;

    /* renamed from: a */
    public int f126390a;

    /* renamed from: b */
    public bxwc f126391b = bxxn.f165040b;

    /* renamed from: c */
    public blcy f126392c;

    static {
        blfm blfm = new blfm();
        f126388d = blfm;
        GeneratedMessageLite.m124024a(blfm.class, blfm);
    }

    private blfm() {
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
            return GeneratedMessageLite.m124022a(f126388d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"a", "b", blco.class, "c"});
        } else if (i2 == 3) {
            return new blfm();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[]) null, (char[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f126388d;
            }
            bxxk bxxk = f126389e;
            if (bxxk == null) {
                synchronized (blfm.class) {
                    bxxk = f126389e;
                    if (bxxk == null) {
                        bxxk = new bxve(f126388d);
                        f126389e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
