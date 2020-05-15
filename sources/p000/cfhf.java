package p000;

/* renamed from: cfhf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfhf implements cfhe {

    /* renamed from: a */
    public static final bdyx f184082a;

    /* renamed from: b */
    public static final bdyx f184083b;

    /* renamed from: c */
    public static final bdyx f184084c;

    /* renamed from: d */
    public static final bdyx f184085d;

    /* renamed from: e */
    public static final bdyx f184086e;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.mdisync")).mo58443a();
        f184082a = bdyx.m91607a(a, "CoreFeature__proto_data_store_dasu_sampling_interval", 0L);
        f184083b = bdyx.m91607a(a, "PdsFeature__first_party_acl_fetcher_stats_sampling_interval", 0L);
        f184084c = bdyx.m91607a(a, "PdsFeature__intent_delivery_timeout_secs", 10L);
        f184085d = bdyx.m91607a(a, "PdsFeature__intent_success_sampling_interval", 0L);
        f184086e = bdyx.m91607a(a, "CoreFeature__proto_data_store_intent_sampling_interval", 0L);
    }

    /* renamed from: a */
    public final long mo81231a() {
        return ((Long) f184082a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final long mo81232b() {
        return ((Long) f184083b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final long mo81233c() {
        return ((Long) f184084c.mo58455c()).longValue();
    }

    /* renamed from: d */
    public final long mo81234d() {
        return ((Long) f184085d.mo58455c()).longValue();
    }

    /* renamed from: e */
    public final long mo81235e() {
        return ((Long) f184086e.mo58455c()).longValue();
    }
}
