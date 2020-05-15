package p000;

/* renamed from: byzf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byzf extends bxvg implements bxvh {

    /* renamed from: b */
    public static final byzf f169070b;

    /* renamed from: d */
    private static volatile bxxk f169071d;

    /* renamed from: a */
    public bxwc f169072a = bxxn.f165040b;

    /* renamed from: c */
    private byte f169073c = 2;

    static {
        byzf byzf = new byzf();
        f169070b = byzf;
        bxvk.m124024a(byzf.class, byzf);
    }

    private byzf() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f169073c);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f169073c = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f169070b, "\u0001\u0001\u0000\u0000\u0004\u0004\u0001\u0000\u0001\u0000\u0004\u001b", new Object[]{"a", byzh.class});
        } else if (i2 == 3) {
            return new byzf();
        } else {
            if (i2 == 4) {
                return new bxvf(f169070b);
            }
            if (i2 == 5) {
                return f169070b;
            }
            bxxk bxxk = f169071d;
            if (bxxk == null) {
                synchronized (byzf.class) {
                    bxxk = f169071d;
                    if (bxxk == null) {
                        bxxk = new bxve(f169070b);
                        f169071d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: e */
    public final void mo74513e() {
        if (!this.f169072a.mo73666a()) {
            this.f169072a = bxvk.m124021a(this.f169072a);
        }
    }
}
