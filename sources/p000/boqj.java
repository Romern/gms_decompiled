package p000;

/* renamed from: boqj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boqj extends bxvk implements bxxd {

    /* renamed from: k */
    public static final boqj f134271k;

    /* renamed from: l */
    private static volatile bxxk f134272l;

    /* renamed from: a */
    public int f134273a;

    /* renamed from: b */
    public boolean f134274b;

    /* renamed from: c */
    public int f134275c = -1;

    /* renamed from: d */
    public int f134276d;

    /* renamed from: e */
    public boolean f134277e;

    /* renamed from: f */
    public boolean f134278f;

    /* renamed from: g */
    public String f134279g = "";

    /* renamed from: h */
    public int f134280h;

    /* renamed from: i */
    public bxwc f134281i = bxxn.f165040b;

    /* renamed from: j */
    public bxwc f134282j = bxxn.f165040b;

    static {
        boqj boqj = new boqj();
        f134271k = boqj;
        bxvk.m124024a(boqj.class, boqj);
    }

    private boqj() {
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
            return bxvk.m124022a(f134271k, "\u0001\t\u0000\u0001\u0002\f\t\u0000\u0002\u0000\u0002ဇ\u0001\u0003င\u0002\u0005င\u0004\u0006ဇ\u0005\bဇ\u0007\tဈ\b\nဌ\t\u000b\u001a\f\u001a", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", boqi.f134270a, "i", "j"});
        } else if (i2 == 3) {
            return new boqj();
        } else {
            if (i2 == 4) {
                return new bxvd((float[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f134271k;
            }
            bxxk bxxk = f134272l;
            if (bxxk == null) {
                synchronized (boqj.class) {
                    bxxk = f134272l;
                    if (bxxk == null) {
                        bxxk = new bxve(f134271k);
                        f134272l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
