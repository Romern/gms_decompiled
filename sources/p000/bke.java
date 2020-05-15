package p000;

/* renamed from: bke */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bke extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bke f4954b;

    /* renamed from: c */
    private static volatile bxxk f4955c;

    /* renamed from: a */
    public bxvw f4956a = bxwq.f165002b;

    static {
        bke bke = new bke();
        f4954b = bke;
        bxvk.m124024a(bke.class, bke);
    }

    private bke() {
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
            return bxvk.m124022a(f4954b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u0014", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bke();
        } else {
            if (i2 == 4) {
                return new bxvd(f4954b);
            }
            if (i2 == 5) {
                return f4954b;
            }
            bxxk bxxk = f4955c;
            if (bxxk == null) {
                synchronized (bke.class) {
                    bxxk = f4955c;
                    if (bxxk == null) {
                        bxxk = new bxve(f4954b);
                        f4955c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
