package p000;

/* renamed from: cbbu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbbu extends bxvk implements bxxd {

    /* renamed from: b */
    public static final cbbu f176618b;

    /* renamed from: c */
    private static volatile bxxk f176619c;

    /* renamed from: a */
    public cbma f176620a;

    static {
        cbbu cbbu = new cbbu();
        f176618b = cbbu;
        bxvk.m124024a(cbbu.class, cbbu);
    }

    private cbbu() {
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
            return bxvk.m124022a(f176618b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cbbu();
        } else {
            if (i2 == 4) {
                return new bxvd(f176618b);
            }
            if (i2 == 5) {
                return f176618b;
            }
            bxxk bxxk = f176619c;
            if (bxxk == null) {
                synchronized (cbbu.class) {
                    bxxk = f176619c;
                    if (bxxk == null) {
                        bxxk = new bxve(f176618b);
                        f176619c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
