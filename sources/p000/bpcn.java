package p000;

/* renamed from: bpcn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpcn extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final bpcn f135799h;

    /* renamed from: i */
    private static volatile bxxk f135800i;

    /* renamed from: a */
    public int f135801a;

    /* renamed from: b */
    public String f135802b = "";

    /* renamed from: c */
    public int f135803c;

    /* renamed from: d */
    public String f135804d = "";

    /* renamed from: e */
    public int f135805e;

    /* renamed from: f */
    public int f135806f;

    /* renamed from: g */
    public bxwc f135807g = bxxn.f165040b;

    static {
        bpcn bpcn = new bpcn();
        f135799h = bpcn;
        GeneratedMessageLite.m124024a(bpcn.class, bpcn);
    }

    private bpcn() {
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
            return GeneratedMessageLite.m124022a(f135799h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဋ\u0003\u0005င\u0004\u0006\u001b", new Object[]{"a", "b", "c", "d", "e", "f", "g", bpco.class});
        } else if (i2 == 3) {
            return new bpcn();
        } else {
            if (i2 == 4) {
                return new bxvd((int[]) null, (short[]) null);
            }
            if (i2 == 5) {
                return f135799h;
            }
            bxxk bxxk = f135800i;
            if (bxxk == null) {
                synchronized (bpcn.class) {
                    bxxk = f135800i;
                    if (bxxk == null) {
                        bxxk = new bxve(f135799h);
                        f135800i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
