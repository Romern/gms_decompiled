package p000;

/* renamed from: bztr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bztr extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bztr f171363c;

    /* renamed from: d */
    private static volatile bxxk f171364d;

    /* renamed from: a */
    public long f171365a;

    /* renamed from: b */
    public String f171366b = "";

    static {
        bztr bztr = new bztr();
        f171363c = bztr;
        bxvk.m124024a(bztr.class, bztr);
    }

    private bztr() {
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
            return bxvk.m124022a(f171363c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bztr();
        } else {
            if (i2 == 4) {
                return new bxvd(f171363c);
            }
            if (i2 == 5) {
                return f171363c;
            }
            bxxk bxxk = f171364d;
            if (bxxk == null) {
                synchronized (bztr.class) {
                    bxxk = f171364d;
                    if (bxxk == null) {
                        bxxk = new bxve(f171363c);
                        f171364d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
