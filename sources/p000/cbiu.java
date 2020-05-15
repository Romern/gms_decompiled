package p000;

/* renamed from: cbiu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbiu extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final cbiu f177299c;

    /* renamed from: d */
    private static volatile bxxk f177300d;

    /* renamed from: a */
    public String f177301a = "";

    /* renamed from: b */
    public bxwc f177302b = bxxn.f165040b;

    static {
        cbiu cbiu = new cbiu();
        f177299c = cbiu;
        GeneratedMessageLite.m124024a(cbiu.class, cbiu);
    }

    private cbiu() {
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
            return GeneratedMessageLite.m124022a(f177299c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"a", "b", cbit.class});
        } else if (i2 == 3) {
            return new cbiu();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[]) null, (short[][][]) null);
            }
            if (i2 == 5) {
                return f177299c;
            }
            bxxk bxxk = f177300d;
            if (bxxk == null) {
                synchronized (cbiu.class) {
                    bxxk = f177300d;
                    if (bxxk == null) {
                        bxxk = new bxve(f177299c);
                        f177300d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
