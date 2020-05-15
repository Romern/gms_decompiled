package p000;

/* renamed from: bpwc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpwc extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bpwc f139457e;

    /* renamed from: f */
    private static volatile bxxk f139458f;

    /* renamed from: a */
    public int f139459a;

    /* renamed from: b */
    public bpwb f139460b;

    /* renamed from: c */
    public int f139461c;

    /* renamed from: d */
    public String f139462d = "";

    static {
        bpwc bpwc = new bpwc();
        f139457e = bpwc;
        bxvk.m124024a(bpwc.class, bpwc);
    }

    private bpwc() {
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
            return bxvk.m124022a(f139457e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဌ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", "c", bpvx.f139449a, "d"});
        } else if (i2 == 3) {
            return new bpwc();
        } else {
            if (i2 == 4) {
                return new bxvd(f139457e);
            }
            if (i2 == 5) {
                return f139457e;
            }
            bxxk bxxk = f139458f;
            if (bxxk == null) {
                synchronized (bpwc.class) {
                    bxxk = f139458f;
                    if (bxxk == null) {
                        bxxk = new bxve(f139457e);
                        f139458f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
