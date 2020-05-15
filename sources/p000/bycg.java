package p000;

/* renamed from: bycg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bycg extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bycg f165641e;

    /* renamed from: f */
    private static volatile bxxk f165642f;

    /* renamed from: a */
    public int f165643a;

    /* renamed from: b */
    public int f165644b;

    /* renamed from: c */
    public String f165645c = "";

    /* renamed from: d */
    public bycf f165646d;

    static {
        bycg bycg = new bycg();
        f165641e = bycg;
        GeneratedMessageLite.m124024a(bycg.class, bycg);
    }

    private bycg() {
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
            return GeneratedMessageLite.m124022a(f165641e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", bycd.f165636a, "c", "d"});
        } else if (i2 == 3) {
            return new bycg();
        } else {
            if (i2 == 4) {
                return new bxvd(f165641e);
            }
            if (i2 == 5) {
                return f165641e;
            }
            bxxk bxxk = f165642f;
            if (bxxk == null) {
                synchronized (bycg.class) {
                    bxxk = f165642f;
                    if (bxxk == null) {
                        bxxk = new bxve(f165641e);
                        f165642f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
