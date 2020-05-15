package p000;

/* renamed from: bwab */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwab extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bwab f158605a;

    /* renamed from: d */
    private static volatile bxxk f158606d;

    /* renamed from: b */
    private bpwm f158607b;

    /* renamed from: c */
    private byte f158608c = 2;

    static {
        bwab bwab = new bwab();
        f158605a = bwab;
        GeneratedMessageLite.m124024a(bwab.class, bwab);
    }

    private bwab() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f158608c);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f158608c = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f158605a, "\u0000\u0001\u0000\u0000\u0004\u0004\u0001\u0000\u0000\u0001\u0004Љ", new Object[]{"b"});
        } else if (i2 == 3) {
            return new bwab();
        } else {
            if (i2 == 4) {
                return new bxvd(f158605a);
            }
            if (i2 == 5) {
                return f158605a;
            }
            bxxk bxxk = f158606d;
            if (bxxk == null) {
                synchronized (bwab.class) {
                    bxxk = f158606d;
                    if (bxxk == null) {
                        bxxk = new bxve(f158605a);
                        f158606d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
