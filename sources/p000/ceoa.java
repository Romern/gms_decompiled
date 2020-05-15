package p000;

/* renamed from: ceoa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ceoa implements cenz {

    /* renamed from: a */
    public static final bdyx f183132a;

    /* renamed from: b */
    public static final bdyx f183133b;

    /* renamed from: c */
    public static final bdyx f183134c;

    /* renamed from: d */
    public static final bdyx f183135d;

    /* renamed from: e */
    public static final bdyx f183136e;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.icing.mdh")).mo58443a();
        f183132a = bdyx.m91610a(a, "CoreFeature__do_not_broadcast_null_subscription_on_delete", true);
        f183133b = bdyx.m91610a(a, "CoreFeature__enable_network_tags", false);
        f183134c = bdyx.m91610a(a, "CoreFeature__enable_subscription_logging", true);
        bdyx.m91610a(a, "CoreFeature__enable_subscription_ttl_on_access", true);
        f183135d = bdyx.m91610a(a, "CoreFeature__propagate_exceptions_from_execute_sync", false);
        f183136e = bdyx.m91610a(a, "CoreFeature__recreate_grpc_channel_on_flags_change", true);
    }

    /* renamed from: a */
    public final boolean mo79475a() {
        return ((Boolean) f183132a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo79476b() {
        return ((Boolean) f183133b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo79477c() {
        return ((Boolean) f183134c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo79478d() {
        return ((Boolean) f183135d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo79479e() {
        return ((Boolean) f183136e.mo58455c()).booleanValue();
    }
}
