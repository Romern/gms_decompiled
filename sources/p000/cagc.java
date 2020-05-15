package p000;

/* renamed from: cagc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cagc extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final cagc f173075e;

    /* renamed from: f */
    private static volatile bxxk f173076f;

    /* renamed from: a */
    public int f173077a;

    /* renamed from: b */
    public long f173078b;

    /* renamed from: c */
    public long f173079c;

    /* renamed from: d */
    public boolean f173080d;

    static {
        cagc cagc = new cagc();
        f173075e = cagc;
        GeneratedMessageLite.m124024a(cagc.class, cagc);
    }

    private cagc() {
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
            return GeneratedMessageLite.m124022a(f173075e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0001\u0002ဇ\u0002\u0003ဂ\u0000", new Object[]{"a", "c", "d", "b"});
        } else if (i2 == 3) {
            return new cagc();
        } else {
            if (i2 == 4) {
                return new bxvd(f173075e);
            }
            if (i2 == 5) {
                return f173075e;
            }
            bxxk bxxk = f173076f;
            if (bxxk == null) {
                synchronized (cagc.class) {
                    bxxk = f173076f;
                    if (bxxk == null) {
                        bxxk = new bxve(f173075e);
                        f173076f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
