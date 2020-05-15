package p000;

/* renamed from: bucw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bucw extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bucw f153415b;

    /* renamed from: c */
    private static volatile bxxk f153416c;

    /* renamed from: a */
    public bxwc f153417a = bxxn.f165040b;

    static {
        bucw bucw = new bucw();
        f153415b = bucw;
        GeneratedMessageLite.m124024a(bucw.class, bucw);
    }

    private bucw() {
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
            return GeneratedMessageLite.m124022a(f153415b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bucu.class});
        } else if (i2 == 3) {
            return new bucw();
        } else {
            if (i2 == 4) {
                return new bucv();
            }
            if (i2 == 5) {
                return f153415b;
            }
            bxxk bxxk = f153416c;
            if (bxxk == null) {
                synchronized (bucw.class) {
                    bxxk = f153416c;
                    if (bxxk == null) {
                        bxxk = new bxve(f153415b);
                        f153416c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
