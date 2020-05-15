package p000;

/* renamed from: bssu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bssu extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bssu f146916d;

    /* renamed from: e */
    private static volatile bxxk f146917e;

    /* renamed from: a */
    public int f146918a;

    /* renamed from: b */
    public long f146919b;

    /* renamed from: c */
    public long f146920c;

    static {
        bssu bssu = new bssu();
        f146916d = bssu;
        GeneratedMessageLite.m124024a(bssu.class, bssu);
    }

    private bssu() {
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
            return GeneratedMessageLite.m124022a(f146916d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bssu();
        } else {
            if (i2 == 4) {
                return new bxvd(f146916d);
            }
            if (i2 == 5) {
                return f146916d;
            }
            bxxk bxxk = f146917e;
            if (bxxk == null) {
                synchronized (bssu.class) {
                    bxxk = f146917e;
                    if (bxxk == null) {
                        bxxk = new bxve(f146916d);
                        f146917e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
