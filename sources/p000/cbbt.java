package p000;

/* renamed from: cbbt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbbt extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final cbbt f176613d;

    /* renamed from: e */
    private static volatile bxxk f176614e;

    /* renamed from: a */
    public int f176615a = 0;

    /* renamed from: b */
    public Object f176616b;

    /* renamed from: c */
    public int f176617c;

    static {
        cbbt cbbt = new cbbt();
        f176613d = cbbt;
        GeneratedMessageLite.m124024a(cbbt.class, cbbt);
    }

    private cbbt() {
        ByteString bxtx = bxtx.f164797b;
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
            return GeneratedMessageLite.m124022a(f176613d, "\u0000\u0010\u0001\u0000\u0001\u0011\u0010\u0000\u0000\u0000\u0001\f\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000\u0011<\u0000", new Object[]{"b", "a", "c", bxte.class, cbbx.class, cbbq.class, cbca.class, cbmc.class, cbbv.class, cbjg.class, cbbz.class, cbby.class, cbbm.class, cbbq.class, cbcb.class, cbbw.class, cbbr.class, cbcc.class});
        } else if (i2 == 3) {
            return new cbbt();
        } else {
            if (i2 == 4) {
                return new bxvd(f176613d);
            }
            if (i2 == 5) {
                return f176613d;
            }
            bxxk bxxk = f176614e;
            if (bxxk == null) {
                synchronized (cbbt.class) {
                    bxxk = f176614e;
                    if (bxxk == null) {
                        bxxk = new bxve(f176613d);
                        f176614e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
