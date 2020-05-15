package p000;

/* renamed from: qmo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qmo extends bxvk implements bxxd {

    /* renamed from: g */
    public static final qmo f41724g;

    /* renamed from: h */
    private static volatile bxxk f41725h;

    /* renamed from: a */
    public int f41726a;

    /* renamed from: b */
    public int f41727b;

    /* renamed from: c */
    public bxwc f41728c = bxxn.f165040b;

    /* renamed from: d */
    public bxwc f41729d = bxxn.f165040b;

    /* renamed from: e */
    public bxwc f41730e = bxxn.f165040b;

    /* renamed from: f */
    public boolean f41731f = true;

    static {
        qmo qmo = new qmo();
        f41724g = qmo;
        bxvk.m124024a(qmo.class, qmo);
    }

    private qmo() {
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
            return bxvk.m124022a(f41724g, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0003\u0000\u0001င\u0000\u0003\u001b\u0005\u001b\u0007\u001b\bဇ\u0001", new Object[]{"a", "b", "c", qmn.class, "d", djd.class, "e", djd.class, "f"});
        } else if (i2 == 3) {
            return new qmo();
        } else {
            if (i2 == 4) {
                return new bxvd((float[]) null, (boolean[][][]) null);
            }
            if (i2 == 5) {
                return f41724g;
            }
            bxxk bxxk = f41725h;
            if (bxxk == null) {
                synchronized (qmo.class) {
                    bxxk = f41725h;
                    if (bxxk == null) {
                        bxxk = new bxve(f41724g);
                        f41725h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo24114a() {
        if (!this.f41728c.mo73666a()) {
            this.f41728c = bxvk.m124021a(this.f41728c);
        }
    }
}
