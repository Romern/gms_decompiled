package p000;

/* renamed from: caed */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caed extends bxvk implements bxxd {

    /* renamed from: i */
    public static final caed f172799i;

    /* renamed from: j */
    private static volatile bxxk f172800j;

    /* renamed from: a */
    public int f172801a;

    /* renamed from: b */
    public String f172802b = "";

    /* renamed from: c */
    public bxvn f172803c = bxtk.f164779b;

    /* renamed from: d */
    public bxvw f172804d = bxwq.f165002b;

    /* renamed from: e */
    public bxwc f172805e = bxxn.f165040b;

    /* renamed from: f */
    public bxwc f172806f = bxxn.f165040b;

    /* renamed from: g */
    public bxtx f172807g = bxtx.f164797b;

    /* renamed from: h */
    public bxvo f172808h = bxum.f164858b;

    static {
        caed caed = new caed();
        f172799i = caed;
        bxvk.m124024a(caed.class, caed);
    }

    private caed() {
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
            return bxvk.m124022a(f172799i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0005\u0000\u0001ဈ\u0000\u0002\u0019\u0003\u0014\u0004\u001a\u0005\u001b\u0006ည\u0001\u0007\u0012", new Object[]{"a", "b", "c", "d", "e", "f", caef.class, "g", "h"});
        } else if (i2 == 3) {
            return new caed();
        } else {
            if (i2 == 4) {
                return new caec();
            }
            if (i2 == 5) {
                return f172799i;
            }
            bxxk bxxk = f172800j;
            if (bxxk == null) {
                synchronized (caed.class) {
                    bxxk = f172800j;
                    if (bxxk == null) {
                        bxxk = new bxve(f172799i);
                        f172800j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: c */
    public final void mo74627c() {
        if (!this.f172803c.mo73666a()) {
            this.f172803c = bxvk.m124017a(this.f172803c);
        }
    }

    /* renamed from: e */
    public final void mo74628e() {
        if (!this.f172804d.mo73666a()) {
            this.f172804d = bxvk.m124020a(this.f172804d);
        }
    }

    /* renamed from: f */
    public final void mo74629f() {
        if (!this.f172805e.mo73666a()) {
            this.f172805e = bxvk.m124021a(this.f172805e);
        }
    }

    /* renamed from: g */
    public final void mo74630g() {
        if (!this.f172808h.mo73666a()) {
            bxvo bxvo = this.f172808h;
            int size = bxvo.size();
            this.f172808h = bxvo.mo73893a(size != 0 ? size + size : 10);
        }
    }
}
