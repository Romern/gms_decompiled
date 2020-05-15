package p000;

/* renamed from: aapb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aapb extends bxvk implements bxxd {

    /* renamed from: d */
    public static final aapb f28733d;

    /* renamed from: e */
    private static volatile bxxk f28734e;

    /* renamed from: a */
    public int f28735a;

    /* renamed from: b */
    public String f28736b = "";

    /* renamed from: c */
    public boolean f28737c;

    static {
        aapb aapb = new aapb();
        f28733d = aapb;
        bxvk.m124024a(aapb.class, aapb);
    }

    private aapb() {
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
            return bxvk.m124022a(f28733d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new aapb();
        } else {
            if (i2 == 4) {
                return new bxvd(f28733d);
            }
            if (i2 == 5) {
                return f28733d;
            }
            bxxk bxxk = f28734e;
            if (bxxk == null) {
                synchronized (aapb.class) {
                    bxxk = f28734e;
                    if (bxxk == null) {
                        bxxk = new bxve(f28733d);
                        f28734e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
