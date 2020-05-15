package p000;

import android.content.ComponentName;

/* renamed from: skl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class skl {

    /* renamed from: a */
    public static final bdyx f44626a;

    /* renamed from: b */
    public static final bdyx f44627b = bdyx.m91607a(skm.f44632a, "stats:wakeLocks:time_out_duration", 600000L);

    /* renamed from: c */
    public static final bdyx f44628c = bdyx.m91610a(skm.f44632a, "stats:wakeLocks:enable_log_calling_package_info", true);

    /* renamed from: d */
    public static final bdyx f44629d = bdyx.m91607a(skm.f44632a, "stats:wakeLocks:max_timeout_heldlock", Long.MAX_VALUE);

    /* renamed from: e */
    public static final bdyx f44630e = bdyx.m91610a(skm.f44632a, "stats_wakeLocks_enable_work_chains_pi", false);

    /* renamed from: f */
    public static final bdyx f44631f = bdyx.m91608a(skm.f44632a, "stats_wakeLocks_timeout_overrides", sgn.f44426b, skk.f44625a);

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
        f44626a = bdyx.m91606a(bdyw, "stats:wakeLocks:level", 0);
    }
}
