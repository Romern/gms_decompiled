package p000;

/* renamed from: bpas */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpas extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bpas f135532c;

    /* renamed from: d */
    private static volatile bxxk f135533d;

    /* renamed from: a */
    public int f135534a;

    /* renamed from: b */
    public int f135535b;

    static {
        bpas bpas = new bpas();
        f135532c = bpas;
        GeneratedMessageLite.m124024a(bpas.class, bpas);
    }

    private bpas() {
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
            return GeneratedMessageLite.m124022a(f135532c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bpar.f135531a});
        } else if (i2 == 3) {
            return new bpas();
        } else {
            if (i2 == 4) {
                return new bxvd(f135532c);
            }
            if (i2 == 5) {
                return f135532c;
            }
            bxxk bxxk = f135533d;
            if (bxxk == null) {
                synchronized (bpas.class) {
                    bxxk = f135533d;
                    if (bxxk == null) {
                        bxxk = new bxve(f135532c);
                        f135533d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
