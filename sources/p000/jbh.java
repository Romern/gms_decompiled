package p000;

/* renamed from: jbh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jbh extends bxvk implements bxxd {

    /* renamed from: d */
    public static final jbh f22094d;

    /* renamed from: e */
    private static volatile bxxk f22095e;

    /* renamed from: a */
    public boolean f22096a;

    /* renamed from: b */
    public bxwc f22097b = bxxn.f165040b;

    /* renamed from: c */
    public boolean f22098c;

    static {
        jbh jbh = new jbh();
        f22094d = jbh;
        bxvk.m124024a(jbh.class, jbh);
    }

    private jbh() {
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
            return bxvk.m124022a(f22094d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0007\u0002\u001b\u0003\u0007", new Object[]{"a", "b", jbg.class, "c"});
        } else if (i2 == 3) {
            return new jbh();
        } else {
            if (i2 == 4) {
                return new bxvd(f22094d);
            }
            if (i2 == 5) {
                return f22094d;
            }
            bxxk bxxk = f22095e;
            if (bxxk == null) {
                synchronized (jbh.class) {
                    bxxk = f22095e;
                    if (bxxk == null) {
                        bxxk = new bxve(f22094d);
                        f22095e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
