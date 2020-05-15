package p000;

/* renamed from: btiz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btiz extends bxvk implements bxxd {

    /* renamed from: c */
    public static final btiz f149058c;

    /* renamed from: d */
    private static volatile bxxk f149059d;

    /* renamed from: a */
    public int f149060a;

    /* renamed from: b */
    public int f149061b;

    static {
        btiz btiz = new btiz();
        f149058c = btiz;
        bxvk.m124024a(btiz.class, btiz);
    }

    private btiz() {
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
            return bxvk.m124022a(f149058c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new btiz();
        } else {
            if (i2 == 4) {
                return new bxvd(f149058c);
            }
            if (i2 == 5) {
                return f149058c;
            }
            bxxk bxxk = f149059d;
            if (bxxk == null) {
                synchronized (btiz.class) {
                    bxxk = f149059d;
                    if (bxxk == null) {
                        bxxk = new bxve(f149058c);
                        f149059d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
