package p000;

/* renamed from: bpct */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpct extends bxvk implements bxxd {

    /* renamed from: i */
    public static final bpct f135850i;

    /* renamed from: j */
    private static volatile bxxk f135851j;

    /* renamed from: a */
    public int f135852a;

    /* renamed from: b */
    public boolean f135853b;

    /* renamed from: c */
    public boolean f135854c;

    /* renamed from: d */
    public int f135855d;

    /* renamed from: e */
    public boolean f135856e;

    /* renamed from: f */
    public boolean f135857f;

    /* renamed from: g */
    public boolean f135858g;

    /* renamed from: h */
    public boolean f135859h;

    static {
        bpct bpct = new bpct();
        f135850i = bpct;
        bxvk.m124024a(bpct.class, bpct);
    }

    private bpct() {
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
            return bxvk.m124022a(f135850i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003င\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new bpct();
        } else {
            if (i2 == 4) {
                return new bxvd(f135850i);
            }
            if (i2 == 5) {
                return f135850i;
            }
            bxxk bxxk = f135851j;
            if (bxxk == null) {
                synchronized (bpct.class) {
                    bxxk = f135851j;
                    if (bxxk == null) {
                        bxxk = new bxve(f135850i);
                        f135851j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
