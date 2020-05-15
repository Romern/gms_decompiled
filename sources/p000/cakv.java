package p000;

/* renamed from: cakv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cakv extends bxvk implements bxxd {

    /* renamed from: g */
    public static final cakv f175064g;

    /* renamed from: h */
    private static volatile bxxk f175065h;

    /* renamed from: a */
    public int f175066a;

    /* renamed from: b */
    public bxwc f175067b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f175068c = bxxn.f165040b;

    /* renamed from: d */
    public bxwc f175069d = bxxn.f165040b;

    /* renamed from: e */
    public long f175070e;

    /* renamed from: f */
    public long f175071f;

    static {
        cakv cakv = new cakv();
        f175064g = cakv;
        bxvk.m124024a(cakv.class, cakv);
    }

    private cakv() {
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
            return bxvk.m124022a(f175064g, "\u0001\u0005\u0000\u0001\u0001\n\u0005\u0000\u0003\u0000\u0001\u001b\u0003ဂ\u0001\u0004ဂ\u0002\t\u001b\n\u001b", new Object[]{"a", "b", caku.class, "e", "f", "c", caku.class, "d", caku.class});
        } else if (i2 == 3) {
            return new cakv();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][][]) null, (char[][]) null);
            }
            if (i2 == 5) {
                return f175064g;
            }
            bxxk bxxk = f175065h;
            if (bxxk == null) {
                synchronized (cakv.class) {
                    bxxk = f175065h;
                    if (bxxk == null) {
                        bxxk = new bxve(f175064g);
                        f175065h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
