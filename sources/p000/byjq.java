package p000;

/* renamed from: byjq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byjq extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final byjq f166688e;

    /* renamed from: f */
    private static volatile bxxk f166689f;

    /* renamed from: a */
    public int f166690a;

    /* renamed from: b */
    public int f166691b;

    /* renamed from: c */
    public long f166692c;

    /* renamed from: d */
    public long f166693d;

    static {
        byjq byjq = new byjq();
        f166688e = byjq;
        GeneratedMessageLite.m124024a(byjq.class, byjq);
    }

    private byjq() {
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
            return GeneratedMessageLite.m124022a(f166688e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new byjq();
        } else {
            if (i2 == 4) {
                return new bxvd(f166688e);
            }
            if (i2 == 5) {
                return f166688e;
            }
            bxxk bxxk = f166689f;
            if (bxxk == null) {
                synchronized (byjq.class) {
                    bxxk = f166689f;
                    if (bxxk == null) {
                        bxxk = new bxve(f166688e);
                        f166689f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
