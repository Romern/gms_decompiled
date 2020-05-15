package p000;

/* renamed from: celg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class celg implements celf {

    /* renamed from: a */
    public static final bdyx f182892a;

    /* renamed from: b */
    public static final bdyx f182893b;

    /* renamed from: c */
    public static final bdyx f182894c;

    /* renamed from: d */
    public static final bdyx f182895d;

    /* renamed from: e */
    public static final bdyx f182896e;

    /* renamed from: f */
    public static final bdyx f182897f;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.herrevad")).mo58445a("herrevad:");
        bdyx.m91610a(a, "Telephony__always_collect_data_subscription_cellinfo", true);
        bdyx.m91610a(a, "Telephony__collect_carrier_aggregation_data", true);
        f182892a = bdyx.m91610a(a, "Telephony__collect_is_using_carrier_aggregation", true);
        bdyx.m91610a(a, "Telephony__collect_neighboring_cells_data", true);
        bdyx.m91610a(a, "Telephony__collect_nr_5g_network_state", true);
        f182893b = bdyx.m91610a(a, "Telephony__collect_opportunistic_bit", true);
        f182894c = bdyx.m91610a(a, "Telephony__collect_specific_carrier_id", true);
        bdyx.m91610a(a, "Telephony__collect_subscription_data", true);
        bdyx.m91610a(a, "Telephony__collection_enabled", true);
        f182895d = bdyx.m91610a(a, "Telephony__handle_request_cellinfo_npe", false);
        f182896e = bdyx.m91607a(a, "Telephony__request_cellinfo_timeout", 100L);
        f182897f = bdyx.m91610a(a, "Telephony__support_cellinfonr", true);
        bdyx.m91610a(a, "Telephony__use_active_phone_state_listener", true);
        bdyx.m91610a(a, "Telephony__use_default_data_sim_consistently", true);
    }

    /* renamed from: a */
    public final boolean mo79263a() {
        return ((Boolean) f182892a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo79264b() {
        return ((Boolean) f182893b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo79265c() {
        return ((Boolean) f182894c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo79266d() {
        return ((Boolean) f182895d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final long mo79267e() {
        return ((Long) f182896e.mo58455c()).longValue();
    }

    /* renamed from: f */
    public final boolean mo79268f() {
        return ((Boolean) f182897f.mo58455c()).booleanValue();
    }
}
