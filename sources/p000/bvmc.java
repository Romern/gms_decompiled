package p000;

/* renamed from: bvmc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvmc extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bvmc f156635d;

    /* renamed from: e */
    private static volatile bxxk f156636e;

    /* renamed from: a */
    public int f156637a;

    /* renamed from: b */
    public bvov f156638b;

    /* renamed from: c */
    public String f156639c = "";

    static {
        bvmc bvmc = new bvmc();
        f156635d = bvmc;
        GeneratedMessageLite.m124024a(bvmc.class, bvmc);
    }

    private bvmc() {
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
            return GeneratedMessageLite.m124022a(f156635d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bvmc();
        } else {
            if (i2 == 4) {
                return new bxvd(f156635d);
            }
            if (i2 == 5) {
                return f156635d;
            }
            bxxk bxxk = f156636e;
            if (bxxk == null) {
                synchronized (bvmc.class) {
                    bxxk = f156636e;
                    if (bxxk == null) {
                        bxxk = new bxve(f156635d);
                        f156636e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
