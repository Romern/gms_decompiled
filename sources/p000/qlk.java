package p000;

/* renamed from: qlk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qlk {

    /* renamed from: a */
    public static final byte[] f41645a;

    /* renamed from: b */
    public static final bdyx f41646b;

    /* renamed from: c */
    public static final bdyx f41647c = bdyx.m91611a(f41654j, "dev_requested_features", f41645a);

    /* renamed from: d */
    public static final bdyx f41648d = bdyx.m91611a(f41654j, "module_set_list", f41645a);

    /* renamed from: e */
    public static final bdyx f41649e = bdyx.m91610a(f41654j, "enable_checkin_logging", false);

    /* renamed from: f */
    public static final rtc f41650f = rtc.m34378a("gms:chimera:module_packages", "com.google.android.play.games,com.google.android.gms.policy_test_support");

    /* renamed from: g */
    public static final rtc f41651g = rtc.m34378a("gms:chimera:dev_module_packages", "");

    /* renamed from: h */
    public static final rtc f41652h = rtc.m34378a("gms:chimera:dev_module_blacklist", "");

    /* renamed from: i */
    public static final rtc f41653i = rtc.m34377a("gms:chimera:download_free_space_percent", (Long) 400L);

    /* renamed from: j */
    private static final bdyw f41654j;

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
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: rtc.a(java.lang.String, java.lang.Long):rtc
     arg types: [java.lang.String, long]
     candidates:
      rtc.a(java.lang.String, java.lang.Float):rtc
      rtc.a(java.lang.String, java.lang.Integer):rtc
      rtc.a(java.lang.String, java.lang.String):rtc
      rtc.a(java.lang.String, boolean):rtc
      rtc.a(android.content.Context, java.util.Set):void
      rtc.a(java.lang.String, java.lang.Long):rtc */
    static {
        bdyw b = new bdyw(bdyj.m91581a("com.google.android.gms")).mo58445a("gms:chimera:").mo58451b("Chimera__");
        f41654j = b;
        byte[] bArr = new byte[0];
        f41645a = bArr;
        f41646b = bdyx.m91611a(b, "required_features", bArr);
    }

    /* renamed from: a */
    public static rtc[] m32361a() {
        return new rtc[]{f41650f, f41651g, f41653i};
    }
}
