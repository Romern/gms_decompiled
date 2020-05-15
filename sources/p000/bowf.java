package p000;

/* renamed from: bowf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bowf extends bxvk implements bxxd {

    /* renamed from: j */
    public static final bowf f135112j;

    /* renamed from: k */
    private static volatile bxxk f135113k;

    /* renamed from: a */
    public int f135114a;

    /* renamed from: b */
    public boul f135115b;

    /* renamed from: c */
    public bouk f135116c;

    /* renamed from: d */
    public bovb f135117d;

    /* renamed from: e */
    public bouw f135118e;

    /* renamed from: f */
    public boup f135119f;

    /* renamed from: g */
    public bowe f135120g;

    /* renamed from: h */
    public bxwc f135121h = bxxn.f165040b;

    /* renamed from: i */
    public bowi f135122i;

    static {
        bowf bowf = new bowf();
        f135112j = bowf;
        bxvk.m124024a(bowf.class, bowf);
    }

    private bowf() {
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
            return bxvk.m124022a(f135112j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007\u001b\bဉ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", boub.class, "i"});
        } else if (i2 == 3) {
            return new bowf();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][]) null, (byte[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f135112j;
            }
            bxxk bxxk = f135113k;
            if (bxxk == null) {
                synchronized (bowf.class) {
                    bxxk = f135113k;
                    if (bxxk == null) {
                        bxxk = new bxve(f135112j);
                        f135113k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
