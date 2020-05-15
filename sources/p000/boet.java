package p000;

/* renamed from: boet */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boet extends bxvk implements bxxd {

    /* renamed from: q */
    public static final boet f132836q;

    /* renamed from: r */
    private static volatile bxxk f132837r;

    /* renamed from: a */
    public int f132838a;

    /* renamed from: b */
    public long f132839b;

    /* renamed from: c */
    public boolean f132840c;

    /* renamed from: d */
    public boolean f132841d;

    /* renamed from: e */
    public boolean f132842e;

    /* renamed from: f */
    public boolean f132843f;

    /* renamed from: g */
    public bogg f132844g;

    /* renamed from: h */
    public long f132845h;

    /* renamed from: i */
    public long f132846i;

    /* renamed from: j */
    public long f132847j;

    /* renamed from: k */
    public long f132848k;

    /* renamed from: l */
    public String f132849l = "";

    /* renamed from: m */
    public bxwc f132850m = bxxn.f165040b;

    /* renamed from: n */
    public bxwc f132851n = bxxn.f165040b;

    /* renamed from: o */
    public boolean f132852o;

    /* renamed from: p */
    public boev f132853p;

    static {
        boet boet = new boet();
        f132836q = boet;
        bxvk.m124024a(boet.class, boet);
    }

    private boet() {
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
            return bxvk.m124022a(f132836q, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0002\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဉ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဈ\n\f\u001a\r\u001a\u000eဇ\u000b\u000fဉ\f", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p"});
        } else if (i2 == 3) {
            return new boet();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][][]) null, (boolean[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f132836q;
            }
            bxxk bxxk = f132837r;
            if (bxxk == null) {
                synchronized (boet.class) {
                    bxxk = f132837r;
                    if (bxxk == null) {
                        bxxk = new bxve(f132836q);
                        f132837r = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
