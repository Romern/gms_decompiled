package p000;

/* renamed from: cfwf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfwf implements cfwe {

    /* renamed from: a */
    public static final bdyx f185834a;

    /* renamed from: b */
    public static final bdyx f185835b;

    /* renamed from: c */
    public static final bdyx f185836c;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.people"));
        f185834a = bdyx.m91610a(bdyw, "FsaBugFixesY2019w28__enable_googlified_contacts_count_log_fix_enabled", false);
        f185835b = bdyx.m91610a(bdyw, "FsaBugFixesY2019w28__full_sync_when_star_group_not_synced_enabled", true);
        f185836c = bdyx.m91610a(bdyw, "FsaBugFixesY2019w28__set_group_notes_with_title_enabled", false);
    }

    /* renamed from: a */
    public final boolean mo82823a() {
        return ((Boolean) f185834a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo82824b() {
        return ((Boolean) f185835b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo82825c() {
        return ((Boolean) f185836c.mo58455c()).booleanValue();
    }
}
