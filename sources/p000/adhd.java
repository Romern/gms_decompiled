package p000;

/* renamed from: adhd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adhd extends bxvk implements bxxd {

    /* renamed from: j */
    public static final adhd f61664j;

    /* renamed from: k */
    private static volatile bxxk f61665k;

    /* renamed from: a */
    public bxwc f61666a = bxxn.f165040b;

    /* renamed from: b */
    public bxwc f61667b = bxxn.f165040b;

    /* renamed from: c */
    public adhj f61668c;

    /* renamed from: d */
    public adhc f61669d;

    /* renamed from: e */
    public bxwc f61670e = bxxn.f165040b;

    /* renamed from: f */
    public bxwc f61671f = bxxn.f165040b;

    /* renamed from: g */
    public bxwc f61672g = bxxn.f165040b;

    /* renamed from: h */
    public int f61673h;

    /* renamed from: i */
    public String f61674i = "";

    static {
        adhd adhd = new adhd();
        f61664j = adhd;
        bxvk.m124024a(adhd.class, adhd);
    }

    private adhd() {
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
            return bxvk.m124022a(f61664j, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0005\u0000\u0001\u001b\u0002\u001b\u0003\t\u0004\t\u0005\u001b\u0006\u001b\u0007\u0004\bȈ\t\u001b", new Object[]{"a", adhi.class, "b", adhh.class, "c", "d", "e", adhb.class, "f", adhg.class, "h", "i", "g", adhe.class});
        } else if (i2 == 3) {
            return new adhd();
        } else {
            if (i2 == 4) {
                return new bxvd(f61664j);
            }
            if (i2 == 5) {
                return f61664j;
            }
            bxxk bxxk = f61665k;
            if (bxxk == null) {
                synchronized (adhd.class) {
                    bxxk = f61665k;
                    if (bxxk == null) {
                        bxxk = new bxve(f61664j);
                        f61665k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
