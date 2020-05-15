package p000;

/* renamed from: bvrh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvrh extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bvrh f157436a;

    /* renamed from: b */
    private static volatile bxxk f157437b;

    static {
        bvrh bvrh = new bvrh();
        f157436a = bvrh;
        bxvk.m124024a(bvrh.class, bvrh);
    }

    private bvrh() {
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
            return bxvk.m124022a(f157436a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvrh();
        }
        if (i2 == 4) {
            return new bxvd(f157436a);
        }
        if (i2 == 5) {
            return f157436a;
        }
        bxxk bxxk = f157437b;
        if (bxxk == null) {
            synchronized (bvrh.class) {
                bxxk = f157437b;
                if (bxxk == null) {
                    bxxk = new bxve(f157436a);
                    f157437b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
