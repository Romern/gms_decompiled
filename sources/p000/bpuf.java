package p000;

/* renamed from: bpuf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpuf extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bpuf f139232f;

    /* renamed from: g */
    private static volatile bxxk f139233g;

    /* renamed from: a */
    public int f139234a;

    /* renamed from: b */
    public int f139235b;

    /* renamed from: c */
    public String f139236c = "";

    /* renamed from: d */
    public bxwc f139237d = bxxn.f165040b;

    /* renamed from: e */
    public bxwc f139238e = bxxn.f165040b;

    static {
        bpuf bpuf = new bpuf();
        f139232f = bpuf;
        bxvk.m124024a(bpuf.class, bpuf);
    }

    private bpuf() {
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
            return bxvk.m124022a(f139232f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003\u001b\u0004\u001a", new Object[]{"a", "b", bpud.f139231a, "c", "d", bojy.class, "e"});
        } else if (i2 == 3) {
            return new bpuf();
        } else {
            if (i2 == 4) {
                return new bpuc();
            }
            if (i2 == 5) {
                return f139232f;
            }
            bxxk bxxk = f139233g;
            if (bxxk == null) {
                synchronized (bpuf.class) {
                    bxxk = f139233g;
                    if (bxxk == null) {
                        bxxk = new bxve(f139232f);
                        f139233g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo68987a() {
        if (!this.f139238e.mo73666a()) {
            this.f139238e = bxvk.m124021a(this.f139238e);
        }
    }
}
