package p000;

/* renamed from: cemc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cemc implements cemb {

    /* renamed from: a */
    public static final bdyx f182936a;

    /* renamed from: b */
    public static final bdyx f182937b;

    /* renamed from: c */
    public static final bdyx f182938c;

    /* renamed from: d */
    public static final bdyx f182939d;

    /* renamed from: e */
    public static final bdyx f182940e;

    /* renamed from: f */
    public static final bdyx f182941f;

    /* renamed from: g */
    public static final bdyx f182942g;

    /* renamed from: h */
    public static final bdyx f182943h;

    /* renamed from: i */
    public static final bdyx f182944i;

    /* renamed from: j */
    public static final bdyx f182945j;

    /* renamed from: k */
    public static final bdyx f182946k;

    /* renamed from: l */
    public static final bdyx f182947l;

    /* renamed from: m */
    public static final bdyx f182948m;

    /* renamed from: n */
    public static final bdyx f182949n;

    /* renamed from: o */
    public static final bdyx f182950o;

    /* renamed from: p */
    public static final bdyx f182951p;

    /* renamed from: q */
    public static final bdyx f182952q;

    /* renamed from: r */
    public static final bdyx f182953r;

    /* renamed from: s */
    public static final bdyx f182954s;

    /* renamed from: t */
    public static final bdyx f182955t;

    /* renamed from: u */
    public static final bdyx f182956u;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.icing"));
        bdyx.m91607a(bdyw, "gms_icing_annotation_api_stats_sample_interval", 1L);
        bdyx.m91607a(bdyw, "gms_icing_app_history_event_upload_stats_sample_interval", 100L);
        f182936a = bdyx.m91607a(bdyw, "gms_icing_app_indexing_call_stats_sample_interval", 5L);
        bdyx.m91607a(bdyw, "gms_icing_app_indexing_database_helper_silent_feedback_interval_millis", 86400000L);
        f182937b = bdyx.m91607a(bdyw, "gms_icing_app_indexing_database_helper_silent_feedback_sample_interval", 100L);
        f182938c = bdyx.m91607a(bdyw, "gms_icing_app_indexing_update_index_stats_sample_interval", 5L);
        f182939d = bdyx.m91607a(bdyw, "gms_icing_apps_usage_signal_stats_sample_interval", 100L);
        f182940e = bdyx.m91607a(bdyw, "gms_icing_battery_stats_sample_interval", 10L);
        f182941f = bdyx.m91607a(bdyw, "gms_icing_compaction_stats_sample_interval", 10L);
        f182942g = bdyx.m91607a(bdyw, "gms_icing_content_fetcher_oom_sample_interval", 1000L);
        bdyx.m91607a(bdyw, "gms_icing_corpus_schema_store_error_sample_interval", 10L);
        bdyx.m91605a(bdyw, "gms_icing_default_stats_sample", 0.1d);
        f182943h = bdyx.m91607a(bdyw, "gms_icing_default_stats_sample_interval", 10L);
        f182944i = bdyx.m91607a(bdyw, "gms_icing_index_document_stats_sample_interval", 1000L);
        f182945j = bdyx.m91607a(bdyw, "gms_icing_index_init_stats_sample_interval", 10L);
        f182946k = bdyx.m91607a(bdyw, "gms_icing_index_restoration_stats_sample_interval", 10L);
        bdyx.m91605a(bdyw, "gms_icing_internal_corpora_health_stats_sample", 0.01d);
        f182947l = bdyx.m91607a(bdyw, "gms_icing_internal_corpora_health_stats_sample_interval", 100L);
        bdyx.m91607a(bdyw, "gms_icing_mdd_default_sample_interval", 100L);
        bdyx.m91607a(bdyw, "gms_icing_permission_checker_stats_sample_interval", 100L);
        f182948m = bdyx.m91607a(bdyw, "gms_icing_platform_proxy_corpora_update_stats_sample_interval", 1000L);
        bdyx.m91607a(bdyw, "gms_icing_ps1_app_names_silent_feedback_sample_interval", 100L);
        f182949n = bdyx.m91607a(bdyw, "gms_icing_query_stats_sample_interval", 10L);
        f182950o = bdyx.m91607a(bdyw, "gms_icing_report_usage_stats_sample_interval", 5L);
        f182951p = bdyx.m91607a(bdyw, "gms_icing_silent_feedback_3p_sample_interval", 10000L);
        f182952q = bdyx.m91607a(bdyw, "gms_icing_sms_timing_stats_sample_interval", 1000L);
        f182953r = bdyx.m91607a(bdyw, "gms_icing_sync_proto_data_store_sample_interval", 0L);
        f182954s = bdyx.m91607a(bdyw, "gms_icing_timing_stats_sample_interval", 10L);
        f182955t = bdyx.m91607a(bdyw, "gms_icing_usage_report_stats_sample_interval", 100L);
        f182956u = bdyx.m91607a(bdyw, "gms_icing_wake_lock_details_sample_interval", 1L);
    }

    /* renamed from: a */
    public final long mo79299a() {
        return ((Long) f182936a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final long mo79300b() {
        return ((Long) f182937b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final long mo79301c() {
        return ((Long) f182938c.mo58455c()).longValue();
    }

    /* renamed from: d */
    public final long mo79302d() {
        return ((Long) f182939d.mo58455c()).longValue();
    }

    /* renamed from: e */
    public final long mo79303e() {
        return ((Long) f182940e.mo58455c()).longValue();
    }

    /* renamed from: f */
    public final long mo79304f() {
        return ((Long) f182941f.mo58455c()).longValue();
    }

    /* renamed from: g */
    public final long mo79305g() {
        return ((Long) f182942g.mo58455c()).longValue();
    }

    /* renamed from: h */
    public final long mo79306h() {
        return ((Long) f182943h.mo58455c()).longValue();
    }

    /* renamed from: i */
    public final long mo79307i() {
        return ((Long) f182944i.mo58455c()).longValue();
    }

    /* renamed from: j */
    public final long mo79308j() {
        return ((Long) f182945j.mo58455c()).longValue();
    }

    /* renamed from: k */
    public final long mo79309k() {
        return ((Long) f182946k.mo58455c()).longValue();
    }

    /* renamed from: l */
    public final long mo79310l() {
        return ((Long) f182947l.mo58455c()).longValue();
    }

    /* renamed from: m */
    public final long mo79311m() {
        return ((Long) f182948m.mo58455c()).longValue();
    }

    /* renamed from: n */
    public final long mo79312n() {
        return ((Long) f182949n.mo58455c()).longValue();
    }

    /* renamed from: o */
    public final long mo79313o() {
        return ((Long) f182950o.mo58455c()).longValue();
    }

    /* renamed from: p */
    public final long mo79314p() {
        return ((Long) f182951p.mo58455c()).longValue();
    }

    /* renamed from: q */
    public final long mo79315q() {
        return ((Long) f182952q.mo58455c()).longValue();
    }

    /* renamed from: r */
    public final long mo79316r() {
        return ((Long) f182953r.mo58455c()).longValue();
    }

    /* renamed from: s */
    public final long mo79317s() {
        return ((Long) f182954s.mo58455c()).longValue();
    }

    /* renamed from: t */
    public final long mo79318t() {
        return ((Long) f182955t.mo58455c()).longValue();
    }

    /* renamed from: u */
    public final long mo79319u() {
        return ((Long) f182956u.mo58455c()).longValue();
    }
}
