package p000;

/* renamed from: bygv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bygv extends bxvk implements bxxd {

    /* renamed from: h */
    public static final bygv f166388h;

    /* renamed from: j */
    private static volatile bxxk f166389j;

    /* renamed from: a */
    public int f166390a = 0;

    /* renamed from: b */
    public Object f166391b;

    /* renamed from: c */
    public bygz f166392c;

    /* renamed from: d */
    public bxwc f166393d = bxxn.f165040b;

    /* renamed from: e */
    public bxwc f166394e = bxxn.f165040b;

    /* renamed from: f */
    public int f166395f = 30;

    /* renamed from: g */
    public boolean f166396g;

    /* renamed from: i */
    private int f166397i;

    static {
        bygv bygv = new bygv();
        f166388h = bygv;
        bxvk.m124024a(bygv.class, bygv);
    }

    private bygv() {
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
            return bxvk.m124022a(f166388h, "\u0001\u0006\u0001\u0001\u0001\b\u0006\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u001a\u0004ြ\u0000\u0005ဋ\u0002\bဇ\u0005", new Object[]{"b", "a", "i", "c", "d", bygq.class, "e", byhs.class, "f", "g"});
        } else if (i2 == 3) {
            return new bygv();
        } else {
            if (i2 == 4) {
                return new bxvd(f166388h);
            }
            if (i2 == 5) {
                return f166388h;
            }
            bxxk bxxk = f166389j;
            if (bxxk == null) {
                synchronized (bygv.class) {
                    bxxk = f166389j;
                    if (bxxk == null) {
                        bxxk = new bxve(f166388h);
                        f166389j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
