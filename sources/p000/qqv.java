package p000;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

/* renamed from: qqv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qqv {

    /* renamed from: a */
    public static final bdyx f41964a;

    /* renamed from: b */
    public static final bdyx f41965b = bdyx.m91609a(f41982s, "password_api_grpc_host", "chromesyncpasswords-pa.googleapis.com");

    /* renamed from: c */
    public static final bdyx f41966c = bdyx.m91606a(f41982s, "password_api_grpc_port", 443);

    /* renamed from: d */
    public static final bdyx f41967d = bdyx.m91609a(f41982s, "password_api_server_scope", "https://www.googleapis.com/auth/login_manager");

    /* renamed from: e */
    public static final bdyx f41968e = bdyx.m91609a(f41982s, "sync_entity_api_grpc_host", "chromesyncentities-pa.googleapis.com");

    /* renamed from: f */
    public static final bdyx f41969f = bdyx.m91606a(f41982s, "sync_entity_api_grpc_port", 443);

    /* renamed from: g */
    public static final bdyx f41970g = bdyx.m91609a(f41982s, "sync_entity_api_server_scope", "https://www.googleapis.com/auth/login_manager");

    /* renamed from: h */
    public static final bdyx f41971h = bdyx.m91609a(f41982s, "affiliation_api_server_url", "https://www.googleapis.com");

    /* renamed from: i */
    public static final bdyx f41972i = bdyx.m91609a(f41982s, "affiliation_api_server_path", "/affiliation/v1");

    /* renamed from: j */
    public static final bdyx f41973j = bdyx.m91609a(f41982s, "affiliation_api_apiary_trace", "");

    /* renamed from: k */
    public static final bdyx f41974k = bdyx.m91607a(f41982s, "sync:delay_for_gsync_tickle", TimeUnit.MINUTES.toMillis(2));

    /* renamed from: l */
    public static final bdyx f41975l = bdyx.m91609a(f41982s, "sync:foreground_rate_limit_millis", TextUtils.join(",", new Long[]{Long.valueOf(TimeUnit.SECONDS.toMillis(10))}));

    /* renamed from: m */
    public static final bdyx f41976m = bdyx.m91609a(f41982s, "sync:rate_limit_millis", TextUtils.join(",", new Long[]{Long.valueOf(TimeUnit.SECONDS.toMillis(10)), Long.valueOf(TimeUnit.MINUTES.toMillis(1)), Long.valueOf(TimeUnit.MINUTES.toMillis(5)), Long.valueOf(TimeUnit.HOURS.toMillis(1))}));

    /* renamed from: n */
    public static final bdyx f41977n = bdyx.m91607a(f41982s, "sync:min_delay_on_server_error_millis", TimeUnit.MINUTES.toMillis(2));

    /* renamed from: o */
    public static final bdyx f41978o = bdyx.m91607a(f41982s, "sync:max_delay_on_server_error_millis", TimeUnit.DAYS.toMillis(14));

    /* renamed from: p */
    public static final bdyx f41979p = bdyx.m91607a(f41982s, "sync:delay_on_server_overload_millis", TimeUnit.DAYS.toMillis(3));

    /* renamed from: q */
    public static final bdyx f41980q = bdyx.m91607a(f41982s, "affiliation_version", 1L);

    /* renamed from: r */
    public static final bdyx f41981r = bdyx.m91609a(f41982s, "enabled_log_types", "");

    /* renamed from: s */
    private static final bdyw f41982s;

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
        bdyw a = new bdyw(anef.m64088a("com.google.android.gms.chromesync")).mo58445a("gms:chromesync:");
        f41982s = a;
        f41964a = bdyx.m91609a(a, "chrome_dashboard_link", "https://www.google.com/settings/chrome/sync");
        bdyx.m91610a(f41982s, "password_api_use_grpc", true);
        bdyx.m91609a(f41982s, "affiliation_api_grpc_host", "www.googleapis.com");
        bdyx.m91606a(f41982s, "affiliation_api_grpc_port", 443);
        bdyx.m91609a(f41982s, "affiliation_api_grpc_server_scope", "https://www.googleapis.com/auth/login_manager");
    }
}
