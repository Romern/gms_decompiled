package p000;

/* renamed from: dco */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dco extends bxvg implements bxvh {

    /* renamed from: a */
    public static final dco f12865a;

    /* renamed from: c */
    private static volatile bxxk f12866c;

    /* renamed from: b */
    private byte f12867b = 2;

    static {
        dco dco = new dco();
        f12865a = dco;
        bxvk.m124024a(dco.class, dco);
    }

    private dco() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f12867b);
        }
        byte b = 1;
        if (i2 == 1) {
            if (obj == null) {
                b = 0;
            }
            this.f12867b = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f12865a, "\u0001\u0000", (Object[]) null);
        } else {
            if (i2 == 3) {
                return new dco();
            }
            if (i2 == 4) {
                return new bxvf(f12865a);
            }
            if (i2 == 5) {
                return f12865a;
            }
            bxxk bxxk = f12866c;
            if (bxxk == null) {
                synchronized (dco.class) {
                    bxxk = f12866c;
                    if (bxxk == null) {
                        bxxk = new bxve(f12865a);
                        f12866c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
