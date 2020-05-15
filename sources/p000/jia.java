package p000;

/* renamed from: jia */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jia extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final jia f22529d;

    /* renamed from: f */
    private static volatile bxxk f22530f;

    /* renamed from: a */
    public int f22531a;

    /* renamed from: b */
    public bxwc f22532b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f22533c = bxxn.f165040b;

    /* renamed from: e */
    private int f22534e;

    static {
        jia jia = new jia();
        f22529d = jia;
        GeneratedMessageLite.m124024a(jia.class, jia);
    }

    private jia() {
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
            return GeneratedMessageLite.m124022a(f22529d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0002\u0000\u0001ဌ\u0000\u0002\u001b\u0004\u001b", new Object[]{"e", "a", jhy.f22526a, "b", jht.class, "c", jhx.class});
        } else if (i2 == 3) {
            return new jia();
        } else {
            if (i2 == 4) {
                return new bxvd(f22529d);
            }
            if (i2 == 5) {
                return f22529d;
            }
            bxxk bxxk = f22530f;
            if (bxxk == null) {
                synchronized (jia.class) {
                    bxxk = f22530f;
                    if (bxxk == null) {
                        bxxk = new bxve(f22529d);
                        f22530f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
