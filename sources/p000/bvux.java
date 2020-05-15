package p000;

/* renamed from: bvux */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvux extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bvux f157756d;

    /* renamed from: e */
    private static volatile bxxk f157757e;

    /* renamed from: a */
    public int f157758a;

    /* renamed from: b */
    public byel f157759b;

    /* renamed from: c */
    public int f157760c;

    static {
        bvux bvux = new bvux();
        f157756d = bvux;
        GeneratedMessageLite.m124024a(bvux.class, bvux);
    }

    private bvux() {
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
            return GeneratedMessageLite.m124022a(f157756d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bvux();
        } else {
            if (i2 == 4) {
                return new bxvd(f157756d);
            }
            if (i2 == 5) {
                return f157756d;
            }
            bxxk bxxk = f157757e;
            if (bxxk == null) {
                synchronized (bvux.class) {
                    bxxk = f157757e;
                    if (bxxk == null) {
                        bxxk = new bxve(f157756d);
                        f157757e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
