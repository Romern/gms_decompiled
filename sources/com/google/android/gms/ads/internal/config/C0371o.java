package com.google.android.gms.ads.internal.config;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.C0341h;
import com.google.android.gms.ads.internal.flag.C0388a;
import com.google.android.gms.ads.internal.flag.C0393f;
import com.google.android.gms.ads.internal.flag.C0401n;
import com.google.android.gms.ads.internal.flag.C0402o;
import com.google.android.gms.ads.internal.flag.C0404q;
import com.google.android.gms.ads.internal.util.C0616an;
import com.google.android.gms.ads.internal.util.client.C0633h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.internal.config.o */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0371o {

    /* renamed from: A */
    public static final C0362f f8187A = C0362f.m5314a(1, "gads:sai:gmscore_availability_check_disabled", false);

    /* renamed from: B */
    public static final C0362f f8188B = C0362f.m5314a(1, "gads:sai:logging_disabled_for_drx", false);

    /* renamed from: C */
    public static final C0362f f8189C = C0362f.m5314a(1, "gads:webview:error_web_response:enabled", false);

    /* renamed from: D */
    public static final C0362f f8190D = C0362f.m5314a(1, "gads:webviewgone:kill_process:enabled", false);

    /* renamed from: E */
    public static final C0362f f8191E = C0362f.m5316a("gads:app_activity_tracker:app_session_timeout_ms", TimeUnit.MINUTES.toMillis(5));

    /* renamed from: F */
    public static final C0362f f8192F = C0362f.m5314a(1, "gads:adid_values_in_adrequest:enabled", false);

    /* renamed from: G */
    public static final C0362f f8193G = C0362f.m5316a("gads:adid_values_in_adrequest:timeout", 2000L);

    /* renamed from: H */
    public static final C0362f f8194H = C0362f.m5314a(1, "gads:disable_adid_values_in_ms", false);

    /* renamed from: I */
    public static final C0362f f8195I = C0362f.m5314a(1, "gads:interstitial_ad_pool:enabled", false);

    /* renamed from: J */
    public static final C0362f f8196J = C0362f.m5314a(1, "gads:msa:experiments:enabled", false);

    /* renamed from: K */
    public static final C0388a f8197K = C0401n.f8354a;

    /* renamed from: L */
    public static final C0362f f8198L = C0362f.m5314a(1, "gads:gestures:errorlogging:enabled", false);

    /* renamed from: M */
    public static final C0362f f8199M = C0362f.m5316a("gads:gestures:task_timeout", 2000L);

    /* renamed from: N */
    public static final C0362f f8200N = C0362f.m5314a(1, "gads:gestures:fpi:enabled", false);

    /* renamed from: O */
    public static final C0362f f8201O = C0362f.m5314a(1, "gads:signal:app_permissions:disabled", false);

    /* renamed from: P */
    public static final C0362f f8202P = C0362f.m5314a(1, "gads:gestures:inthex:enabled", false);

    /* renamed from: Q */
    public static final C0362f f8203Q = C0362f.m5314a(1, "gads:gestures:hpk:enabled", true);

    /* renamed from: R */
    public static final C0362f f8204R = C0362f.m5317a("gads:gestures:pk", "");

    /* renamed from: S */
    public static final C0362f f8205S = C0362f.m5314a(1, "gads:gestures:bs:enabled", true);

    /* renamed from: T */
    public static final C0362f f8206T = C0362f.m5314a(1, "gads:gestures:check_initialization_thread:enabled", false);

    /* renamed from: U */
    public static final C0362f f8207U = C0362f.m5314a(1, "gads:gestures:get_query_in_non_ui_thread:enabled", true);

    /* renamed from: V */
    public static final C0362f f8208V = C0362f.m5314a(1, "gads:gestures:pds:enabled", true);

    /* renamed from: W */
    public static final C0362f f8209W = C0362f.m5314a(1, "gads:gestures:las:enabled", false);

    /* renamed from: X */
    public static final C0362f f8210X = C0362f.m5314a(1, "gads:gestures:ns:enabled", true);

    /* renamed from: Y */
    public static final C0362f f8211Y = C0362f.m5317a("gads:sdk_core_constants:caps", "");

    /* renamed from: Z */
    public static final C0362f f8212Z = C0362f.m5314a(1, "gads:js_flags:disable_phenotype", false);

    /* renamed from: a */
    public static final C0362f f8213a = C0362f.m5317a("gads:sdk_core_location:client:html", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/sdk-core-v40-impl.html");

    /* renamed from: aA */
    public static final C0362f f8214aA = C0362f.m5314a(1, "gads:signals:doritos:v1:enabled", false);

    /* renamed from: aB */
    public static final C0362f f8215aB = C0362f.m5314a(1, "gads:signals:doritos:v2:immediate:enabled", false);

    /* renamed from: aC */
    public static final C0362f f8216aC = C0362f.m5314a(1, "gads:signals:location:enabled", false);

    /* renamed from: aD */
    public static final C0362f f8217aD = C0362f.m5314a(1, "gads:signals:parental_control:enabled", false);

    /* renamed from: aE */
    public static final C0362f f8218aE = C0362f.m5314a(1, "gads:signals:video_decoder:enabled", false);

    /* renamed from: aF */
    public static final C0362f f8219aF = C0362f.m5314a(1, "gads:attestation_token:enabled", false);

    /* renamed from: aG */
    public static final C0362f f8220aG = C0362f.m5314a(1, "gads:ar_ads:enabled", false);

    /* renamed from: aH */
    public static final C0362f f8221aH = C0362f.m5314a(1, "gads:unhandled_event_reporting:enabled", false);

    /* renamed from: aI */
    public static final C0362f f8222aI = C0362f.m5314a(2, "DISABLE_CRASH_REPORTING", false);

    /* renamed from: aa */
    public static final C0362f f8223aa = C0362f.m5314a(1, "gads:enable_native_media_aspect_ratio", true);

    /* renamed from: ab */
    public static final C0362f f8224ab = C0362f.m5314a(1, "gads:auto_location_for_coarse_permission", false);

    /* renamed from: ac */
    public static final C0362f f8225ac = C0362f.m5316a("gads:auto_location_timeout", 2000L);

    /* renamed from: ad */
    public static final C0362f f8226ad = C0362f.m5316a("gads:auto_location_interval", -1L);

    /* renamed from: ae */
    public static final C0362f f8227ae = C0362f.m5316a("gads:parental_controls:timeout", 2000L);

    /* renamed from: af */
    public static final C0362f f8228af = C0362f.m5315a("gads:cache:ad_request_timeout_millis", 250);

    /* renamed from: ag */
    public static final C0362f f8229ag = C0362f.m5315a("gads:cache:max_concurrent_downloads", 10);

    /* renamed from: ah */
    public static final C0362f f8230ah = C0362f.m5316a("gads:cache:javascript_timeout_millis", 5000L);

    /* renamed from: ai */
    public static final C0362f f8231ai = C0362f.m5314a(1, "gads:http_assets_cache:enabled", false);

    /* renamed from: aj */
    public static final C0362f f8232aj = C0362f.m5317a("gads:http_assets_cache:regex", "(?i)https:\\/\\/(tpc\\.googlesyndication\\.com\\/(.*)|lh\\d+\\.googleusercontent\\.com\\/(.*))");

    /* renamed from: ak */
    public static final C0362f f8233ak = C0362f.m5315a("gads:http_assets_cache:time_out", 100);

    /* renamed from: al */
    public static final C0362f f8234al = C0362f.m5314a(1, "gads:chrome_custom_tabs_browser:enabled", false);

    /* renamed from: am */
    public static final C0362f f8235am = C0362f.m5314a(1, "gads:chrome_custom_tabs:disabled", false);

    /* renamed from: an */
    public static final C0362f f8236an = C0362f.m5314a(1, "gads:clearcut_logging:enabled", false);

    /* renamed from: ao */
    public static final C0362f f8237ao = C0362f.m5314a(1, "gads:clearcut_logging:write_to_file", false);

    /* renamed from: ap */
    public static final C0362f f8238ap = C0362f.m5315a("gad:http_redirect_max_count:times", 8);

    /* renamed from: aq */
    public static final C0362f f8239aq = C0362f.m5314a(1, "gads:omid:enabled", true);

    /* renamed from: ar */
    public static final C0362f f8240ar = C0362f.m5315a("gads:omid:destroy_webview_delay", 1000);

    /* renamed from: as */
    public static final C0362f f8241as = C0362f.m5314a(1, "gads:nonagon:continue_on_no_fill", false);

    /* renamed from: at */
    public static final C0362f f8242at = C0362f.m5314a(1, "gads:uri_query_to_map_bg_thread:enabled", false);

    /* renamed from: au */
    public static final C0362f f8243au = C0362f.m5314a(1, "gads:nonagon:service:enabled", true);

    /* renamed from: av */
    public static final C0362f f8244av = C0362f.m5314a(1, "gads:signals:ad_id_info:enabled", false);

    /* renamed from: aw */
    public static final C0362f f8245aw = C0362f.m5314a(1, "gads:signals:app_index:enabled", false);

    /* renamed from: ax */
    public static final C0362f f8246ax = C0362f.m5314a(1, "gads:signals:attestation_token:enabled", false);

    /* renamed from: ay */
    public static final C0362f f8247ay = C0362f.m5314a(1, "gads:signals:cache:enabled", false);

    /* renamed from: az */
    public static final C0362f f8248az = C0362f.m5314a(1, "gads:signals:doritos:enabled", false);

    /* renamed from: b */
    public static final C0362f f8249b = C0362f.m5317a("gads:active_view_location:html", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/sdk-core-v40-impl.html");

    /* renamed from: c */
    public static final C0388a f8250c = C0402o.f8355a;

    /* renamed from: d */
    public static final C0362f f8251d = C0362f.m5315a("gads:http_url_connection_factory:timeout_millis", 10000);

    /* renamed from: e */
    public static final C0362f f8252e = C0362f.m5317a("gads:video:codec_query_mime_types", "");

    /* renamed from: f */
    public static final C0362f f8253f = C0362f.m5315a("gads:video:codec_query_minimum_version", 16);

    /* renamed from: g */
    public static final C0362f f8254g = C0362f.m5317a("gad:mraid:url_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/mraid/v3/mraid_app_banner.js");

    /* renamed from: h */
    public static final C0362f f8255h = C0362f.m5317a("gad:mraid:url_expanded_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/mraid/v3/mraid_app_expanded_banner.js");

    /* renamed from: i */
    public static final C0362f f8256i = C0362f.m5314a(1, "gads:mraid:initial_size_fallback", false);

    /* renamed from: j */
    public static final C0362f f8257j = C0362f.m5315a("gads:content_vertical_fingerprint_number", 100);

    /* renamed from: k */
    public static final C0362f f8258k = C0362f.m5315a("gads:content_vertical_fingerprint_bits", 23);

    /* renamed from: l */
    public static final C0362f f8259l = C0362f.m5315a("gads:content_vertical_fingerprint_ngram", 3);

    /* renamed from: m */
    public static final C0362f f8260m = C0362f.m5317a("gads:content_fetch_exclude_view_tag", "none");

    /* renamed from: n */
    public static final C0362f f8261n = C0362f.m5314a(1, "gads:content_fetch_disable_get_title_from_webview", false);

    /* renamed from: o */
    public static final C0362f f8262o = C0362f.m5314a(1, "gads:content_fetch_enable_new_content_score", false);

    /* renamed from: p */
    public static final C0362f f8263p = C0362f.m5314a(1, "gads:content_fetch_enable_serve_once", false);

    /* renamed from: q */
    public static final C0362f f8264q = C0362f.m5314a(1, "gads:sai:enabled", true);

    /* renamed from: r */
    public static final C0362f f8265r = C0362f.m5317a("gads:sai:click_ping_schema_v2", "^[^?]*(/aclk\\?|/pcs/click\\?).*");

    /* renamed from: s */
    public static final C0362f f8266s = C0362f.m5317a("gads:sai:impression_ping_schema_v2", "^[^?]*(/adview|/pcs/view).*");

    /* renamed from: t */
    public static final C0362f f8267t = C0362f.m5314a(1, "gads:sai:using_macro:enabled", false);

    /* renamed from: u */
    public static final C0362f f8268u = C0362f.m5317a("gads:sai:ad_event_id_macro_name", "[gw_fbsaeid]");

    /* renamed from: v */
    public static final C0362f f8269v = C0362f.m5316a("gads:sai:timeout_ms", -1L);

    /* renamed from: w */
    public static final C0362f f8270w = C0362f.m5315a("gads:sai:scion_thread_pool_size", 5);

    /* renamed from: x */
    public static final C0362f f8271x = C0362f.m5314a(1, "gads:sai:app_measurement_enabled3", false);

    /* renamed from: y */
    public static final C0362f f8272y = C0362f.m5315a("gads:sai:app_measurement_min_client_dynamite_version", 20290);

    /* renamed from: z */
    public static final C0362f f8273z = C0362f.m5314a(1, "gads:sai:force_through_reflection", true);

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.ads.internal.config.f.a(java.lang.String, long):com.google.android.gms.ads.internal.config.f
     arg types: [java.lang.String, int]
     candidates:
      com.google.android.gms.ads.internal.config.f.a(java.lang.String, int):com.google.android.gms.ads.internal.config.f
      com.google.android.gms.ads.internal.config.f.a(java.lang.String, java.lang.String):com.google.android.gms.ads.internal.config.f
      com.google.android.gms.ads.internal.config.f.a(android.content.SharedPreferences$Editor, java.lang.Object):void
      com.google.android.gms.ads.internal.config.f.a(android.content.SharedPreferences$Editor, java.lang.String):void
      com.google.android.gms.ads.internal.config.f.a(org.json.JSONObject, java.lang.String):void
      com.google.android.gms.ads.internal.config.f.a(java.lang.String, long):com.google.android.gms.ads.internal.config.f */
    static {
        C0362f.m5317a("gads:video_exo_player:version", "3");
        C0362f.m5315a("gads:video_exo_player:connect_timeout", 8000);
        C0362f.m5315a("gads:video_exo_player:read_timeout", 8000);
        C0362f.m5315a("gads:video_exo_player:loading_check_interval", 1048576);
        C0362f.m5315a("gads:video_exo_player:exo_player_precache_limit", Integer.MAX_VALUE);
        C0362f.m5315a("gads:video_exo_player:byte_buffer_precache_limit", Integer.MAX_VALUE);
        C0362f.m5315a("gads:video_exo_player_socket_receive_buffer_size", 0);
        C0362f.m5317a("gads:video_exo_player:precache_exceptions", "");
        C0362f.m5315a("gads:video_exo_player:min_retry_count", -1);
        C0362f.m5315a("gads:video_stream_cache:limit_count", 5);
        C0362f.m5315a("gads:video_stream_cache:limit_space", 8388608);
        C0362f.m5315a("gads:video_stream_exo_cache:buffer_size", 8388608);
        C0362f.m5316a("gads:video_stream_cache:limit_time_sec", 300L);
        C0362f.m5316a("gads:video_stream_cache:notify_interval_millis", 125L);
        C0362f.m5315a("gads:video_stream_cache:connect_timeout_millis", 10000);
        C0362f.m5317a("gads:video:metric_frame_hash_times", "");
        C0362f.m5316a("gads:video:metric_frame_hash_time_leniency", 500L);
        C0362f.m5314a(1, "gads:video:force_watermark", false);
        C0362f.m5316a("gads:video:surface_update_min_spacing_ms", 1000L);
        C0362f.m5314a(1, "gads:video:spinner:enabled", false);
        C0362f.m5315a("gads:video:spinner:scale", 4);
        C0362f.m5316a("gads:video:spinner:jank_threshold_ms", 50L);
        C0362f.m5314a(1, "gads:video:aggressive_media_codec_release", false);
        C0362f.m5314a(1, "gads:memory_bundle:debug_info", false);
        C0362f.m5317a("gad:mraid:url_interstitial", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/mraid/v3/mraid_app_interstitial.js");
        C0362f.m5317a("gad:mraid:version", "3.0");
        C0362f.m5314a(1, "gads:mraid:expanded_interstitial_fix", false);
        C0362f.m5317a("gads:content_fetch_view_tag_id", "googlebot");
        C0362f.m5314a(1, "gads:sai:inject_firebase_proxy", false);
        C0362f.m5314a(1, "gads:sai:app_measurement_npa_enabled", false);
        C0362f.m5314a(1, "gads:interstitial:app_must_be_foreground:enabled", false);
        C0362f.m5314a(1, "gads:interstitial:foreground_report:enabled", false);
        C0362f.m5314a(1, "gads:webview:pause_interstitial:enabled", true);
        C0362f.m5314a(1, "gads:rsku:webviewgone:kill_process:enabled", false);
        C0362f.m5314a(1, "gads:rsku:webviewgone:new_onshow:enabled", true);
        C0362f.m5314a(1, "gads:webviewgone:new_onshow:enabled", false);
        C0362f.m5314a(1, "gads:webview:pause_resume:enabled", true);
        C0362f.m5317a("gads:webview_cookie_url", "googleads.g.doubleclick.net");
        C0362f.m5314a(1, "gads:new_rewarded_ad:enabled", true);
        C0362f.m5314a(1, "gads:rewarded:adapter_initialization_enabled", false);
        C0362f.m5316a("gads:rewarded:adapter_timeout_ms", 20000L);
        C0362f.m5314a(1, "gads:rewarded:ad_metadata_enabled", false);
        C0362f.m5314a(1, "gads:rewarded:ssv_custom_data_enabled", true);
        C0362f.m5316a("gads:app_activity_tracker:notify_background_listeners_delay_ms", 500L);
        C0362f.m5316a("gads:ad_overlay:delay_page_close_timeout_ms", 5000L);
        C0362f.m5314a(1, "gads:custom_close_blocking:enabled", false);
        C0362f.m5314a(1, "gads:disabling_closable_area:enabled", false);
        C0362f.m5314a(1, "gads:use_system_ui_for_fullscreen:enabled", false);
        C0362f.m5314a(1, "gads:ad_overlay:collect_cutout_info:enabled", false);
        C0362f.m5314a(1, "gads:impression_optimization_enabled", false);
        C0362f.m5317a("gads:banner_ad_pool:schema", "customTargeting");
        C0362f.m5315a("gads:banner_ad_pool:max_queues", 3);
        C0362f.m5315a("gads:banner_ad_pool:max_pools", 3);
        C0362f.m5314a(1, "gads:delay_banner_renderer:enabled", true);
        C0362f.m5314a(1, "gads:interstitial_ad_pool:enabled_for_rewarded", false);
        C0362f.m5317a("gads:interstitial_ad_pool:schema", "customTargeting");
        C0362f.m5317a("gads:interstitial_ad_pool:request_exclusions", "com.google.ads.mediation.admob.AdMobAdapter/_ad");
        C0362f.m5315a("gads:interstitial_ad_pool:max_pools", 3);
        C0362f.m5315a("gads:interstitial_ad_pool:max_pool_depth", 2);
        C0362f.m5315a("gads:interstitial_ad_pool:time_limit_sec", 1200);
        C0362f.m5317a("gads:interstitial_ad_pool:ad_unit_exclusions", "(?!)");
        C0362f.m5315a("gads:interstitial_ad_pool:top_off_latency_min_millis", 0);
        C0362f.m5315a("gads:interstitial_ad_pool:top_off_latency_range_millis", 0);
        C0362f.m5316a("gads:interstitial_ad_pool:discard_thresholds", 0L);
        C0362f.m5316a("gads:interstitial_ad_pool:miss_thresholds", 0L);
        C0362f.m5318a("gads:interstitial_ad_pool:discard_asymptote");
        C0362f.m5318a("gads:interstitial_ad_pool:miss_asymptote");
        C0362f.m5317a("gads:spherical_video:vertex_shader", "");
        C0362f.m5317a("gads:spherical_video:fragment_shader", "");
        C0362f.m5314a(1, "gads:include_local_global_rectangles", false);
        C0362f.m5316a("gads:position_watcher:throttle_ms", 200L);
        C0362f.m5316a("gads:position_watcher:scroll_aware_throttle_ms", 33L);
        C0362f.m5314a(1, "gads:position_watcher:enable_scroll_aware_ads", false);
        C0362f.m5314a(1, "gads:position_watcher:send_scroll_data", false);
        C0362f.m5314a(1, "gads:gen204_signals:enabled", false);
        C0362f.m5317a("gads:logged_adapter_version_classes", "");
        C0362f.m5316a("gads:rtb_v1_1:signal_timeout_ms", 1000L);
        C0362f.m5314a(1, "gads:rtb_signal:enabled", true);
        C0362f.m5314a(1, "gads:rtb_v1_1:cld:enabled", true);
        C0362f.m5314a(1, "gads:rtb_v1_1:cld:check_regex:enabled", true);
        C0362f.m5317a("gads:rtb_logging:regex", "(?!)");
        C0362f.m5314a(1, "gads:v1_1:adapter_initialization:enabled", true);
        C0362f.m5315a("gads:adapter_initialization:min_sdk_version", 15301000);
        C0362f.m5316a("gads:adapter_initialization:timeout", 30L);
        C0362f.m5316a("gads:adapter_initialization:cld_timeout", 10L);
        C0362f.m5314a(1, "gads:initialization_csi:enabled", false);
        C0362f.m5314a(1, "gads:initialization_csi_control:enabled", false);
        C0362f.m5315a("gads:gestures:a2:enabled", 0);
        C0362f.m5314a(1, "gads:gestures:clearTd:enabled", false);
        C0362f.m5314a(1, "gads:gestures:asig:enabled", false);
        C0362f.m5314a(1, "gads:gestures:ans:enabled", false);
        C0362f.m5314a(1, "gads:gestures:tos:enabled", false);
        C0362f.m5314a(1, "gads:gestures:brt:enabled", true);
        C0362f.m5314a(1, "gads:gestures:init_new_thread:enabled", true);
        C0362f.m5315a("gads:gestures:as2percentage", 0);
        C0362f.m5314a(1, "gads:gestures:vdd:enabled", false);
        C0362f.m5314a(1, "gads:native:asset_view_touch_events", false);
        C0362f.m5314a(1, "gads:native:set_touch_listener_on_asset_views", true);
        C0362f.m5314a(1, "gads:ais:enabled", false);
        C0362f.m5314a(1, "gads:send_available_disk_space:enabled", false);
        C0341h.m5275b().f8172b.add(C0362f.m5317a("gads:sdk_core_constants:experiment_id", (String) null));
        C0362f.m5317a("gads:native:engine_url_with_protocol", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html");
        C0362f.m5317a("gads:native:video_url", "//imasdk.googleapis.com/admob/sdkloader/native_video.html");
        C0362f.m5317a("gads:native:video_url_with_protocol", "https://imasdk.googleapis.com/admob/sdkloader/native_video.html");
        C0362f.m5315a("gads:native_video_load_timeout", 10);
        C0362f.m5315a("gads:omid:native_webview_load_timeout", 2000);
        C0362f.m5314a(1, "gads:native:media_content_main_image:enabled", true);
        C0362f.m5317a("gads:ad_choices_content_description", "Ad Choices Icon");
        C0362f.m5314a(1, "gads:enable_store_active_view_state", false);
        C0362f.m5314a(1, "gads:enable_singleton_broadcast_receiver", false);
        C0362f.m5314a(1, "gads:native:media_view_match_parent:enabled", false);
        C0362f.m5314a(1, "gads:native:count_impression_for_assets", false);
        C0362f.m5314a(1, "gads:instream_ad:enabled", true);
        C0362f.m5314a(1, "gads:fluid_ad:use_wrap_content_height", false);
        C0362f.m5319b("gads:auto_location_for_coarse_permission:experiment_id");
        C0362f.m5319b("gads:auto_location_timeout:experiment_id");
        C0362f.m5319b("gads:auto_location_interval:experiment_id");
        C0362f.m5314a(1, "gads:rtb_v1_1:fetch_app_settings_using_cld:enabled", true);
        C0362f.m5314a(1, "gads:get_request_signals_cld:enabled", false);
        C0362f.m5314a(1, "gads:rtb_v1_1:use_manifest_appid_cld:enabled", true);
        C0362f.m5316a("gads:fetch_app_settings_using_cld:refresh_interval_ms", 7200000L);
        C0362f.m5314a(1, "gads:cache:bind_on_foreground", false);
        C0362f.m5314a(1, "gads:cache:bind_on_init", false);
        C0362f.m5314a(1, "gads:cache:bind_on_request", false);
        C0362f.m5316a("gads:cache:bind_on_request_keep_alive", TimeUnit.SECONDS.toMillis(30));
        C0362f.m5314a(1, "gads:cache:use_cache_data_source", false);
        C0362f.m5314a(1, "gads:cache:connection_per_read", false);
        C0362f.m5316a("gads:cache:connection_timeout", 5000L);
        C0362f.m5316a("gads:cache:read_only_connection_timeout", 5000L);
        C0362f.m5316a("gads:debug_hold_gesture:time_millis", 2000L);
        C0362f.m5317a("gads:drx_debug:debug_device_linking_url", "https://www.google.com/dfp/linkDevice");
        C0362f.m5317a("gads:drx_debug:in_app_preview_status_url", "https://www.google.com/dfp/inAppPreview");
        C0362f.m5317a("gads:drx_debug:debug_signal_status_url", "https://www.google.com/dfp/debugSignals");
        C0362f.m5317a("gads:drx_debug:send_debug_data_url", "https://www.google.com/dfp/sendDebugData");
        C0362f.m5315a("gads:drx_debug:timeout_ms", 5000);
        C0362f.m5315a("gad:pixel_dp_comparision_multiplier", 1);
        C0362f.m5314a(1, "gad:interstitial_for_multi_window", false);
        C0362f.m5314a(1, "gad:interstitial_ad_stay_active_in_multi_window", false);
        C0362f.m5314a(1, "gad:interstitial_multi_window_method", false);
        C0362f.m5315a("gad:interstitial:close_button_padding_dip", 0);
        C0362f.m5314a(1, "gad:publisher_testing:force_local_request:enabled", true);
        C0362f.m5317a("gad:publisher_testing:force_local_request:enabled_list", "");
        C0362f.m5317a("gad:publisher_testing:force_local_request:disabled_list", "");
        C0362f.m5314a(1, "gads:omid_1_3_activate:enabled", false);
        C0362f.m5314a(1, "gads:nonagon:banner:enabled", false);
        C0362f.m5317a("gads:nonagon:banner:ad_unit_exclusions", "(?!)");
        C0362f.m5314a(1, "gads:nonagon:app_open:enabled", true);
        C0362f.m5315a("gads:app_open_beta:min_version", 99999999);
        C0362f.m5317a("gads:nonagon:app_open:ad_unit_exclusions", "(?!)");
        C0362f.m5314a(1, "gads:nonagon:interstitial:enabled", false);
        C0362f.m5317a("gads:nonagon:interstitial:ad_unit_exclusions", "(?!)");
        C0362f.m5314a(1, "gads:nonagon:rewardedvideo:enabled", false);
        C0362f.m5314a(1, "gads:nonagon:mobile_ads_setting_manager:enabled", false);
        C0362f.m5317a("gads:nonagon:rewardedvideo:ad_unit_exclusions", "(?!)");
        C0362f.m5314a(1, "gads:nonagon:nativead:enabled", false);
        C0362f.m5317a("gads:nonagon:nativead:app_name", "(?!)");
        C0362f.m5314a(1, "gads:nonagon:banner:check_dp_size", true);
        C0362f.m5314a(1, "gads:nonagon:rewarded:load_multiple_ads", true);
        C0362f.m5314a(1, "gads:nonagon:return_last_error_code", false);
        C0362f.m5314a(1, "gads:nonagon:return_no_fill_error_code", false);
        C0362f.m5314a(1, "gads:nonagon:open_not_loaded_interstitial", true);
        C0362f.m5314a(1, "gads:nonagon:separate_timeout:enabled", true);
        C0362f.m5315a("gads:nonagon:request_timeout:seconds", 60);
        C0362f.m5314a(1, "gads:nonagon:banner_recursive_renderer", false);
        C0362f.m5314a(1, "gads:nonagon:app_stats_lock:enabled", false);
        C0362f.m5314a(1, "gads:nonagon:app_stats_main_thread:enabled", false);
        C0362f.m5314a(1, "gads:nonagon:active_view_gmsg_background_thread:enabled", true);
        C0362f.m5314a(1, "gads:active_view_gmsg_separate_pool:enabled", true);
        C0362f.m5314a(1, "gads:nonagon:dpl_cancel_destroy_webview:enabled", false);
        C0362f.m5314a(1, "gads:signals:network_prediction:enabled", false);
        C0362f.m5314a(1, "gads:signals:app_version_name:enabled", false);
        C0362f.m5316a("gads:mobius_linking:sdk_side_cooldown_time_threshold:ms", 3600000L);
        C0362f.m5315a("gads:adoverlay:b68684796:targeting_sdk:lower_bound", 27);
        C0362f.m5315a("gads:adoverlay:b68684796:targeting_sdk:upper_bound", 26);
        C0362f.m5315a("gads:adoverlay:b68684796:sdk_int:lower_bound", 27);
        C0362f.m5315a("gads:adoverlay:b68684796:sdk_int:upper_bound", 26);
        int i = C0404q.f8357a;
        C0362f.m5314a(1, "gads:consent:shared_preference_reading:enabled", true);
        C0362f.m5314a(1, "gads:consent:iab_consent_info:enabled", true);
        C0362f.m5314a(1, "gads:fc_consent:shared_preference_reading:enabled", true);
        C0362f.m5317a("gads:sp:json_string", "");
        C0362f.m5314a(1, "gads:nativeads:image:sample:enabled", true);
        C0362f.m5315a("gads:nativeads:image:sample:pixels", 1048576);
        C0362f.m5314a(1, "gads:nativeads:pub_image_scale_type:enabled", true);
        C0362f.m5314a(1, "gads:offline_signaling:enabled", false);
        C0362f.m5315a("gads:offline_signaling:log_maximum", 100);
        C0362f.m5314a(1, "gads:nativeads:template_signal:enabled", true);
        C0362f.m5314a(1, "gads:nativeads:media_content_aspect_ratio:enabled", true);
        C0362f.m5314a(1, "gads:nativeads:media_content_metadata:enabled", true);
        C0362f.m5314a(1, "gads:precache_pool:verbose_logging", false);
        C0362f.m5315a("gads:rewarded_precache_pool:count", 0);
        C0362f.m5315a("gads:interstitial_precache_pool:count", 0);
        C0362f.m5317a("gads:rewarded_precache_pool:discard_strategy", "lru");
        C0362f.m5317a("gads:interstitial_precache_pool:discard_strategy", "lru");
        C0362f.m5317a("gads:rewarded_precache_pool:cache_start_trigger", "onAdClosed");
        C0362f.m5317a("gads:interstitial_precache_pool:cache_start_trigger", "onAdClosed");
        C0362f.m5315a("gads:rewarded_precache_pool:size", 1);
        C0362f.m5315a("gads:interstitial_precache_pool:size", 1);
        C0362f.m5315a("gads:rewarded_precache_pool:ad_time_limit", 1200);
        C0362f.m5315a("gads:interstitial_precache_pool:ad_time_limit", 1200);
        C0362f.m5317a("gads:rewarded_precache_pool:schema", "customTargeting,npa,tagForChildDirectedTreatment,tagForUnderAgeOfConsent,maxAdContentRating");
        C0362f.m5317a("gads:interstitial_precache_pool:schema", "customTargeting,npa,tagForChildDirectedTreatment,tagForUnderAgeOfConsent,maxAdContentRating");
        C0362f.m5317a("gads:app_open_precache_pool:schema", "orientation,npa,tagForChildDirectedTreatment,tagForUnderAgeOfConsent,maxAdContentRating");
        C0362f.m5317a("gads:app_open_precache_pool:discard_strategy", "oldest");
        C0362f.m5315a("gads:app_open_precache_pool:count", 0);
        C0362f.m5317a("gads:app_open_precache_pool:cache_start_trigger", "onAdClosed");
        C0362f.m5315a("gads:app_open_precache_pool:size", 1);
        C0362f.m5315a("gads:app_open_precache_pool:ad_time_limit", 14400);
        C0362f.m5314a(1, "gads:memory_leak:b129558083", false);
        C0362f.m5314a(1, "gads:response_info:enabled", true);
        C0362f.m5314a(1, "gads:csi:interstitial_failed_to_show:enabled", false);
        C0362f.m5314a(1, "gads:csi:mediation_failure:enabled", false);
        C0362f.m5317a("gads:csi:error_parsing:regex", "^(\\d+)");
        C0362f.m5314a(1, "gads:signal_collection_without_rendering:enabled", true);
        C0362f.m5315a("gads:native_ads_signal:timeout", 1000);
        C0362f.m5315a("gads:signal_v2:min_version", 19677000);
        C0362f.m5314a(1, "gads:paid_event_listener:enabled", false);
        C0362f.m5314a(1, "gads:is_in_scroll_view_new_api:enabled", true);
        C0362f.m5314a(1, "gads:native_ad_policy_validator:enabled", false);
        C0362f.m5315a("gads:policy_validator_layoutparam:flags", 808);
        C0362f.m5314a(2, "NATIVE_AD_DEBUGGER_ENABLED", false);
        C0362f.m5315a("gads:policy_validator_overlay_margins:dp", 15);
        C0362f.m5314a(1, "gads:wire_banner_listener_after_request:enabled", false);
        C0362f.m5314a(1, "gads:wire_rewarded_listener_after_request:enabled", false);
        C0362f.m5314a(1, "gads:wire_app_open_listener_after_request:enabled", false);
        C0362f.m5314a(1, "gads:wire_interstitial_listener_after_request:enabled", false);
        C0362f.m5314a(1, "gads:wire_ad_loader_listener_after_request:enabled", false);
        C0362f.m5314a(1, "gads:server_transaction_source:enabled", false);
        C0362f.m5317a("gads:server_transaction_source:list", "Network");
    }

    /* renamed from: a */
    public static List m5338a() {
        return C0341h.m5275b().mo6605a();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.util.Collection], assign insn: 0x0008: IGET  (r0v1 ? I:java.util.Collection) = (r0v0 com.google.android.gms.ads.internal.config.h) com.google.android.gms.ads.internal.config.h.c java.util.Collection */
    /* renamed from: b */
    public static List m5341b() {
        C0364h b = C0341h.m5275b();
        List a = b.mo6605a();
        ? r0 = b.f8173c;
        int size = r0.size();
        for (int i = 0; i < size; i++) {
            String str = (String) ((C0362f) r0.get(i)).mo6604a();
            if (!TextUtils.isEmpty(str)) {
                a.add(str);
            }
        }
        a.addAll(C0372p.m5344a());
        return a;
    }

    /* renamed from: c */
    public static Collection m5343c() {
        return C0341h.m5275b().f8171a;
    }

    /* renamed from: a */
    public static void m5339a(Context context) {
        C0616an.m5620a(new C0370n(context));
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List, java.util.Collection], assign insn: 0x0019: IGET  (r1v3 ? I:java.util.Collection) = (r1v2 com.google.android.gms.ads.internal.config.h) com.google.android.gms.ads.internal.config.h.a java.util.Collection */
    /* renamed from: a */
    public static void m5340a(Context context, JSONObject jSONObject) {
        C0341h.m5278e();
        SharedPreferences.Editor edit = C0365i.m5332a(context).edit();
        C0341h.m5275b();
        new C0363g(edit, jSONObject);
        int i = C0393f.f8327a;
        ? r1 = C0341h.m5275b().f8171a;
        int size = r1.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0362f fVar = (C0362f) r1.get(i2);
            if (fVar.f8166a == 1) {
                fVar.mo6601a(edit, fVar.mo6600a(jSONObject));
            }
        }
        if (jSONObject != null) {
            edit.putString("flag_configuration", jSONObject.toString());
        } else {
            C0633h.m5668b("Flag Json is null.");
        }
        C0341h.m5278e();
        C0365i.m5333a(context, edit);
    }

    /* renamed from: b */
    public static List m5342b(Context context) {
        if (!C0341h.m5274a().mo6807b(context)) {
            return null;
        }
        C0364h b = C0341h.m5275b();
        ArrayList arrayList = new ArrayList();
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            for (C0362f fVar : b.f8173c) {
                String str = (String) fVar.mo6604a();
                if (!TextUtils.isEmpty(str)) {
                    arrayList.add(str);
                }
            }
            arrayList.addAll(C0372p.m5344a());
            return arrayList;
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }
}
