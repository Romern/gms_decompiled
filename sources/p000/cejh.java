package p000;

/* renamed from: cejh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cejh extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final cejh f182765c;

    /* renamed from: e */
    private static volatile bxxk f182766e;

    /* renamed from: a */
    public cejn f182767a;

    /* renamed from: b */
    public cejg f182768b;

    /* renamed from: d */
    private int f182769d;

    static {
        cejh cejh = new cejh();
        f182765c = cejh;
        GeneratedMessageLite.m124024a(cejh.class, cejh);
    }

    private cejh() {
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
            return GeneratedMessageLite.m124022a(f182765c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new cejh();
        } else {
            if (i2 == 4) {
                return new bxvd(f182765c);
            }
            if (i2 == 5) {
                return f182765c;
            }
            bxxk bxxk = f182766e;
            if (bxxk == null) {
                synchronized (cejh.class) {
                    bxxk = f182766e;
                    if (bxxk == null) {
                        bxxk = new bxve(f182765c);
                        f182766e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
