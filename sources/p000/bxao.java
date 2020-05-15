package p000;

/* renamed from: bxao */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxao extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bxao f161729a;

    /* renamed from: b */
    public static final bxvj f161730b;

    /* renamed from: c */
    private static volatile bxxk f161731c;

    static {
        bxao bxao = new bxao();
        f161729a = bxao;
        bxvk.m124024a(bxao.class, bxao);
        bwny bwny = bwny.f160414k;
        bxao bxao2 = f161729a;
        f161730b = bxvk.m124006a(bwny, bxao2, bxao2, 220794719, bxzf.MESSAGE);
    }

    private bxao() {
        bxwq bxwq = bxwq.f165002b;
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
            return bxvk.m124022a(f161729a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bxao();
        }
        if (i2 == 4) {
            return new bxvd(f161729a);
        }
        if (i2 == 5) {
            return f161729a;
        }
        bxxk bxxk = f161731c;
        if (bxxk == null) {
            synchronized (bxao.class) {
                bxxk = f161731c;
                if (bxxk == null) {
                    bxxk = new bxve(f161729a);
                    f161731c = bxxk;
                }
            }
        }
        return bxxk;
    }
}
