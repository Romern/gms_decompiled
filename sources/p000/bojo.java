package p000;

/* renamed from: bojo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bojo extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bojo f133310e;

    /* renamed from: f */
    private static volatile bxxk f133311f;

    /* renamed from: a */
    public int f133312a;

    /* renamed from: b */
    public int f133313b;

    /* renamed from: c */
    public int f133314c;

    /* renamed from: d */
    public bxwc f133315d = bxxn.f165040b;

    static {
        bojo bojo = new bojo();
        f133310e = bojo;
        GeneratedMessageLite.m124024a(bojo.class, bojo);
    }

    private bojo() {
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
            return GeneratedMessageLite.m124022a(f133310e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0004\u001b", new Object[]{"a", "b", "c", "d", bojn.class});
        } else if (i2 == 3) {
            return new bojo();
        } else {
            if (i2 == 4) {
                return new bxvd((float[]) null, (byte[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f133310e;
            }
            bxxk bxxk = f133311f;
            if (bxxk == null) {
                synchronized (bojo.class) {
                    bxxk = f133311f;
                    if (bxxk == null) {
                        bxxk = new bxve(f133310e);
                        f133311f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
