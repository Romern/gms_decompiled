package p000;

/* renamed from: cbie */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbie extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final cbie f177232b;

    /* renamed from: c */
    private static volatile bxxk f177233c;

    /* renamed from: a */
    public cbid f177234a;

    static {
        cbie cbie = new cbie();
        f177232b = cbie;
        GeneratedMessageLite.m124024a(cbie.class, cbie);
    }

    private cbie() {
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
            return GeneratedMessageLite.m124022a(f177232b, "\u0000\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0000\u0000\u0003\t", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cbie();
        } else {
            if (i2 == 4) {
                return new bxvd(f177232b);
            }
            if (i2 == 5) {
                return f177232b;
            }
            bxxk bxxk = f177233c;
            if (bxxk == null) {
                synchronized (cbie.class) {
                    bxxk = f177233c;
                    if (bxxk == null) {
                        bxxk = new bxve(f177232b);
                        f177233c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
