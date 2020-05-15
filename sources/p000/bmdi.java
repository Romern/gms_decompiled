package p000;

/* renamed from: bmdi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmdi extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bmdi f128798c;

    /* renamed from: e */
    private static volatile bxxk f128799e;

    /* renamed from: a */
    public bmdm f128800a;

    /* renamed from: b */
    public String f128801b = "";

    /* renamed from: d */
    private int f128802d;

    static {
        bmdi bmdi = new bmdi();
        f128798c = bmdi;
        GeneratedMessageLite.m124024a(bmdi.class, bmdi);
    }

    private bmdi() {
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
            return GeneratedMessageLite.m124022a(f128798c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bmdi();
        } else {
            if (i2 == 4) {
                return new bxvd(f128798c);
            }
            if (i2 == 5) {
                return f128798c;
            }
            bxxk bxxk = f128799e;
            if (bxxk == null) {
                synchronized (bmdi.class) {
                    bxxk = f128799e;
                    if (bxxk == null) {
                        bxxk = new bxve(f128798c);
                        f128799e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
