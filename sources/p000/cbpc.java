package p000;

/* renamed from: cbpc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbpc extends bxvk implements bxxd {

    /* renamed from: c */
    public static final cbpc f177898c;

    /* renamed from: d */
    private static volatile bxxk f177899d;

    /* renamed from: a */
    public int f177900a;

    /* renamed from: b */
    public int f177901b;

    static {
        cbpc cbpc = new cbpc();
        f177898c = cbpc;
        bxvk.m124024a(cbpc.class, cbpc);
    }

    private cbpc() {
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
            return bxvk.m124022a(f177898c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\f", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cbpc();
        } else {
            if (i2 == 4) {
                return new bxvd(f177898c);
            }
            if (i2 == 5) {
                return f177898c;
            }
            bxxk bxxk = f177899d;
            if (bxxk == null) {
                synchronized (cbpc.class) {
                    bxxk = f177899d;
                    if (bxxk == null) {
                        bxxk = new bxve(f177898c);
                        f177899d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
