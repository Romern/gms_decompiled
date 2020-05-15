package p000;

/* renamed from: cgbq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgbq implements cgbp {

    /* renamed from: a */
    public static final bdyx f186292a;

    /* renamed from: b */
    public static final bdyx f186293b;

    /* renamed from: c */
    public static final bdyx f186294c;

    /* renamed from: d */
    public static final bdyx f186295d;

    /* renamed from: e */
    public static final bdyx f186296e;

    /* renamed from: f */
    public static final bdyx f186297f;

    /* renamed from: g */
    public static final bdyx f186298g;

    /* renamed from: h */
    public static final bdyx f186299h;

    /* renamed from: i */
    public static final bdyx f186300i;

    /* renamed from: j */
    public static final bdyx f186301j;

    /* renamed from: k */
    public static final bdyx f186302k;

    /* renamed from: l */
    public static final bdyx f186303l;

    /* renamed from: m */
    public static final bdyx f186304m;

    /* renamed from: n */
    public static final bdyx f186305n;

    /* renamed from: o */
    public static final bdyx f186306o;

    /* renamed from: p */
    public static final bdyx f186307p;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.people"));
        f186292a = bdyx.m91610a(bdyw, "PeopleDeletedNullContactsCleanup__enable_aggregator_version_logging", true);
        bdyx.m91610a(bdyw, "PeopleDeletedNullContactsCleanup__logging_dangling_contacts", false);
        f186293b = bdyx.m91610a(bdyw, "PeopleDeletedNullContactsCleanup__logging_dangling_contacts_with_api_fix", false);
        f186294c = bdyx.m91607a(bdyw, "PeopleDeletedNullContactsCleanup__oneoff_task_execution_window_seconds", 1800L);
        f186295d = bdyx.m91610a(bdyw, "PeopleDeletedNullContactsCleanup__oneoff_task_is_enabled", false);
        f186296e = bdyx.m91610a(bdyw, "PeopleDeletedNullContactsCleanup__oneoff_task_requires_charging", false);
        f186297f = bdyx.m91610a(bdyw, "PeopleDeletedNullContactsCleanup__oneoff_task_requires_device_idle", false);
        f186298g = bdyx.m91607a(bdyw, "PeopleDeletedNullContactsCleanup__oneoff_task_threshold_seconds_since_last_run", 86400L);
        f186299h = bdyx.m91607a(bdyw, "PeopleDeletedNullContactsCleanup__periodic_interval_seconds", 86400L);
        f186300i = bdyx.m91607a(bdyw, "PeopleDeletedNullContactsCleanup__periodic_task_flex_seconds", 600L);
        f186301j = bdyx.m91610a(bdyw, "PeopleDeletedNullContactsCleanup__periodic_task_is_enabled", true);
        f186302k = bdyx.m91610a(bdyw, "PeopleDeletedNullContactsCleanup__periodic_task_persisted", true);
        f186303l = bdyx.m91610a(bdyw, "PeopleDeletedNullContactsCleanup__periodic_task_requires_charging", true);
        f186304m = bdyx.m91610a(bdyw, "PeopleDeletedNullContactsCleanup__periodic_task_requires_device_idle", false);
        f186305n = bdyx.m91610a(bdyw, "PeopleDeletedNullContactsCleanup__periodic_task_use_flex", false);
        f186306o = bdyx.m91610a(bdyw, "PeopleDeletedNullContactsCleanup__service_enabled", true);
        f186307p = bdyx.m91610a(bdyw, "PeopleDeletedNullContactsCleanup__use_elapsed_real_time_enabled", true);
    }

    /* renamed from: a */
    public final boolean mo83228a() {
        return ((Boolean) f186292a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo83229b() {
        return ((Boolean) f186293b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final long mo83230c() {
        return ((Long) f186294c.mo58455c()).longValue();
    }

    /* renamed from: d */
    public final boolean mo83231d() {
        return ((Boolean) f186295d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo83232e() {
        return ((Boolean) f186296e.mo58455c()).booleanValue();
    }

    /* renamed from: f */
    public final boolean mo83233f() {
        return ((Boolean) f186297f.mo58455c()).booleanValue();
    }

    /* renamed from: g */
    public final long mo83234g() {
        return ((Long) f186298g.mo58455c()).longValue();
    }

    /* renamed from: h */
    public final long mo83235h() {
        return ((Long) f186299h.mo58455c()).longValue();
    }

    /* renamed from: i */
    public final long mo83236i() {
        return ((Long) f186300i.mo58455c()).longValue();
    }

    /* renamed from: j */
    public final boolean mo83237j() {
        return ((Boolean) f186301j.mo58455c()).booleanValue();
    }

    /* renamed from: k */
    public final boolean mo83238k() {
        return ((Boolean) f186302k.mo58455c()).booleanValue();
    }

    /* renamed from: l */
    public final boolean mo83239l() {
        return ((Boolean) f186303l.mo58455c()).booleanValue();
    }

    /* renamed from: m */
    public final boolean mo83240m() {
        return ((Boolean) f186304m.mo58455c()).booleanValue();
    }

    /* renamed from: n */
    public final boolean mo83241n() {
        return ((Boolean) f186305n.mo58455c()).booleanValue();
    }

    /* renamed from: o */
    public final boolean mo83242o() {
        return ((Boolean) f186306o.mo58455c()).booleanValue();
    }

    /* renamed from: p */
    public final boolean mo83243p() {
        return ((Boolean) f186307p.mo58455c()).booleanValue();
    }
}
