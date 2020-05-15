package p000;

/* renamed from: bojk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bojk extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bojk f133290d;

    /* renamed from: e */
    private static volatile bxxk f133291e;

    /* renamed from: a */
    public int f133292a;

    /* renamed from: b */
    public int f133293b;

    /* renamed from: c */
    public bojl f133294c;

    static {
        bojk bojk = new bojk();
        f133290d = bojk;
        GeneratedMessageLite.m124024a(bojk.class, bojk);
    }

    private bojk() {
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
            return GeneratedMessageLite.m124022a(f133290d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", bojj.f133289a, "c"});
        } else if (i2 == 3) {
            return new bojk();
        } else {
            if (i2 == 4) {
                return new bxvd(f133290d);
            }
            if (i2 == 5) {
                return f133290d;
            }
            bxxk bxxk = f133291e;
            if (bxxk == null) {
                synchronized (bojk.class) {
                    bxxk = f133291e;
                    if (bxxk == null) {
                        bxxk = new bxve(f133290d);
                        f133291e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
