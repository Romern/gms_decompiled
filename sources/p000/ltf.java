package p000;

/* renamed from: ltf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ltf extends bxvk implements bxxd {

    /* renamed from: d */
    public static final ltf f32903d;

    /* renamed from: e */
    private static volatile bxxk f32904e;

    /* renamed from: a */
    public int f32905a;

    /* renamed from: b */
    public String f32906b = "";

    /* renamed from: c */
    public lss f32907c;

    static {
        ltf ltf = new ltf();
        f32903d = ltf;
        bxvk.m124024a(ltf.class, ltf);
    }

    private ltf() {
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
            return bxvk.m124022a(f32903d, "\u0001\u0002\u0000\u0001&'\u0002\u0000\u0000\u0000&ဈ\u0000'ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new ltf();
        } else {
            if (i2 == 4) {
                return new bxvd(f32903d);
            }
            if (i2 == 5) {
                return f32903d;
            }
            bxxk bxxk = f32904e;
            if (bxxk == null) {
                synchronized (ltf.class) {
                    bxxk = f32904e;
                    if (bxxk == null) {
                        bxxk = new bxve(f32903d);
                        f32904e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
