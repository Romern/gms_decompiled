package p000;

/* renamed from: bokh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bokh extends bxvg implements bxvh {

    /* renamed from: a */
    public static final bokh f133408a;

    /* renamed from: c */
    private static volatile bxxk f133409c;

    /* renamed from: b */
    private byte f133410b = 2;

    static {
        bokh bokh = new bokh();
        f133408a = bokh;
        bxvk.m124024a(bokh.class, bokh);
    }

    private bokh() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f133410b);
        }
        byte b = 1;
        if (i2 == 1) {
            if (obj == null) {
                b = 0;
            }
            this.f133410b = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f133408a, "\u0001\u0000", (Object[]) null);
        } else {
            if (i2 == 3) {
                return new bokh();
            }
            if (i2 == 4) {
                return new bxvf(f133408a);
            }
            if (i2 == 5) {
                return f133408a;
            }
            bxxk bxxk = f133409c;
            if (bxxk == null) {
                synchronized (bokh.class) {
                    bxxk = f133409c;
                    if (bxxk == null) {
                        bxxk = new bxve(f133408a);
                        f133409c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
