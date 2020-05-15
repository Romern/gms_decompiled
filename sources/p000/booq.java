package p000;

/* renamed from: booq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class booq extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final booq f133980c;

    /* renamed from: d */
    private static volatile bxxk f133981d;

    /* renamed from: a */
    public int f133982a;

    /* renamed from: b */
    public bxwc f133983b = bxxn.f165040b;

    static {
        booq booq = new booq();
        f133980c = booq;
        GeneratedMessageLite.m124024a(booq.class, booq);
    }

    private booq() {
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
            return GeneratedMessageLite.m124022a(f133980c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002\u001b", new Object[]{"a", "b", bopk.class});
        } else if (i2 == 3) {
            return new booq();
        } else {
            if (i2 == 4) {
                return new bxvd((int[]) null, (int[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f133980c;
            }
            bxxk bxxk = f133981d;
            if (bxxk == null) {
                synchronized (booq.class) {
                    bxxk = f133981d;
                    if (bxxk == null) {
                        bxxk = new bxve(f133980c);
                        f133981d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
