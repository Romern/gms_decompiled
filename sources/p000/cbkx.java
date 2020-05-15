package p000;

/* renamed from: cbkx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbkx extends bxvk implements bxxd {

    /* renamed from: c */
    public static final cbkx f177453c;

    /* renamed from: d */
    private static volatile bxxk f177454d;

    /* renamed from: a */
    public int f177455a = 0;

    /* renamed from: b */
    public Object f177456b;

    static {
        cbkx cbkx = new cbkx();
        f177453c = cbkx;
        bxvk.m124024a(cbkx.class, cbkx);
    }

    private cbkx() {
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
            return bxvk.m124022a(f177453c, "\u0000\u0006\u0001\u0000\u0002\u0007\u0006\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"b", "a", cbkj.class, cbku.class, cbkw.class, cbks.class, cbkv.class, cbkt.class});
        } else if (i2 == 3) {
            return new cbkx();
        } else {
            if (i2 == 4) {
                return new bxvd(f177453c);
            }
            if (i2 == 5) {
                return f177453c;
            }
            bxxk bxxk = f177454d;
            if (bxxk == null) {
                synchronized (cbkx.class) {
                    bxxk = f177454d;
                    if (bxxk == null) {
                        bxxk = new bxve(f177453c);
                        f177454d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
