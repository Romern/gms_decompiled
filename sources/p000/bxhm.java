package p000;

/* renamed from: bxhm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxhm extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final bxhm f163422i;

    /* renamed from: j */
    private static volatile bxxk f163423j;

    /* renamed from: a */
    public int f163424a;

    /* renamed from: b */
    public String f163425b = "";

    /* renamed from: c */
    public String f163426c = "";

    /* renamed from: d */
    public int f163427d;

    /* renamed from: e */
    public int f163428e;

    /* renamed from: f */
    public int f163429f;

    /* renamed from: g */
    public String f163430g = "";

    /* renamed from: h */
    public String f163431h = "";

    static {
        bxhm bxhm = new bxhm();
        f163422i = bxhm;
        GeneratedMessageLite.m124024a(bxhm.class, bxhm);
    }

    private bxhm() {
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
            return GeneratedMessageLite.m124022a(f163422i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004င\u0003\u0005င\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"a", "b", "c", "d", bxfx.f163210a, "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new bxhm();
        } else {
            if (i2 == 4) {
                return new bxvd(f163422i);
            }
            if (i2 == 5) {
                return f163422i;
            }
            bxxk bxxk = f163423j;
            if (bxxk == null) {
                synchronized (bxhm.class) {
                    bxxk = f163423j;
                    if (bxxk == null) {
                        bxxk = new bxve(f163422i);
                        f163423j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
