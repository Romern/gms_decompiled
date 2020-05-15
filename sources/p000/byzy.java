package p000;

/* renamed from: byzy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byzy extends bxvk implements bxxd {

    /* renamed from: d */
    public static final byzy f169191d;

    /* renamed from: e */
    private static volatile bxxk f169192e;

    /* renamed from: a */
    public int f169193a;

    /* renamed from: b */
    public String f169194b = "";

    /* renamed from: c */
    public bxwc f169195c = bxxn.f165040b;

    static {
        byzy byzy = new byzy();
        f169191d = byzy;
        bxvk.m124024a(byzy.class, byzy);
    }

    private byzy() {
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
            return bxvk.m124022a(f169191d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"a", "b", "c", byzz.class});
        } else if (i2 == 3) {
            return new byzy();
        } else {
            if (i2 == 4) {
                return new byzx();
            }
            if (i2 == 5) {
                return f169191d;
            }
            bxxk bxxk = f169192e;
            if (bxxk == null) {
                synchronized (byzy.class) {
                    bxxk = f169192e;
                    if (bxxk == null) {
                        bxxk = new bxve(f169191d);
                        f169192e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: c */
    public final void mo74517c() {
        if (!this.f169195c.mo73666a()) {
            this.f169195c = bxvk.m124021a(this.f169195c);
        }
    }
}
