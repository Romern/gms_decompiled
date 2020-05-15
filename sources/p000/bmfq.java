package p000;

/* renamed from: bmfq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmfq extends bxvk implements bxxd {

    /* renamed from: i */
    public static final bmfq f129141i;

    /* renamed from: k */
    private static volatile bxxk f129142k;

    /* renamed from: a */
    public int f129143a;

    /* renamed from: b */
    public long f129144b;

    /* renamed from: c */
    public bmno f129145c;

    /* renamed from: d */
    public String f129146d = "";

    /* renamed from: e */
    public bxwc f129147e = bxxn.f165040b;

    /* renamed from: f */
    public bmfp f129148f;

    /* renamed from: g */
    public bmfp f129149g;

    /* renamed from: h */
    public bwhn f129150h;

    /* renamed from: j */
    private byte f129151j = 2;

    static {
        bmfq bmfq = new bmfq();
        f129141i = bmfq;
        bxvk.m124024a(bmfq.class, bmfq);
    }

    private bmfq() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f129151j);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f129151j = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f129141i, "\u0001\u0007\u0000\u0001\u0001\f\u0007\u0000\u0001\u0002\u0001ဉ\u0001\u0003ဈ\u0003\u0007ဉ\u0006\bᐉ\u0004\tᐉ\u0005\u000b\u001b\fဂ\u0000", new Object[]{"a", "c", "d", "h", "f", "g", "e", bmnr.class, "b"});
        } else if (i2 == 3) {
            return new bmfq();
        } else {
            if (i2 == 4) {
                return new bxvd(f129141i);
            }
            if (i2 == 5) {
                return f129141i;
            }
            bxxk bxxk = f129142k;
            if (bxxk == null) {
                synchronized (bmfq.class) {
                    bxxk = f129142k;
                    if (bxxk == null) {
                        bxxk = new bxve(f129141i);
                        f129142k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
