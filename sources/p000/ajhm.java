package p000;

/* renamed from: ajhm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajhm extends bxvk implements bxxd {

    /* renamed from: b */
    public static final ajhm f70666b;

    /* renamed from: c */
    private static volatile bxxk f70667c;

    /* renamed from: a */
    public bxwc f70668a = bxxn.f165040b;

    static {
        ajhm ajhm = new ajhm();
        f70666b = ajhm;
        bxvk.m124024a(ajhm.class, ajhm);
    }

    private ajhm() {
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
            return bxvk.m124022a(f70666b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", ajhl.class});
        } else if (i2 == 3) {
            return new ajhm();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][][]) null, (byte[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f70666b;
            }
            bxxk bxxk = f70667c;
            if (bxxk == null) {
                synchronized (ajhm.class) {
                    bxxk = f70667c;
                    if (bxxk == null) {
                        bxxk = new bxve(f70666b);
                        f70667c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo38662a() {
        if (!this.f70668a.mo73666a()) {
            this.f70668a = bxvk.m124021a(this.f70668a);
        }
    }
}
