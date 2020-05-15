package p000;

/* renamed from: boly */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boly extends GeneratedMessageLite implements bxxd {

    /* renamed from: k */
    public static final boly f133593k;

    /* renamed from: l */
    private static volatile bxxk f133594l;

    /* renamed from: a */
    public int f133595a;

    /* renamed from: b */
    public int f133596b;

    /* renamed from: c */
    public int f133597c;

    /* renamed from: d */
    public int f133598d;

    /* renamed from: e */
    public int f133599e;

    /* renamed from: f */
    public int f133600f;

    /* renamed from: g */
    public int f133601g;

    /* renamed from: h */
    public int f133602h;

    /* renamed from: i */
    public long f133603i;

    /* renamed from: j */
    public bxwc f133604j = bxxn.f165040b;

    static {
        boly boly = new boly();
        f133593k = boly;
        GeneratedMessageLite.m124024a(boly.class, boly);
    }

    private boly() {
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
            return GeneratedMessageLite.m124022a(f133593k, "\u0000\n\u0000\u0000\u0001\r\n\u0000\u0001\u0000\u0001\f\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004\u0006\u0004\u0007\u0004\b\f\t\u0002\r\u001b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", bolv.class});
        } else if (i2 == 3) {
            return new boly();
        } else {
            if (i2 == 4) {
                return new bxvd(f133593k);
            }
            if (i2 == 5) {
                return f133593k;
            }
            bxxk bxxk = f133594l;
            if (bxxk == null) {
                synchronized (boly.class) {
                    bxxk = f133594l;
                    if (bxxk == null) {
                        bxxk = new bxve(f133593k);
                        f133594l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
