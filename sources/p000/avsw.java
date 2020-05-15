package p000;

/* renamed from: avsw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avsw extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final avsw f93866e;

    /* renamed from: f */
    private static volatile bxxk f93867f;

    /* renamed from: a */
    public String f93868a = "";

    /* renamed from: b */
    public boolean f93869b;

    /* renamed from: c */
    public avsv f93870c;

    /* renamed from: d */
    public avsv f93871d;

    static {
        avsw avsw = new avsw();
        f93866e = avsw;
        GeneratedMessageLite.m124024a(avsw.class, avsw);
    }

    private avsw() {
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
            return GeneratedMessageLite.m124022a(f93866e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0007\u0003\t\u0004\t", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new avsw();
        } else {
            if (i2 == 4) {
                return new bxvd(f93866e);
            }
            if (i2 == 5) {
                return f93866e;
            }
            bxxk bxxk = f93867f;
            if (bxxk == null) {
                synchronized (avsw.class) {
                    bxxk = f93867f;
                    if (bxxk == null) {
                        bxxk = new bxve(f93866e);
                        f93867f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
