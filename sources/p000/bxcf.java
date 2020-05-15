package p000;

/* renamed from: bxcf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxcf extends bxvg implements bxvh {

    /* renamed from: a */
    public static final bxcf f162779a;

    /* renamed from: c */
    private static volatile bxxk f162780c;

    /* renamed from: b */
    private byte f162781b = 2;

    static {
        bxcf bxcf = new bxcf();
        f162779a = bxcf;
        GeneratedMessageLite.m124024a(bxcf.class, bxcf);
    }

    private bxcf() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f162781b);
        }
        byte b = 1;
        if (i2 == 1) {
            if (obj == null) {
                b = 0;
            }
            this.f162781b = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f162779a, "\u0001\u0000", (Object[]) null);
        } else {
            if (i2 == 3) {
                return new bxcf();
            }
            if (i2 == 4) {
                return new bxvf(f162779a);
            }
            if (i2 == 5) {
                return f162779a;
            }
            bxxk bxxk = f162780c;
            if (bxxk == null) {
                synchronized (bxcf.class) {
                    bxxk = f162780c;
                    if (bxxk == null) {
                        bxxk = new bxve(f162779a);
                        f162780c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
