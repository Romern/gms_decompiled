package p000;

/* renamed from: cept */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cept implements ceps {

    /* renamed from: a */
    public static final bdyx f183238a;

    /* renamed from: b */
    public static final bdyx f183239b;

    /* renamed from: c */
    public static final bdyx f183240c;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.instantapps")).mo58443a();
        f183238a = bdyx.m91610a(a, "OResolution__allow_devman_routing", false);
        bdyx.m91610a(a, "OResolution__enable_android_tv_intersplit_navigation", false);
        f183239b = bdyx.m91610a(a, "OResolution__filter_out_persistent_installed_packages", true);
        f183240c = bdyx.m91610a(a, "OResolution__include_extra_metadata_in_instant_app_resolve_info", false);
        bdyx.m91610a(a, "OResolution__skip_resolution_when_opted_out", true);
    }

    /* renamed from: a */
    public final boolean mo79566a() {
        return ((Boolean) f183238a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo79567b() {
        return ((Boolean) f183239b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo79568c() {
        return ((Boolean) f183240c.mo58455c()).booleanValue();
    }
}
