package p000;

/* renamed from: aaqo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaqo extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final aaqo f28924f;

    /* renamed from: g */
    private static volatile bxxk f28925g;

    /* renamed from: a */
    public int f28926a;

    /* renamed from: b */
    public int f28927b;

    /* renamed from: c */
    public int f28928c;

    /* renamed from: d */
    public int f28929d;

    /* renamed from: e */
    public long f28930e;

    static {
        aaqo aaqo = new aaqo();
        f28924f = aaqo;
        GeneratedMessageLite.m124024a(aaqo.class, aaqo);
    }

    private aaqo() {
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
            return GeneratedMessageLite.m124022a(f28924f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003င\u0002\u0004ဂ\u0003", new Object[]{"a", "b", aaqn.f28923a, "c", aaqm.f28922a, "d", "e"});
        } else if (i2 == 3) {
            return new aaqo();
        } else {
            if (i2 == 4) {
                return new bxvd(f28924f);
            }
            if (i2 == 5) {
                return f28924f;
            }
            bxxk bxxk = f28925g;
            if (bxxk == null) {
                synchronized (aaqo.class) {
                    bxxk = f28925g;
                    if (bxxk == null) {
                        bxxk = new bxve(f28924f);
                        f28925g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
