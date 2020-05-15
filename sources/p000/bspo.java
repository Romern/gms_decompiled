package p000;

/* renamed from: bspo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bspo extends GeneratedMessageLite implements bxxd {

    /* renamed from: k */
    public static final bspo f146541k;

    /* renamed from: l */
    private static volatile bxxk f146542l;

    /* renamed from: a */
    public int f146543a;

    /* renamed from: b */
    public int f146544b;

    /* renamed from: c */
    public int f146545c;

    /* renamed from: d */
    public int f146546d;

    /* renamed from: e */
    public int f146547e;

    /* renamed from: f */
    public int f146548f;

    /* renamed from: g */
    public boolean f146549g;

    /* renamed from: h */
    public boolean f146550h;

    /* renamed from: i */
    public boolean f146551i;

    /* renamed from: j */
    public boolean f146552j;

    static {
        bspo bspo = new bspo();
        f146541k = bspo;
        GeneratedMessageLite.m124024a(bspo.class, bspo);
    }

    private bspo() {
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
            return GeneratedMessageLite.m124022a(f146541k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001င\u0001\u0002င\u0004\u0003ဇ\u0005\u0004ဇ\u0006\u0005ဌ\u0000\u0006ဇ\u0007\u0007ဇ\b\bင\u0002\tင\u0003", new Object[]{"a", "c", "f", "g", "h", "b", bsmt.m115988b(), "i", "j", "d", "e"});
        } else if (i2 == 3) {
            return new bspo();
        } else {
            if (i2 == 4) {
                return new bxvd(f146541k);
            }
            if (i2 == 5) {
                return f146541k;
            }
            bxxk bxxk = f146542l;
            if (bxxk == null) {
                synchronized (bspo.class) {
                    bxxk = f146542l;
                    if (bxxk == null) {
                        bxxk = new bxve(f146541k);
                        f146542l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
