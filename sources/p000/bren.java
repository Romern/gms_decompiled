package p000;

/* renamed from: bren */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bren extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bren f142684b;

    /* renamed from: d */
    private static volatile bxxk f142685d;

    /* renamed from: a */
    public bral f142686a;

    /* renamed from: c */
    private int f142687c;

    static {
        bren bren = new bren();
        f142684b = bren;
        GeneratedMessageLite.m124024a(bren.class, bren);
    }

    private bren() {
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
            return GeneratedMessageLite.m124022a(f142684b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bren();
        } else {
            if (i2 == 4) {
                return new bxvd(f142684b);
            }
            if (i2 == 5) {
                return f142684b;
            }
            bxxk bxxk = f142685d;
            if (bxxk == null) {
                synchronized (bren.class) {
                    bxxk = f142685d;
                    if (bxxk == null) {
                        bxxk = new bxve(f142684b);
                        f142685d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
