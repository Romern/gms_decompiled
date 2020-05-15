package p000;

/* renamed from: bxhn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxhn extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bxhn f163432e;

    /* renamed from: f */
    private static volatile bxxk f163433f;

    /* renamed from: a */
    public int f163434a;

    /* renamed from: b */
    public int f163435b;

    /* renamed from: c */
    public String f163436c = "";

    /* renamed from: d */
    public int f163437d;

    static {
        bxhn bxhn = new bxhn();
        f163432e = bxhn;
        GeneratedMessageLite.m124024a(bxhn.class, bxhn);
    }

    private bxhn() {
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
            return GeneratedMessageLite.m124022a(f163432e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003င\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bxhn();
        } else {
            if (i2 == 4) {
                return new bxvd(f163432e);
            }
            if (i2 == 5) {
                return f163432e;
            }
            bxxk bxxk = f163433f;
            if (bxxk == null) {
                synchronized (bxhn.class) {
                    bxxk = f163433f;
                    if (bxxk == null) {
                        bxxk = new bxve(f163432e);
                        f163433f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
