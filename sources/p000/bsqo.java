package p000;

/* renamed from: bsqo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsqo extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bsqo f146669e;

    /* renamed from: f */
    private static volatile bxxk f146670f;

    /* renamed from: a */
    public int f146671a;

    /* renamed from: b */
    public bsqh f146672b;

    /* renamed from: c */
    public bsqq f146673c;

    /* renamed from: d */
    public bsqh f146674d;

    static {
        bsqo bsqo = new bsqo();
        f146669e = bsqo;
        GeneratedMessageLite.m124024a(bsqo.class, bsqo);
    }

    private bsqo() {
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
            return GeneratedMessageLite.m124022a(f146669e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bsqo();
        } else {
            if (i2 == 4) {
                return new bxvd(f146669e);
            }
            if (i2 == 5) {
                return f146669e;
            }
            bxxk bxxk = f146670f;
            if (bxxk == null) {
                synchronized (bsqo.class) {
                    bxxk = f146670f;
                    if (bxxk == null) {
                        bxxk = new bxve(f146669e);
                        f146670f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
