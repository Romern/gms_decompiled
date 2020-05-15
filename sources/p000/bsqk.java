package p000;

/* renamed from: bsqk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsqk extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bsqk f146657e;

    /* renamed from: f */
    private static volatile bxxk f146658f;

    /* renamed from: a */
    public int f146659a;

    /* renamed from: b */
    public bssl f146660b;

    /* renamed from: c */
    public bssl f146661c;

    /* renamed from: d */
    public String f146662d = "";

    static {
        bsqk bsqk = new bsqk();
        f146657e = bsqk;
        GeneratedMessageLite.m124024a(bsqk.class, bsqk);
    }

    private bsqk() {
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
            return GeneratedMessageLite.m124022a(f146657e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bsqk();
        } else {
            if (i2 == 4) {
                return new bxvd(f146657e);
            }
            if (i2 == 5) {
                return f146657e;
            }
            bxxk bxxk = f146658f;
            if (bxxk == null) {
                synchronized (bsqk.class) {
                    bxxk = f146658f;
                    if (bxxk == null) {
                        bxxk = new bxve(f146657e);
                        f146658f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
