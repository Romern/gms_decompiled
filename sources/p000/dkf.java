package p000;

/* renamed from: dkf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dkf extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final dkf f13397i;

    /* renamed from: j */
    private static volatile bxxk f13398j;

    /* renamed from: a */
    public int f13399a;

    /* renamed from: b */
    public String f13400b = "";

    /* renamed from: c */
    public String f13401c = "";

    /* renamed from: d */
    public int f13402d;

    /* renamed from: e */
    public boolean f13403e;

    /* renamed from: f */
    public int f13404f;

    /* renamed from: g */
    public String f13405g = "";

    /* renamed from: h */
    public String f13406h = "";

    static {
        dkf dkf = new dkf();
        f13397i = dkf;
        GeneratedMessageLite.m124024a(dkf.class, dkf);
    }

    private dkf() {
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
            return GeneratedMessageLite.m124022a(f13397i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဇ\u0003\u0005င\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new dkf();
        } else {
            if (i2 == 4) {
                return new bxvd(f13397i);
            }
            if (i2 == 5) {
                return f13397i;
            }
            bxxk bxxk = f13398j;
            if (bxxk == null) {
                synchronized (dkf.class) {
                    bxxk = f13398j;
                    if (bxxk == null) {
                        bxxk = new bxve(f13397i);
                        f13398j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
