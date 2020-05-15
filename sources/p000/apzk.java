package p000;

/* renamed from: apzk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apzk extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final apzk f85262d;

    /* renamed from: e */
    private static volatile bxxk f85263e;

    /* renamed from: a */
    public int f85264a;

    /* renamed from: b */
    public String f85265b = "";

    /* renamed from: c */
    public int f85266c;

    static {
        apzk apzk = new apzk();
        f85262d = apzk;
        GeneratedMessageLite.m124024a(apzk.class, apzk);
    }

    private apzk() {
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
            return GeneratedMessageLite.m124022a(f85262d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new apzk();
        } else {
            if (i2 == 4) {
                return new bxvd(f85262d);
            }
            if (i2 == 5) {
                return f85262d;
            }
            bxxk bxxk = f85263e;
            if (bxxk == null) {
                synchronized (apzk.class) {
                    bxxk = f85263e;
                    if (bxxk == null) {
                        bxxk = new bxve(f85262d);
                        f85263e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
