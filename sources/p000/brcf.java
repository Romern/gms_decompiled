package p000;

/* renamed from: brcf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brcf extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bxvu f142355f = new brce();

    /* renamed from: i */
    public static final brcf f142356i;

    /* renamed from: j */
    private static volatile bxxk f142357j;

    /* renamed from: a */
    public int f142358a;

    /* renamed from: b */
    public brao f142359b;

    /* renamed from: c */
    public brdu f142360c;

    /* renamed from: d */
    public brcn f142361d;

    /* renamed from: e */
    public bxvt f142362e = bxvm.f164965b;

    /* renamed from: g */
    public bxwc f142363g = bxxn.f165040b;

    /* renamed from: h */
    public brdl f142364h;

    static {
        brcf brcf = new brcf();
        f142356i = brcf;
        GeneratedMessageLite.m124024a(brcf.class, brcf);
    }

    private brcf() {
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
            return GeneratedMessageLite.m124022a(f142356i, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u001e\u0005\u001b\u0006ဉ\u0003", new Object[]{"a", "b", "c", "d", "e", brcm.m113876b(), "g", bree.class, "h"});
        } else if (i2 == 3) {
            return new brcf();
        } else {
            if (i2 == 4) {
                return new bxvd(f142356i);
            }
            if (i2 == 5) {
                return f142356i;
            }
            bxxk bxxk = f142357j;
            if (bxxk == null) {
                synchronized (brcf.class) {
                    bxxk = f142357j;
                    if (bxxk == null) {
                        bxxk = new bxve(f142356i);
                        f142357j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
