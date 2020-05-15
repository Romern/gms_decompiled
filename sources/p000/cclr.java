package p000;

/* renamed from: cclr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cclr implements cclq {

    /* renamed from: a */
    public static final bdyx f179366a;

    /* renamed from: b */
    public static final bdyx f179367b;

    /* renamed from: c */
    public static final bdyx f179368c;

    /* renamed from: d */
    public static final bdyx f179369d;

    /* renamed from: e */
    public static final bdyx f179370e;

    /* renamed from: f */
    public static final bdyx f179371f;

    /* renamed from: g */
    public static final bdyx f179372g;

    /* renamed from: h */
    public static final bdyx f179373h;

    /* renamed from: i */
    public static final bdyx f179374i;

    /* renamed from: j */
    public static final bdyx f179375j;

    /* renamed from: k */
    public static final bdyx f179376k;

    /* renamed from: l */
    public static final bdyx f179377l;

    /* renamed from: m */
    public static final bdyx f179378m;

    /* renamed from: n */
    public static final bdyx f179379n;

    /* renamed from: o */
    public static final bdyx f179380o;

    /* renamed from: p */
    public static final bdyx f179381p;

    /* renamed from: q */
    public static final bdyx f179382q;

    /* renamed from: r */
    public static final bdyx f179383r;

    /* renamed from: s */
    public static final bdyx f179384s;

    /* renamed from: t */
    public static final bdyx f179385t;

    /* renamed from: u */
    public static final bdyx f179386u;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.backup"));
        f179366a = bdyx.m91607a(bdyw, "backup_encryption_diff_script_max_chunk_size_bytes", 1048576L);
        f179367b = bdyx.m91610a(bdyw, "Encryption__backup_encryption_initialize_key_when_account_set", true);
        f179368c = bdyx.m91610a(bdyw, "Encryption__backup_encryption_request_backoff_if_key_not_synced", true);
        f179369d = bdyx.m91607a(bdyw, "Encryption__backup_encryption_request_backoff_if_key_not_synced_backoff_ms", 43200000L);
        f179370e = bdyx.m91610a(bdyw, "Encryption__backup_encryption_should_deduplicate_keys_in_kv_backup", true);
        f179371f = bdyx.m91610a(bdyw, "Encryption__backup_encryption_should_keep_keys_if_user_unchanged", true);
        f179372g = bdyx.m91610a(bdyw, "Encryption__backup_encryption_should_perform_full_if_salt_unavailable", true);
        f179373h = bdyx.m91610a(bdyw, "Encryption__backup_lazy_create_recovery_controller", true);
        f179374i = bdyx.m91607a(bdyw, "backup_max_backups_until_tertiary_key_rotation", 31L);
        f179375j = bdyx.m91607a(bdyw, "backup_maximum_key_rotations_per_window", 2L);
        f179376k = bdyx.m91610a(bdyw, "Encryption__backup_remove_silent_feedback_for_missing_account", true);
        f179377l = bdyx.m91610a(bdyw, "backup_require_encryption_opt_in", true);
        f179378m = bdyx.m91607a(bdyw, "backup_secondary_key_rotation_interval_ms", 2678400000L);
        f179379n = bdyx.m91610a(bdyw, "backup_should_set_secondary_key_version_in_restore_requests", true);
        f179380o = bdyx.m91605a(bdyw, "backup_silent_feedback_sampling_rate_encryption", 0.01d);
        f179381p = bdyx.m91605a(bdyw, "backup_silent_feedback_sampling_rate_temp_crypto_backup", 0.01d);
        f179382q = bdyx.m91605a(bdyw, "backup_silent_feedback_sampling_rate_unsupported_crypto", 0.01d);
        f179383r = bdyx.m91610a(bdyw, "Encryption__backup_skip_p_api_calls_on_pre_p_when_checking_eligibility", true);
        f179384s = bdyx.m91610a(bdyw, "backup_use_correct_recovery_controller_is_enabled_method", true);
        f179385t = bdyx.m91610a(bdyw, "backup_use_sh_backup_servers", false);
        f179386u = bdyx.m91610a(bdyw, "backup_should_not_show_backup_date_if_key_not_synced", false);
    }

    /* renamed from: a */
    public final long mo76298a() {
        return ((Long) f179366a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final boolean mo76299b() {
        return ((Boolean) f179367b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo76300c() {
        return ((Boolean) f179368c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final long mo76301d() {
        return ((Long) f179369d.mo58455c()).longValue();
    }

    /* renamed from: e */
    public final boolean mo76302e() {
        return ((Boolean) f179370e.mo58455c()).booleanValue();
    }

    /* renamed from: f */
    public final boolean mo76303f() {
        return ((Boolean) f179371f.mo58455c()).booleanValue();
    }

    /* renamed from: g */
    public final boolean mo76304g() {
        return ((Boolean) f179372g.mo58455c()).booleanValue();
    }

    /* renamed from: h */
    public final boolean mo76305h() {
        return ((Boolean) f179373h.mo58455c()).booleanValue();
    }

    /* renamed from: i */
    public final long mo76306i() {
        return ((Long) f179374i.mo58455c()).longValue();
    }

    /* renamed from: j */
    public final long mo76307j() {
        return ((Long) f179375j.mo58455c()).longValue();
    }

    /* renamed from: k */
    public final boolean mo76308k() {
        return ((Boolean) f179376k.mo58455c()).booleanValue();
    }

    /* renamed from: l */
    public final boolean mo76309l() {
        return ((Boolean) f179377l.mo58455c()).booleanValue();
    }

    /* renamed from: m */
    public final long mo76310m() {
        return ((Long) f179378m.mo58455c()).longValue();
    }

    /* renamed from: n */
    public final boolean mo76311n() {
        return ((Boolean) f179379n.mo58455c()).booleanValue();
    }

    /* renamed from: o */
    public final double mo76312o() {
        return ((Double) f179380o.mo58455c()).doubleValue();
    }

    /* renamed from: p */
    public final double mo76313p() {
        return ((Double) f179381p.mo58455c()).doubleValue();
    }

    /* renamed from: q */
    public final double mo76314q() {
        return ((Double) f179382q.mo58455c()).doubleValue();
    }

    /* renamed from: r */
    public final boolean mo76315r() {
        return ((Boolean) f179383r.mo58455c()).booleanValue();
    }

    /* renamed from: s */
    public final boolean mo76316s() {
        return ((Boolean) f179384s.mo58455c()).booleanValue();
    }

    /* renamed from: t */
    public final boolean mo76317t() {
        return ((Boolean) f179385t.mo58455c()).booleanValue();
    }

    /* renamed from: u */
    public final boolean mo76318u() {
        return ((Boolean) f179386u.mo58455c()).booleanValue();
    }
}
