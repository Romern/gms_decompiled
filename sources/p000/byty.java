package p000;

/* renamed from: byty */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byty extends bxvk implements bxxd {

    /* renamed from: d */
    public static final byty f167731d;

    /* renamed from: e */
    private static volatile bxxk f167732e;

    /* renamed from: a */
    public int f167733a;

    /* renamed from: b */
    public bxwc f167734b = bxxn.f165040b;

    /* renamed from: c */
    public bytz f167735c;

    static {
        byty byty = new byty();
        f167731d = byty;
        bxvk.m124024a(byty.class, byty);
    }

    private byty() {
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
            return bxvk.m124022a(f167731d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"a", "b", bytw.class, "c"});
        } else if (i2 == 3) {
            return new byty();
        } else {
            if (i2 == 4) {
                return new bytx();
            }
            if (i2 == 5) {
                return f167731d;
            }
            bxxk bxxk = f167732e;
            if (bxxk == null) {
                synchronized (byty.class) {
                    bxxk = f167732e;
                    if (bxxk == null) {
                        bxxk = new bxve(f167731d);
                        f167732e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: c */
    public final void mo74508c() {
        if (!this.f167734b.mo73666a()) {
            this.f167734b = bxvk.m124021a(this.f167734b);
        }
    }
}
