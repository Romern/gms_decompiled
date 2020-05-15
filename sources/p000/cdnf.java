package p000;

/* renamed from: cdnf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdnf implements cdne {

    /* renamed from: a */
    public static final bdyx f181302a;

    /* renamed from: b */
    public static final bdyx f181303b;

    /* renamed from: c */
    public static final bdyx f181304c;

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
        bdyw a = new bdyw("direct_boot:gms_chimera_phenotype_flags").mo58445a("gms:common:sqlite_");
        f181302a = bdyx.m91609a(a, "SQLite__idle_connection_timeout_blacklisted_database_names", "");
        f181303b = bdyx.m91607a(a, "SQLite__idle_connection_timeout_ms", 30000L);
        f181304c = bdyx.m91610a(a, "SQLite__use_idle_connection_timeout_modules", false);
    }

    /* renamed from: a */
    public final String mo77949a() {
        return (String) f181302a.mo58455c();
    }

    /* renamed from: b */
    public final long mo77950b() {
        return ((Long) f181303b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final boolean mo77951c() {
        return ((Boolean) f181304c.mo58455c()).booleanValue();
    }
}
