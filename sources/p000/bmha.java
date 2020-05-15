package p000;

/* renamed from: bmha */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmha extends bxvk implements bxxd {

    /* renamed from: k */
    public static final bmha f129377k;

    /* renamed from: l */
    private static volatile bxxk f129378l;

    /* renamed from: a */
    public int f129379a;

    /* renamed from: b */
    public bmdn f129380b;

    /* renamed from: c */
    public bxwc f129381c = bxxn.f165040b;

    /* renamed from: d */
    public bxwc f129382d = bxxn.f165040b;

    /* renamed from: e */
    public bmno f129383e;

    /* renamed from: f */
    public bmno f129384f;

    /* renamed from: g */
    public bmjf f129385g;

    /* renamed from: h */
    public bmnr f129386h;

    /* renamed from: i */
    public bxwc f129387i = bxxn.f165040b;

    /* renamed from: j */
    public long f129388j;

    static {
        bmha bmha = new bmha();
        f129377k = bmha;
        bxvk.m124024a(bmha.class, bmha);
    }

    private bmha() {
        bxvm bxvm = bxvm.f164965b;
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
            return bxvk.m124022a(f129377k, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0003\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဉ\u0001\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဂ\u0005\u0007ဉ\u0002\t\u001b\n\u001b", new Object[]{"a", "b", "d", bmqf.class, "e", "g", "h", "j", "f", "i", bmdb.class, "c", bmno.class});
        } else if (i2 == 3) {
            return new bmha();
        } else {
            if (i2 == 4) {
                return new bxvd(f129377k);
            }
            if (i2 == 5) {
                return f129377k;
            }
            bxxk bxxk = f129378l;
            if (bxxk == null) {
                synchronized (bmha.class) {
                    bxxk = f129378l;
                    if (bxxk == null) {
                        bxxk = new bxve(f129377k);
                        f129378l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
