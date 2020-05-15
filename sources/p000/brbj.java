package p000;

/* renamed from: brbj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brbj extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final brbj f142268b;

    /* renamed from: d */
    private static volatile bxxk f142269d;

    /* renamed from: a */
    public bral f142270a;

    /* renamed from: c */
    private int f142271c;

    static {
        brbj brbj = new brbj();
        f142268b = brbj;
        GeneratedMessageLite.m124024a(brbj.class, brbj);
    }

    private brbj() {
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
            return GeneratedMessageLite.m124022a(f142268b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new brbj();
        } else {
            if (i2 == 4) {
                return new bxvd(f142268b);
            }
            if (i2 == 5) {
                return f142268b;
            }
            bxxk bxxk = f142269d;
            if (bxxk == null) {
                synchronized (brbj.class) {
                    bxxk = f142269d;
                    if (bxxk == null) {
                        bxxk = new bxve(f142268b);
                        f142269d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
