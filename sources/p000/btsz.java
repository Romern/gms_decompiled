package p000;

/* renamed from: btsz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btsz extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final btsz f150308i;

    /* renamed from: j */
    private static volatile bxxk f150309j;

    /* renamed from: a */
    public int f150310a;

    /* renamed from: b */
    public btsb f150311b;

    /* renamed from: c */
    public btrw f150312c;

    /* renamed from: d */
    public String f150313d = "";

    /* renamed from: e */
    public String f150314e = "";

    /* renamed from: f */
    public btsi f150315f;

    /* renamed from: g */
    public int f150316g;

    /* renamed from: h */
    public btrt f150317h;

    static {
        btsz btsz = new btsz();
        f150308i = btsz;
        GeneratedMessageLite.m124024a(btsz.class, btsz);
    }

    private btsz() {
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
            return GeneratedMessageLite.m124022a(f150308i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဉ\u0004\u0007ဌ\u0006\bဉ\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", btta.f150318a, "h"});
        } else if (i2 == 3) {
            return new btsz();
        } else {
            if (i2 == 4) {
                return new bxvd(f150308i);
            }
            if (i2 == 5) {
                return f150308i;
            }
            bxxk bxxk = f150309j;
            if (bxxk == null) {
                synchronized (btsz.class) {
                    bxxk = f150309j;
                    if (bxxk == null) {
                        bxxk = new bxve(f150308i);
                        f150309j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
