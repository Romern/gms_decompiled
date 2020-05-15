package p000;

/* renamed from: bkxr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkxr extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bkxr f125411f;

    /* renamed from: h */
    private static volatile bxxk f125412h;

    /* renamed from: a */
    public int f125413a;

    /* renamed from: b */
    public bxwc f125414b = bxxn.f165040b;

    /* renamed from: c */
    public bkxw f125415c;

    /* renamed from: d */
    public bkxy f125416d;

    /* renamed from: e */
    public bkxu f125417e;

    /* renamed from: g */
    private byte f125418g = 2;

    static {
        bkxr bkxr = new bkxr();
        f125411f = bkxr;
        GeneratedMessageLite.m124024a(bkxr.class, bkxr);
    }

    private bkxr() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f125418g);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f125418g = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f125411f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001Л\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"a", "b", bkxq.class, "c", "d", "e"});
        } else if (i2 == 3) {
            return new bkxr();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][][]) null, (boolean[][]) null);
            }
            if (i2 == 5) {
                return f125411f;
            }
            bxxk bxxk = f125412h;
            if (bxxk == null) {
                synchronized (bkxr.class) {
                    bxxk = f125412h;
                    if (bxxk == null) {
                        bxxk = new bxve(f125411f);
                        f125412h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
