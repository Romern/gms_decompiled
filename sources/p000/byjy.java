package p000;

/* renamed from: byjy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byjy extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final byjy f166710h;

    /* renamed from: i */
    private static volatile bxxk f166711i;

    /* renamed from: a */
    public int f166712a;

    /* renamed from: b */
    public bygz f166713b;

    /* renamed from: c */
    public bxwc f166714c = bxxn.f165040b;

    /* renamed from: d */
    public byjj f166715d;

    /* renamed from: e */
    public bxwc f166716e = bxxn.f165040b;

    /* renamed from: f */
    public byjw f166717f;

    /* renamed from: g */
    public byjx f166718g;

    static {
        byjy byjy = new byjy();
        f166710h = byjy;
        GeneratedMessageLite.m124024a(byjy.class, byjy);
    }

    private byjy() {
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
            return GeneratedMessageLite.m124022a(f166710h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001a\u0005ဉ\u0002\u0007ဉ\u0004", new Object[]{"a", "b", "c", bygu.class, "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new byjy();
        } else {
            if (i2 == 4) {
                return new byjv();
            }
            if (i2 == 5) {
                return f166710h;
            }
            bxxk bxxk = f166711i;
            if (bxxk == null) {
                synchronized (byjy.class) {
                    bxxk = f166711i;
                    if (bxxk == null) {
                        bxxk = new bxve(f166710h);
                        f166711i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
