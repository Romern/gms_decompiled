package p000;

/* renamed from: bvts */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvts extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bvts f157611f;

    /* renamed from: g */
    private static volatile bxxk f157612g;

    /* renamed from: a */
    public int f157613a;

    /* renamed from: b */
    public bzrv f157614b;

    /* renamed from: c */
    public int f157615c;

    /* renamed from: d */
    public bxwc f157616d = bxxn.f165040b;

    /* renamed from: e */
    public String f157617e = "";

    static {
        bvts bvts = new bvts();
        f157611f = bvts;
        GeneratedMessageLite.m124024a(bvts.class, bvts);
    }

    private bvts() {
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
            return GeneratedMessageLite.m124022a(f157611f, "\u0001\u0004\u0000\u0001\u0002\u0006\u0004\u0000\u0001\u0000\u0002ဉ\u0000\u0003င\u0001\u0005\u001b\u0006ဈ\u0002", new Object[]{"a", "b", "c", "d", bvtr.class, "e"});
        } else if (i2 == 3) {
            return new bvts();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][]) null);
            }
            if (i2 == 5) {
                return f157611f;
            }
            bxxk bxxk = f157612g;
            if (bxxk == null) {
                synchronized (bvts.class) {
                    bxxk = f157612g;
                    if (bxxk == null) {
                        bxxk = new bxve(f157611f);
                        f157612g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
