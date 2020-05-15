package p000;

/* renamed from: cdmw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdmw implements cdmv {

    /* renamed from: a */
    public static final bdyx f181274a;

    /* renamed from: b */
    public static final bdyx f181275b;

    /* renamed from: c */
    public static final bdyx f181276c;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms"));
        f181274a = bdyx.m91607a(bdyw, "ProtoDataStoreFeature__dasu_sampling_interval", 0L);
        f181275b = bdyx.m91610a(bdyw, "ProtoDataStoreFeature__enable_accounts_in_factory", false);
        f181276c = bdyx.m91610a(bdyw, "ProtoDataStoreFeature__enable_signalling_account_manager", false);
    }

    /* renamed from: a */
    public final long mo77924a() {
        return ((Long) f181274a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final boolean mo77925b() {
        return ((Boolean) f181275b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo77926c() {
        return ((Boolean) f181276c.mo58455c()).booleanValue();
    }
}
