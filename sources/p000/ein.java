package p000;

/* renamed from: ein */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ein extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final ein f15063c;

    /* renamed from: d */
    private static volatile bxxk f15064d;

    /* renamed from: a */
    public int f15065a;

    /* renamed from: b */
    public eil f15066b;

    static {
        ein ein = new ein();
        f15063c = ein;
        GeneratedMessageLite.m124024a(ein.class, ein);
    }

    private ein() {
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
            return GeneratedMessageLite.m124022a(f15063c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\t", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new ein();
        } else {
            if (i2 == 4) {
                return new bxvd(f15063c);
            }
            if (i2 == 5) {
                return f15063c;
            }
            bxxk bxxk = f15064d;
            if (bxxk == null) {
                synchronized (ein.class) {
                    bxxk = f15064d;
                    if (bxxk == null) {
                        bxxk = new bxve(f15063c);
                        f15064d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
