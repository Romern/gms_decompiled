package p000;

/* renamed from: dcs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dcs extends bxvg implements bxvh {

    /* renamed from: a */
    public static final dcs f12877a;

    /* renamed from: c */
    private static volatile bxxk f12878c;

    /* renamed from: b */
    private byte f12879b = 2;

    static {
        dcs dcs = new dcs();
        f12877a = dcs;
        bxvk.m124024a(dcs.class, dcs);
    }

    private dcs() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f12879b);
        }
        byte b = 1;
        if (i2 == 1) {
            if (obj == null) {
                b = 0;
            }
            this.f12879b = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f12877a, "\u0001\u0000", (Object[]) null);
        } else {
            if (i2 == 3) {
                return new dcs();
            }
            if (i2 == 4) {
                return new bxvf(f12877a);
            }
            if (i2 == 5) {
                return f12877a;
            }
            bxxk bxxk = f12878c;
            if (bxxk == null) {
                synchronized (dcs.class) {
                    bxxk = f12878c;
                    if (bxxk == null) {
                        bxxk = new bxve(f12877a);
                        f12878c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
