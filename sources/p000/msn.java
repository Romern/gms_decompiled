package p000;

/* renamed from: msn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class msn extends bxvk implements bxxd {

    /* renamed from: e */
    public static final msn f34567e;

    /* renamed from: f */
    private static volatile bxxk f34568f;

    /* renamed from: a */
    public int f34569a;

    /* renamed from: b */
    public int f34570b;

    /* renamed from: c */
    public boolean f34571c;

    /* renamed from: d */
    public boolean f34572d;

    static {
        msn msn = new msn();
        f34567e = msn;
        bxvk.m124024a(msn.class, msn);
    }

    private msn() {
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
            return bxvk.m124022a(f34567e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", msm.f34566a, "c", "d"});
        } else if (i2 == 3) {
            return new msn();
        } else {
            if (i2 == 4) {
                return new bxvd(f34567e);
            }
            if (i2 == 5) {
                return f34567e;
            }
            bxxk bxxk = f34568f;
            if (bxxk == null) {
                synchronized (msn.class) {
                    bxxk = f34568f;
                    if (bxxk == null) {
                        bxxk = new bxve(f34567e);
                        f34568f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
