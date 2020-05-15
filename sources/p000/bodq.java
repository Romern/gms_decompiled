package p000;

/* renamed from: bodq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bodq extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bodq f132725c;

    /* renamed from: d */
    private static volatile bxxk f132726d;

    /* renamed from: a */
    public int f132727a;

    /* renamed from: b */
    public int f132728b;

    static {
        bodq bodq = new bodq();
        f132725c = bodq;
        bxvk.m124024a(bodq.class, bodq);
    }

    private bodq() {
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
            return bxvk.m124022a(f132725c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bodp.f132724a});
        } else if (i2 == 3) {
            return new bodq();
        } else {
            if (i2 == 4) {
                return new bxvd(f132725c);
            }
            if (i2 == 5) {
                return f132725c;
            }
            bxxk bxxk = f132726d;
            if (bxxk == null) {
                synchronized (bodq.class) {
                    bxxk = f132726d;
                    if (bxxk == null) {
                        bxxk = new bxve(f132725c);
                        f132726d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
