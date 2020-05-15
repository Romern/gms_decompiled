package p000;

/* renamed from: ccce */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccce implements cccd {

    /* renamed from: a */
    public static final bdyx f178740a;

    /* renamed from: b */
    public static final bdyx f178741b;

    /* renamed from: c */
    public static final bdyx f178742c;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.auth_api_account_transfer"));
        f178740a = bdyx.m91610a(bdyw, "PreExistingFlags__add_ids_to_broadcasts", true);
        f178741b = bdyx.m91607a(bdyw, "PreExistingFlags__purge_data_schedule_window_length_in_sec", 86400L);
        f178742c = bdyx.m91607a(bdyw, "PreExistingFlags__purge_data_time_in_sec", 864000L);
    }

    /* renamed from: a */
    public final boolean mo75757a() {
        return ((Boolean) f178740a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final long mo75758b() {
        return ((Long) f178741b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final long mo75759c() {
        return ((Long) f178742c.mo58455c()).longValue();
    }
}
