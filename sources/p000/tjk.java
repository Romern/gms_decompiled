package p000;

/* renamed from: tjk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tjk extends bxvk implements bxxd {

    /* renamed from: i */
    public static final tjk f46190i;

    /* renamed from: j */
    private static volatile bxxk f46191j;

    /* renamed from: a */
    public int f46192a;

    /* renamed from: b */
    public bxhe f46193b;

    /* renamed from: c */
    public bxic f46194c;

    /* renamed from: d */
    public bxgc f46195d;

    /* renamed from: e */
    public bxhn f46196e;

    /* renamed from: f */
    public bxip f46197f;

    /* renamed from: g */
    public bxin f46198g;

    /* renamed from: h */
    public bxlr f46199h;

    static {
        tjk tjk = new tjk();
        f46190i = tjk;
        bxvk.m124024a(tjk.class, tjk);
    }

    private tjk() {
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
            return bxvk.m124022a(f46190i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new tjk();
        } else {
            if (i2 == 4) {
                return new bxvd(f46190i);
            }
            if (i2 == 5) {
                return f46190i;
            }
            bxxk bxxk = f46191j;
            if (bxxk == null) {
                synchronized (tjk.class) {
                    bxxk = f46191j;
                    if (bxxk == null) {
                        bxxk = new bxve(f46190i);
                        f46191j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
