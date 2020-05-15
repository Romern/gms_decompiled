package p000;

/* renamed from: bomv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bomv extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bomv f133724b;

    /* renamed from: c */
    private static volatile bxxk f133725c;

    /* renamed from: a */
    public bxwc f133726a = bxxn.f165040b;

    static {
        bomv bomv = new bomv();
        f133724b = bomv;
        GeneratedMessageLite.m124024a(bomv.class, bomv);
    }

    private bomv() {
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
            return GeneratedMessageLite.m124022a(f133724b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bomw.class});
        } else if (i2 == 3) {
            return new bomv();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][]) null, (char[][][]) null);
            }
            if (i2 == 5) {
                return f133724b;
            }
            bxxk bxxk = f133725c;
            if (bxxk == null) {
                synchronized (bomv.class) {
                    bxxk = f133725c;
                    if (bxxk == null) {
                        bxxk = new bxve(f133724b);
                        f133725c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
