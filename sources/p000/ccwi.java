package p000;

/* renamed from: ccwi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccwi implements ccwh {

    /* renamed from: a */
    public static final bdyx f180104a;

    /* renamed from: b */
    public static final bdyx f180105b;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.car"));
        f180104a = bdyx.m91607a(bdyw, "media_stats_logging_millis", 10000L);
        f180105b = bdyx.m91610a(bdyw, "VideoStatsLoggingFeature__video_stats_period_focused_time_only", false);
    }

    /* renamed from: a */
    public final long mo76939a() {
        return ((Long) f180104a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final boolean mo76940b() {
        return ((Boolean) f180105b.mo58455c()).booleanValue();
    }
}
