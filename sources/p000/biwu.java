package p000;

/* renamed from: biwu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biwu extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final biwu f122129b;

    /* renamed from: d */
    private static volatile bxxk f122130d;

    /* renamed from: a */
    public String f122131a = "";

    /* renamed from: c */
    private int f122132c;

    static {
        biwu biwu = new biwu();
        f122129b = biwu;
        GeneratedMessageLite.m124024a(biwu.class, biwu);
    }

    private biwu() {
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
            return GeneratedMessageLite.m124022a(f122129b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new biwu();
        } else {
            if (i2 == 4) {
                return new bxvd(f122129b);
            }
            if (i2 == 5) {
                return f122129b;
            }
            bxxk bxxk = f122130d;
            if (bxxk == null) {
                synchronized (biwu.class) {
                    bxxk = f122130d;
                    if (bxxk == null) {
                        bxxk = new bxve(f122129b);
                        f122130d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
