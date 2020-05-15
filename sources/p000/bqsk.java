package p000;

/* renamed from: bqsk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqsk extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bqsk f141535e;

    /* renamed from: f */
    private static volatile bxxk f141536f;

    /* renamed from: a */
    public String f141537a = "";

    /* renamed from: b */
    public int f141538b;

    /* renamed from: c */
    public int f141539c;

    /* renamed from: d */
    public int f141540d;

    static {
        bqsk bqsk = new bqsk();
        f141535e = bqsk;
        GeneratedMessageLite.m124024a(bqsk.class, bqsk);
    }

    private bqsk() {
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
            return GeneratedMessageLite.m124022a(f141535e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bqsk();
        } else {
            if (i2 == 4) {
                return new bxvd(f141535e);
            }
            if (i2 == 5) {
                return f141535e;
            }
            bxxk bxxk = f141536f;
            if (bxxk == null) {
                synchronized (bqsk.class) {
                    bxxk = f141536f;
                    if (bxxk == null) {
                        bxxk = new bxve(f141535e);
                        f141536f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
