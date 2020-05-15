package p000;

/* renamed from: cbgj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbgj extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final cbgj f177040b;

    /* renamed from: c */
    private static volatile bxxk f177041c;

    /* renamed from: a */
    public bxwc f177042a = bxxn.f165040b;

    static {
        cbgj cbgj = new cbgj();
        f177040b = cbgj;
        GeneratedMessageLite.m124024a(cbgj.class, cbgj);
    }

    private cbgj() {
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
            return GeneratedMessageLite.m124022a(f177040b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", cbgk.class});
        } else if (i2 == 3) {
            return new cbgj();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][]) null, (char[][]) null);
            }
            if (i2 == 5) {
                return f177040b;
            }
            bxxk bxxk = f177041c;
            if (bxxk == null) {
                synchronized (cbgj.class) {
                    bxxk = f177041c;
                    if (bxxk == null) {
                        bxxk = new bxve(f177040b);
                        f177041c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
