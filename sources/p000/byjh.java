package p000;

/* renamed from: byjh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byjh extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final byjh f166649h;

    /* renamed from: i */
    private static volatile bxxk f166650i;

    /* renamed from: a */
    public int f166651a;

    /* renamed from: b */
    public int f166652b;

    /* renamed from: c */
    public bxwc f166653c = bxxn.f165040b;

    /* renamed from: d */
    public bxwc f166654d = bxxn.f165040b;

    /* renamed from: e */
    public int f166655e = -1;

    /* renamed from: f */
    public boolean f166656f;

    /* renamed from: g */
    public boolean f166657g;

    static {
        byjh byjh = new byjh();
        f166649h = byjh;
        GeneratedMessageLite.m124024a(byjh.class, byjh);
    }

    private byjh() {
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
            return GeneratedMessageLite.m124022a(f166649h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001ဌ\u0000\u0002\u001b\u0003\u001b\u0004င\u0001\u0005ဇ\u0002\u0006ဇ\u0003", new Object[]{"a", "b", byjf.f166648a, "c", byje.class, "d", byje.class, "e", "f", "g"});
        } else if (i2 == 3) {
            return new byjh();
        } else {
            if (i2 == 4) {
                return new byjc();
            }
            if (i2 == 5) {
                return f166649h;
            }
            bxxk bxxk = f166650i;
            if (bxxk == null) {
                synchronized (byjh.class) {
                    bxxk = f166650i;
                    if (bxxk == null) {
                        bxxk = new bxve(f166649h);
                        f166650i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
