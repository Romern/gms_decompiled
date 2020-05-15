package p000;

import android.content.ComponentName;

/* renamed from: skj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class skj {

    /* renamed from: a */
    public static final bdyx f44618a;

    /* renamed from: b */
    public static final bdyx f44619b = bdyx.m91607a(skm.f44632a, "stats:network_usage:interval_in_seconds", 0L);

    /* renamed from: c */
    public static final bdyx f44620c = bdyx.m91607a(skm.f44632a, "stats:network_usage:flex_time_in_seconds", 3600L);

    /* renamed from: d */
    public static final bdyx f44621d = bdyx.m91607a(skm.f44632a, "stats:network_usage:network_report_N_start_time_delta_in_millis", -86400000L);

    /* renamed from: e */
    public static final bdyx f44622e = bdyx.m91607a(skm.f44632a, "stats:network_usage:network_report_N_duration_in_millis", 86400000L);

    /* renamed from: f */
    public static final bdyx f44623f = bdyx.m91607a(skm.f44632a, "stats:network_usage:interval_in_seconds_for_androidN_bucket_interval", 0L);

    /* renamed from: g */
    public static final bdyx f44624g = bdyx.m91610a(skm.f44632a, "stats:network_usage:network_tracking_androidN_enabled", false);

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
        bdyw bdyw = skm.f44632a;
        ComponentName componentName = skr.f44644a;
        f44618a = bdyx.m91606a(bdyw, "stats:network_usage:level", 0);
        bdyx.m91610a(skm.f44632a, "stats:network_usage:yesterday_report_androidN_enabled", false);
        bdyx.m91607a(skm.f44632a, "stats:network_usage:yesterday_report_androidN_flex_time_in_seconds", 3600L);
    }
}
