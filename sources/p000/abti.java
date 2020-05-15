package p000;

/* renamed from: abti */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abti extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final abti f58235e;

    /* renamed from: f */
    private static volatile bxxk f58236f;

    /* renamed from: a */
    public int f58237a;

    /* renamed from: b */
    public String f58238b = "";

    /* renamed from: c */
    public String f58239c = "";

    /* renamed from: d */
    public int f58240d;

    static {
        abti abti = new abti();
        f58235e = abti;
        GeneratedMessageLite.m124024a(abti.class, abti);
    }

    private abti() {
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
            return GeneratedMessageLite.m124022a(f58235e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဋ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new abti();
        } else {
            if (i2 == 4) {
                return new bxvd(f58235e);
            }
            if (i2 == 5) {
                return f58235e;
            }
            bxxk bxxk = f58236f;
            if (bxxk == null) {
                synchronized (abti.class) {
                    bxxk = f58236f;
                    if (bxxk == null) {
                        bxxk = new bxve(f58235e);
                        f58236f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
