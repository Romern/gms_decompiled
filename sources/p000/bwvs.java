package p000;

/* renamed from: bwvs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwvs extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bwvs f161171a;

    /* renamed from: b */
    public static final bxvj f161172b;

    /* renamed from: c */
    private static volatile bxxk f161173c;

    static {
        bwvs bwvs = new bwvs();
        f161171a = bwvs;
        bxvk.m124024a(bwvs.class, bwvs);
        bwou bwou = bwou.f160492e;
        bwvs bwvs2 = f161171a;
        f161172b = bxvk.m124006a(bwou, bwvs2, bwvs2, 209228584, bxzf.MESSAGE);
    }

    private bwvs() {
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
            return bxvk.m124022a(f161171a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bwvs();
        }
        if (i2 == 4) {
            return new bxvd(f161171a);
        }
        if (i2 == 5) {
            return f161171a;
        }
        bxxk bxxk = f161173c;
        if (bxxk == null) {
            synchronized (bwvs.class) {
                bxxk = f161173c;
                if (bxxk == null) {
                    bxxk = new bxve(f161171a);
                    f161173c = bxxk;
                }
            }
        }
        return bxxk;
    }
}
