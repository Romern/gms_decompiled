package p000;

/* renamed from: nm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1220nm {

    /* renamed from: a */
    public static final C1213nf f26744a = new C1218nk(null, false);

    /* renamed from: b */
    public static final C1213nf f26745b = new C1218nk(null, true);

    /* renamed from: c */
    public static final C1213nf f26746c = new C1218nk(C1215nh.f26740a, false);

    /* renamed from: d */
    public static final C1213nf f26747d = new C1218nk(C1215nh.f26740a, true);

    static {
        new C1218nk(C1214ng.f26739a, false);
        int i = C1219nl.f26743a;
    }

    /* renamed from: a */
    static int m19676a(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    /* renamed from: b */
    static int m19677b(int i) {
        if (i != 0) {
            if (i == 1 || i == 2) {
                return 0;
            }
            switch (i) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
