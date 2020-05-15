package p000;

/* renamed from: cfxa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfxa implements cfwz {

    /* renamed from: a */
    public static final bdyx f185867a;

    /* renamed from: b */
    public static final bdyx f185868b;

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
        f185867a = bdyx.m91610a(bdyw, "FsaBugFixesY2020w03__log_sync_failed_raw_contacts_enabled", true);
        f185868b = bdyx.m91610a(bdyw, "FsaBugFixesY2020w03__trim_group_title_before_dedup_enabled", true);
    }

    /* renamed from: a */
    public final boolean mo82849a() {
        return ((Boolean) f185867a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo82850b() {
        return ((Boolean) f185868b.mo58455c()).booleanValue();
    }
}
