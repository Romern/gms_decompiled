package p000;

/* renamed from: abtv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abtv extends bxvk implements bxxd {

    /* renamed from: i */
    public static final abtv f58318i;

    /* renamed from: j */
    private static volatile bxxk f58319j;

    /* renamed from: a */
    public int f58320a;

    /* renamed from: b */
    public int f58321b;

    /* renamed from: c */
    public int f58322c;

    /* renamed from: d */
    public boolean f58323d;

    /* renamed from: e */
    public boolean f58324e;

    /* renamed from: f */
    public boolean f58325f;

    /* renamed from: g */
    public int f58326g;

    /* renamed from: h */
    public boolean f58327h;

    static {
        abtv abtv = new abtv();
        f58318i = abtv;
        bxvk.m124024a(abtv.class, abtv);
    }

    private abtv() {
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
            return bxvk.m124022a(f58318i, "\u0001\u0007\u0000\u0001\u0001\u001a\u0007\u0000\u0000\u0000\u0001င\u0000\tင\u0001\nဇ\u0002\u0011ဇ\u0003\u0018ဇ\u0005\u0019ဋ\u0006\u001aဇ\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new abtv();
        } else {
            if (i2 == 4) {
                return new bxvd(f58318i);
            }
            if (i2 == 5) {
                return f58318i;
            }
            bxxk bxxk = f58319j;
            if (bxxk == null) {
                synchronized (abtv.class) {
                    bxxk = f58319j;
                    if (bxxk == null) {
                        bxxk = new bxve(f58318i);
                        f58319j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
