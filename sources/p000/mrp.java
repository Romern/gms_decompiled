package p000;

/* renamed from: mrp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mrp extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final mrp f34462i;

    /* renamed from: j */
    private static volatile bxxk f34463j;

    /* renamed from: a */
    public int f34464a;

    /* renamed from: b */
    public boolean f34465b;

    /* renamed from: c */
    public boolean f34466c;

    /* renamed from: d */
    public boolean f34467d;

    /* renamed from: e */
    public boolean f34468e;

    /* renamed from: f */
    public boolean f34469f;

    /* renamed from: g */
    public boolean f34470g;

    /* renamed from: h */
    public boolean f34471h;

    static {
        mrp mrp = new mrp();
        f34462i = mrp;
        GeneratedMessageLite.m124024a(mrp.class, mrp);
    }

    private mrp() {
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
            return GeneratedMessageLite.m124022a(f34462i, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\tဇ\b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new mrp();
        } else {
            if (i2 == 4) {
                return new bxvd(f34462i);
            }
            if (i2 == 5) {
                return f34462i;
            }
            bxxk bxxk = f34463j;
            if (bxxk == null) {
                synchronized (mrp.class) {
                    bxxk = f34463j;
                    if (bxxk == null) {
                        bxxk = new bxve(f34462i);
                        f34463j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
