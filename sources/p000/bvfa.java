package p000;

/* renamed from: bvfa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvfa extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bvfa f155837a;

    /* renamed from: b */
    private static volatile bxxk f155838b;

    static {
        bvfa bvfa = new bvfa();
        f155837a = bvfa;
        bxvk.m124024a(bvfa.class, bvfa);
    }

    private bvfa() {
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
            return bxvk.m124022a(f155837a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvfa();
        }
        if (i2 == 4) {
            return new bxvd(f155837a);
        }
        if (i2 == 5) {
            return f155837a;
        }
        bxxk bxxk = f155838b;
        if (bxxk == null) {
            synchronized (bvfa.class) {
                bxxk = f155838b;
                if (bxxk == null) {
                    bxxk = new bxve(f155837a);
                    f155838b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
