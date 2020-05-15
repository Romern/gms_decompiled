package p000;

/* renamed from: cgrv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgrv implements cgru {

    /* renamed from: a */
    public static final bdyx f187613a;

    /* renamed from: b */
    public static final bdyx f187614b;

    /* renamed from: c */
    public static final bdyx f187615c;

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
        bdyw a = new bdyw("com.google.android.metrics").mo58445a("gms:stats:");
        f187613a = bdyx.m91610a(a, "BatteryStats__collect_dogfooder_battery_stats", false);
        f187614b = bdyx.m91610a(a, "BatteryStats__filter_history", true);
        f187615c = bdyx.m91607a(a, "BatteryStats__record_interval_secs", 7200L);
    }

    /* renamed from: a */
    public final boolean mo84367a() {
        return ((Boolean) f187613a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo84368b() {
        return ((Boolean) f187614b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final long mo84369c() {
        return ((Long) f187615c.mo58455c()).longValue();
    }
}
