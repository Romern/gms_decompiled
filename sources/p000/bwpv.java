package p000;

/* renamed from: bwpv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwpv extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bwpv f160604b;

    /* renamed from: c */
    public static final bxvj f160605c;

    /* renamed from: e */
    private static volatile bxxk f160606e;

    /* renamed from: a */
    public int f160607a;

    /* renamed from: d */
    private int f160608d;

    static {
        bwpv bwpv = new bwpv();
        f160604b = bwpv;
        GeneratedMessageLite.m124024a(bwpv.class, bwpv);
        bwou bwou = bwou.f160492e;
        bwpv bwpv2 = f160604b;
        f160605c = GeneratedMessageLite.m124006a(bwou, bwpv2, bwpv2, 232057536, bxzf.MESSAGE);
    }

    private bwpv() {
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
            return GeneratedMessageLite.m124022a(f160604b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"d", "a", bwpt.f160603a});
        } else if (i2 == 3) {
            return new bwpv();
        } else {
            if (i2 == 4) {
                return new bxvd(f160604b);
            }
            if (i2 == 5) {
                return f160604b;
            }
            bxxk bxxk = f160606e;
            if (bxxk == null) {
                synchronized (bwpv.class) {
                    bxxk = f160606e;
                    if (bxxk == null) {
                        bxxk = new bxve(f160604b);
                        f160606e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
