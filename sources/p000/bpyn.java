package p000;

/* renamed from: bpyn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpyn extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bpyn f139894f;

    /* renamed from: g */
    private static volatile bxxk f139895g;

    /* renamed from: a */
    public int f139896a;

    /* renamed from: b */
    public int f139897b;

    /* renamed from: c */
    public bxwc f139898c = bxxn.f165040b;

    /* renamed from: d */
    public int f139899d;

    /* renamed from: e */
    public int f139900e;

    static {
        bpyn bpyn = new bpyn();
        f139894f = bpyn;
        GeneratedMessageLite.m124024a(bpyn.class, bpyn);
    }

    private bpyn() {
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
            return GeneratedMessageLite.m124022a(f139894f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002\u001a\u0003င\u0001\u0004င\u0002", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bpyn();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][][]) null, (short[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f139894f;
            }
            bxxk bxxk = f139895g;
            if (bxxk == null) {
                synchronized (bpyn.class) {
                    bxxk = f139895g;
                    if (bxxk == null) {
                        bxxk = new bxve(f139894f);
                        f139895g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
