package p000;

/* renamed from: bxqk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxqk extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bxqk f164396a;

    /* renamed from: c */
    private static volatile bxxk f164397c;

    /* renamed from: b */
    private byte f164398b = 2;

    static {
        bxqk bxqk = new bxqk();
        f164396a = bxqk;
        bxvk.m124024a(bxqk.class, bxqk);
    }

    private bxqk() {
        bxxn bxxn = bxxn.f165040b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f164398b);
        }
        byte b = 1;
        if (i2 == 1) {
            if (obj == null) {
                b = 0;
            }
            this.f164398b = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f164396a, "\u0001\u0000", (Object[]) null);
        } else {
            if (i2 == 3) {
                return new bxqk();
            }
            if (i2 == 4) {
                return new bxvd(f164396a);
            }
            if (i2 == 5) {
                return f164396a;
            }
            bxxk bxxk = f164397c;
            if (bxxk == null) {
                synchronized (bxqk.class) {
                    bxxk = f164397c;
                    if (bxxk == null) {
                        bxxk = new bxve(f164396a);
                        f164397c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
