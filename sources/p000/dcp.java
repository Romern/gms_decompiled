package p000;

/* renamed from: dcp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dcp extends bxvg implements bxvh {

    /* renamed from: a */
    public static final dcp f12868a;

    /* renamed from: c */
    private static volatile bxxk f12869c;

    /* renamed from: b */
    private byte f12870b = 2;

    static {
        dcp dcp = new dcp();
        f12868a = dcp;
        GeneratedMessageLite.m124024a(dcp.class, dcp);
    }

    private dcp() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f12870b);
        }
        byte b = 1;
        if (i2 == 1) {
            if (obj == null) {
                b = 0;
            }
            this.f12870b = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f12868a, "\u0001\u0000", (Object[]) null);
        } else {
            if (i2 == 3) {
                return new dcp();
            }
            if (i2 == 4) {
                return new bxvf(f12868a);
            }
            if (i2 == 5) {
                return f12868a;
            }
            bxxk bxxk = f12869c;
            if (bxxk == null) {
                synchronized (dcp.class) {
                    bxxk = f12869c;
                    if (bxxk == null) {
                        bxxk = new bxve(f12868a);
                        f12869c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
