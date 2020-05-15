package p000;

/* renamed from: obb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class obb extends obg {

    /* renamed from: a */
    private static obe f37117a;

    /* renamed from: b */
    private static obe f37118b;

    private obb(oer oer) {
        super(oer);
    }

    /* renamed from: a */
    public static obe m28335a(oer oer) {
        oer oer2 = oer.UNKNOWN;
        int ordinal = oer.ordinal();
        if (ordinal == 3) {
            if (f37118b == null) {
                f37118b = new obb(oer.AUDIO_SINK_GUIDANCE);
            }
            return f37118b;
        } else if (ordinal != 5) {
            String valueOf = String.valueOf(oer.name());
            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Invalid service type: ") : "Invalid service type: ".concat(valueOf));
        } else {
            if (f37117a == null) {
                f37117a = new obb(oer.AUDIO_SINK_MEDIA);
            }
            return f37117a;
        }
    }
}
