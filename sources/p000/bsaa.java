package p000;

/* renamed from: bsaa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsaa extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bsaa f143818f;

    /* renamed from: g */
    private static volatile bxxk f143819g;

    /* renamed from: a */
    public int f143820a;

    /* renamed from: b */
    public bxwc f143821b = bxxn.f165040b;

    /* renamed from: c */
    public int f143822c = 1;

    /* renamed from: d */
    public bsaf f143823d;

    /* renamed from: e */
    public byqn f143824e;

    static {
        bsaa bsaa = new bsaa();
        f143818f = bsaa;
        GeneratedMessageLite.m124024a(bsaa.class, bsaa);
    }

    private bsaa() {
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
            return GeneratedMessageLite.m124022a(f143818f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002ဌ\u0000\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"a", "b", brzt.class, "c", brzr.f143778a, "d", "e"});
        } else if (i2 == 3) {
            return new bsaa();
        } else {
            if (i2 == 4) {
                return new bxvd((int[]) null, (int[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f143818f;
            }
            bxxk bxxk = f143819g;
            if (bxxk == null) {
                synchronized (bsaa.class) {
                    bxxk = f143819g;
                    if (bxxk == null) {
                        bxxk = new bxve(f143818f);
                        f143819g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
