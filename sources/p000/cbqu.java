package p000;

/* renamed from: cbqu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbqu extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final cbqu f178071c;

    /* renamed from: d */
    private static volatile bxxk f178072d;

    /* renamed from: a */
    public cbqj f178073a;

    /* renamed from: b */
    public bxwc f178074b = bxxn.f165040b;

    static {
        cbqu cbqu = new cbqu();
        f178071c = cbqu;
        GeneratedMessageLite.m124024a(cbqu.class, cbqu);
    }

    private cbqu() {
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
            return GeneratedMessageLite.m124022a(f178071c, "\u0000\u0002\u0000\u0000\u0003\u0004\u0002\u0000\u0001\u0000\u0003\u001b\u0004\t", new Object[]{"b", cbqy.class, "a"});
        } else if (i2 == 3) {
            return new cbqu();
        } else {
            if (i2 == 4) {
                return new bxvd((char[]) null, (boolean[][]) null);
            }
            if (i2 == 5) {
                return f178071c;
            }
            bxxk bxxk = f178072d;
            if (bxxk == null) {
                synchronized (cbqu.class) {
                    bxxk = f178072d;
                    if (bxxk == null) {
                        bxxk = new bxve(f178071c);
                        f178072d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
