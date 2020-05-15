package p000;

/* renamed from: bojl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bojl extends bxvk implements bxxd {

    /* renamed from: h */
    public static final bojl f133295h;

    /* renamed from: i */
    private static volatile bxxk f133296i;

    /* renamed from: a */
    public int f133297a;

    /* renamed from: b */
    public String f133298b = "";

    /* renamed from: c */
    public String f133299c = "";

    /* renamed from: d */
    public int f133300d;

    /* renamed from: e */
    public String f133301e = "";

    /* renamed from: f */
    public bxwc f133302f = bxxn.f165040b;

    /* renamed from: g */
    public bxwc f133303g = bxxn.f165040b;

    static {
        bojl bojl = new bojl();
        f133295h = bojl;
        bxvk.m124024a(bojl.class, bojl);
    }

    private bojl() {
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
            return bxvk.m124022a(f133295h, "\u0001\u0006\u0000\u0001\u0003\b\u0006\u0000\u0002\u0000\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဋ\u0004\u0006ဈ\u0005\u0007\u001b\b\u001b", new Object[]{"a", "b", "c", "d", "e", "f", boit.class, "g", boit.class});
        } else if (i2 == 3) {
            return new bojl();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][]) null, (float[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f133295h;
            }
            bxxk bxxk = f133296i;
            if (bxxk == null) {
                synchronized (bojl.class) {
                    bxxk = f133296i;
                    if (bxxk == null) {
                        bxxk = new bxve(f133295h);
                        f133296i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
