package p000;

/* renamed from: brzn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brzn extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final brzn f143761e;

    /* renamed from: f */
    private static volatile bxxk f143762f;

    /* renamed from: a */
    public int f143763a;

    /* renamed from: b */
    public long f143764b;

    /* renamed from: c */
    public bxvw f143765c = bxwq.f165002b;

    /* renamed from: d */
    public bxwc f143766d = bxxn.f165040b;

    static {
        brzn brzn = new brzn();
        f143761e = brzn;
        GeneratedMessageLite.m124024a(brzn.class, brzn);
    }

    private brzn() {
        bxxn bxxn = bxxn.f165040b;
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
            return GeneratedMessageLite.m124022a(f143761e, "\u0001\u0003\u0000\u0001\u0004\u0006\u0003\u0000\u0002\u0000\u0004\u001b\u0005စ\u0001\u0006\u0017", new Object[]{"a", "d", brzm.class, "b", "c"});
        } else if (i2 == 3) {
            return new brzn();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][]) null, (boolean[][][]) null);
            }
            if (i2 == 5) {
                return f143761e;
            }
            bxxk bxxk = f143762f;
            if (bxxk == null) {
                synchronized (brzn.class) {
                    bxxk = f143762f;
                    if (bxxk == null) {
                        bxxk = new bxve(f143761e);
                        f143762f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
