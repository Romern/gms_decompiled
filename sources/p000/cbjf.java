package p000;

/* renamed from: cbjf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbjf extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final cbjf f177322b;

    /* renamed from: c */
    private static volatile bxxk f177323c;

    /* renamed from: a */
    public String f177324a = "";

    static {
        cbjf cbjf = new cbjf();
        f177322b = cbjf;
        GeneratedMessageLite.m124024a(cbjf.class, cbjf);
    }

    private cbjf() {
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
            return GeneratedMessageLite.m124022a(f177322b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cbjf();
        } else {
            if (i2 == 4) {
                return new bxvd(f177322b);
            }
            if (i2 == 5) {
                return f177322b;
            }
            bxxk bxxk = f177323c;
            if (bxxk == null) {
                synchronized (cbjf.class) {
                    bxxk = f177323c;
                    if (bxxk == null) {
                        bxxk = new bxve(f177322b);
                        f177323c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
