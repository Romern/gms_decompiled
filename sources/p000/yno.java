package p000;

/* renamed from: yno */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yno implements ceae {

    /* renamed from: A */
    public static final bdyx f54137A = bdyx.m91605a(f54171ah, "fitness.min_running_cadence", 2.0d);

    /* renamed from: B */
    public static final bdyx f54138B = bdyx.m91607a(f54171ah, "fitness.min_segment_duration_secs", 60L);

    /* renamed from: C */
    public static final bdyx f54139C = bdyx.m91605a(f54171ah, "fitness.min_speed", 0.25d);

    /* renamed from: D */
    public static final bdyx f54140D = bdyx.m91605a(f54171ah, "fitness.min_stride_ratio", 0.6600000262260437d);

    /* renamed from: E */
    public static final bdyx f54141E = bdyx.m91607a(f54171ah, "fitness.min_time_bicycle", 300000L);

    /* renamed from: F */
    public static final bdyx f54142F = bdyx.m91607a(f54171ah, "fitness.min_time_bicycle_for_short_segment_filter_millis", 600000L);

    /* renamed from: G */
    public static final bdyx f54143G = bdyx.m91607a(f54171ah, "fitness.min_time_running", 60000L);

    /* renamed from: H */
    public static final bdyx f54144H = bdyx.m91607a(f54171ah, "fitness.min_time_vehicle", 300000L);

    /* renamed from: I */
    public static final bdyx f54145I = bdyx.m91605a(f54171ah, "fitness.min_walking_cadence", 1.399999976158142d);

    /* renamed from: J */
    public static final bdyx f54146J = bdyx.m91605a(f54171ah, "fitness.moderate_heart_activity_met_value", 3.0d);

    /* renamed from: K */
    public static final bdyx f54147K = bdyx.m91607a(f54171ah, "fitness.moderate_heart_steps_per_minute", 100L);

    /* renamed from: L */
    public static final bdyx f54148L = bdyx.m91605a(f54171ah, "fitness.resting_heart_filter_high_threshold", 120.0d);

    /* renamed from: M */
    public static final bdyx f54149M = bdyx.m91605a(f54171ah, "fitness.resting_heart_filter_low_threshold", 20.0d);

    /* renamed from: N */
    public static final bdyx f54150N = bdyx.m91605a(f54171ah, "fitness.resting_heart_rate_maximum_allowed", 120.0d);

    /* renamed from: O */
    public static final bdyx f54151O = bdyx.m91605a(f54171ah, "fitness.resting_heart_rate_metric_percentile", 0.10000000149011612d);

    /* renamed from: P */
    public static final bdyx f54152P = bdyx.m91605a(f54171ah, "fitness.resting_heart_rate_minimum_allowed", 30.0d);

    /* renamed from: Q */
    public static final bdyx f54153Q = bdyx.m91607a(f54171ah, "fitness.resting_heart_rate_minimum_minutes", 120L);

    /* renamed from: R */
    public static final bdyx f54154R = bdyx.m91605a(f54171ah, "fitness.resting_heart_rate_regression_gradient", 1.0d);

    /* renamed from: S */
    public static final bdyx f54155S = bdyx.m91605a(f54171ah, "fitness.resting_heart_rate_regression_intercept", 0.0d);

    /* renamed from: T */
    public static final bdyx f54156T = bdyx.m91607a(f54171ah, "fitness.resting_heart_rate_update_period_minutes", 1440L);

    /* renamed from: U */
    public static final bdyx f54157U = bdyx.m91607a(f54171ah, "fitness.resting_heart_rate_window_minutes", 1440L);

    /* renamed from: V */
    public static final bdyx f54158V = bdyx.m91607a(f54171ah, "fitness.speed_search_radius_secs_local_stream", 30L);

    /* renamed from: W */
    public static final bdyx f54159W = bdyx.m91610a(f54171ah, "fitness.split_watch_step_deltas_w42", false);

    /* renamed from: X */
    public static final bdyx f54160X = bdyx.m91605a(f54171ah, "fitness.stride_running_a0", -0.6129999756813049d);

    /* renamed from: Y */
    public static final bdyx f54161Y = bdyx.m91605a(f54171ah, "fitness.stride_running_a1", 0.296999990940094d);

    /* renamed from: Z */
    public static final bdyx f54162Z = bdyx.m91605a(f54171ah, "fitness.stride_running_a2", 0.25d);

    /* renamed from: a */
    public static final bdyx f54163a;

    /* renamed from: aa */
    public static final bdyx f54164aa = bdyx.m91605a(f54171ah, "fitness.stride_walking_a0", -0.21619999408721924d);

    /* renamed from: ab */
    public static final bdyx f54165ab = bdyx.m91605a(f54171ah, "fitness.stride_walking_a1", 0.3483999967575073d);

    /* renamed from: ac */
    public static final bdyx f54166ac = bdyx.m91605a(f54171ah, "fitness.stride_walking_a2", 0.10570000112056732d);

    /* renamed from: ad */
    public static final bdyx f54167ad = bdyx.m91610a(f54171ah, "fitness.throw_on_cycles", false);

    /* renamed from: ae */
    public static final bdyx f54168ae = bdyx.m91605a(f54171ah, "fitness.vigorous_heart_activity_met_value", 6.0d);

    /* renamed from: af */
    public static final bdyx f54169af = bdyx.m91607a(f54171ah, "fitness.vigorous_heart_steps_per_minute", 130L);

    /* renamed from: ag */
    public static final bdyx f54170ag = bdyx.m91609a(f54171ah, "fitness.wear_activity_remove_threshold_in_samples", "walking=3|running=3|biking=5|in_vehicle=5");

    /* renamed from: ah */
    private static final bdyw f54171ah;

    /* renamed from: ai */
    private static final bdyx f54172ai = bdyx.m91609a(f54171ah, "fitness.coaching_metrics_from_met_package_names", "com.strava,fi.polar.beat,com.runtastic.android,com.runtastic.android.pro,com.mapmyride.android2");

    /* renamed from: aj */
    private static final bdyx f54173aj = bdyx.m91605a(f54171ah, "fitness.default_user_age", 30.0d);

    /* renamed from: ak */
    private static final bdyx f54174ak = bdyx.m91607a(f54171ah, "fitness.duration_for_distance_buckets", 30L);

    /* renamed from: al */
    private static final bdyx f54175al = bdyx.m91610a(f54171ah, "fitness.enable_activity_from_steps_transformation", true);

    /* renamed from: am */
    private static final bdyx f54176am = bdyx.m91610a(f54171ah, "fitness.ensure_active_calories_are_above_rest", true);

    /* renamed from: an */
    private static final bdyx f54177an = bdyx.m91609a(f54171ah, "fitness.estimated_cadences", "");

    /* renamed from: ao */
    private static final bdyx f54178ao = bdyx.m91607a(f54171ah, "fitness.high_fidelity_distance_interval_nanos", 45000000000L);

    /* renamed from: ap */
    private static final bdyx f54179ap = bdyx.m91605a(f54171ah, "fitness.high_fidelity_location_accuracy_threshold", 50.0d);

    /* renamed from: aq */
    private static final bdyx f54180aq = bdyx.m91607a(f54171ah, "fitness.location_max_time_gap_secs", 600L);

    /* renamed from: ar */
    private static final bdyx f54181ar = bdyx.m91605a(f54171ah, "fitness.max_location_accuracy_threshold", 150.0d);

    /* renamed from: as */
    private static final bdyx f54182as = bdyx.m91607a(f54171ah, "fitness.max_segment_length_for_min_speed_secs", 7200L);

    /* renamed from: at */
    private static final bdyx f54183at = bdyx.m91607a(f54171ah, "fitness.max_step_cadence", 360L);

    /* renamed from: au */
    private static final bdyx f54184au = bdyx.m91607a(f54171ah, "fitness.min_step_cadence", 30L);

    /* renamed from: av */
    private static final bdyx f54185av = bdyx.m91609a(f54171ah, "fitness.no_step_activities", "in_vehicle,biking,biking.hand,biking.mountain,biking.road,biking.spinning,biking.stationary,biking.utility,sleep,sleep.awake,sleep.deep,sleep.light,sleep.rem");

    /* renamed from: aw */
    private static final bdyx f54186aw = bdyx.m91610a(f54171ah, "fitness.prefer_third_party_distance_delta", true);

    /* renamed from: ax */
    private static final bdyx f54187ax = bdyx.m91610a(f54171ah, "fitness.trim_data_points_in_quantity_merger", true);

    /* renamed from: ay */
    private static final bdyx f54188ay = bdyx.m91610a(f54171ah, "fitness.trim_server_points", true);

    /* renamed from: b */
    public static final bdyx f54189b = bdyx.m91607a(f54171ah, "fitness.active_steps_per_minute", 30L);

    /* renamed from: c */
    public static final bdyx f54190c = bdyx.m91610a(f54171ah, "fitness.bicycle_state_relabelling", true);

    /* renamed from: d */
    public static final bdyx f54191d = bdyx.m91605a(f54171ah, "fitness.default_s_parameter", -78.0d);

    /* renamed from: e */
    public static final bdyx f54192e = bdyx.m91610a(f54171ah, "fitness.enable_pre_hmm_bicycle_observation_relabeling", false);

    /* renamed from: f */
    public static final bdyx f54193f = bdyx.m91610a(f54171ah, "fitness.enable_read_interval_goals", true);

    /* renamed from: g */
    public static final bdyx f54194g = bdyx.m91610a(f54171ah, "fitness.enable_resting_heart_rate", true);

    /* renamed from: h */
    public static final bdyx f54195h = bdyx.m91610a(f54171ah, "fitness.enable_short_bicycle_segments_relabel", false);

    /* renamed from: i */
    public static final bdyx f54196i = bdyx.m91610a(f54171ah, "fitness.enable_speed_from_distance", true);

    /* renamed from: j */
    public static final bdyx f54197j = bdyx.m91607a(f54171ah, "fitness.heart_minutes_maximum_heart_rate_samples_gap_millis", 15000L);

    /* renamed from: k */
    public static final bdyx f54198k = bdyx.m91607a(f54171ah, "fitness.location_clustering_threshold_millis", 30000L);

    /* renamed from: l */
    public static final bdyx f54199l = bdyx.m91607a(f54171ah, "fitness.max_cumulative_batch_secs", 30L);

    /* renamed from: m */
    public static final bdyx f54200m = bdyx.m91607a(f54171ah, "fitness.max_duration_for_bicycle_state_relabelling", 900000L);

    /* renamed from: n */
    public static final bdyx f54201n = bdyx.m91605a(f54171ah, "fitness.max_running_cadence", 3.5999999046325684d);

    /* renamed from: o */
    public static final bdyx f54202o = bdyx.m91607a(f54171ah, "fitness.max_segment_sample_gap_secs", 600L);

    /* renamed from: p */
    public static final bdyx f54203p = bdyx.m91607a(f54171ah, "fitness.max_step_duplicate_millis", 1000L);

    /* renamed from: q */
    public static final bdyx f54204q = bdyx.m91605a(f54171ah, "fitness.max_stride_ratio", 1.3300000429153442d);

    /* renamed from: r */
    public static final bdyx f54205r = bdyx.m91607a(f54171ah, "fitness.max_tilt_gap_secs", 60L);

    /* renamed from: s */
    public static final bdyx f54206s = bdyx.m91607a(f54171ah, "fitness.max_valid_count_delta", 5000L);

    /* renamed from: t */
    public static final bdyx f54207t = bdyx.m91605a(f54171ah, "fitness.max_walking_cadence", 2.799999952316284d);

    /* renamed from: u */
    public static final bdyx f54208u = bdyx.m91607a(f54171ah, "fitness.maximum_calorie_point_duration_nanos", 0L);

    /* renamed from: v */
    public static final bdyx f54209v = bdyx.m91607a(f54171ah, "fitness.maximum_segment_length_hours", 24L);

    /* renamed from: w */
    public static final bdyx f54210w = bdyx.m91607a(f54171ah, "fitness.min_bicycle_observation_confidence_required", 75L);

    /* renamed from: x */
    public static final bdyx f54211x = bdyx.m91607a(f54171ah, "fitness.min_bicycle_observations_required", 7L);

    /* renamed from: y */
    public static final bdyx f54212y = bdyx.m91609a(f54171ah, "fitness.min_max_cadences", "");

    /* renamed from: z */
    public static final bdyx f54213z = bdyx.m91609a(f54171ah, "fitness.min_max_cadences_for_creating_segments", "walking=60,160|running=140,360");

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
        bdyw bdyw = new bdyw(anef.m64088a("com.google.android.gms.fitness"));
        f54171ah = bdyw;
        f54163a = bdyx.m91605a(bdyw, "fitness.active_activity_met_value", 1.600000023841858d);
        bdyx.m91607a(f54171ah, "fitness.linear_interpolate_maximum_heart_rate_samples_gap_millis", 1800000L);
        bdyx.m91607a(f54171ah, "fitness.max_rest_calories_duration_minutes", 1440L);
        bdyx.m91607a(f54171ah, "fitness.min_step_estimation_gap_secs", 180L);
        bdyx.m91607a(f54171ah, "fitness.read_behind_secs_local", 3600L);
        bdyx.m91610a(f54171ah, "fitness.rest_calories_in_merger", true);
        bdyx.m91610a(f54171ah, "fitness.should_enable_speed_ar", false);
        bdyx.m91605a(f54171ah, "fitness.speed_smoothing_window_secs", 0.0d);
    }

    /* renamed from: a */
    public final String mo30614a() {
        return (String) f54172ai.mo58455c();
    }

    /* renamed from: b */
    public final float mo30615b() {
        return ((Double) f54173aj.mo58455c()).floatValue();
    }

    /* renamed from: c */
    public final long mo30616c() {
        return ((Long) f54174ak.mo58455c()).longValue();
    }

    /* renamed from: d */
    public final boolean mo30617d() {
        return ((Boolean) f54175al.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo30618e() {
        return ((Boolean) f54176am.mo58455c()).booleanValue();
    }

    /* renamed from: f */
    public final String mo30619f() {
        return (String) f54177an.mo58455c();
    }

    /* renamed from: g */
    public final long mo30620g() {
        return ((Long) f54178ao.mo58455c()).longValue();
    }

    /* renamed from: h */
    public final float mo30621h() {
        return ((Double) f54179ap.mo58455c()).floatValue();
    }

    /* renamed from: i */
    public final long mo30622i() {
        return ((Long) f54180aq.mo58455c()).longValue();
    }

    /* renamed from: j */
    public final float mo30623j() {
        return ((Double) f54181ar.mo58455c()).floatValue();
    }

    /* renamed from: k */
    public final long mo30624k() {
        return ((Long) f54182as.mo58455c()).longValue();
    }

    /* renamed from: l */
    public final long mo30625l() {
        return ((Long) f54183at.mo58455c()).longValue();
    }

    /* renamed from: m */
    public final long mo30626m() {
        return ((Long) f54184au.mo58455c()).longValue();
    }

    /* renamed from: n */
    public final String mo30627n() {
        return (String) f54185av.mo58455c();
    }

    /* renamed from: o */
    public final boolean mo30628o() {
        return ((Boolean) f54186aw.mo58455c()).booleanValue();
    }

    /* renamed from: p */
    public final boolean mo30629p() {
        return ((Boolean) f54187ax.mo58455c()).booleanValue();
    }

    /* renamed from: q */
    public final boolean mo30630q() {
        return ((Boolean) f54188ay.mo58455c()).booleanValue();
    }
}
