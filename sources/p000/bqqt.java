package p000;

/* renamed from: bqqt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqqt extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bqqt f141382c;

    /* renamed from: d */
    private static volatile bxxk f141383d;

    /* renamed from: a */
    public int f141384a;

    /* renamed from: b */
    public bqqu f141385b;

    static {
        bqqt bqqt = new bqqt();
        f141382c = bqqt;
        GeneratedMessageLite.m124024a(bqqt.class, bqqt);
    }

    private bqqt() {
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
            return GeneratedMessageLite.m124022a(f141382c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bqqt();
        } else {
            if (i2 == 4) {
                return new bxvd(f141382c);
            }
            if (i2 == 5) {
                return f141382c;
            }
            bxxk bxxk = f141383d;
            if (bxxk == null) {
                synchronized (bqqt.class) {
                    bxxk = f141383d;
                    if (bxxk == null) {
                        bxxk = new bxve(f141382c);
                        f141383d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
