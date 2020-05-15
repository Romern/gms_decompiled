package p000;

/* renamed from: brdv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brdv extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final brdv f142566b;

    /* renamed from: d */
    private static volatile bxxk f142567d;

    /* renamed from: a */
    public boolean f142568a;

    /* renamed from: c */
    private int f142569c;

    static {
        brdv brdv = new brdv();
        f142566b = brdv;
        GeneratedMessageLite.m124024a(brdv.class, brdv);
    }

    private brdv() {
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
            return GeneratedMessageLite.m124022a(f142566b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဇ\u0001", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new brdv();
        } else {
            if (i2 == 4) {
                return new bxvd(f142566b);
            }
            if (i2 == 5) {
                return f142566b;
            }
            bxxk bxxk = f142567d;
            if (bxxk == null) {
                synchronized (brdv.class) {
                    bxxk = f142567d;
                    if (bxxk == null) {
                        bxxk = new bxve(f142566b);
                        f142567d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
