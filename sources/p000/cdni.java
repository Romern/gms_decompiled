package p000;

/* renamed from: cdni */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdni implements cdnh {

    /* renamed from: a */
    public static final bdyx f181307a;

    /* renamed from: b */
    public static final bdyx f181308b;

    /* renamed from: c */
    public static final bdyx f181309c;

    /* renamed from: d */
    public static final bdyx f181310d;

    /* renamed from: e */
    public static final bdyx f181311e;

    /* renamed from: f */
    public static final bdyx f181312f;

    /* renamed from: g */
    public static final bdyx f181313g;

    /* renamed from: h */
    public static final bdyx f181314h;

    /* renamed from: i */
    public static final bdyx f181315i;

    /* renamed from: j */
    public static final bdyx f181316j;

    /* renamed from: k */
    public static final bdyx f181317k;

    /* renamed from: l */
    public static final bdyx f181318l;

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
        bdyw b = new bdyw("direct_boot:gms_chimera_phenotype_flags").mo58445a("gms:common:devicedoctor:").mo58450b();
        f181307a = bdyx.m91610a(b, "DeviceDoctor__defer_safeboot_logging", true);
        f181308b = bdyx.m91610a(b, "DeviceDoctor__fixer_framework_use_alternate_validity_time_for_non_complete_fixes", true);
        f181309c = bdyx.m91610a(b, "DeviceDoctor__safeboot_checkin_enabled", true);
        f181310d = bdyx.m91607a(b, "SafeBoot__safeboot_checkin_fix_valid_for_seconds", 3600L);
        f181311e = bdyx.m91610a(b, "DeviceDoctor__safeboot_clearcut_sos_enabled", true);
        f181312f = bdyx.m91607a(b, "SafeBoot__safeboot_clearcut_sos_fix_valid_for_seconds", 3600L);
        bdyx.m91610a(b, "SafeBoot__safeboot_consent_migration_enabled", false);
        f181313g = bdyx.m91610a(b, "DeviceDoctor__safeboot_enabled", true);
        f181314h = bdyx.m91610a(b, "SafeBoot__safeboot_fast_check_enabled", true);
        f181315i = bdyx.m91610a(b, "SafeBoot__safeboot_lazy_data_fetch_enabled", true);
        f181316j = bdyx.m91610a(b, "DeviceDoctor__safeboot_phenotype_fix_enabled", true);
        f181317k = bdyx.m91607a(b, "SafeBoot__safeboot_phenotype_fix_valid_for_seconds", 900L);
        bdyx.m91607a(b, "SafeBoot__safeboot_restart_max_restart_files", 10L);
        f181318l = bdyx.m91610a(b, "SafeBoot__safeboot_restart_trigger_enabled", false);
    }

    /* renamed from: a */
    public final boolean mo77953a() {
        return ((Boolean) f181307a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo77954b() {
        return ((Boolean) f181308b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo77955c() {
        return ((Boolean) f181309c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final long mo77956d() {
        return ((Long) f181310d.mo58455c()).longValue();
    }

    /* renamed from: e */
    public final boolean mo77957e() {
        return ((Boolean) f181311e.mo58455c()).booleanValue();
    }

    /* renamed from: f */
    public final long mo77958f() {
        return ((Long) f181312f.mo58455c()).longValue();
    }

    /* renamed from: g */
    public final boolean mo77959g() {
        return ((Boolean) f181313g.mo58455c()).booleanValue();
    }

    /* renamed from: h */
    public final boolean mo77960h() {
        return ((Boolean) f181314h.mo58455c()).booleanValue();
    }

    /* renamed from: i */
    public final boolean mo77961i() {
        return ((Boolean) f181315i.mo58455c()).booleanValue();
    }

    /* renamed from: j */
    public final boolean mo77962j() {
        return ((Boolean) f181316j.mo58455c()).booleanValue();
    }

    /* renamed from: k */
    public final long mo77963k() {
        return ((Long) f181317k.mo58455c()).longValue();
    }

    /* renamed from: l */
    public final boolean mo77964l() {
        return ((Boolean) f181318l.mo58455c()).booleanValue();
    }
}
