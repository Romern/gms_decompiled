package p000;

/* renamed from: cdyw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdyw implements cdyv {

    /* renamed from: A */
    public static final bdyx f181964A;

    /* renamed from: a */
    public static final bdyx f181965a;

    /* renamed from: b */
    public static final bdyx f181966b;

    /* renamed from: c */
    public static final bdyx f181967c;

    /* renamed from: d */
    public static final bdyx f181968d;

    /* renamed from: e */
    public static final bdyx f181969e;

    /* renamed from: f */
    public static final bdyx f181970f;

    /* renamed from: g */
    public static final bdyx f181971g;

    /* renamed from: h */
    public static final bdyx f181972h;

    /* renamed from: i */
    public static final bdyx f181973i;

    /* renamed from: j */
    public static final bdyx f181974j;

    /* renamed from: k */
    public static final bdyx f181975k;

    /* renamed from: l */
    public static final bdyx f181976l;

    /* renamed from: m */
    public static final bdyx f181977m;

    /* renamed from: n */
    public static final bdyx f181978n;

    /* renamed from: o */
    public static final bdyx f181979o;

    /* renamed from: p */
    public static final bdyx f181980p;

    /* renamed from: q */
    public static final bdyx f181981q;

    /* renamed from: r */
    public static final bdyx f181982r;

    /* renamed from: s */
    public static final bdyx f181983s;

    /* renamed from: t */
    public static final bdyx f181984t;

    /* renamed from: u */
    public static final bdyx f181985u;

    /* renamed from: v */
    public static final bdyx f181986v;

    /* renamed from: w */
    public static final bdyx f181987w;

    /* renamed from: x */
    public static final bdyx f181988x;

    /* renamed from: y */
    public static final bdyx f181989y;

    /* renamed from: z */
    public static final bdyx f181990z;

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
    static {
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.fitness")).mo58445a("fitness.");
        f181965a = bdyx.m91610a(a, "BugFixes__bug_reports_outside_recording_delegate", true);
        f181966b = bdyx.m91610a(a, "BugFixes__check_recording_permission_on_binder_thread", true);
        f181967c = bdyx.m91610a(a, "BugFixes__compare_session_app_package_only", true);
        f181968d = bdyx.m91610a(a, "BugFixes__delete_duplicate_sessions", true);
        f181969e = bdyx.m91610a(a, "BugFixes__double_check_background_data_type", true);
        bdyx.m91610a(a, "handle_no_account_signout", false);
        f181970f = bdyx.m91610a(a, "BugFixes__handle_removed_account_sync", true);
        bdyx.m91610a(a, "BugFixes__handle_removed_account_sync_wear", true);
        f181971g = bdyx.m91610a(a, "BugFixes__ignore_missing_registration_when_recording_disabled", true);
        f181972h = bdyx.m91610a(a, "init_recording_on_skipped_sync", true);
        f181973i = bdyx.m91610a(a, "init_recording_service", true);
        f181974j = bdyx.m91610a(a, "BugFixes__init_recording_service_on_package_replaced", true);
        f181975k = bdyx.m91610a(a, "limit_level_db_timestamp_reads", true);
        f181976l = bdyx.m91610a(a, "BugFixes__log_database_corruption", true);
        f181977m = bdyx.m91607a(a, "maximum_bucket_count", 86400L);
        bdyx.m91610a(a, "new_account_resolution", false);
        bdyx.m91610a(a, "perform_real_auth_check_on_wear", false);
        f181978n = bdyx.m91610a(a, "BugFixes__persist_last_sync_time_always", true);
        f181979o = bdyx.m91610a(a, "BugFixes__recording_initializer_check_future", true);
        f181980p = bdyx.m91610a(a, "BugFixes__reinitialize_legacy_sync", true);
        bdyx.m91610a(a, "BugFixes__remove_flp_internal_helper_uses", true);
        f181981q = bdyx.m91610a(a, "BugFixes__retain_subscriptions_on_package_disabled", true);
        f181982r = bdyx.m91610a(a, "BugFixes__return_error_on_recording_listener_registration_failure", true);
        f181983s = bdyx.m91610a(a, "BugFixes__return_permission_check_fail_status_code", true);
        f181984t = bdyx.m91610a(a, "BugFixes__return_read_stats_in_shared_memory", true);
        f181985u = bdyx.m91610a(a, "BugFixes__skip_settings_ui_for_manage_data", true);
        f181986v = bdyx.m91610a(a, "skip_unnecessary_sync_adapter_init", true);
        f181987w = bdyx.m91610a(a, "BugFixes__skip_unnecessary_sync_adapter_sync", true);
        f181988x = bdyx.m91610a(a, "BugFixes__subscription_propagation_fix", true);
        f181989y = bdyx.m91610a(a, "BugFixes__throw_missing_ar_install_permission", true);
        f181990z = bdyx.m91610a(a, "BugFixes__trigger_wear_sync_on_successful_phone_sync", true);
        f181964A = bdyx.m91610a(a, "BugFixes__use_session_store_to_determine_active_sessions", true);
    }

    /* renamed from: A */
    public final boolean mo78496A() {
        return ((Boolean) f181964A.mo58455c()).booleanValue();
    }

    /* renamed from: a */
    public final boolean mo78497a() {
        return ((Boolean) f181965a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo78498b() {
        return ((Boolean) f181966b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo78499c() {
        return ((Boolean) f181967c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo78500d() {
        return ((Boolean) f181968d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo78501e() {
        return ((Boolean) f181969e.mo58455c()).booleanValue();
    }

    /* renamed from: f */
    public final boolean mo78502f() {
        return ((Boolean) f181970f.mo58455c()).booleanValue();
    }

    /* renamed from: g */
    public final boolean mo78503g() {
        return ((Boolean) f181971g.mo58455c()).booleanValue();
    }

    /* renamed from: h */
    public final boolean mo78504h() {
        return ((Boolean) f181972h.mo58455c()).booleanValue();
    }

    /* renamed from: i */
    public final boolean mo78505i() {
        return ((Boolean) f181973i.mo58455c()).booleanValue();
    }

    /* renamed from: j */
    public final boolean mo78506j() {
        return ((Boolean) f181974j.mo58455c()).booleanValue();
    }

    /* renamed from: k */
    public final boolean mo78507k() {
        return ((Boolean) f181975k.mo58455c()).booleanValue();
    }

    /* renamed from: l */
    public final boolean mo78508l() {
        return ((Boolean) f181976l.mo58455c()).booleanValue();
    }

    /* renamed from: m */
    public final long mo78509m() {
        return ((Long) f181977m.mo58455c()).longValue();
    }

    /* renamed from: n */
    public final boolean mo78510n() {
        return ((Boolean) f181978n.mo58455c()).booleanValue();
    }

    /* renamed from: o */
    public final boolean mo78511o() {
        return ((Boolean) f181979o.mo58455c()).booleanValue();
    }

    /* renamed from: p */
    public final boolean mo78512p() {
        return ((Boolean) f181980p.mo58455c()).booleanValue();
    }

    /* renamed from: q */
    public final boolean mo78513q() {
        return ((Boolean) f181981q.mo58455c()).booleanValue();
    }

    /* renamed from: r */
    public final boolean mo78514r() {
        return ((Boolean) f181982r.mo58455c()).booleanValue();
    }

    /* renamed from: s */
    public final boolean mo78515s() {
        return ((Boolean) f181983s.mo58455c()).booleanValue();
    }

    /* renamed from: t */
    public final boolean mo78516t() {
        return ((Boolean) f181984t.mo58455c()).booleanValue();
    }

    /* renamed from: u */
    public final boolean mo78517u() {
        return ((Boolean) f181985u.mo58455c()).booleanValue();
    }

    /* renamed from: v */
    public final boolean mo78518v() {
        return ((Boolean) f181986v.mo58455c()).booleanValue();
    }

    /* renamed from: w */
    public final boolean mo78519w() {
        return ((Boolean) f181987w.mo58455c()).booleanValue();
    }

    /* renamed from: x */
    public final boolean mo78520x() {
        return ((Boolean) f181988x.mo58455c()).booleanValue();
    }

    /* renamed from: y */
    public final boolean mo78521y() {
        return ((Boolean) f181989y.mo58455c()).booleanValue();
    }

    /* renamed from: z */
    public final boolean mo78522z() {
        return ((Boolean) f181990z.mo58455c()).booleanValue();
    }
}
