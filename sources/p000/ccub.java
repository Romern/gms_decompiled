package p000;

/* renamed from: ccub */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccub implements ccua {

    /* renamed from: a */
    public static final bdyx f179923a;

    /* renamed from: b */
    public static final bdyx f179924b;

    /* renamed from: c */
    public static final bdyx f179925c;

    /* renamed from: d */
    public static final bdyx f179926d;

    /* renamed from: e */
    public static final bdyx f179927e;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bdyx.a(bdyw, java.lang.String, boolean):bdyx
     arg types: [bdyw, java.lang.String, int]
     candidates:
      bdyx.a(bdyw, java.lang.String, double):bdyx
      bdyx.a(bdyw, java.lang.String, int):bdyx
      bdyx.a(bdyw, java.lang.String, long):bdyx
      bdyx.a(bdyw, java.lang.String, java.lang.String):bdyx
      bdyx.a(bdyw, java.lang.String, byte[]):bdyx
      bdyx.a(bdyw, java.lang.String, boolean):bdyx */
    static {
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.car"));
        f179923a = bdyx.m91610a(bdyw, "HDProjection__car_video_allow_1080p_over_24GHz_wifi", false);
        f179924b = bdyx.m91610a(bdyw, "car_video_allow_1080p_over_wifi", true);
        f179925c = bdyx.m91610a(bdyw, "car_video_allow_720p_over_wifi", true);
        f179926d = bdyx.m91609a(bdyw, "HDProjection__car_video_deny_1080p_list", "Subaru,,,,HARMAN:GENESIS,,,,LG Electronics,Premium GEN5:HYUNDAI,,,,LG Electronics,Premium GEN5:KIA,,,,LG Electronics,Premium GEN5");
        f179927e = bdyx.m91609a(bdyw, "HDProjection__car_video_deny_720p_list", "Subaru,,,,HARMAN:GENESIS,,,,LG Electronics,Premium GEN5:HYUNDAI,,,,LG Electronics,Premium GEN5:KIA,,,,LG Electronics,Premium GEN5");
    }

    /* renamed from: a */
    public final boolean mo76777a() {
        return ((Boolean) f179923a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo76778b() {
        return ((Boolean) f179924b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo76779c() {
        return ((Boolean) f179925c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final String mo76780d() {
        return (String) f179926d.mo58455c();
    }

    /* renamed from: e */
    public final String mo76781e() {
        return (String) f179927e.mo58455c();
    }
}
