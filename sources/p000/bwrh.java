package p000;

/* renamed from: bwrh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwrh extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bwrh f160766a;

    /* renamed from: b */
    private static volatile bxxk f160767b;

    static {
        bwrh bwrh = new bwrh();
        f160766a = bwrh;
        bxvk.m124024a(bwrh.class, bwrh);
    }

    private bwrh() {
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
            return bxvk.m124022a(f160766a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bwrh();
        }
        if (i2 == 4) {
            return new bxvd(f160766a);
        }
        if (i2 == 5) {
            return f160766a;
        }
        bxxk bxxk = f160767b;
        if (bxxk == null) {
            synchronized (bwrh.class) {
                bxxk = f160767b;
                if (bxxk == null) {
                    bxxk = new bxve(f160766a);
                    f160767b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
