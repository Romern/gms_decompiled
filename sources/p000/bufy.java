package p000;

/* renamed from: bufy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bufy extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bufy f153759a;

    /* renamed from: b */
    private static volatile bxxk f153760b;

    static {
        bufy bufy = new bufy();
        f153759a = bufy;
        bxvk.m124024a(bufy.class, bufy);
    }

    private bufy() {
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
            return bxvk.m124022a(f153759a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bufy();
        }
        if (i2 == 4) {
            return new bxvd(f153759a);
        }
        if (i2 == 5) {
            return f153759a;
        }
        bxxk bxxk = f153760b;
        if (bxxk == null) {
            synchronized (bufy.class) {
                bxxk = f153760b;
                if (bxxk == null) {
                    bxxk = new bxve(f153759a);
                    f153760b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
