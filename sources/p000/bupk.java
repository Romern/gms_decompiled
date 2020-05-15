package p000;

/* renamed from: bupk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bupk extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bupk f154647a;

    /* renamed from: b */
    private static volatile bxxk f154648b;

    static {
        bupk bupk = new bupk();
        f154647a = bupk;
        bxvk.m124024a(bupk.class, bupk);
    }

    private bupk() {
        bxwq bxwq = bxwq.f165002b;
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
            return bxvk.m124022a(f154647a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bupk();
        }
        if (i2 == 4) {
            return new bxvd(f154647a);
        }
        if (i2 == 5) {
            return f154647a;
        }
        bxxk bxxk = f154648b;
        if (bxxk == null) {
            synchronized (bupk.class) {
                bxxk = f154648b;
                if (bxxk == null) {
                    bxxk = new bxve(f154647a);
                    f154648b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
