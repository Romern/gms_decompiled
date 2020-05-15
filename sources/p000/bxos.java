package p000;

/* renamed from: bxos */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxos extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bxos f164205a;

    /* renamed from: b */
    private static volatile bxxk f164206b;

    static {
        bxos bxos = new bxos();
        f164205a = bxos;
        GeneratedMessageLite.m124024a(bxos.class, bxos);
    }

    private bxos() {
        bxxn bxxn = bxxn.f165040b;
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
            return GeneratedMessageLite.m124022a(f164205a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bxos();
        }
        if (i2 == 4) {
            return new bxvd(f164205a);
        }
        if (i2 == 5) {
            return f164205a;
        }
        bxxk bxxk = f164206b;
        if (bxxk == null) {
            synchronized (bxos.class) {
                bxxk = f164206b;
                if (bxxk == null) {
                    bxxk = new bxve(f164205a);
                    f164206b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
