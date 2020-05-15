package p000;

/* renamed from: boed */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boed extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final boed f132781i;

    /* renamed from: j */
    private static volatile bxxk f132782j;

    /* renamed from: a */
    public int f132783a;

    /* renamed from: b */
    public int f132784b;

    /* renamed from: c */
    public String f132785c = "";

    /* renamed from: d */
    public int f132786d;

    /* renamed from: e */
    public boei f132787e;

    /* renamed from: f */
    public int f132788f;

    /* renamed from: g */
    public int f132789g;

    /* renamed from: h */
    public boolean f132790h;

    static {
        boed boed = new boed();
        f132781i = boed;
        GeneratedMessageLite.m124024a(boed.class, boed);
    }

    private boed() {
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
            return GeneratedMessageLite.m124022a(f132781i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006င\u0005\u0007ဇ\u0006", new Object[]{"a", "b", boec.f132780a, "c", "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new boed();
        } else {
            if (i2 == 4) {
                return new bxvd(f132781i);
            }
            if (i2 == 5) {
                return f132781i;
            }
            bxxk bxxk = f132782j;
            if (bxxk == null) {
                synchronized (boed.class) {
                    bxxk = f132782j;
                    if (bxxk == null) {
                        bxxk = new bxve(f132781i);
                        f132782j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
