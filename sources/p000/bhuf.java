package p000;

/* renamed from: bhuf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhuf {

    /* renamed from: a */
    public static final String f119619a = m101541a("otg-l", "signal_source_");

    /* renamed from: b */
    public static final String f119620b = m101541a("otg-l", "gps_speed");

    /* renamed from: c */
    public static final String f119621c = m101541a("otg-l", "gps_speed_zero");

    /* renamed from: d */
    public static final String f119622d = m101541a("otg-l", "previous_absent");

    /* renamed from: e */
    public static final String f119623e = m101541a("otg-l", "position_delta");

    /* renamed from: f */
    public static final String f119624f = m101541a("otg-l", "time_delta");

    /* renamed from: g */
    public static final String f119625g = m101541a("otg-l", "speed");

    /* renamed from: h */
    public static final String f119626h = m101541a("otg-w", "num_ssid");

    /* renamed from: i */
    public static final String f119627i = m101541a("otg-w", "strength");

    /* renamed from: j */
    public static final String f119628j = m101541a("otg-w", "mean_strength");

    /* renamed from: k */
    public static final String f119629k = m101541a("otg-w", "is_connected");

    /* renamed from: l */
    public static final String f119630l = m101541a("otg-w", "strength_std");

    /* renamed from: m */
    public static final String f119631m = m101541a("otg-a", "type_");

    /* renamed from: n */
    public static final String f119632n = m101541a("otg-a", "weighted_speed");

    /* renamed from: o */
    public static final String f119633o = m101541a("otg-a", "weighted_speed_zero");

    /* renamed from: p */
    public static final String f119634p = m101541a("otg-a", "absent");

    /* renamed from: q */
    public static final String f119635q = m101541a("otg-a", "walking_with_high_probability");

    static {
        m101541a("otg-l", "absent");
        m101541a("otg-w", "absent");
    }

    /* renamed from: a */
    private static String m101541a(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 1 + str2.length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }
}
