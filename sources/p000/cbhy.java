package p000;

/* renamed from: cbhy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbhy extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final cbhy f177214d;

    /* renamed from: e */
    private static volatile bxxk f177215e;

    /* renamed from: a */
    public int f177216a = 0;

    /* renamed from: b */
    public Object f177217b;

    /* renamed from: c */
    public String f177218c = "";

    static {
        cbhy cbhy = new cbhy();
        f177214d = cbhy;
        GeneratedMessageLite.m124024a(cbhy.class, cbhy);
    }

    private cbhy() {
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
            return GeneratedMessageLite.m124022a(f177214d, "\u0000\u0002\u0001\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001=\u0000\u0003Ȉ", new Object[]{"b", "a", "c"});
        } else if (i2 == 3) {
            return new cbhy();
        } else {
            if (i2 == 4) {
                return new bxvd(f177214d);
            }
            if (i2 == 5) {
                return f177214d;
            }
            bxxk bxxk = f177215e;
            if (bxxk == null) {
                synchronized (cbhy.class) {
                    bxxk = f177215e;
                    if (bxxk == null) {
                        bxxk = new bxve(f177214d);
                        f177215e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
