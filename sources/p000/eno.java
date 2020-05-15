package p000;

/* renamed from: eno */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class eno extends bxvk implements bxxd {

    /* renamed from: e */
    public static final eno f15330e;

    /* renamed from: g */
    private static volatile bxxk f15331g;

    /* renamed from: a */
    public bxwc f15332a = bxxn.f165040b;

    /* renamed from: b */
    public long f15333b;

    /* renamed from: c */
    public bxwc f15334c = bxxn.f165040b;

    /* renamed from: d */
    public String f15335d = "";

    /* renamed from: f */
    private int f15336f;

    static {
        eno eno = new eno();
        f15330e = eno;
        bxvk.m124024a(eno.class, eno);
    }

    private eno() {
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
            return bxvk.m124022a(f15330e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u001b\u0002ဂ\u0000\u0003\u001b\u0004ဈ\u0001", new Object[]{"f", "a", cadp.class, "b", "c", cadz.class, "d"});
        } else if (i2 == 3) {
            return new eno();
        } else {
            if (i2 == 4) {
                return new bxvd(f15330e);
            }
            if (i2 == 5) {
                return f15330e;
            }
            bxxk bxxk = f15331g;
            if (bxxk == null) {
                synchronized (eno.class) {
                    bxxk = f15331g;
                    if (bxxk == null) {
                        bxxk = new bxve(f15330e);
                        f15331g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
