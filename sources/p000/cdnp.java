package p000;

/* renamed from: cdnp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdnp implements cdno {

    /* renamed from: a */
    public static final bdyx f181332a;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms"));
        bdyx.m91610a(bdyw, "SchedulerDatabase__enable_database_schema_version_15", true);
        bdyx.m91610a(bdyw, "SchedulerDatabase__enable_database_schema_version_17", true);
        f181332a = bdyx.m91610a(bdyw, "SchedulerDatabase__enable_database_schema_version_18_v2", false);
    }

    /* renamed from: a */
    public final boolean mo77975a() {
        return ((Boolean) f181332a.mo58455c()).booleanValue();
    }
}
