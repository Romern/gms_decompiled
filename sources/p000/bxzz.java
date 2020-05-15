package p000;

/* renamed from: bxzz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxzz extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bxzz f165211e;

    /* renamed from: f */
    private static volatile bxxk f165212f;

    /* renamed from: a */
    public String f165213a = "";

    /* renamed from: b */
    public String f165214b = "";

    /* renamed from: c */
    public long f165215c;

    /* renamed from: d */
    public long f165216d;

    static {
        bxzz bxzz = new bxzz();
        f165211e = bxzz;
        GeneratedMessageLite.m124024a(bxzz.class, bxzz);
    }

    private bxzz() {
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
            return GeneratedMessageLite.m124022a(f165211e, "\u0000\u0004\u0000\u0000\u0001\b\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0007\u0002\b\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bxzz();
        } else {
            if (i2 == 4) {
                return new bxvd(f165211e);
            }
            if (i2 == 5) {
                return f165211e;
            }
            bxxk bxxk = f165212f;
            if (bxxk == null) {
                synchronized (bxzz.class) {
                    bxxk = f165212f;
                    if (bxxk == null) {
                        bxxk = new bxve(f165211e);
                        f165212f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
