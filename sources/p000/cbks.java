package p000;

/* renamed from: cbks */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbks extends bxvk implements bxxd {

    /* renamed from: a */
    public static final cbks f177443a;

    /* renamed from: b */
    private static volatile bxxk f177444b;

    static {
        cbks cbks = new cbks();
        f177443a = cbks;
        bxvk.m124024a(cbks.class, cbks);
    }

    private cbks() {
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
            return bxvk.m124022a(f177443a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cbks();
        }
        if (i2 == 4) {
            return new bxvd(f177443a);
        }
        if (i2 == 5) {
            return f177443a;
        }
        bxxk bxxk = f177444b;
        if (bxxk == null) {
            synchronized (cbks.class) {
                bxxk = f177444b;
                if (bxxk == null) {
                    bxxk = new bxve(f177443a);
                    f177444b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
