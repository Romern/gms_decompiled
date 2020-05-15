package p000;

/* renamed from: bprq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bprq extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bprq f138883e;

    /* renamed from: f */
    private static volatile bxxk f138884f;

    /* renamed from: a */
    public int f138885a;

    /* renamed from: b */
    public int f138886b;

    /* renamed from: c */
    public bxwc f138887c = bxxn.f165040b;

    /* renamed from: d */
    public bxwc f138888d = bxxn.f165040b;

    static {
        bprq bprq = new bprq();
        f138883e = bprq;
        bxvk.m124024a(bprq.class, bprq);
    }

    private bprq() {
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
            return bxvk.m124022a(f138883e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001င\u0000\u0002\u001a\u0003\u001b", new Object[]{"a", "b", "c", "d", bprr.class});
        } else if (i2 == 3) {
            return new bprq();
        } else {
            if (i2 == 4) {
                return new bprp();
            }
            if (i2 == 5) {
                return f138883e;
            }
            bxxk bxxk = f138884f;
            if (bxxk == null) {
                synchronized (bprq.class) {
                    bxxk = f138884f;
                    if (bxxk == null) {
                        bxxk = new bxve(f138883e);
                        f138884f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo68977a() {
        if (!this.f138888d.mo73666a()) {
            this.f138888d = bxvk.m124021a(this.f138888d);
        }
    }
}
