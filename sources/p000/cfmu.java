package p000;

/* renamed from: cfmu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfmu implements cfmr {

    /* renamed from: a */
    public static final bdyx f184407a;

    /* renamed from: b */
    public static final bdyx f184408b;

    /* renamed from: c */
    public static final bdyx f184409c;

    /* renamed from: d */
    public static final bdyx f184410d;

    /* renamed from: e */
    public static final bdyx f184411e;

    /* renamed from: f */
    public static final bdyx f184412f;

    /* renamed from: g */
    public static final bdyx f184413g;

    /* renamed from: h */
    public static final bdyx f184414h;

    /* renamed from: i */
    public static final bdyx f184415i;

    /* renamed from: j */
    public static final bdyx f184416j;

    /* renamed from: k */
    public static final bdyx f184417k;

    /* renamed from: l */
    public static final bdyx f184418l;

    /* renamed from: m */
    public static final bdyx f184419m;

    /* renamed from: n */
    public static final bdyx f184420n;

    /* renamed from: o */
    public static final bdyx f184421o;

    /* renamed from: p */
    public static final bdyx f184422p;

    /* renamed from: q */
    public static final bdyx f184423q;

    /* renamed from: r */
    public static final bdyx f184424r;

    /* renamed from: s */
    public static final bdyx f184425s;

    /* renamed from: t */
    public static final bdyx f184426t;

    /* renamed from: u */
    public static final bdyx f184427u;

    /* renamed from: v */
    public static final bdyx f184428v;

    /* renamed from: w */
    public static final bdyx f184429w;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.mobile_data_plan"));
        f184407a = bdyx.m91610a(bdyw, "LoggingImprovements__background_maintains_event_flow_id", true);
        try {
            f184408b = bdyx.m91608a(bdyw, "LoggingImprovements__bucket_delimeters_of_plan_bytes", (bydi) GeneratedMessageLite.m124014a(bydi.f165792b, new byte[]{10, 16, -64, -106, -79, 2, Byte.MIN_VALUE, -83, -30, 4, Byte.MIN_VALUE, -121, -89, 14, Byte.MIN_VALUE, -31, -21, 23}), cfms.f184405a);
            try {
                f184409c = bdyx.m91608a(bdyw, "LoggingImprovements__bucket_delimeters_of_plan_minutes", (bydi) GeneratedMessageLite.m124014a(bydi.f165792b, new byte[]{10, 6, 10, 60, -48, 5, -96, 56}), cfmt.f184406a);
                f184410d = bdyx.m91610a(bdyw, "LoggingImprovements__consent_maintains_event_flow_id", true);
                bdyx.m91610a(bdyw, "LoggingImprovements__expand_gcore_register_context_logged", true);
                f184411e = bdyx.m91610a(bdyw, "LoggingImprovements__log_all_notification_types", true);
                f184412f = bdyx.m91610a(bdyw, "LoggingImprovements__log_api_calling_package", false);
                f184413g = bdyx.m91610a(bdyw, "LoggingImprovements__log_bg_trigger_details", true);
                f184414h = bdyx.m91610a(bdyw, "LoggingImprovements__log_bytes_as_buckets", false);
                f184415i = bdyx.m91610a(bdyw, "LoggingImprovements__log_cache_save_events", true);
                f184416j = bdyx.m91610a(bdyw, "LoggingImprovements__log_calling_pkg_details", true);
                f184417k = bdyx.m91610a(bdyw, "LoggingImprovements__log_consent_agree_button_shown", false);
                f184418l = bdyx.m91610a(bdyw, "LoggingImprovements__log_consent_link_clicks", false);
                f184419m = bdyx.m91610a(bdyw, "LoggingImprovements__log_consent_status_in_set_consent_status_response", false);
                f184420n = bdyx.m91610a(bdyw, "LoggingImprovements__log_device_status_changes", true);
                f184421o = bdyx.m91610a(bdyw, "LoggingImprovements__log_gcorereg_error_codes", true);
                f184422p = bdyx.m91610a(bdyw, "LoggingImprovements__log_mcc_mnc", false);
                f184423q = bdyx.m91610a(bdyw, "LoggingImprovements__log_not_on_cellular_details", true);
                f184424r = bdyx.m91610a(bdyw, "LoggingImprovements__log_periodic_task_cancelling", true);
                f184425s = bdyx.m91610a(bdyw, "LoggingImprovements__log_rpc_list_cpid_endpoints", false);
                f184426t = bdyx.m91610a(bdyw, "LoggingImprovements__log_truncated_gcm_token", false);
                f184427u = bdyx.m91610a(bdyw, "LoggingImprovements__log_ui_action_start_and_stop", true);
                f184428v = bdyx.m91610a(bdyw, "LoggingImprovements__ui_maintains_event_flow_id", true);
                f184429w = bdyx.m91610a(bdyw, "LoggingImprovements__use_tracking_ids", true);
            } catch (bxwf e) {
                throw new AssertionError("Could not parse proto flag \"LoggingImprovements__bucket_delimeters_of_plan_minutes\"");
            }
        } catch (bxwf e2) {
            throw new AssertionError("Could not parse proto flag \"LoggingImprovements__bucket_delimeters_of_plan_bytes\"");
        }
    }

    /* renamed from: a */
    public final boolean mo81508a() {
        return ((Boolean) f184407a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final bydi mo81509b() {
        return (bydi) f184408b.mo58455c();
    }

    /* renamed from: c */
    public final bydi mo81510c() {
        return (bydi) f184409c.mo58455c();
    }

    /* renamed from: d */
    public final boolean mo81511d() {
        return ((Boolean) f184410d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo81512e() {
        return ((Boolean) f184411e.mo58455c()).booleanValue();
    }

    /* renamed from: f */
    public final boolean mo81513f() {
        return ((Boolean) f184412f.mo58455c()).booleanValue();
    }

    /* renamed from: g */
    public final boolean mo81514g() {
        return ((Boolean) f184413g.mo58455c()).booleanValue();
    }

    /* renamed from: h */
    public final boolean mo81515h() {
        return ((Boolean) f184414h.mo58455c()).booleanValue();
    }

    /* renamed from: i */
    public final boolean mo81516i() {
        return ((Boolean) f184415i.mo58455c()).booleanValue();
    }

    /* renamed from: j */
    public final boolean mo81517j() {
        return ((Boolean) f184416j.mo58455c()).booleanValue();
    }

    /* renamed from: k */
    public final boolean mo81518k() {
        return ((Boolean) f184417k.mo58455c()).booleanValue();
    }

    /* renamed from: l */
    public final boolean mo81519l() {
        return ((Boolean) f184418l.mo58455c()).booleanValue();
    }

    /* renamed from: m */
    public final boolean mo81520m() {
        return ((Boolean) f184419m.mo58455c()).booleanValue();
    }

    /* renamed from: n */
    public final boolean mo81521n() {
        return ((Boolean) f184420n.mo58455c()).booleanValue();
    }

    /* renamed from: o */
    public final boolean mo81522o() {
        return ((Boolean) f184421o.mo58455c()).booleanValue();
    }

    /* renamed from: p */
    public final boolean mo81523p() {
        return ((Boolean) f184422p.mo58455c()).booleanValue();
    }

    /* renamed from: q */
    public final boolean mo81524q() {
        return ((Boolean) f184423q.mo58455c()).booleanValue();
    }

    /* renamed from: r */
    public final boolean mo81525r() {
        return ((Boolean) f184424r.mo58455c()).booleanValue();
    }

    /* renamed from: s */
    public final boolean mo81526s() {
        return ((Boolean) f184425s.mo58455c()).booleanValue();
    }

    /* renamed from: t */
    public final boolean mo81527t() {
        return ((Boolean) f184426t.mo58455c()).booleanValue();
    }

    /* renamed from: u */
    public final boolean mo81528u() {
        return ((Boolean) f184427u.mo58455c()).booleanValue();
    }

    /* renamed from: v */
    public final boolean mo81529v() {
        return ((Boolean) f184428v.mo58455c()).booleanValue();
    }

    /* renamed from: w */
    public final boolean mo81530w() {
        return ((Boolean) f184429w.mo58455c()).booleanValue();
    }
}
