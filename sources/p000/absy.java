package p000;

/* renamed from: absy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class absy extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final absy f58176h;

    /* renamed from: i */
    private static volatile bxxk f58177i;

    /* renamed from: a */
    public int f58178a;

    /* renamed from: b */
    public bxwc f58179b = bxxn.f165040b;

    /* renamed from: c */
    public int f58180c;

    /* renamed from: d */
    public boolean f58181d;

    /* renamed from: e */
    public int f58182e;

    /* renamed from: f */
    public absv f58183f;

    /* renamed from: g */
    public String f58184g = "";

    static {
        absy absy = new absy();
        f58176h = absy;
        GeneratedMessageLite.m124024a(absy.class, absy);
    }

    private absy() {
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
            return GeneratedMessageLite.m124022a(f58176h, "\u0001\u0006\u0000\u0001\u0003\b\u0006\u0000\u0001\u0000\u0003\u001b\u0004ဌ\u0002\u0005ဇ\u0003\u0006င\u0004\u0007ဉ\u0005\bဈ\u0006", new Object[]{"a", "b", absu.class, "c", absw.f58175a, "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new absy();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][][]) null, (boolean[][][]) null);
            }
            if (i2 == 5) {
                return f58176h;
            }
            bxxk bxxk = f58177i;
            if (bxxk == null) {
                synchronized (absy.class) {
                    bxxk = f58177i;
                    if (bxxk == null) {
                        bxxk = new bxve(f58176h);
                        f58177i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
