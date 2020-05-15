package p000;

/* renamed from: bxsp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxsp extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bxsp f164717c;

    /* renamed from: d */
    private static volatile bxxk f164718d;

    /* renamed from: a */
    public int f164719a;

    /* renamed from: b */
    public String f164720b = "";

    static {
        bxsp bxsp = new bxsp();
        f164717c = bxsp;
        GeneratedMessageLite.m124024a(bxsp.class, bxsp);
    }

    private bxsp() {
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
            return GeneratedMessageLite.m124022a(f164717c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bxsp();
        } else {
            if (i2 == 4) {
                return new bxvd(f164717c);
            }
            if (i2 == 5) {
                return f164717c;
            }
            bxxk bxxk = f164718d;
            if (bxxk == null) {
                synchronized (bxsp.class) {
                    bxxk = f164718d;
                    if (bxxk == null) {
                        bxxk = new bxve(f164717c);
                        f164718d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
