package p000;

/* renamed from: bwhy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwhy extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bwhy f159603b;

    /* renamed from: c */
    private static volatile bxxk f159604c;

    /* renamed from: a */
    public bxwc f159605a = bxxn.f165040b;

    static {
        bwhy bwhy = new bwhy();
        f159603b = bwhy;
        GeneratedMessageLite.m124024a(bwhy.class, bwhy);
    }

    private bwhy() {
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
            return GeneratedMessageLite.m124022a(f159603b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bwhx.class});
        } else if (i2 == 3) {
            return new bwhy();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[]) null, (float[][][]) null);
            }
            if (i2 == 5) {
                return f159603b;
            }
            bxxk bxxk = f159604c;
            if (bxxk == null) {
                synchronized (bwhy.class) {
                    bxxk = f159604c;
                    if (bxxk == null) {
                        bxxk = new bxve(f159603b);
                        f159604c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
