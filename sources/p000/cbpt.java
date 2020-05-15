package p000;

/* renamed from: cbpt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbpt extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final cbpt f177955c;

    /* renamed from: d */
    private static volatile bxxk f177956d;

    /* renamed from: a */
    public int f177957a = 0;

    /* renamed from: b */
    public Object f177958b;

    static {
        cbpt cbpt = new cbpt();
        f177955c = cbpt;
        GeneratedMessageLite.m124024a(cbpt.class, cbpt);
    }

    private cbpt() {
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
            return GeneratedMessageLite.m124022a(f177955c, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"b", "a", cbpd.class});
        } else if (i2 == 3) {
            return new cbpt();
        } else {
            if (i2 == 4) {
                return new bxvd(f177955c);
            }
            if (i2 == 5) {
                return f177955c;
            }
            bxxk bxxk = f177956d;
            if (bxxk == null) {
                synchronized (cbpt.class) {
                    bxxk = f177956d;
                    if (bxxk == null) {
                        bxxk = new bxve(f177955c);
                        f177956d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
