package p000;

/* renamed from: bxiq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxiq extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bxiq f163553d;

    /* renamed from: e */
    private static volatile bxxk f163554e;

    /* renamed from: a */
    public int f163555a;

    /* renamed from: b */
    public int f163556b;

    /* renamed from: c */
    public long f163557c;

    static {
        bxiq bxiq = new bxiq();
        f163553d = bxiq;
        GeneratedMessageLite.m124024a(bxiq.class, bxiq);
    }

    private bxiq() {
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
            return GeneratedMessageLite.m124022a(f163553d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", bxco.m122578b(), "c"});
        } else if (i2 == 3) {
            return new bxiq();
        } else {
            if (i2 == 4) {
                return new bxvd(f163553d);
            }
            if (i2 == 5) {
                return f163553d;
            }
            bxxk bxxk = f163554e;
            if (bxxk == null) {
                synchronized (bxiq.class) {
                    bxxk = f163554e;
                    if (bxxk == null) {
                        bxxk = new bxve(f163553d);
                        f163554e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
