package p000;

/* renamed from: cbij */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbij extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final cbij f177251e;

    /* renamed from: f */
    private static volatile bxxk f177252f;

    /* renamed from: a */
    public bxwc f177253a = bxxn.f165040b;

    /* renamed from: b */
    public cbie f177254b;

    /* renamed from: c */
    public cbip f177255c;

    /* renamed from: d */
    public cbim f177256d;

    static {
        cbij cbij = new cbij();
        f177251e = cbij;
        GeneratedMessageLite.m124024a(cbij.class, cbij);
    }

    private cbij() {
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
            return GeneratedMessageLite.m124022a(f177251e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002\t\u0003\t\u0004\t", new Object[]{"a", cbil.class, "b", "c", "d"});
        } else if (i2 == 3) {
            return new cbij();
        } else {
            if (i2 == 4) {
                return new cbii();
            }
            if (i2 == 5) {
                return f177251e;
            }
            bxxk bxxk = f177252f;
            if (bxxk == null) {
                synchronized (cbij.class) {
                    bxxk = f177252f;
                    if (bxxk == null) {
                        bxxk = new bxve(f177251e);
                        f177252f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: c */
    public final void mo75235c() {
        if (!this.f177253a.mo73666a()) {
            this.f177253a = GeneratedMessageLite.m124021a(this.f177253a);
        }
    }
}
