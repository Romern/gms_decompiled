package p000;

/* renamed from: blfa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blfa extends bxvk implements bxxd {

    /* renamed from: h */
    public static final blfa f126316h;

    /* renamed from: i */
    private static volatile bxxk f126317i;

    /* renamed from: a */
    public int f126318a;

    /* renamed from: b */
    public String f126319b = "";

    /* renamed from: c */
    public long f126320c;

    /* renamed from: d */
    public String f126321d = "";

    /* renamed from: e */
    public String f126322e = "";

    /* renamed from: f */
    public long f126323f;

    /* renamed from: g */
    public bldq f126324g;

    static {
        blfa blfa = new blfa();
        f126316h = blfa;
        bxvk.m124024a(blfa.class, blfa);
    }

    private blfa() {
        bxxn bxxn = bxxn.f165040b;
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
            return bxvk.m124022a(f126316h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0000\u0004ဂ\u0001\u0005ဂ\u0004\u0007ဉ\u0006", new Object[]{"a", "d", "e", "b", "c", "f", "g"});
        } else if (i2 == 3) {
            return new blfa();
        } else {
            if (i2 == 4) {
                return new bxvd(f126316h);
            }
            if (i2 == 5) {
                return f126316h;
            }
            bxxk bxxk = f126317i;
            if (bxxk == null) {
                synchronized (blfa.class) {
                    bxxk = f126317i;
                    if (bxxk == null) {
                        bxxk = new bxve(f126316h);
                        f126317i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
