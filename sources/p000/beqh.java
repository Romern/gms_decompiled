package p000;

/* renamed from: beqh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beqh {

    /* renamed from: a */
    public static final beqh f112039a = new beqh("???", '?', false);

    /* renamed from: e */
    private static final beqh f112040e = new beqh("AUD", '$', true);

    /* renamed from: f */
    private static final beqh f112041f = new beqh("CAD", '$', true);

    /* renamed from: g */
    private static final beqh f112042g = new beqh("EUR", 8364, true);

    /* renamed from: h */
    private static final beqh f112043h = new beqh("GBP", 163, true);

    /* renamed from: i */
    private static final beqh f112044i = new beqh("USD", '$', true);

    /* renamed from: j */
    private static final beqh f112045j = new beqh("INR", 8377, true);

    /* renamed from: b */
    public final String f112046b;

    /* renamed from: c */
    public final char f112047c;

    /* renamed from: d */
    public final boolean f112048d;

    private beqh(String str, char c, boolean z) {
        this.f112046b = str;
        this.f112047c = c;
        this.f112048d = z;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static beqh m95434a(String str) {
        char c;
        switch (str.hashCode()) {
            case 65168:
                if (str.equals("AUD")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 66470:
                if (str.equals("CAD")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 69026:
                if (str.equals("EUR")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 70357:
                if (str.equals("GBP")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 72653:
                if (str.equals("INR")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 84326:
                if (str.equals("USD")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        return c != 0 ? c != 1 ? c != 2 ? c != 3 ? c != 4 ? c != 5 ? f112039a : f112045j : f112044i : f112043h : f112042g : f112041f : f112040e;
    }
}
