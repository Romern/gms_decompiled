package p000;

/* renamed from: boxs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boxs extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final boxs f135283c;

    /* renamed from: d */
    private static volatile bxxk f135284d;

    /* renamed from: a */
    public int f135285a;

    /* renamed from: b */
    public int f135286b;

    static {
        boxs boxs = new boxs();
        f135283c = boxs;
        GeneratedMessageLite.m124024a(boxs.class, boxs);
    }

    private boxs() {
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
            return GeneratedMessageLite.m124022a(f135283c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", boxr.f135282a});
        } else if (i2 == 3) {
            return new boxs();
        } else {
            if (i2 == 4) {
                return new bxvd(f135283c);
            }
            if (i2 == 5) {
                return f135283c;
            }
            bxxk bxxk = f135284d;
            if (bxxk == null) {
                synchronized (boxs.class) {
                    bxxk = f135284d;
                    if (bxxk == null) {
                        bxxk = new bxve(f135283c);
                        f135284d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
