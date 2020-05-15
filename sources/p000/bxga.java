package p000;

/* renamed from: bxga */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxga extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bxga f163216d;

    /* renamed from: e */
    private static volatile bxxk f163217e;

    /* renamed from: a */
    public int f163218a;

    /* renamed from: b */
    public bxwc f163219b = bxxn.f165040b;

    /* renamed from: c */
    public long f163220c;

    static {
        bxga bxga = new bxga();
        f163216d = bxga;
        GeneratedMessageLite.m124024a(bxga.class, bxga);
    }

    private bxga() {
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
            return GeneratedMessageLite.m124022a(f163216d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဂ\u0000", new Object[]{"a", "b", bxhp.class, "c"});
        } else if (i2 == 3) {
            return new bxga();
        } else {
            if (i2 == 4) {
                return new bxfz();
            }
            if (i2 == 5) {
                return f163216d;
            }
            bxxk bxxk = f163217e;
            if (bxxk == null) {
                synchronized (bxga.class) {
                    bxxk = f163217e;
                    if (bxxk == null) {
                        bxxk = new bxve(f163216d);
                        f163217e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
