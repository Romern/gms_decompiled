package p000;

/* renamed from: ccsv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccsv implements ccsu {

    /* renamed from: a */
    public static final bdyx f179872a;

    /* renamed from: b */
    public static final bdyx f179873b;

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
        f179872a = bdyx.m91610a(bdyw, "use_available_wifi_info_and_network", true);
        f179873b = bdyx.m91610a(bdyw, "wireless_enable_channel_support", false);
    }

    /* renamed from: a */
    public final boolean mo76738a() {
        return ((Boolean) f179872a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo76739b() {
        return ((Boolean) f179873b.mo58455c()).booleanValue();
    }
}
