package p000;

/* renamed from: aclc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aclc extends bxvk implements bxxd {

    /* renamed from: l */
    public static final aclc f60068l;

    /* renamed from: m */
    private static volatile bxxk f60069m;

    /* renamed from: a */
    public String f60070a = "";

    /* renamed from: b */
    public int f60071b;

    /* renamed from: c */
    public String f60072c = "";

    /* renamed from: d */
    public int f60073d;

    /* renamed from: e */
    public boolean f60074e;

    /* renamed from: f */
    public boolean f60075f;

    /* renamed from: g */
    public boolean f60076g;

    /* renamed from: h */
    public int f60077h;

    /* renamed from: i */
    public acld f60078i;

    /* renamed from: j */
    public int f60079j;

    /* renamed from: k */
    public bxwc f60080k = bxxn.f165040b;

    static {
        aclc aclc = new aclc();
        f60068l = aclc;
        bxvk.m124024a(aclc.class, aclc);
    }

    private aclc() {
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
            return bxvk.m124022a(f60068l, "\u0000\u000b\u0000\u0000\u0001\u000f\u000b\u0000\u0001\u0000\u0001Ȉ\u0002\u0004\u0003Ȉ\u0004\f\b\u0007\n\u0007\u000b\u0007\f\u0004\r\t\u000e\f\u000fȚ", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
        } else if (i2 == 3) {
            return new aclc();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][]) null, (int[][]) null);
            }
            if (i2 == 5) {
                return f60068l;
            }
            bxxk bxxk = f60069m;
            if (bxxk == null) {
                synchronized (aclc.class) {
                    bxxk = f60069m;
                    if (bxxk == null) {
                        bxxk = new bxve(f60068l);
                        f60069m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
