package p000;

/* renamed from: bxvl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxvl extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bxvl f164962b;

    /* renamed from: c */
    private static volatile bxxk f164963c;

    /* renamed from: a */
    public int f164964a;

    static {
        bxvl bxvl = new bxvl();
        f164962b = bxvl;
        GeneratedMessageLite.m124024a(bxvl.class, bxvl);
    }

    private bxvl() {
    }

    /* renamed from: a */
    public static bxvl m124044a(int i) {
        bxvd da = f164962b.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((bxvl) da.f164949b).f164964a = i;
        return (bxvl) da.mo74062i();
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
            return GeneratedMessageLite.m124022a(f164962b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bxvl();
        } else {
            if (i2 == 4) {
                return new bxvd(f164962b);
            }
            if (i2 == 5) {
                return f164962b;
            }
            bxxk bxxk = f164963c;
            if (bxxk == null) {
                synchronized (bxvl.class) {
                    bxxk = f164963c;
                    if (bxxk == null) {
                        bxxk = new bxve(f164962b);
                        f164963c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
