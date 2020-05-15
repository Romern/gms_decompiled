package p000;

/* renamed from: atyk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atyk extends bxvk implements bxxd {

    /* renamed from: c */
    public static final atyk f91112c;

    /* renamed from: d */
    private static volatile bxxk f91113d;

    /* renamed from: a */
    public String f91114a = "";

    /* renamed from: b */
    public String f91115b = "";

    static {
        atyk atyk = new atyk();
        f91112c = atyk;
        bxvk.m124024a(atyk.class, atyk);
    }

    private atyk() {
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
            return bxvk.m124022a(f91112c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new atyk();
        } else {
            if (i2 == 4) {
                return new bxvd(f91112c);
            }
            if (i2 == 5) {
                return f91112c;
            }
            bxxk bxxk = f91113d;
            if (bxxk == null) {
                synchronized (atyk.class) {
                    bxxk = f91113d;
                    if (bxxk == null) {
                        bxxk = new bxve(f91112c);
                        f91113d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
