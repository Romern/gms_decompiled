package p000;

/* renamed from: bwzd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwzd extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bwzd f161575b;

    /* renamed from: d */
    private static volatile bxxk f161576d;

    /* renamed from: a */
    public bxww f161577a = bxww.f165013b;

    /* renamed from: c */
    private bxww f161578c = bxww.f165013b;

    static {
        bwzd bwzd = new bwzd();
        f161575b = bwzd;
        bxvk.m124024a(bwzd.class, bwzd);
    }

    private bwzd() {
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
            return bxvk.m124022a(f161575b, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0002\u0000\u0000\u00012\u00022", new Object[]{"a", bwzc.f161574a, "c", bwzb.f161573a});
        } else if (i2 == 3) {
            return new bwzd();
        } else {
            if (i2 == 4) {
                return new bxvd(f161575b);
            }
            if (i2 == 5) {
                return f161575b;
            }
            bxxk bxxk = f161576d;
            if (bxxk == null) {
                synchronized (bwzd.class) {
                    bxxk = f161576d;
                    if (bxxk == null) {
                        bxxk = new bxve(f161575b);
                        f161576d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
