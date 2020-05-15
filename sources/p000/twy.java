package p000;

import com.android.volley.DefaultRetryPolicy;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.concurrent.TimeUnit;

/* renamed from: twy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class twy {

    /* renamed from: A */
    public static final bdyx f46790A = bdyx.m91607a(f46875bf, "content_cache_shared_max_bytes", 100000000L);

    /* renamed from: B */
    public static final bdyx f46791B = bdyx.m91605a(f46875bf, "content_cache_shared_max_total_space_fraction", 0.05d);

    /* renamed from: C */
    public static final bdyx f46792C = bdyx.m91607a(f46875bf, "content_internal_max_bytes", 200000000L);

    /* renamed from: D */
    public static final bdyx f46793D = bdyx.m91605a(f46875bf, "content_internal_max_total_space_fraction", 0.25d);

    /* renamed from: E */
    public static final bdyx f46794E = bdyx.m91607a(f46875bf, "content_internal_min_free_space_bytes", 5242880L);

    /* renamed from: F */
    public static final bdyx f46795F = bdyx.m91607a(f46875bf, "content_maintenance_min_interval_millis", TimeUnit.MILLISECONDS.convert(30, TimeUnit.SECONDS));

    /* renamed from: G */
    public static final bdyx f46796G = bdyx.m91609a(f46875bf, "control_progress_api_whitelist", "576267593750,900820440409");

    /* renamed from: H */
    public static final bdyx f46797H = bdyx.m91607a(f46875bf, "device_status_report_min_interval_millis", TimeUnit.MILLISECONDS.convert(1, TimeUnit.HOURS));

    /* renamed from: I */
    public static final bdyx f46798I = bdyx.m91609a(f46875bf, "disable_features_manchego", "");

    /* renamed from: J */
    public static final bdyx f46799J = bdyx.m91610a(f46875bf, "disable_sync", false);

    /* renamed from: K */
    public static final bdyx f46800K = bdyx.m91609a(f46875bf, "server_url", "https://www.googleapis.com");

    /* renamed from: L */
    public static final bdyx f46801L = bdyx.m91610a(f46875bf, "enable_apiary_backend_traces", true);

    /* renamed from: M */
    public static final bdyx f46802M = bdyx.m91610a(f46875bf, "enable_folder_color_in_file_picker", false);

    /* renamed from: N */
    public static final bdyx f46803N = bdyx.m91610a(f46875bf, "enable_folder_color_sync", true);

    /* renamed from: O */
    public static final bdyx f46804O = bdyx.m91610a(f46875bf, "enable_folder_color_update", true);

    /* renamed from: P */
    public static final bdyx f46805P = bdyx.m91610a(f46875bf, "enable_open_file_dialog_search", true);

    /* renamed from: Q */
    public static final bdyx f46806Q = bdyx.m91610a(f46875bf, "enable_open_file_dialog_sort_options", true);

    /* renamed from: R */
    public static final bdyx f46807R = bdyx.m91610a(f46875bf, "enable_permission", false);

    /* renamed from: S */
    public static final bdyx f46808S = bdyx.m91610a(f46875bf, "enable_push_notification", true);

    /* renamed from: T */
    public static final bdyx f46809T = bdyx.m91610a(f46875bf, "enable_query_result_projection", true);

    /* renamed from: U */
    public static final bdyx f46810U = bdyx.m91607a(f46875bf, "event_router_idle_timeout_millis", TimeUnit.MILLISECONDS.convert(5, TimeUnit.SECONDS));

    /* renamed from: V */
    public static final bdyx f46811V = bdyx.m91609a(f46875bf, "folder_color_default_color", "#8f8f8f");

    /* renamed from: W */
    public static final bdyx f46812W = bdyx.m91607a(f46875bf, "force_full_sync_level", 0L);

    /* renamed from: X */
    public static final bdyx f46813X = bdyx.m91606a(f46875bf, "limiter_default_max_tokens", 10);

    /* renamed from: Y */
    public static final bdyx f46814Y = bdyx.m91607a(f46875bf, "limiter_token_period_millis", 10L);

    /* renamed from: Z */
    public static final bdyx f46815Z = bdyx.m91606a(f46875bf, "max_concurrent_downloads", 5);

    /* renamed from: a */
    public static final bdyx f46816a;

    /* renamed from: aA */
    public static final bdyx f46817aA = bdyx.m91609a(f46875bf, "singleton_local_id_version", "");

    /* renamed from: aB */
    public static final bdyx f46818aB = bdyx.m91607a(f46875bf, "sleep_after_recursive_apply_on_server_millis", TimeUnit.MILLISECONDS.convert(10, TimeUnit.SECONDS));

    /* renamed from: aC */
    public static final bdyx f46819aC = bdyx.m91609a(f46875bf, "streaming_api_whitelist", "");

    /* renamed from: aD */
    public static final bdyx f46820aD = bdyx.m91606a(f46875bf, "sync_down_description_length_limit", 100000);

    /* renamed from: aE */
    public static final bdyx f46821aE = bdyx.m91606a(f46875bf, "sync_down_mime_type_length_limit", 100000);

    /* renamed from: aF */
    public static final bdyx f46822aF = bdyx.m91606a(f46875bf, "sync_down_title_length_limit", 100000);

    /* renamed from: aG */
    public static final bdyx f46823aG = bdyx.m91606a(f46875bf, "sync_max_feeds_app_data", 40);

    /* renamed from: aH */
    public static final bdyx f46824aH = bdyx.m91606a(f46875bf, "sync_max_feeds_drive_files", 28);

    /* renamed from: aI */
    public static final bdyx f46825aI = bdyx.m91606a(f46875bf, "sync_max_feeds_drive_folders", 10);

    /* renamed from: aJ */
    public static final bdyx f46826aJ = bdyx.m91606a(f46875bf, "sync_max_feeds_photos", 2);

    /* renamed from: aK */
    public static final bdyx f46827aK = bdyx.m91606a(f46875bf, "sync_more_max_feeds_to_retrieve", 1);

    /* renamed from: aL */
    public static final bdyx f46828aL = bdyx.m91606a(f46875bf, "sync_scheduler_first_party_rate_limit_max_stored_tokens", 20);

    /* renamed from: aM */
    public static final bdyx f46829aM = bdyx.m91607a(f46875bf, "sync_scheduler_first_party_rate_limit_token_period_millis", TimeUnit.MILLISECONDS.convert(5, TimeUnit.SECONDS));

    /* renamed from: aN */
    public static final bdyx f46830aN = bdyx.m91606a(f46875bf, "sync_scheduler_max_concurrent", 1);

    /* renamed from: aO */
    public static final bdyx f46831aO = bdyx.m91606a(f46875bf, "sync_scheduler_on_connect_rate_limit_max_stored_tokens", 5);

    /* renamed from: aP */
    public static final bdyx f46832aP = bdyx.m91607a(f46875bf, "sync_scheduler_on_connect_rate_limit_token_period_millis", TimeUnit.MILLISECONDS.convert(1, TimeUnit.HOURS));

    /* renamed from: aQ */
    public static final bdyx f46833aQ = bdyx.m91606a(f46875bf, "sync_scheduler_rate_limit_max_stored_tokens", 5);

    /* renamed from: aR */
    public static final bdyx f46834aR = bdyx.m91607a(f46875bf, "sync_scheduler_rate_limit_token_period_millis", TimeUnit.MILLISECONDS.convert(1, TimeUnit.MINUTES));

    /* renamed from: aS */
    public static final bdyx f46835aS = bdyx.m91607a(f46875bf, "sync_scheduler_wakelock_timeout_seconds", TimeUnit.SECONDS.convert(10, TimeUnit.MINUTES));

    /* renamed from: aT */
    public static final bdyx f46836aT = bdyx.m91609a(f46875bf, "thumbnail_url_format", "https://lh3.googleusercontent.com/d/%s");

    /* renamed from: aU */
    public static final bdyx f46837aU = bdyx.m91606a(f46875bf, "tombstone_old_max_size", 0);

    /* renamed from: aV */
    public static final bdyx f46838aV = bdyx.m91607a(f46875bf, "tombstone_time_interval_ms", TimeUnit.MILLISECONDS.convert(30, TimeUnit.DAYS));

    /* renamed from: aW */
    public static final bdyx f46839aW = bdyx.m91607a(f46875bf, "unsubscribed_keep_time_ms", TimeUnit.MILLISECONDS.convert(1, TimeUnit.DAYS));

    /* renamed from: aX */
    public static final bdyx f46840aX = bdyx.m91607a(f46875bf, "unsubscribed_refresh_time_ms", TimeUnit.MILLISECONDS.convert(1, TimeUnit.DAYS));

    /* renamed from: aY */
    public static final bdyx f46841aY = bdyx.m91605a(f46875bf, "upload_chunk_backoff_growth_factor", 2.0d);

    /* renamed from: aZ */
    public static final bdyx f46842aZ = bdyx.m91605a(f46875bf, "upload_initial_chunk_backoff_seconds", 1.0d);

    /* renamed from: aa */
    public static final bdyx f46843aa = bdyx.m91606a(f46875bf, "max_concurrent_pin_downloads", 4);

    /* renamed from: ab */
    public static final bdyx f46844ab = bdyx.m91606a(f46875bf, "max_description_code_points", 100000);

    /* renamed from: ac */
    public static final bdyx f46845ac = bdyx.m91606a(f46875bf, "max_incomplete_downloads", 10);

    /* renamed from: ad */
    public static final bdyx f46846ad = bdyx.m91606a(f46875bf, "max_mime_type_code_points", 100000);

    /* renamed from: ae */
    public static final bdyx f46847ae = bdyx.m91606a(f46875bf, "max_pin_download_retries", 5);

    /* renamed from: af */
    public static final bdyx f46848af = bdyx.m91606a(f46875bf, "max_title_code_points", 100000);

    /* renamed from: ag */
    public static final bdyx f46849ag = bdyx.m91606a(f46875bf, "metrics_logging_mode", 0);

    /* renamed from: ah */
    public static final bdyx f46850ah = bdyx.m91609a(f46875bf, "mime_type_pattern", ".+");

    /* renamed from: ai */
    public static final bdyx f46851ai = bdyx.m91606a(f46875bf, "min_push_notification_battery_level_percent", 12);

    /* renamed from: aj */
    public static final bdyx f46852aj = bdyx.m91609a(f46875bf, "permission_api_whitelist", "383787855441,412042324140");

    /* renamed from: ak */
    public static final bdyx f46853ak = bdyx.m91606a(f46875bf, "persisted_event_attempts", 3);

    /* renamed from: al */
    public static final bdyx f46854al = bdyx.m91607a(f46875bf, "persisted_event_retry_interval_millis", TimeUnit.MILLISECONDS.convert(10, TimeUnit.MINUTES));

    /* renamed from: am */
    public static final bdyx f46855am = bdyx.m91607a(f46875bf, "persisted_event_snooze_interval_millis", TimeUnit.MILLISECONDS.convert(5, TimeUnit.MINUTES));

    /* renamed from: an */
    public static final bdyx f46856an = bdyx.m91606a(f46875bf, "persisted_event_snooze_growth_base", 2);

    /* renamed from: ao */
    public static final bdyx f46857ao = bdyx.m91610a(f46875bf, "propagate_file_scope", false);

    /* renamed from: ap */
    public static final bdyx f46858ap = bdyx.m91606a(f46875bf, "realtime_compaction_mutation_threshold", 100);

    /* renamed from: aq */
    public static final bdyx f46859aq = bdyx.m91606a(f46875bf, "realtime_oldest_supported_client_lib_version", 6000000);

    /* renamed from: ar */
    public static final bdyx f46860ar = bdyx.m91606a(f46875bf, "realtime_oldest_supported_gmscore_version", 6000000);

    /* renamed from: as */
    public static final bdyx f46861as = bdyx.m91610a(f46875bf, "realtime_persist_undo", false);

    /* renamed from: at */
    public static final bdyx f46862at = bdyx.m91609a(f46875bf, "realtime_server_url", "https://drive.google.com/otservice");

    /* renamed from: au */
    public static final bdyx f46863au = bdyx.m91607a(f46875bf, "reset_on_reboot_delay_millis", TimeUnit.MILLISECONDS.convert(2, TimeUnit.MINUTES));

    /* renamed from: av */
    public static final bdyx f46864av = bdyx.m91610a(f46875bf, "request_photos_space_when_syncing", true);

    /* renamed from: aw */
    public static final bdyx f46865aw = bdyx.m91606a(f46875bf, "search_max_feeds_to_retrieve", 1);

    /* renamed from: ax */
    public static final bdyx f46866ax = bdyx.m91607a(f46875bf, "search_query_cache_expiration_ms", TimeUnit.MILLISECONDS.convert(2, TimeUnit.MINUTES));

    /* renamed from: ay */
    public static final bdyx f46867ay = bdyx.m91606a(f46875bf, "server_default_timeout_ms", (int) DefaultRetryPolicy.DEFAULT_TIMEOUT_MS);

    /* renamed from: az */
    public static final bdyx f46868az = bdyx.m91609a(f46875bf, "server_jobset", "prod");

    /* renamed from: b */
    public static final bdyx f46869b = bdyx.m91607a(f46875bf, "operation_queue_backoff_max_wait_millis", TimeUnit.MILLISECONDS.convert(1, TimeUnit.MINUTES));

    /* renamed from: ba */
    public static final bdyx f46870ba = bdyx.m91606a(f46875bf, "upload_chunk_retry_count_max", 4);

    /* renamed from: bb */
    public static final bdyx f46871bb = bdyx.m91610a(f46875bf, "use_full_access_for_downloads", true);

    /* renamed from: bc */
    public static final bdyx f46872bc = bdyx.m91610a(f46875bf, "use_held_lock", false);

    /* renamed from: bd */
    public static final bdyx f46873bd = bdyx.m91610a(f46875bf, "verbose_volley_logging", false);

    /* renamed from: be */
    public static final bdyx f46874be = bdyx.m91609a(f46875bf, "wifi_lock_workaround_device_regex", "ZTE~(SmartTab7|SmartTab10)~13");

    /* renamed from: bf */
    private static final bdyw f46875bf;

    /* renamed from: c */
    public static final bdyx f46876c = bdyx.m91605a(f46875bf, "operation_queue_backoff_wait_growth_factor", 2.0d);

    /* renamed from: d */
    public static final bdyx f46877d = bdyx.m91606a(f46875bf, "operation_queue_max_attempt_count", 6);

    /* renamed from: e */
    public static final bdyx f46878e = bdyx.m91606a(f46875bf, "action_queue_num_threads", 4);

    /* renamed from: f */
    public static final bdyx f46879f = bdyx.m91606a(f46875bf, "action_queue_num_threads_non_uploads", 1);

    /* renamed from: g */
    public static final bdyx f46880g = bdyx.m91607a(f46875bf, "action_queue_rate_limited_retry_check_interval_ms", TimeUnit.MILLISECONDS.convert(15, TimeUnit.SECONDS));

    /* renamed from: h */
    public static final bdyx f46881h = bdyx.m91606a(f46875bf, "activity_level_low_min_count_threshold", 1);

    /* renamed from: i */
    public static final bdyx f46882i = bdyx.m91607a(f46875bf, "activity_level_low_push_notification_sync_interval_ms", TimeUnit.MILLISECONDS.convert(3, TimeUnit.HOURS));

    /* renamed from: j */
    public static final bdyx f46883j = bdyx.m91607a(f46875bf, "activity_level_low_window_size_ms", TimeUnit.MILLISECONDS.convert(24, TimeUnit.HOURS));

    /* renamed from: k */
    public static final bdyx f46884k = bdyx.m91606a(f46875bf, "activity_level_high_min_count_threshold", 2);

    /* renamed from: l */
    public static final bdyx f46885l = bdyx.m91607a(f46875bf, "activity_level_high_push_notification_sync_interval_ms", TimeUnit.MILLISECONDS.convert(5, TimeUnit.MINUTES));

    /* renamed from: m */
    public static final bdyx f46886m = bdyx.m91607a(f46875bf, "activity_level_high_window_size_ms", TimeUnit.MILLISECONDS.convert(30, TimeUnit.MINUTES));

    /* renamed from: n */
    public static final bdyx f46887n = bdyx.m91610a(f46875bf, "always_send_modified_date", true);

    /* renamed from: o */
    public static final bdyx f46888o = bdyx.m91609a(f46875bf, "apiary_trace_token", "");

    /* renamed from: p */
    public static final bdyx f46889p = bdyx.m91607a(f46875bf, "app_auth_cache_time_ms", TimeUnit.MILLISECONDS.convert(1, TimeUnit.HOURS));

    /* renamed from: q */
    public static final bdyx f46890q = bdyx.m91605a(f46875bf, "binary_diff_upload_chunksize_scaling", 0.25d);

    /* renamed from: r */
    public static final bdyx f46891r = bdyx.m91606a(f46875bf, "binary_diff_upload_min_chunksize", 32);

    /* renamed from: s */
    public static final bdyx f46892s = bdyx.m91606a(f46875bf, "binary_diff_upload_min_filesize", 170);

    /* renamed from: t */
    public static final bdyx f46893t = bdyx.m91606a(f46875bf, "binary_diff_upload_max_chunksize", (int) AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES);

    /* renamed from: u */
    public static final bdyx f46894u = bdyx.m91606a(f46875bf, "changelog_sync_limit", 2499);

    /* renamed from: v */
    public static final bdyx f46895v = bdyx.m91607a(f46875bf, "cleanup_action_min_interval_millis", TimeUnit.MILLISECONDS.convert(5, TimeUnit.MINUTES));

    /* renamed from: w */
    public static final bdyx f46896w = bdyx.m91610a(f46875bf, "cleanup_custom_props_on_creation", true);

    /* renamed from: x */
    public static final bdyx f46897x = bdyx.m91607a(f46875bf, "content_cache_internal_max_bytes", 100000000L);

    /* renamed from: y */
    public static final bdyx f46898y = bdyx.m91605a(f46875bf, "content_cache_internal_max_total_space_fraction", 0.05d);

    /* renamed from: z */
    public static final bdyx f46899z = bdyx.m91607a(f46875bf, "content_cache_internal_min_free_space_bytes", 20000000L);

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
        bdyw b = new bdyw(anef.m64088a("com.google.android.gms.drive")).mo58445a("drive:").mo58451b("gms:drive:");
        f46875bf = b;
        f46816a = bdyx.m91607a(b, "operation_queue_backoff_init_wait", TimeUnit.MILLISECONDS.convert(1, TimeUnit.SECONDS));
        bdyx.m91606a(f46875bf, "enable_db_transaction_counter_check_min_api", 0);
        bdyx.m91607a(f46875bf, "realtime_cache_duration_millis", TimeUnit.MILLISECONDS.convert(1, TimeUnit.DAYS));
        bdyx.m91607a(f46875bf, "sync_database_yield_backoff_millis", 600L);
        bdyx.m91606a(f46875bf, "sync_max_num_backoff", 2);
    }
}
