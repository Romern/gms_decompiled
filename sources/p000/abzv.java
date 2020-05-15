package p000;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: abzv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abzv {

    /* renamed from: A */
    public static final bdyx f59007A = bdyx.m91607a(f59013G, "gms_icing_silent_feedback_mdh_sample_interval", 500L);

    /* renamed from: B */
    public static final bdyx f59008B = bdyx.m91606a(f59013G, "gms_icing_mdh_task_reschedule_sample_interval", 50);

    /* renamed from: C */
    public static final bdyx f59009C = bdyx.m91606a(f59013G, "gms_icing_mdh_flags_change_sample_interval", 50);

    /* renamed from: D */
    public static final bdyx f59010D = bdyx.m91606a(f59013G, "gms_icing_mdh_registration_write_delay_seconds", 5);

    /* renamed from: E */
    public static final bdyx f59011E = bdyx.m91607a(f59013G, "gms_icing_mdh_immediate_scheduler_execution_delay_seconds", 0L);

    /* renamed from: F */
    public static final bdyx f59012F = bdyx.m91609a(f59013G, "gms_icing_mdh_broadcast_listeners_blacklisted_packages", "");

    /* renamed from: G */
    private static final bdyw f59013G;

    /* renamed from: a */
    public static final bdyx f59014a;

    /* renamed from: b */
    public static final bdyx f59015b = bdyx.m91606a(f59013G, "gms_icing_mdh_call_credentials_stats_sample_interval", 1000);

    /* renamed from: c */
    public static final bdyx f59016c = bdyx.m91606a(f59013G, "gms_icing_mdh_sync_stats_sample_interval", 100);

    /* renamed from: d */
    public static final bdyx f59017d = bdyx.m91606a(f59013G, "gms_icing_mdh_notification_stats_sample_interval", 1000);

    /* renamed from: e */
    public static final bdyx f59018e = bdyx.m91609a(f59013G, "gms_icing_mdh_server_host_override", "");

    /* renamed from: f */
    public static final bdyx f59019f = bdyx.m91606a(f59013G, "gms_icing_mdh_server_port_override", 0);

    /* renamed from: g */
    public static final bdyx f59020g = bdyx.m91607a(f59013G, "gms_icing_mdh_grpc_deadline_seconds", TimeUnit.MINUTES.toSeconds(5));

    /* renamed from: h */
    public static final bdyx f59021h = bdyx.m91609a(f59013G, "gms_icing_mdh_notifications_sender_id", "1064998223678");

    /* renamed from: i */
    public static final bdyx f59022i = bdyx.m91607a(f59013G, "gms_icing_mdh_sync_periodic_task_period", TimeUnit.HOURS.toSeconds(48));

    /* renamed from: j */
    public static final bdyx f59023j = bdyx.m91607a(f59013G, "gms_icing_mdh_sync_periodic_task_flex", TimeUnit.HOURS.toSeconds(24));

    /* renamed from: k */
    public static final bdyx f59024k = bdyx.m91610a(f59013G, "gms_icing_mdh_sync_periodic_requires_charging", true);

    /* renamed from: l */
    public static final bdyx f59025l = bdyx.m91607a(f59013G, "gms_icing_mdh_sync_unconditional_threshold", TimeUnit.HOURS.toSeconds(6));

    /* renamed from: m */
    public static final bdyx f59026m = bdyx.m91607a(f59013G, "gms_icing_mdh_sync_outdated_threshold", TimeUnit.HOURS.toSeconds(1));

    /* renamed from: n */
    public static final bdyx f59027n = bdyx.m91607a(f59013G, "gms_icing_mdh_sync_refresh_minimum_timeout_millis", TimeUnit.SECONDS.toMillis(0));

    /* renamed from: o */
    public static final bdyx f59028o = bdyx.m91605a(f59013G, "gms_icing_mdh_sync_post_write_start_timeout_fraction", 0.9d);

    /* renamed from: p */
    public static final bdyx f59029p = bdyx.m91607a(f59013G, "gms_icing_mdh_sync_notification_delay_seconds", TimeUnit.MINUTES.toSeconds(2));

    /* renamed from: q */
    public static final bdyx f59030q = bdyx.m91605a(f59013G, "gms_icing_mdh_sync_notification_delay_fraction", 0.5d);

    /* renamed from: r */
    public static final bdyx f59031r = bdyx.m91610a(f59013G, "gms_icing_mdh_sync_throttle_trigger_on_first", true);

    /* renamed from: s */
    public static final bdyx f59032s = bdyx.m91607a(f59013G, "gms_icing_mdh_sync_throttle_delay_start", TimeUnit.MINUTES.toSeconds(10));

    /* renamed from: t */
    public static final bdyx f59033t = bdyx.m91607a(f59013G, "gms_icing_mdh_sync_max_execution_delay", TimeUnit.MINUTES.toSeconds(5));

    /* renamed from: u */
    public static final bdyx f59034u = bdyx.m91607a(f59013G, "gms_icing_mdh_wipeout_period", TimeUnit.DAYS.toSeconds(1));

    /* renamed from: v */
    public static final bdyx f59035v = bdyx.m91607a(f59013G, "gms_icing_mdh_wipeout_flex", TimeUnit.HOURS.toSeconds(12));

    /* renamed from: w */
    public static final bdyx f59036w = bdyx.m91610a(f59013G, "gms_icing_mdh_wipeout_requires_charging", true);

    /* renamed from: x */
    public static final bdyx f59037x = bdyx.m91607a(f59013G, "gms_icing_mdh_subscriptions_cleanup_period", TimeUnit.DAYS.toSeconds(2));

    /* renamed from: y */
    public static final bdyx f59038y = bdyx.m91607a(f59013G, "gms_icing_mdh_subscriptions_cleanup_flex", TimeUnit.DAYS.toSeconds(1));

    /* renamed from: z */
    public static final bdyx f59039z = bdyx.m91610a(f59013G, "gms_icing_mdh_subscriptions_cleanup_requires_charging", true);

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
     method: bdyx.a(bdyw, java.lang.String, double):bdyx
     arg types: [bdyw, java.lang.String, int]
     candidates:
      bdyx.a(bdyw, java.lang.String, int):bdyx
      bdyx.a(bdyw, java.lang.String, long):bdyx
      bdyx.a(bdyw, java.lang.String, java.lang.String):bdyx
      bdyx.a(bdyw, java.lang.String, boolean):bdyx
      bdyx.a(bdyw, java.lang.String, byte[]):bdyx
      bdyx.a(bdyw, java.lang.String, double):bdyx */
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
        bdyw bdyw = new bdyw(anef.m64088a("com.google.android.gms.icing"));
        f59013G = bdyw;
        f59014a = bdyx.m91606a(bdyw, "gms_icing_mdh_channel_event_sample_interval", 100);
        bdyx.m91606a(f59013G, "gms_icing_mdh_notifications_registration_stats_sample_interval", 100);
        bdyx.m91610a(f59013G, "gms_icing_mdh_scheduler_missing_active_network_default", false);
    }

    /* renamed from: a */
    public static Set m48731a() {
        if (!"".equals(f59012F.mo58455c())) {
            return new HashSet(Arrays.asList(TextUtils.split((String) f59012F.mo58455c(), ",")));
        }
        return bnon.f131923a;
    }
}
