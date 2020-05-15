package p000;

/* renamed from: cbdo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbdo extends bxvk implements bxxd {

    /* renamed from: b */
    public static final cbdo f176763b;

    /* renamed from: c */
    private static volatile bxxk f176764c;

    /* renamed from: a */
    public bxvw f176765a = bxwq.f165002b;

    static {
        cbdo cbdo = new cbdo();
        f176763b = cbdo;
        bxvk.m124024a(cbdo.class, cbdo);
    }

    private cbdo() {
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
            return bxvk.m124022a(f176763b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001%", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cbdo();
        } else {
            if (i2 == 4) {
                return new cbdn();
            }
            if (i2 == 5) {
                return f176763b;
            }
            bxxk bxxk = f176764c;
            if (bxxk == null) {
                synchronized (cbdo.class) {
                    bxxk = f176764c;
                    if (bxxk == null) {
                        bxxk = new bxve(f176763b);
                        f176764c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
