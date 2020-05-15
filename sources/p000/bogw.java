package p000;

/* renamed from: bogw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bogw extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bogw f133033d;

    /* renamed from: e */
    private static volatile bxxk f133034e;

    /* renamed from: a */
    public int f133035a;

    /* renamed from: b */
    public int f133036b;

    /* renamed from: c */
    public int f133037c;

    static {
        bogw bogw = new bogw();
        f133033d = bogw;
        bxvk.m124024a(bogw.class, bogw);
    }

    private bogw() {
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
            return bxvk.m124022a(f133033d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", bogu.f133032a, "c", bogy.f133043a});
        } else if (i2 == 3) {
            return new bogw();
        } else {
            if (i2 == 4) {
                return new bxvd(f133033d);
            }
            if (i2 == 5) {
                return f133033d;
            }
            bxxk bxxk = f133034e;
            if (bxxk == null) {
                synchronized (bogw.class) {
                    bxxk = f133034e;
                    if (bxxk == null) {
                        bxxk = new bxve(f133033d);
                        f133034e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
