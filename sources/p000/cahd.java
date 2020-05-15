package p000;

/* renamed from: cahd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cahd extends bxvk implements bxxd {

    /* renamed from: d */
    public static final cahd f174532d;

    /* renamed from: e */
    private static volatile bxxk f174533e;

    /* renamed from: a */
    public int f174534a = 0;

    /* renamed from: b */
    public Object f174535b;

    /* renamed from: c */
    public bxwc f174536c = bxxn.f165040b;

    static {
        cahd cahd = new cahd();
        f174532d = cahd;
        bxvk.m124024a(cahd.class, cahd);
    }

    private cahd() {
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
            return bxvk.m124022a(f174532d, "\u0001\u0003\u0001\u0000\u0001\u0004\u0003\u0000\u0001\u0000\u0001း\u0000\u0003\u001b\u0004ဵ\u0000", new Object[]{"b", "a", "c", cahc.class});
        } else if (i2 == 3) {
            return new cahd();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][]) null, (int[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f174532d;
            }
            bxxk bxxk = f174533e;
            if (bxxk == null) {
                synchronized (cahd.class) {
                    bxxk = f174533e;
                    if (bxxk == null) {
                        bxxk = new bxve(f174532d);
                        f174533e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: c */
    public final void mo74642c() {
        if (!this.f174536c.mo73666a()) {
            this.f174536c = bxvk.m124021a(this.f174536c);
        }
    }
}
