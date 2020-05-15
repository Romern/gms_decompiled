package p000;

/* renamed from: cggl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cggl implements cggk {

    /* renamed from: a */
    public static final bdyx f186841a;

    /* renamed from: b */
    public static final bdyx f186842b;

    /* renamed from: c */
    public static final bdyx f186843c;

    /* renamed from: d */
    public static final bdyx f186844d;

    /* renamed from: e */
    public static final bdyx f186845e;

    /* renamed from: f */
    public static final bdyx f186846f;

    /* renamed from: g */
    public static final bdyx f186847g;

    /* renamed from: h */
    public static final bdyx f186848h;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.places"));
        f186841a = bdyx.m91607a(bdyw, "autocomplete_widget_num_results_to_request", 10L);
        f186842b = bdyx.m91607a(bdyw, "place_picker_my_location_deadline", 10000L);
        f186843c = bdyx.m91607a(bdyw, "place_autocomplete_error_delay_msec", 2000L);
        f186844d = bdyx.m91607a(bdyw, "place_picker_max_results", 20L);
        bdyx.m91607a(bdyw, "place_picker_places_place_updates_expiration", 30000L);
        bdyx.m91607a(bdyw, "place_picker_places_place_updates_interval", 10000L);
        f186845e = bdyx.m91609a(bdyw, "place_picker_redirect_to_autocomplete", "com.google.android.keep");
        f186846f = bdyx.m91607a(bdyw, "place_picker_places_server_deadline", 10000L);
        f186847g = bdyx.m91607a(bdyw, "place_picker_reverse_geocoding_deadline", 1000L);
        f186848h = bdyx.m91610a(bdyw, "place_picker_use_autocomplete_adapter", true);
    }

    /* renamed from: a */
    public final long mo83701a() {
        return ((Long) f186841a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final long mo83702b() {
        return ((Long) f186842b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final long mo83703c() {
        return ((Long) f186843c.mo58455c()).longValue();
    }

    /* renamed from: d */
    public final long mo83704d() {
        return ((Long) f186844d.mo58455c()).longValue();
    }

    /* renamed from: e */
    public final String mo83705e() {
        return (String) f186845e.mo58455c();
    }

    /* renamed from: f */
    public final long mo83706f() {
        return ((Long) f186846f.mo58455c()).longValue();
    }

    /* renamed from: g */
    public final long mo83707g() {
        return ((Long) f186847g.mo58455c()).longValue();
    }

    /* renamed from: h */
    public final boolean mo83708h() {
        return ((Boolean) f186848h.mo58455c()).booleanValue();
    }
}
