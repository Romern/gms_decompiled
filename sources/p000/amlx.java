package p000;

/* renamed from: amlx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amlx extends GeneratedMessageLite implements bxxd {

    /* renamed from: l */
    public static final amlx f75227l;

    /* renamed from: m */
    private static volatile bxxk f75228m;

    /* renamed from: a */
    public int f75229a;

    /* renamed from: b */
    public int f75230b;

    /* renamed from: c */
    public int f75231c;

    /* renamed from: d */
    public String f75232d = "";

    /* renamed from: e */
    public amlq f75233e;

    /* renamed from: f */
    public bxwc f75234f = bxxn.f165040b;

    /* renamed from: g */
    public int f75235g;

    /* renamed from: h */
    public amli f75236h;

    /* renamed from: i */
    public int f75237i;

    /* renamed from: j */
    public amlt f75238j;

    /* renamed from: k */
    public String f75239k = "";

    static {
        amlx amlx = new amlx();
        f75227l = amlx;
        GeneratedMessageLite.m124024a(amlx.class, amlx);
    }

    private amlx() {
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
            return GeneratedMessageLite.m124022a(f75227l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0001\u0000\u0001ဌ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဉ\u0003\u0005\u001b\u0006ဌ\u0004\u0007ဉ\u0005\bဌ\u0006\tဉ\u0007\nဈ\b", new Object[]{"a", "b", amlk.f75190a, "c", "d", "e", "f", amlv.class, "g", amlj.f75189a, "h", "i", amlw.f75226a, "j", "k"});
        } else if (i2 == 3) {
            return new amlx();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][]) null, (int[]) null);
            }
            if (i2 == 5) {
                return f75227l;
            }
            bxxk bxxk = f75228m;
            if (bxxk == null) {
                synchronized (amlx.class) {
                    bxxk = f75228m;
                    if (bxxk == null) {
                        bxxk = new bxve(f75227l);
                        f75228m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
