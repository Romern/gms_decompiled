package p000;

/* renamed from: cggi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cggi implements cggh {

    /* renamed from: a */
    public static final bdyx f186822a;

    /* renamed from: b */
    public static final bdyx f186823b;

    /* renamed from: c */
    public static final bdyx f186824c;

    /* renamed from: d */
    public static final bdyx f186825d;

    /* renamed from: e */
    public static final bdyx f186826e;

    /* renamed from: f */
    public static final bdyx f186827f;

    /* renamed from: g */
    public static final bdyx f186828g;

    /* renamed from: h */
    public static final bdyx f186829h;

    /* renamed from: i */
    public static final bdyx f186830i;

    /* renamed from: j */
    public static final bdyx f186831j;

    /* renamed from: k */
    public static final bdyx f186832k;

    /* renamed from: l */
    public static final bdyx f186833l;

    /* renamed from: m */
    public static final bdyx f186834m;

    /* renamed from: n */
    public static final bdyx f186835n;

    /* renamed from: o */
    public static final bdyx f186836o;

    /* renamed from: p */
    public static final bdyx f186837p;

    /* renamed from: q */
    public static final bdyx f186838q;

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
     method: bdyx.a(bdyw, java.lang.String, double):bdyx
     arg types: [bdyw, java.lang.String, int]
     candidates:
      bdyx.a(bdyw, java.lang.String, int):bdyx
      bdyx.a(bdyw, java.lang.String, long):bdyx
      bdyx.a(bdyw, java.lang.String, java.lang.String):bdyx
      bdyx.a(bdyw, java.lang.String, boolean):bdyx
      bdyx.a(bdyw, java.lang.String, byte[]):bdyx
      bdyx.a(bdyw, java.lang.String, double):bdyx */
    static {
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.places"));
        f186822a = bdyx.m91610a(bdyw, "enable_hierarchical_scoring", true);
        f186823b = bdyx.m91607a(bdyw, "force_new_segment_after_seconds", -1L);
        f186824c = bdyx.m91607a(bdyw, "max_activity_staleness_time_millis", 120000L);
        f186825d = bdyx.m91607a(bdyw, "max_probable_clusters", 5L);
        f186826e = bdyx.m91605a(bdyw, "max_speed_for_at_place_meters_per_second", 2.0d);
        f186827f = bdyx.m91605a(bdyw, "maximum_cluster_radius_meters", 18.0d);
        f186828g = bdyx.m91607a(bdyw, "maximum_segmentation_signal_staleness_millis", 300000L);
        f186829h = bdyx.m91607a(bdyw, "min_duration_since_at_place_to_be_in_transit_millis", 120000L);
        f186830i = bdyx.m91607a(bdyw, "min_time_spent_in_cluster_to_be_at_place_millis", 180000L);
        f186831j = bdyx.m91607a(bdyw, "num_candidates_for_second_pass", 100L);
        f186832k = bdyx.m91610a(bdyw, "place_inference_at_place_only", false);
        f186833l = bdyx.m91609a(bdyw, "place_inference_module_black_list", "");
        f186834m = bdyx.m91610a(bdyw, "place_inference_result_update_should_always_trigger", false);
        f186835n = bdyx.m91610a(bdyw, "enable_personalized_inference", true);
        f186836o = bdyx.m91610a(bdyw, "include_place_inference_debug_data", false);
        f186837p = bdyx.m91610a(bdyw, "report_check_ins_to_server", false);
        f186838q = bdyx.m91610a(bdyw, "send_check_in_inferences", false);
    }

    /* renamed from: a */
    public final boolean mo83683a() {
        return ((Boolean) f186822a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final long mo83684b() {
        return ((Long) f186823b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final long mo83685c() {
        return ((Long) f186824c.mo58455c()).longValue();
    }

    /* renamed from: d */
    public final long mo83686d() {
        return ((Long) f186825d.mo58455c()).longValue();
    }

    /* renamed from: e */
    public final double mo83687e() {
        return ((Double) f186826e.mo58455c()).doubleValue();
    }

    /* renamed from: f */
    public final double mo83688f() {
        return ((Double) f186827f.mo58455c()).doubleValue();
    }

    /* renamed from: g */
    public final long mo83689g() {
        return ((Long) f186828g.mo58455c()).longValue();
    }

    /* renamed from: h */
    public final long mo83690h() {
        return ((Long) f186829h.mo58455c()).longValue();
    }

    /* renamed from: i */
    public final long mo83691i() {
        return ((Long) f186830i.mo58455c()).longValue();
    }

    /* renamed from: j */
    public final long mo83692j() {
        return ((Long) f186831j.mo58455c()).longValue();
    }

    /* renamed from: k */
    public final boolean mo83693k() {
        return ((Boolean) f186832k.mo58455c()).booleanValue();
    }

    /* renamed from: l */
    public final String mo83694l() {
        return (String) f186833l.mo58455c();
    }

    /* renamed from: m */
    public final boolean mo83695m() {
        return ((Boolean) f186834m.mo58455c()).booleanValue();
    }

    /* renamed from: n */
    public final boolean mo83696n() {
        return ((Boolean) f186835n.mo58455c()).booleanValue();
    }

    /* renamed from: o */
    public final boolean mo83697o() {
        return ((Boolean) f186836o.mo58455c()).booleanValue();
    }

    /* renamed from: p */
    public final boolean mo83698p() {
        return ((Boolean) f186837p.mo58455c()).booleanValue();
    }

    /* renamed from: q */
    public final boolean mo83699q() {
        return ((Boolean) f186838q.mo58455c()).booleanValue();
    }
}
