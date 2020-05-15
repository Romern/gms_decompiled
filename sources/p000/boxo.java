package p000;

/* renamed from: boxo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boxo extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final boxo f135271c;

    /* renamed from: d */
    private static volatile bxxk f135272d;

    /* renamed from: a */
    public int f135273a;

    /* renamed from: b */
    public String f135274b = "";

    static {
        boxo boxo = new boxo();
        f135271c = boxo;
        GeneratedMessageLite.m124024a(boxo.class, boxo);
    }

    private boxo() {
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
            return GeneratedMessageLite.m124022a(f135271c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new boxo();
        } else {
            if (i2 == 4) {
                return new bxvd(f135271c);
            }
            if (i2 == 5) {
                return f135271c;
            }
            bxxk bxxk = f135272d;
            if (bxxk == null) {
                synchronized (boxo.class) {
                    bxxk = f135272d;
                    if (bxxk == null) {
                        bxxk = new bxve(f135271c);
                        f135272d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
