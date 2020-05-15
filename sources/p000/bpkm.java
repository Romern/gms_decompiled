package p000;

/* renamed from: bpkm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpkm extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bpkm f137987d;

    /* renamed from: e */
    private static volatile bxxk f137988e;

    /* renamed from: a */
    public int f137989a;

    /* renamed from: b */
    public bxwc f137990b = bxxn.f165040b;

    /* renamed from: c */
    public int f137991c;

    static {
        bpkm bpkm = new bpkm();
        f137987d = bpkm;
        GeneratedMessageLite.m124024a(bpkm.class, bpkm);
    }

    private bpkm() {
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
            return GeneratedMessageLite.m124022a(f137987d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002င\u0000", new Object[]{"a", "b", bpkj.class, "c"});
        } else if (i2 == 3) {
            return new bpkm();
        } else {
            if (i2 == 4) {
                return new bxvd((char[]) null, (int[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f137987d;
            }
            bxxk bxxk = f137988e;
            if (bxxk == null) {
                synchronized (bpkm.class) {
                    bxxk = f137988e;
                    if (bxxk == null) {
                        bxxk = new bxve(f137987d);
                        f137988e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
