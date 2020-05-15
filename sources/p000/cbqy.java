package p000;

/* renamed from: cbqy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbqy extends bxvk implements bxxd {

    /* renamed from: i */
    public static final cbqy f178081i;

    /* renamed from: j */
    private static volatile bxxk f178082j;

    /* renamed from: a */
    public int f178083a = 0;

    /* renamed from: b */
    public Object f178084b;

    /* renamed from: c */
    public cbqz f178085c;

    /* renamed from: d */
    public int f178086d;

    /* renamed from: e */
    public cbrh f178087e;

    /* renamed from: f */
    public bxwc f178088f = bxxn.f165040b;

    /* renamed from: g */
    public cbqt f178089g;

    /* renamed from: h */
    public cbod f178090h;

    static {
        cbqy cbqy = new cbqy();
        f178081i = cbqy;
        bxvk.m124024a(cbqy.class, cbqy);
    }

    private cbqy() {
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
            return bxvk.m124022a(f178081i, "\u0000\b\u0001\u0000\u0001\b\b\u0000\u0001\u0000\u0001\t\u0002\f\u0003<\u0000\u0004<\u0000\u0005\t\u0006\u001b\u0007\t\b\t", new Object[]{"b", "a", "c", "d", cbra.class, cbqg.class, "e", "f", cbqe.class, "h", "g"});
        } else if (i2 == 3) {
            return new cbqy();
        } else {
            if (i2 == 4) {
                return new cbqw();
            }
            if (i2 == 5) {
                return f178081i;
            }
            bxxk bxxk = f178082j;
            if (bxxk == null) {
                synchronized (cbqy.class) {
                    bxxk = f178082j;
                    if (bxxk == null) {
                        bxxk = new bxve(f178081i);
                        f178082j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: c */
    public final void mo75245c() {
        if (!this.f178088f.mo73666a()) {
            this.f178088f = bxvk.m124021a(this.f178088f);
        }
    }
}
