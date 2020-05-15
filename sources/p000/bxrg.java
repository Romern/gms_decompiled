package p000;

/* renamed from: bxrg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxrg extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bxrg f164554b;

    /* renamed from: d */
    private static volatile bxxk f164555d;

    /* renamed from: a */
    public bxsk f164556a;

    /* renamed from: c */
    private int f164557c;

    static {
        bxrg bxrg = new bxrg();
        f164554b = bxrg;
        GeneratedMessageLite.m124024a(bxrg.class, bxrg);
    }

    private bxrg() {
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
            return GeneratedMessageLite.m124022a(f164554b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bxrg();
        } else {
            if (i2 == 4) {
                return new bxvd(f164554b);
            }
            if (i2 == 5) {
                return f164554b;
            }
            bxxk bxxk = f164555d;
            if (bxxk == null) {
                synchronized (bxrg.class) {
                    bxxk = f164555d;
                    if (bxxk == null) {
                        bxxk = new bxve(f164554b);
                        f164555d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
