package p000;

/* renamed from: cggo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cggo implements cggn {

    /* renamed from: A */
    public static final bdyx f186851A;

    /* renamed from: B */
    public static final bdyx f186852B;

    /* renamed from: C */
    public static final bdyx f186853C;

    /* renamed from: D */
    public static final bdyx f186854D;

    /* renamed from: E */
    public static final bdyx f186855E;

    /* renamed from: F */
    public static final bdyx f186856F;

    /* renamed from: G */
    public static final bdyx f186857G;

    /* renamed from: H */
    public static final bdyx f186858H;

    /* renamed from: I */
    public static final bdyx f186859I;

    /* renamed from: J */
    public static final bdyx f186860J;

    /* renamed from: K */
    public static final bdyx f186861K;

    /* renamed from: L */
    public static final bdyx f186862L;

    /* renamed from: a */
    public static final bdyx f186863a;

    /* renamed from: b */
    public static final bdyx f186864b;

    /* renamed from: c */
    public static final bdyx f186865c;

    /* renamed from: d */
    public static final bdyx f186866d;

    /* renamed from: e */
    public static final bdyx f186867e;

    /* renamed from: f */
    public static final bdyx f186868f;

    /* renamed from: g */
    public static final bdyx f186869g;

    /* renamed from: h */
    public static final bdyx f186870h;

    /* renamed from: i */
    public static final bdyx f186871i;

    /* renamed from: j */
    public static final bdyx f186872j;

    /* renamed from: k */
    public static final bdyx f186873k;

    /* renamed from: l */
    public static final bdyx f186874l;

    /* renamed from: m */
    public static final bdyx f186875m;

    /* renamed from: n */
    public static final bdyx f186876n;

    /* renamed from: o */
    public static final bdyx f186877o;

    /* renamed from: p */
    public static final bdyx f186878p;

    /* renamed from: q */
    public static final bdyx f186879q;

    /* renamed from: r */
    public static final bdyx f186880r;

    /* renamed from: s */
    public static final bdyx f186881s;

    /* renamed from: t */
    public static final bdyx f186882t;

    /* renamed from: u */
    public static final bdyx f186883u;

    /* renamed from: v */
    public static final bdyx f186884v;

    /* renamed from: w */
    public static final bdyx f186885w;

    /* renamed from: x */
    public static final bdyx f186886x;

    /* renamed from: y */
    public static final bdyx f186887y;

    /* renamed from: z */
    public static final bdyx f186888z;

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
        f186863a = bdyx.m91607a(bdyw, "download_interval_millis", 90000L);
        f186864b = bdyx.m91607a(bdyw, "max_number_of_results", 20L);
        f186865c = bdyx.m91607a(bdyw, "maximum_place_inference_result_time_to_live_seconds", 300L);
        f186866d = bdyx.m91605a(bdyw, "maximum_speed_inference_download_meters_per_second", 3.0d);
        f186867e = bdyx.m91607a(bdyw, "mdd_model_download_retry_on_error_interval_seconds", 21600L);
        f186868f = bdyx.m91607a(bdyw, "mdd_model_time_to_live_seconds", 86400L);
        f186869g = bdyx.m91607a(bdyw, "min_percentage_coverage_candidate_selection", 50L);
        f186870h = bdyx.m91607a(bdyw, "model_weights_time_to_live_seconds", 604800L);
        f186871i = bdyx.m91609a(bdyw, "nearby_alert_zero_power_module_list", "Distance");
        f186872j = bdyx.m91610a(bdyw, "never_set_to_true_allow_1p_to_access_0p_features", false);
        f186873k = bdyx.m91607a(bdyw, "number_of_required_stable_places_for_trigger", 1L);
        f186874l = bdyx.m91605a(bdyw, "on_the_go_probability_threshold", 0.7d);
        f186875m = bdyx.m91607a(bdyw, "personalized_candidate_selection_radius_meters", 250L);
        f186876n = bdyx.m91605a(bdyw, "place_index_free_space_ratio", 0.5d);
        f186877o = bdyx.m91607a(bdyw, "place_index_l1_disk_max_entries", 10000L);
        f186878p = bdyx.m91607a(bdyw, "place_index_l2_disk_max_entries", 40000L);
        f186879q = bdyx.m91605a(bdyw, "place_likelihood_bucket_size", 0.05d);
        f186880r = bdyx.m91607a(bdyw, "candidate_download_radius_meters", 250L);
        f186881s = bdyx.m91607a(bdyw, "candidate_selection_max_radius_meters", 150L);
        f186882t = bdyx.m91607a(bdyw, "candidate_selection_max_radius_meters_low_ram", 100L);
        bdyx.m91607a(bdyw, "candidate_selection_min_radius_meters", 10L);
        f186883u = bdyx.m91610a(bdyw, "enable_inference_model_weights_download", true);
        f186884v = bdyx.m91607a(bdyw, "estimate_places_max_wifi_age", 60L);
        f186885w = bdyx.m91607a(bdyw, "estimate_places_max_wifi_scans", 5L);
        f186886x = bdyx.m91607a(bdyw, "location_request_balanced_power_default_interval_millis", 300000L);
        f186887y = bdyx.m91607a(bdyw, "location_request_client_interval_scale_factor", 20L);
        f186888z = bdyx.m91607a(bdyw, "location_request_default_interval_millis", 3600000L);
        f186851A = bdyx.m91607a(bdyw, "location_request_high_power_default_interval_millis", 30000L);
        f186852B = bdyx.m91607a(bdyw, "location_request_low_power_default_interval_millis", 2400000L);
        f186853C = bdyx.m91607a(bdyw, "max_number_of_places_subscriptions_per_package", 10L);
        f186854D = bdyx.m91607a(bdyw, "minimum_activity_recognition_interval_millis", 240000L);
        f186855E = bdyx.m91605a(bdyw, "negligible_place_likelihood", 0.01d);
        f186856F = bdyx.m91607a(bdyw, "place_index_time_to_live_seconds", 1209600L);
        f186857G = bdyx.m91610a(bdyw, "should_request_activity_updates", true);
        f186858H = bdyx.m91607a(bdyw, "service_bind_timeout_seconds", 10L);
        f186859I = bdyx.m91610a(bdyw, "signal_manager_replay_mode", false);
        bdyx.m91607a(bdyw, "slp_api_calls_timeout_seconds", 10L);
        f186860J = bdyx.m91605a(bdyw, "top_place_likelihood_change_threshold", 0.1d);
        f186861K = bdyx.m91610a(bdyw, "use_on_the_go_segmenter_for_transit_decisions", true);
        f186862L = bdyx.m91610a(bdyw, "use_transit_decisions", true);
    }

    /* renamed from: A */
    public final long mo83710A() {
        return ((Long) f186852B.mo58455c()).longValue();
    }

    /* renamed from: B */
    public final long mo83711B() {
        return ((Long) f186853C.mo58455c()).longValue();
    }

    /* renamed from: C */
    public final long mo83712C() {
        return ((Long) f186854D.mo58455c()).longValue();
    }

    /* renamed from: D */
    public final double mo83713D() {
        return ((Double) f186855E.mo58455c()).doubleValue();
    }

    /* renamed from: E */
    public final long mo83714E() {
        return ((Long) f186856F.mo58455c()).longValue();
    }

    /* renamed from: F */
    public final boolean mo83715F() {
        return ((Boolean) f186857G.mo58455c()).booleanValue();
    }

    /* renamed from: G */
    public final long mo83716G() {
        return ((Long) f186858H.mo58455c()).longValue();
    }

    /* renamed from: H */
    public final boolean mo83717H() {
        return ((Boolean) f186859I.mo58455c()).booleanValue();
    }

    /* renamed from: I */
    public final double mo83718I() {
        return ((Double) f186860J.mo58455c()).doubleValue();
    }

    /* renamed from: J */
    public final boolean mo83719J() {
        return ((Boolean) f186861K.mo58455c()).booleanValue();
    }

    /* renamed from: K */
    public final boolean mo83720K() {
        return ((Boolean) f186862L.mo58455c()).booleanValue();
    }

    /* renamed from: L */
    public final void mo83721L() {
        ((Long) f186851A.mo58455c()).longValue();
    }

    /* renamed from: a */
    public final long mo83722a() {
        return ((Long) f186863a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final long mo83723b() {
        return ((Long) f186864b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final long mo83724c() {
        return ((Long) f186865c.mo58455c()).longValue();
    }

    /* renamed from: d */
    public final double mo83725d() {
        return ((Double) f186866d.mo58455c()).doubleValue();
    }

    /* renamed from: e */
    public final long mo83726e() {
        return ((Long) f186867e.mo58455c()).longValue();
    }

    /* renamed from: f */
    public final long mo83727f() {
        return ((Long) f186868f.mo58455c()).longValue();
    }

    /* renamed from: g */
    public final long mo83728g() {
        return ((Long) f186869g.mo58455c()).longValue();
    }

    /* renamed from: h */
    public final long mo83729h() {
        return ((Long) f186870h.mo58455c()).longValue();
    }

    /* renamed from: i */
    public final String mo83730i() {
        return (String) f186871i.mo58455c();
    }

    /* renamed from: j */
    public final boolean mo83731j() {
        return ((Boolean) f186872j.mo58455c()).booleanValue();
    }

    /* renamed from: k */
    public final long mo83732k() {
        return ((Long) f186873k.mo58455c()).longValue();
    }

    /* renamed from: l */
    public final double mo83733l() {
        return ((Double) f186874l.mo58455c()).doubleValue();
    }

    /* renamed from: m */
    public final long mo83734m() {
        return ((Long) f186875m.mo58455c()).longValue();
    }

    /* renamed from: n */
    public final double mo83735n() {
        return ((Double) f186876n.mo58455c()).doubleValue();
    }

    /* renamed from: o */
    public final long mo83736o() {
        return ((Long) f186877o.mo58455c()).longValue();
    }

    /* renamed from: p */
    public final long mo83737p() {
        return ((Long) f186878p.mo58455c()).longValue();
    }

    /* renamed from: q */
    public final double mo83738q() {
        return ((Double) f186879q.mo58455c()).doubleValue();
    }

    /* renamed from: r */
    public final long mo83739r() {
        return ((Long) f186880r.mo58455c()).longValue();
    }

    /* renamed from: s */
    public final long mo83740s() {
        return ((Long) f186881s.mo58455c()).longValue();
    }

    /* renamed from: t */
    public final long mo83741t() {
        return ((Long) f186882t.mo58455c()).longValue();
    }

    /* renamed from: u */
    public final boolean mo83742u() {
        return ((Boolean) f186883u.mo58455c()).booleanValue();
    }

    /* renamed from: v */
    public final long mo83743v() {
        return ((Long) f186884v.mo58455c()).longValue();
    }

    /* renamed from: w */
    public final long mo83744w() {
        return ((Long) f186885w.mo58455c()).longValue();
    }

    /* renamed from: x */
    public final long mo83745x() {
        return ((Long) f186886x.mo58455c()).longValue();
    }

    /* renamed from: y */
    public final long mo83746y() {
        return ((Long) f186887y.mo58455c()).longValue();
    }

    /* renamed from: z */
    public final long mo83747z() {
        return ((Long) f186888z.mo58455c()).longValue();
    }
}
