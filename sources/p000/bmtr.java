package p000;

/* renamed from: bmtr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmtr extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bmtr f130903d;

    /* renamed from: e */
    private static volatile bxxk f130904e;

    /* renamed from: a */
    public String f130905a = "";

    /* renamed from: b */
    public String f130906b = "";

    /* renamed from: c */
    public String f130907c = "";

    static {
        bmtr bmtr = new bmtr();
        f130903d = bmtr;
        GeneratedMessageLite.m124024a(bmtr.class, bmtr);
    }

    private bmtr() {
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
            return GeneratedMessageLite.m124022a(f130903d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\b\u0002\b\u0003\b", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bmtr();
        } else {
            if (i2 == 4) {
                return new bxvd(f130903d);
            }
            if (i2 == 5) {
                return f130903d;
            }
            bxxk bxxk = f130904e;
            if (bxxk == null) {
                synchronized (bmtr.class) {
                    bxxk = f130904e;
                    if (bxxk == null) {
                        bxxk = new bxve(f130903d);
                        f130904e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
