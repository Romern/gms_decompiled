package p000;

/* renamed from: byub */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byub extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final byub f167753d;

    /* renamed from: e */
    private static volatile bxxk f167754e;

    /* renamed from: a */
    public int f167755a;

    /* renamed from: b */
    public bxwc f167756b = bxxn.f165040b;

    /* renamed from: c */
    public byua f167757c;

    static {
        byub byub = new byub();
        f167753d = byub;
        GeneratedMessageLite.m124024a(byub.class, byub);
    }

    private byub() {
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
            return GeneratedMessageLite.m124022a(f167753d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဉ\u0000", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new byub();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][]) null, (float[][]) null);
            }
            if (i2 == 5) {
                return f167753d;
            }
            bxxk bxxk = f167754e;
            if (bxxk == null) {
                synchronized (byub.class) {
                    bxxk = f167754e;
                    if (bxxk == null) {
                        bxxk = new bxve(f167753d);
                        f167754e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
