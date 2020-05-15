package p000;

/* renamed from: ceah */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ceah implements ceag {

    /* renamed from: a */
    public static final bdyx f182157a;

    /* renamed from: b */
    public static final bdyx f182158b;

    /* renamed from: c */
    public static final bdyx f182159c;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.fitness")).mo58445a("fitness.");
        f182157a = bdyx.m91609a(a, "phone_to_wear_blacklisted_datatypes", "com.google.android.apps.fitness.autodetect.event,com.google.android.apps.fitness.battery_cost,com.google.sensor.const_rate_events,com.google.sensor.events");
        bdyx.m91610a(a, "fetch_missing_data_sources", true);
        f182158b = bdyx.m91607a(a, "minimum_subscription_sync_interval_millis", 86400000L);
        bdyx.m91610a(a, "wearable_sync_subscriptions", true);
        f182159c = bdyx.m91609a(a, "wear_to_phone_blacklisted_datatypes", "com.google.android.apps.fitness.autodetect.event");
        bdyx.m91610a(a, "wearable_sync_over_wifi", false);
    }

    /* renamed from: a */
    public final String mo78677a() {
        return (String) f182157a.mo58455c();
    }

    /* renamed from: b */
    public final String mo78678b() {
        return (String) f182159c.mo58455c();
    }
}
