package p000;

/* renamed from: cdtm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdtm extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final cdtm f181703b;

    /* renamed from: c */
    private static volatile bxxk f181704c;

    /* renamed from: a */
    public bxwc f181705a = bxxn.f165040b;

    static {
        cdtm cdtm = new cdtm();
        f181703b = cdtm;
        GeneratedMessageLite.m124024a(cdtm.class, cdtm);
    }

    private cdtm() {
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
            return GeneratedMessageLite.m124022a(f181703b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cdtm();
        } else {
            if (i2 == 4) {
                return new bxvd(f181703b);
            }
            if (i2 == 5) {
                return f181703b;
            }
            bxxk bxxk = f181704c;
            if (bxxk == null) {
                synchronized (cdtm.class) {
                    bxxk = f181704c;
                    if (bxxk == null) {
                        bxxk = new bxve(f181703b);
                        f181704c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
