package p000;

/* renamed from: cbfa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbfa extends bxvk implements bxxd {

    /* renamed from: a */
    public static final cbfa f176878a;

    /* renamed from: b */
    private static volatile bxxk f176879b;

    static {
        cbfa cbfa = new cbfa();
        f176878a = cbfa;
        bxvk.m124024a(cbfa.class, cbfa);
    }

    private cbfa() {
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
            return bxvk.m124022a(f176878a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cbfa();
        }
        if (i2 == 4) {
            return new bxvd(f176878a);
        }
        if (i2 == 5) {
            return f176878a;
        }
        bxxk bxxk = f176879b;
        if (bxxk == null) {
            synchronized (cbfa.class) {
                bxxk = f176879b;
                if (bxxk == null) {
                    bxxk = new bxve(f176878a);
                    f176879b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
