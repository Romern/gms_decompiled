package p000;

/* renamed from: bwhg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwhg extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bwhg f159506d;

    /* renamed from: e */
    private static volatile bxxk f159507e;

    /* renamed from: a */
    public int f159508a;

    /* renamed from: b */
    public bmaj f159509b;

    /* renamed from: c */
    public bwhf f159510c;

    static {
        bwhg bwhg = new bwhg();
        f159506d = bwhg;
        GeneratedMessageLite.m124024a(bwhg.class, bwhg);
    }

    private bwhg() {
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
            return GeneratedMessageLite.m124022a(f159506d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bwhg();
        } else {
            if (i2 == 4) {
                return new bxvd(f159506d);
            }
            if (i2 == 5) {
                return f159506d;
            }
            bxxk bxxk = f159507e;
            if (bxxk == null) {
                synchronized (bwhg.class) {
                    bxxk = f159507e;
                    if (bxxk == null) {
                        bxxk = new bxve(f159506d);
                        f159507e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
