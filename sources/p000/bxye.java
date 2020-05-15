package p000;

/* renamed from: bxye */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxye extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bxye f165087b;

    /* renamed from: c */
    private static volatile bxxk f165088c;

    /* renamed from: a */
    public String f165089a = "";

    static {
        bxye bxye = new bxye();
        f165087b = bxye;
        bxvk.m124024a(bxye.class, bxye);
    }

    private bxye() {
    }

    /* renamed from: a */
    public static bxye m124404a(String str) {
        bxvd da = f165087b.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        str.getClass();
        ((bxye) da.f164949b).f165089a = str;
        return (bxye) da.mo74062i();
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
            return bxvk.m124022a(f165087b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bxye();
        } else {
            if (i2 == 4) {
                return new bxvd(f165087b);
            }
            if (i2 == 5) {
                return f165087b;
            }
            bxxk bxxk = f165088c;
            if (bxxk == null) {
                synchronized (bxye.class) {
                    bxxk = f165088c;
                    if (bxxk == null) {
                        bxxk = new bxve(f165087b);
                        f165088c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
