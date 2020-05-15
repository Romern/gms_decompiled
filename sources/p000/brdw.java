package p000;

/* renamed from: brdw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brdw extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final brdw f142570b;

    /* renamed from: d */
    private static volatile bxxk f142571d;

    /* renamed from: a */
    public boolean f142572a;

    /* renamed from: c */
    private int f142573c;

    static {
        brdw brdw = new brdw();
        f142570b = brdw;
        GeneratedMessageLite.m124024a(brdw.class, brdw);
    }

    private brdw() {
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
            return GeneratedMessageLite.m124022a(f142570b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new brdw();
        } else {
            if (i2 == 4) {
                return new bxvd(f142570b);
            }
            if (i2 == 5) {
                return f142570b;
            }
            bxxk bxxk = f142571d;
            if (bxxk == null) {
                synchronized (brdw.class) {
                    bxxk = f142571d;
                    if (bxxk == null) {
                        bxxk = new bxve(f142570b);
                        f142571d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
