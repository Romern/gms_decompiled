package p000;

/* renamed from: bwgp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwgp extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bwgp f159240c;

    /* renamed from: d */
    private static volatile bxxk f159241d;

    /* renamed from: a */
    public int f159242a;

    /* renamed from: b */
    public bmed f159243b;

    static {
        bwgp bwgp = new bwgp();
        f159240c = bwgp;
        GeneratedMessageLite.m124024a(bwgp.class, bwgp);
    }

    private bwgp() {
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
            return GeneratedMessageLite.m124022a(f159240c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bwgp();
        } else {
            if (i2 == 4) {
                return new bxvd(f159240c);
            }
            if (i2 == 5) {
                return f159240c;
            }
            bxxk bxxk = f159241d;
            if (bxxk == null) {
                synchronized (bwgp.class) {
                    bxxk = f159241d;
                    if (bxxk == null) {
                        bxxk = new bxve(f159240c);
                        f159241d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
