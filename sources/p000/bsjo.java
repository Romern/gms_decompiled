package p000;

/* renamed from: bsjo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsjo extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bsjo f144827c;

    /* renamed from: d */
    private static volatile bxxk f144828d;

    /* renamed from: a */
    public String f144829a = "";

    /* renamed from: b */
    public String f144830b = "";

    static {
        bsjo bsjo = new bsjo();
        f144827c = bsjo;
        bxvk.m124024a(bsjo.class, bsjo);
    }

    private bsjo() {
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
            return bxvk.m124022a(f144827c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bsjo();
        } else {
            if (i2 == 4) {
                return new bxvd(f144827c);
            }
            if (i2 == 5) {
                return f144827c;
            }
            bxxk bxxk = f144828d;
            if (bxxk == null) {
                synchronized (bsjo.class) {
                    bxxk = f144828d;
                    if (bxxk == null) {
                        bxxk = new bxve(f144827c);
                        f144828d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
