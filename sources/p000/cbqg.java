package p000;

/* renamed from: cbqg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbqg extends bxvk implements bxxd {

    /* renamed from: b */
    public static final cbqg f178018b;

    /* renamed from: c */
    private static volatile bxxk f178019c;

    /* renamed from: a */
    public cbnz f178020a;

    static {
        cbqg cbqg = new cbqg();
        f178018b = cbqg;
        bxvk.m124024a(cbqg.class, cbqg);
    }

    private cbqg() {
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
            return bxvk.m124022a(f178018b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cbqg();
        } else {
            if (i2 == 4) {
                return new bxvd(f178018b);
            }
            if (i2 == 5) {
                return f178018b;
            }
            bxxk bxxk = f178019c;
            if (bxxk == null) {
                synchronized (cbqg.class) {
                    bxxk = f178019c;
                    if (bxxk == null) {
                        bxxk = new bxve(f178018b);
                        f178019c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
