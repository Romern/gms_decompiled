package p000;

/* renamed from: ccsy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccsy implements ccsx {

    /* renamed from: a */
    public static final bdyx f179876a;

    /* renamed from: b */
    public static final bdyx f179877b;

    /* renamed from: c */
    public static final bdyx f179878c;

    /* renamed from: d */
    public static final bdyx f179879d;

    /* renamed from: e */
    public static final bdyx f179880e;

    /* renamed from: f */
    public static final bdyx f179881f;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bdyx.a(bdyw, java.lang.String, long):bdyx
     arg types: [bdyw, java.lang.String, int]
     candidates:
      bdyx.a(bdyw, java.lang.String, double):bdyx
      bdyx.a(bdyw, java.lang.String, int):bdyx
      bdyx.a(bdyw, java.lang.String, java.lang.String):bdyx
      bdyx.a(bdyw, java.lang.String, boolean):bdyx
      bdyx.a(bdyw, java.lang.String, byte[]):bdyx
      bdyx.a(bdyw, java.lang.String, long):bdyx */
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
        f179876a = bdyx.m91607a(bdyw, "FrameworkGalFeature__fragment_size_for_wifi", 0L);
        f179877b = bdyx.m91607a(bdyw, "FrameworkGalFeature__framer_send_buffer_size_for_wifi", 0L);
        bdyx.m91610a(bdyw, "FrameworkGalFeature__gal_monitor_app_enabled_for_starship", false);
        f179878c = bdyx.m91610a(bdyw, "FrameworkGalFeature__is_gal_snoop_available", false);
        bdyx.m91610a(bdyw, "FrameworkGalFeature__is_gal_snoop_enabled_in_starship", false);
        bdyx.m91610a(bdyw, "FrameworkGalFeature__pcts_enabled_for_starship", false);
        f179879d = bdyx.m91610a(bdyw, "FrameworkGalFeature__qos_enabled_for_usb", true);
        f179880e = bdyx.m91610a(bdyw, "FrameworkGalFeature__qos_enabled_for_wifi", false);
        f179881f = bdyx.m91610a(bdyw, "FrameworkGalFeature__qos_priority_from_service_type", true);
        bdyx.m91610a(bdyw, "FrameworkGalFeature__should_bye_bye_before_new_session_starts", true);
    }

    /* renamed from: a */
    public final long mo76741a() {
        return ((Long) f179876a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final long mo76742b() {
        return ((Long) f179877b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final boolean mo76743c() {
        return ((Boolean) f179878c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo76744d() {
        return ((Boolean) f179879d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo76745e() {
        return ((Boolean) f179880e.mo58455c()).booleanValue();
    }

    /* renamed from: f */
    public final boolean mo76746f() {
        return ((Boolean) f179881f.mo58455c()).booleanValue();
    }
}
