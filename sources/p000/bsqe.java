package p000;

/* renamed from: bsqe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsqe extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bsqe f146627e;

    /* renamed from: f */
    private static volatile bxxk f146628f;

    /* renamed from: a */
    public int f146629a;

    /* renamed from: b */
    public int f146630b;

    /* renamed from: c */
    public String f146631c = "";

    /* renamed from: d */
    public String f146632d = "";

    static {
        bsqe bsqe = new bsqe();
        f146627e = bsqe;
        GeneratedMessageLite.m124024a(bsqe.class, bsqe);
    }

    private bsqe() {
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
            return GeneratedMessageLite.m124022a(f146627e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bsqe();
        } else {
            if (i2 == 4) {
                return new bxvd(f146627e);
            }
            if (i2 == 5) {
                return f146627e;
            }
            bxxk bxxk = f146628f;
            if (bxxk == null) {
                synchronized (bsqe.class) {
                    bxxk = f146628f;
                    if (bxxk == null) {
                        bxxk = new bxve(f146627e);
                        f146628f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
