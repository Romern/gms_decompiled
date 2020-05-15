package p000;

/* renamed from: obj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class obj extends obl {

    /* renamed from: c */
    private static obl f37126c;

    /* renamed from: d */
    private static obl f37127d;

    /* renamed from: b */
    private final oer f37128b;

    /* renamed from: a */
    public static obl m28344a(oer oer) {
        oer oer2 = oer.UNKNOWN;
        int ordinal = oer.ordinal();
        if (ordinal == 3) {
            if (f37126c == null) {
                f37126c = new obj(oer.AUDIO_SINK_GUIDANCE);
            }
            return f37126c;
        } else if (ordinal != 5) {
            String valueOf = String.valueOf(oer.name());
            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Invalid service type: ") : "Invalid service type: ".concat(valueOf));
        } else {
            if (f37127d == null) {
                f37127d = new obj(oer.AUDIO_SINK_MEDIA);
            }
            return f37127d;
        }
    }

    private obj(oer oer) {
        this.f37128b = oer;
    }

    /* renamed from: a */
    public final bnic mo21937a(obn obn) {
        bnic a = super.mo21937a(obn);
        oer oer = oer.UNKNOWN;
        int ordinal = this.f37128b.ordinal();
        if (ordinal != 3) {
            if (ordinal == 5 && obn.mo21939b()) {
                return m28349a(a);
            }
        } else if (obn.mo21940c()) {
            return m28349a(a);
        }
        return a;
    }
}
