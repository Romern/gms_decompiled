package p000;

/* renamed from: amku */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amku extends GeneratedMessageLite implements bxxd {

    /* renamed from: n */
    public static final amku f75091n;

    /* renamed from: o */
    private static volatile bxxk f75092o;

    /* renamed from: a */
    public int f75093a;

    /* renamed from: b */
    public boolean f75094b;

    /* renamed from: c */
    public boolean f75095c;

    /* renamed from: d */
    public boolean f75096d;

    /* renamed from: e */
    public boolean f75097e;

    /* renamed from: f */
    public int f75098f;

    /* renamed from: g */
    public int f75099g;

    /* renamed from: h */
    public int f75100h;

    /* renamed from: i */
    public int f75101i;

    /* renamed from: j */
    public boolean f75102j;

    /* renamed from: k */
    public boolean f75103k;

    /* renamed from: l */
    public amkt f75104l;

    /* renamed from: m */
    public int f75105m;

    static {
        amku amku = new amku();
        f75091n = amku;
        GeneratedMessageLite.m124024a(amku.class, amku);
    }

    private amku() {
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
            return GeneratedMessageLite.m124022a(f75091n, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tဇ\b\nဇ\t\u000bဉ\n\fင\u000b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"});
        } else if (i2 == 3) {
            return new amku();
        } else {
            if (i2 == 4) {
                return new bxvd(f75091n);
            }
            if (i2 == 5) {
                return f75091n;
            }
            bxxk bxxk = f75092o;
            if (bxxk == null) {
                synchronized (amku.class) {
                    bxxk = f75092o;
                    if (bxxk == null) {
                        bxxk = new bxve(f75091n);
                        f75092o = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
