package p000;

/* renamed from: bvna */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvna extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bvna f156836d;

    /* renamed from: e */
    private static volatile bxxk f156837e;

    /* renamed from: a */
    public int f156838a;

    /* renamed from: b */
    public bvov f156839b;

    /* renamed from: c */
    public bvox f156840c;

    static {
        bvna bvna = new bvna();
        f156836d = bvna;
        GeneratedMessageLite.m124024a(bvna.class, bvna);
    }

    private bvna() {
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
            return GeneratedMessageLite.m124022a(f156836d, "\u0001\u0002\u0000\u0001\u0001\u0006\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0006ဉ\u0005", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bvna();
        } else {
            if (i2 == 4) {
                return new bxvd(f156836d);
            }
            if (i2 == 5) {
                return f156836d;
            }
            bxxk bxxk = f156837e;
            if (bxxk == null) {
                synchronized (bvna.class) {
                    bxxk = f156837e;
                    if (bxxk == null) {
                        bxxk = new bxve(f156836d);
                        f156837e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
