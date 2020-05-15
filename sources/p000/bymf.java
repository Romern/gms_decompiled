package p000;

/* renamed from: bymf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bymf extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bymf f167014d;

    /* renamed from: f */
    private static volatile bxxk f167015f;

    /* renamed from: a */
    public bymd f167016a;

    /* renamed from: b */
    public bxwc f167017b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f167018c = bxxn.f165040b;

    /* renamed from: e */
    private int f167019e;

    static {
        bymf bymf = new bymf();
        f167014d = bymf;
        GeneratedMessageLite.m124024a(bymf.class, bymf);
    }

    private bymf() {
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
            return GeneratedMessageLite.m124022a(f167014d, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0002\u0000\u0002ဉ\u0000\u0003\u001b\u0004\u001b", new Object[]{"e", "a", "b", byme.class, "c", bymf.class});
        } else if (i2 == 3) {
            return new bymf();
        } else {
            if (i2 == 4) {
                return new bxvd(f167014d);
            }
            if (i2 == 5) {
                return f167014d;
            }
            bxxk bxxk = f167015f;
            if (bxxk == null) {
                synchronized (bymf.class) {
                    bxxk = f167015f;
                    if (bxxk == null) {
                        bxxk = new bxve(f167014d);
                        f167015f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
