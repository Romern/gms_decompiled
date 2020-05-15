package p000;

/* renamed from: qov */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qov extends bxvk implements bxxd {

    /* renamed from: f */
    public static final qov f41897f;

    /* renamed from: g */
    private static volatile bxxk f41898g;

    /* renamed from: a */
    public int f41899a;

    /* renamed from: b */
    public String f41900b = "";

    /* renamed from: c */
    public long f41901c;

    /* renamed from: d */
    public bxwc f41902d = bxxn.f165040b;

    /* renamed from: e */
    public long f41903e;

    static {
        qov qov = new qov();
        f41897f = qov;
        bxvk.m124024a(qov.class, qov);
    }

    private qov() {
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
            return bxvk.m124022a(f41897f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0004ဂ\u0002\u0005\u001b", new Object[]{"a", "b", "c", "e", "d", qou.class});
        } else if (i2 == 3) {
            return new qov();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][][]) null, (int[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f41897f;
            }
            bxxk bxxk = f41898g;
            if (bxxk == null) {
                synchronized (qov.class) {
                    bxxk = f41898g;
                    if (bxxk == null) {
                        bxxk = new bxve(f41897f);
                        f41898g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo24177a() {
        if (!this.f41902d.mo73666a()) {
            this.f41902d = bxvk.m124021a(this.f41902d);
        }
    }
}
