package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.android.volley.DefaultRetryPolicy;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: abzt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abzt {

    /* renamed from: A */
    public static final bdyx f58833A = bdyx.m91609a(f58983cr, "gms_icing_developer_key", "745476177629.apps.googleusercontent.com");

    /* renamed from: B */
    public static final bdyx f58834B = bdyx.m91607a(f58983cr, "gms_icing_report_usage_rate_limit_interval_ms", 86400000L);

    /* renamed from: C */
    public static final bdyx f58835C = bdyx.m91607a(f58983cr, "gms_icing_report_usage_rate_limit_per_corpus_bytes", 1048576L);

    /* renamed from: D */
    public static final bdyx f58836D = bdyx.m91610a(f58983cr, "gms_icing_enable_third_party_context", false);

    /* renamed from: E */
    public static final bdyx f58837E = bdyx.m91610a(f58983cr, "gms_icing_enable_usage_report_to_platform_corpora", true);

    /* renamed from: F */
    public static final bdyx f58838F = bdyx.m91610a(f58983cr, "gms_icing_enable_action_notification_broadcast", true);

    /* renamed from: G */
    public static final bdyx f58839G = bdyx.m91607a(f58983cr, "gms_icing_action_notification_limit_per_second", 60L);

    /* renamed from: H */
    public static final bdyx f58840H = bdyx.m91607a(f58983cr, "gms_icing_action_notification_limit_per_day", 2000L);

    /* renamed from: I */
    public static final bdyx f58841I = bdyx.m91609a(f58983cr, "gms_icing_whitelisted_packages_for_keyboard_notification", "com.google.android.apps.messaging,com.google.android.apps.chrome,com.chrome.canary,com.chrome.dev,com.chrome.beta,com.android.chrome,com.google.android.apps.maps,com.google.android.apps.gmm.qp,com.google.android.apps.gmm,com.google.android.apps.gmm.fishfood,com.google.android.apps.gmm.dev");

    /* renamed from: J */
    public static final bdyx f58842J = bdyx.m91607a(f58983cr, "gms_icing_report_usage_timout_ms", TimeUnit.SECONDS.toMillis(2));

    /* renamed from: K */
    public static final bdyx f58843K = bdyx.m91607a(f58983cr, "gms_icing_request_indexing_content_fetch_delay_millis", TimeUnit.SECONDS.toMillis(1));

    /* renamed from: L */
    public static final bdyx f58844L = bdyx.m91609a(f58983cr, "gms_icing_global_search_app_package_names", "com.google.android.googlequicksearchbox,com.google.android.apps.nexuslauncher,com.google.android.carassistant");

    /* renamed from: M */
    public static final bdyx f58845M = bdyx.m91609a(f58983cr, "gms_icing_debug_app_package_names", "");

    /* renamed from: N */
    public static final bdyx f58846N = bdyx.m91610a(f58983cr, "gms_icing_enable_annotation_payload_api", true);

    /* renamed from: O */
    public static final bdyx f58847O = bdyx.m91610a(f58983cr, "gms_icing_app_history_upload_enabled", true);

    /* renamed from: P */
    public static final bdyx f58848P = bdyx.m91610a(f58983cr, "gms_icing_app_history_upload_immediate", true);

    /* renamed from: Q */
    public static final bdyx f58849Q = bdyx.m91607a(f58983cr, "gms_icing_app_history_upload_start_delay_secs", TimeUnit.MINUTES.toSeconds(30));

    /* renamed from: R */
    public static final bdyx f58850R = bdyx.m91607a(f58983cr, "gms_icing_app_history_upload_end_delay_secs", TimeUnit.HOURS.toSeconds(6));

    /* renamed from: S */
    public static final bdyx f58851S = bdyx.m91609a(f58983cr, "gms_icing_help_settings_url", "https://support.google.com/websearch?p=ws_searchdata");

    /* renamed from: T */
    public static final bdyx f58852T = bdyx.m91607a(f58983cr, "gms_icing_min_sms_deferral_time_millis", TimeUnit.SECONDS.toMillis(5));

    /* renamed from: U */
    public static final bdyx f58853U = bdyx.m91607a(f58983cr, "gms_icing_max_sms_deferral_time_millis", TimeUnit.SECONDS.toMillis(30));

    /* renamed from: V */
    public static final bdyx f58854V = bdyx.m91607a(f58983cr, "gms_icing_min_sms_deletion_delay_time_millis", TimeUnit.HOURS.toMillis(1));

    /* renamed from: W */
    public static final bdyx f58855W = bdyx.m91606a(f58983cr, "gms_icing_cld3_max_detected_text_bytes", 100);

    /* renamed from: X */
    public static final bdyx f58856X = bdyx.m91610a(f58983cr, "gms_icing_enable_saft_segmenter", true);

    /* renamed from: Y */
    public static final bdyx f58857Y = bdyx.m91610a(f58983cr, "gms_icing_enable_address_annotator_data_files", false);

    /* renamed from: Z */
    public static final bdyx f58858Z = bdyx.m91610a(f58983cr, "gms_icing_annotator_enable_address_multiple_countries", false);

    /* renamed from: a */
    public static final bdyx f58859a;

    /* renamed from: aA */
    public static final bdyx f58860aA = bdyx.m91610a(f58983cr, "gms_icing_enable_3p_version_9_to_8_downgrade", true);

    /* renamed from: aB */
    public static final bdyx f58861aB = bdyx.m91610a(f58983cr, "gms_icing_get_indexable_from_sequence_table", true);

    /* renamed from: aC */
    public static final bdyx f58862aC = bdyx.m91610a(f58983cr, "gms_icing_enable_clean_app_indexing_db_on_maintenance", true);

    /* renamed from: aD */
    public static final bdyx f58863aD = bdyx.m91606a(f58983cr, "gms_icing_3p_database_helper_version", -1);

    /* renamed from: aE */
    public static final bdyx f58864aE = bdyx.m91606a(f58983cr, "gms_icing_app_indexing_task_queue_max_size", 1000);

    /* renamed from: aF */
    public static final bdyx f58865aF = bdyx.m91610a(f58983cr, "gms_icing_enable_updateindex_oneoff_schedule", true);

    /* renamed from: aG */
    public static final bdyx f58866aG = bdyx.m91610a(f58983cr, "gms_icing_enable_updateindex_oneoff_task", true);

    /* renamed from: aH */
    public static final bdyx f58867aH = bdyx.m91610a(f58983cr, "gms_icing_enable_updateindex_periodic_schedule", true);

    /* renamed from: aI */
    public static final bdyx f58868aI = bdyx.m91610a(f58983cr, "gms_icing_enable_updateindex_periodic_task", true);

    /* renamed from: aJ */
    public static final bdyx f58869aJ = bdyx.m91610a(f58983cr, "gms_icing_enable_updateindex_from_content_provider", false);

    /* renamed from: aK */
    public static final bdyx f58870aK = bdyx.m91610a(f58983cr, "gms_icing_enable_updateindex_intentsending", true);

    /* renamed from: aL */
    public static final bdyx f58871aL = bdyx.m91610a(f58983cr, "gms_icing_enable_update_index_internally", true);

    /* renamed from: aM */
    public static final bdyx f58872aM = bdyx.m91610a(f58983cr, "gms_icing_clear_internal_corpora_on_content_incarnation_mismatch", true);

    /* renamed from: aN */
    public static final bdyx f58873aN = bdyx.m91609a(f58983cr, "gms_icing_app_indexing_blacklisted_packages", "");

    /* renamed from: aO */
    public static final bdyx f58874aO = bdyx.m91609a(f58983cr, "gms_icing_app_indexing_rejected_types", "");

    /* renamed from: aP */
    public static final bdyx f58875aP = bdyx.m91610a(f58983cr, "gms_icing_app_history_debug_enabled", false);

    /* renamed from: aQ */
    public static final bdyx f58876aQ = bdyx.m91607a(f58983cr, "gms_icing_report_usage_num_running_tasks", 3L);

    /* renamed from: aR */
    public static final bdyx f58877aR = bdyx.m91607a(f58983cr, "gms_icing_usage_stats_delta_millis", TimeUnit.MINUTES.toMillis(1));

    /* renamed from: aS */
    public static final bdyx f58878aS = bdyx.m91610a(f58983cr, "gms_icing_calendar_indexing_by_content_uri_triggered_task", false);

    /* renamed from: aT */
    public static final bdyx f58879aT = bdyx.m91610a(f58983cr, "gms_icing_calendar_indexing_on_provider_changed", true);

    /* renamed from: aU */
    public static final bdyx f58880aU = bdyx.m91610a(f58983cr, "gms_icing_calendar_indexing_on_rebuild_index", true);

    /* renamed from: aV */
    public static final bdyx f58881aV = bdyx.m91610a(f58983cr, "gms_icing_clear_calendar_data", false);

    /* renamed from: aW */
    public static final bdyx f58882aW = bdyx.m91607a(f58983cr, "gms_icing_calendar_indexing_task_time_before_millis", TimeUnit.SECONDS.toMillis(1));

    /* renamed from: aX */
    public static final bdyx f58883aX = bdyx.m91607a(f58983cr, "gms_icing_calendar_indexing_task_time_between_millis", TimeUnit.SECONDS.toMillis(30));

    /* renamed from: aY */
    public static final bdyx f58884aY = bdyx.m91607a(f58983cr, "gms_icing_calendar_index_time_before_millis", TimeUnit.DAYS.toMillis(366));

    /* renamed from: aZ */
    public static final bdyx f58885aZ = bdyx.m91607a(f58983cr, "gms_icing_calendar_index_time_after_millis", TimeUnit.DAYS.toMillis(366));

    /* renamed from: aa */
    public static final bdyx f58886aa = bdyx.m91610a(f58983cr, "gms_icing_disable_apps_indexing_urda", false);

    /* renamed from: ab */
    public static final bdyx f58887ab = bdyx.m91606a(f58983cr, "gms_icing_corpora_migration_aware_min_gsa_version", Integer.MAX_VALUE);

    /* renamed from: ac */
    public static final bdyx f58888ac = bdyx.m91606a(f58983cr, "gms_icing_enable_app_indexing_content_corpora_min_gsa_version", 300651176);

    /* renamed from: ad */
    public static final bdyx f58889ad = bdyx.m91606a(f58983cr, "gms_icing_enable_null_corpora_for_agsa_min_version", 300721602);

    /* renamed from: ae */
    public static final bdyx f58890ae = bdyx.m91610a(f58983cr, "gms_icing_disable_contacts_corpus", false);

    /* renamed from: af */
    public static final bdyx f58891af = bdyx.m91607a(f58983cr, "gms_icing_contacts_provider_initial_poll_delay_ms", TimeUnit.MINUTES.toMillis(5));

    /* renamed from: ag */
    public static final bdyx f58892ag = bdyx.m91607a(f58983cr, "gms_icing_contacts_provider_repoll_period_ms", TimeUnit.MINUTES.toMillis(5));

    /* renamed from: ah */
    public static final bdyx f58893ah = bdyx.m91606a(f58983cr, "gms_icing_contacts_provider_max_repoll_attempts", 3);

    /* renamed from: ai */
    public static final bdyx f58894ai = bdyx.m91607a(f58983cr, "gms_icing_contacts_provider_change_batching_delay_ms", TimeUnit.SECONDS.toMillis(30));

    /* renamed from: aj */
    public static final bdyx f58895aj = bdyx.m91607a(f58983cr, "gms_icing_contacts_update_all_interval_with_delta_ms", TimeUnit.DAYS.toMillis(7));

    /* renamed from: ak */
    public static final bdyx f58896ak = bdyx.m91606a(f58983cr, "gms_icing_mms_sms_query_batch_size", 100);

    /* renamed from: al */
    public static final bdyx f58897al = bdyx.m91610a(f58983cr, "gms_icing_enable_content_uri_triggered_task", true);

    /* renamed from: am */
    public static final bdyx f58898am = bdyx.m91610a(f58983cr, "gms_icing_send_contact_changed_broadcast_no_updates", false);

    /* renamed from: an */
    public static final bdyx f58899an = bdyx.m91610a(f58983cr, "gms_icing_debug_ce_allow_http_localhost", false);

    /* renamed from: ao */
    public static final bdyx f58900ao = bdyx.m91610a(f58983cr, "gms_icing_enable_app_indexing", true);

    /* renamed from: ap */
    public static final bdyx f58901ap = bdyx.m91610a(f58983cr, "gms_icing_enable_user_actions", true);

    /* renamed from: aq */
    public static final bdyx f58902aq = bdyx.m91610a(f58983cr, "gms_icing_enable_validate_intent_uri", true);

    /* renamed from: ar */
    public static final bdyx f58903ar = bdyx.m91610a(f58983cr, "gms_icing_enable_3p_error_cache", true);

    /* renamed from: as */
    public static final bdyx f58904as = bdyx.m91610a(f58983cr, "gms_icing_enable_3p_error_cache_clear_ttl", true);

    /* renamed from: at */
    public static final bdyx f58905at = bdyx.m91610a(f58983cr, "gms_icing_enable_3p_error_cache_clear_at_uninstall", true);

    /* renamed from: au */
    public static final bdyx f58906au = bdyx.m91610a(f58983cr, "gms_icing_enable_3p_user_action_cache", true);

    /* renamed from: av */
    public static final bdyx f58907av = bdyx.m91610a(f58983cr, "gms_icing_enable_3p_user_action_cache_clear_ttl", true);

    /* renamed from: aw */
    public static final bdyx f58908aw = bdyx.m91610a(f58983cr, "gms_icing_enable_3p_user_action_cache_clear_at_uninstall", true);

    /* renamed from: ax */
    public static final bdyx f58909ax = bdyx.m91610a(f58983cr, "gms_icing_enable_3p_user_action_associated_indexable", true);

    /* renamed from: ay */
    public static final bdyx f58910ay = bdyx.m91610a(f58983cr, "gms_icing_enable_3p_version_7_to_8_upgrade", true);

    /* renamed from: az */
    public static final bdyx f58911az = bdyx.m91610a(f58983cr, "gms_icing_enable_3p_version_8_to_9_upgrade", true);

    /* renamed from: b */
    public static final bdyx f58912b = bdyx.m91610a(f58983cr, "gms_icing_enable_gcm_task_for_internal_corpora_maintenance", true);

    /* renamed from: bA */
    public static final bdyx f58913bA = bdyx.m91610a(f58983cr, "gms_icing_enable_icing_permission_checker_in_authenticate", true);

    /* renamed from: bB */
    public static final bdyx f58914bB = bdyx.m91610a(f58983cr, "gms_icing_allow_query_with_null_package_name_not_null_corpus_name", true);

    /* renamed from: bC */
    public static final bdyx f58915bC = bdyx.m91611a(f58983cr, "gms_icing_access_control_list", f58982cq);

    /* renamed from: bD */
    public static final bdyx f58916bD = bdyx.m91608a(f58983cr, "gms_icing_search_corpus_config_override_proto", null, abzs.f58832a);

    /* renamed from: bE */
    public static final bdyx f58917bE = bdyx.m91610a(f58983cr, "gms_icing_search_corpus_config_override_enabled", true);

    /* renamed from: bF */
    public static final bdyx f58918bF = bdyx.m91606a(f58983cr, "global_search_mobile_application_corpus_min_gmscore_client_sdk_version", Integer.MAX_VALUE);

    /* renamed from: bG */
    public static final bdyx f58919bG = bdyx.m91606a(f58983cr, "global_search_sms_corpus_min_gmscore_client_sdk_version", 11200000);

    /* renamed from: bH */
    public static final bdyx f58920bH = bdyx.m91606a(f58983cr, "global_search_message_corpus_min_gmscore_client_sdk_version", 12200000);

    /* renamed from: bI */
    public static final bdyx f58921bI = bdyx.m91606a(f58983cr, "global_search_photograph_corpus_min_gsa_version", 12200000);

    /* renamed from: bJ */
    public static final bdyx f58922bJ = bdyx.m91606a(f58983cr, "global_search_event_corpus_min_gmscore_client_sdk_version", 11200000);

    /* renamed from: bK */
    public static final bdyx f58923bK = bdyx.m91606a(f58983cr, "global_search_apdl_contacts_corpus_min_gmscore_client_sdk_version", Integer.MAX_VALUE);

    /* renamed from: bL */
    public static final bdyx f58924bL = bdyx.m91606a(f58983cr, "global_search_gmail_min_gmscore_client_sdk_version", Integer.MAX_VALUE);

    /* renamed from: bM */
    public static final bdyx f58925bM = bdyx.m91607a(f58983cr, "gms_icing_app_indexing_database_helper_silent_feedback_interval_millis", TimeUnit.DAYS.toMillis(1));

    /* renamed from: bN */
    public static final bdyx f58926bN = bdyx.m91609a(f58983cr, "gms_icing_sherlog_account_name", "");

    /* renamed from: bO */
    public static final bdyx f58927bO = bdyx.m91605a(f58983cr, "gms_icing_low_power_percentage", 0.15d);

    /* renamed from: bP */
    public static final bdyx f58928bP = bdyx.m91607a(f58983cr, "gms_icing_one_off_rebuild_index_start_delay_seconds", TimeUnit.MINUTES.toSeconds(15));

    /* renamed from: bQ */
    public static final bdyx f58929bQ = bdyx.m91607a(f58983cr, "gms_icing_one_off_rebuild_index_end_delay_seconds", TimeUnit.HOURS.toSeconds(36));

    /* renamed from: bR */
    public static final bdyx f58930bR = bdyx.m91610a(f58983cr, "gms_icing_one_off_rebuild_index_require_charging", true);

    /* renamed from: bS */
    public static final bdyx f58931bS = bdyx.m91606a(f58983cr, "gms_icing_one_off_rebuild_index_network_State", 2);

    /* renamed from: bT */
    public static final bdyx f58932bT = bdyx.m91607a(f58983cr, "gms_icing_periodic_rebuild_index_period_seconds", TimeUnit.DAYS.toSeconds(1));

    /* renamed from: bU */
    public static final bdyx f58933bU = bdyx.m91607a(f58983cr, "gms_icing_periodic_rebuild_index_flex_seconds", TimeUnit.HOURS.toSeconds(12));

    /* renamed from: bV */
    public static final bdyx f58934bV = bdyx.m91607a(f58983cr, "gms_icing_periodic_rebuild_index_package_interval_millis", TimeUnit.DAYS.toMillis(30));

    /* renamed from: bW */
    public static final bdyx f58935bW = bdyx.m91607a(f58983cr, "gms_icing_periodic_rebuild_index_min_package_interval_millis", TimeUnit.DAYS.toMillis(15));

    /* renamed from: bX */
    public static final bdyx f58936bX = bdyx.m91610a(f58983cr, "gms_icing_periodic_rebuild_index_require_charging", true);

    /* renamed from: bY */
    public static final bdyx f58937bY = bdyx.m91606a(f58983cr, "gms_icing_periodic_rebuild_index_network_state", 2);

    /* renamed from: bZ */
    public static final bdyx f58938bZ = bdyx.m91607a(f58983cr, "gms_icing_wake_lock_watchdog_sleep_millis", TimeUnit.MINUTES.toMillis(10));

    /* renamed from: ba */
    public static final bdyx f58939ba = bdyx.m91606a(f58983cr, "gms_icing_calendar_max_attendees", Integer.MAX_VALUE);

    /* renamed from: bb */
    public static final bdyx f58940bb = bdyx.m91606a(f58983cr, "gms_icing_calendar_indexing_max_tasks", 100);

    /* renamed from: bc */
    public static final bdyx f58941bc = bdyx.m91606a(f58983cr, "gms_icing_calendar_indexing_max_update_batch_size", 25);

    /* renamed from: bd */
    public static final bdyx f58942bd = bdyx.m91606a(f58983cr, "gms_icing_calendar_indexing_max_remove_batch_size", 50);

    /* renamed from: be */
    public static final bdyx f58943be = bdyx.m91607a(f58983cr, "gms_icing_calendar_silent_feedback_interval_millis", TimeUnit.DAYS.toMillis(1));

    /* renamed from: bf */
    public static final bdyx f58944bf = bdyx.m91610a(f58983cr, "gms_icing_enable_corpora_aging_in_compaction", true);

    /* renamed from: bg */
    public static final bdyx f58945bg = bdyx.m91606a(f58983cr, "gms_icing_app_indexing_document_max_age_secs", (int) TimeUnit.DAYS.toSeconds(90));

    /* renamed from: bh */
    public static final bdyx f58946bh = bdyx.m91607a(f58983cr, "gms_icing_max_num_rows_per_table", 10000L);

    /* renamed from: bi */
    public static final bdyx f58947bi = bdyx.m91606a(f58983cr, "gms_icing_max_num_query_terms", 50);

    /* renamed from: bj */
    public static final bdyx f58948bj = bdyx.m91610a(f58983cr, "gms_icing_disable_clipped_retrieval_optimization", false);

    /* renamed from: bk */
    public static final bdyx f58949bk = bdyx.m91607a(f58983cr, "gms_icing_data_download_period_secs", TimeUnit.DAYS.toSeconds(1));

    /* renamed from: bl */
    public static final bdyx f58950bl = bdyx.m91610a(f58983cr, "gms_icing_refill_docs_cursor_to_fix_b30750453", true);

    /* renamed from: bm */
    public static final bdyx f58951bm = bdyx.m91610a(f58983cr, "gms_icing_enable_global_query_section_restricts", true);

    /* renamed from: bn */
    public static final bdyx f58952bn = bdyx.m91606a(f58983cr, "gms_icing_s2_cells_per_box", 50);

    /* renamed from: bo */
    public static final bdyx f58953bo = bdyx.m91606a(f58983cr, "gms_icing_s2_cells_per_in_l", 15);

    /* renamed from: bp */
    public static final bdyx f58954bp = bdyx.m91610a(f58983cr, "gms_icing_enable_annotator_blobs", true);

    /* renamed from: bq */
    public static final bdyx f58955bq = bdyx.m91610a(f58983cr, "gms_icing_enable_index_on_low_ram_device", true);

    /* renamed from: br */
    public static final bdyx f58956br = bdyx.m91610a(f58983cr, "gms_icing_skip_init_on_low_memory", true);

    /* renamed from: bs */
    public static final bdyx f58957bs = bdyx.m91610a(f58983cr, "gms_icing_do_not_act_on_gsa_removal_if_running_as_api_test", false);

    /* renamed from: bt */
    public static final bdyx f58958bt = bdyx.m91606a(f58983cr, "gms_icing_tv_device_resolution_method", 2);

    /* renamed from: bu */
    public static final bdyx f58959bu = bdyx.m91610a(f58983cr, "gms_icing_udc_should_send_settings_changed_broadcast", false);

    /* renamed from: bv */
    public static final bdyx f58960bv = bdyx.m91607a(f58983cr, "gms_icing_lockbox_connection_timeout_millis", 500L);

    /* renamed from: bw */
    public static final bdyx f58961bw = bdyx.m91610a(f58983cr, "gms_icing_annotator_enable_date_range_extraction", false);

    /* renamed from: bx */
    public static final bdyx f58962bx = bdyx.m91610a(f58983cr, "gms_icing_enable_subscriber_number_extraction", true);

    /* renamed from: by */
    public static final bdyx f58963by = bdyx.m91609a(f58983cr, "gms_icing_ime_package_names", "com.android.inputmethod.latin,com.google.android.inputmethod.latin,com.google.android.inputmethod.latin.dev,com.google.android.inputmethod.latin.canary,com.google.android.inputmethod.pinyin,com.google.android.inputmethod.korean,com.google.android.inputmethod.japanese,com.google.android.apps.inputmethod.hindi,com.google.android.apps.inputmethod.cantonese,com.google.android.apps.inputmethod.zhuyin");

    /* renamed from: bz */
    public static final bdyx f58964bz = bdyx.m91609a(f58983cr, "gms_icing_app_indexing_type_access_whitelist", "com.android.inputmethod.latin=Sticker,StickerPack;com.google.android.inputmethod.latin=Sticker,StickerPack;com.google.android.inputmethod.latin.dev=Sticker,StickerPack;com.google.android.inputmethod.latin.canary=Sticker,StickerPack;com.google.android.inputmethod.pinyin=Sticker,StickerPack;com.google.android.inputmethod.korean=Sticker,StickerPack;com.google.android.inputmethod.japanese=Sticker,StickerPack;com.google.android.apps.inputmethod.hindi=Sticker,StickerPack;com.google.android.apps.inputmethod.cantonese=Sticker,StickerPack;com.google.android.apps.inputmethod.zhuyin=Sticker,StickerPack");

    /* renamed from: c */
    public static final bdyx f58965c = bdyx.m91607a(f58983cr, "gms_icing_internal_corpora_maintenance_frequency_secs", TimeUnit.DAYS.toSeconds(1));

    /* renamed from: ca */
    public static final bdyx f58966ca = bdyx.m91606a(f58983cr, "gms_icing_contact_name_section_weight", 10);

    /* renamed from: cb */
    public static final bdyx f58967cb = bdyx.m91606a(f58983cr, "gms_icing_contact_email_telephone_section_weight", 3);

    /* renamed from: cc */
    public static final bdyx f58968cc = bdyx.m91609a(f58983cr, "gms_icing_contact_corpus_current_version", "8");

    /* renamed from: cd */
    public static final bdyx f58969cd = bdyx.m91606a(f58983cr, "gms_icing_max_samples_per_clearcut_counter", 100);

    /* renamed from: ce */
    public static final bdyx f58970ce = bdyx.m91606a(f58983cr, "gms_icing_app_indexing_batch_max_tasks", 100);

    /* renamed from: cf */
    public static final bdyx f58971cf = bdyx.m91606a(f58983cr, "gms_icing_app_indexing_batch_max_rows", 5000);

    /* renamed from: cg */
    public static final bdyx f58972cg = bdyx.m91610a(f58983cr, "gms_icing_allow_flag_change_to_invalidate_ground_truth", true);

    /* renamed from: ch */
    public static final bdyx f58973ch = bdyx.m91609a(f58983cr, "gms_icing_relevance_ranking_strategy_st_sort_expr", "(MUL _MAX_HIT_WEIGHT _CORPUS_WEIGHT (ADD 0.5 (MUL 0.5 (EXP (DIV (MAX 0 (SUB _TIMESTAMP (MAX _LAST_USED_TIMESTAMP _CREATED_TIMESTAMP))) -604800)))))");

    /* renamed from: ci */
    public static final bdyx f58974ci = bdyx.m91609a(f58983cr, "gms_icing_packages_whitelisted_for_appdatasearch_indexing_api_on_p", "com.google.android.gms");

    /* renamed from: cj */
    public static final bdyx f58975cj = bdyx.m91607a(f58983cr, "gms_icing_slice_retrieval_timeout_ms", TimeUnit.SECONDS.toMillis(10));

    /* renamed from: ck */
    public static final bdyx f58976ck = bdyx.m91607a(f58983cr, "gms_icing_serialized_slice_bytes_clearcut_counter_bucket_size", 1024L);

    /* renamed from: cl */
    public static final bdyx f58977cl = bdyx.m91607a(f58983cr, "gms_icing_slice_retrieval_latency_ms_clearcut_counter_bucket_size", 100L);

    /* renamed from: cm */
    public static final bdyx f58978cm = bdyx.m91607a(f58983cr, "gms_icing_max_serialized_slice_bytes", 204800L);

    /* renamed from: cn */
    public static final bdyx f58979cn = bdyx.m91607a(f58983cr, "gms_icing_max_document_size", 65535L);

    /* renamed from: co */
    public static final bdyx f58980co = bdyx.m91606a(f58983cr, "gms_icing_query_response_bytes_limit", 1048576);

    /* renamed from: cp */
    public static final bdyx f58981cp = bdyx.m91608a(f58983cr, "gms_icing_update_via_patch_filter", Collections.emptyList(), new abzx());

    /* renamed from: cq */
    private static final byte[] f58982cq = new byte[0];

    /* renamed from: cr */
    private static final bdyw f58983cr;

    /* renamed from: d */
    public static final bdyx f58984d = bdyx.m91610a(f58983cr, "gms_icing_gcm_tasks_require_device_idle", true);

    /* renamed from: e */
    public static final bdyx f58985e = bdyx.m91607a(f58983cr, "gms_icing_internal_corpora_maintenance_flex_secs", TimeUnit.HOURS.toSeconds(12));

    /* renamed from: f */
    public static final bdyx f58986f = bdyx.m91607a(f58983cr, "gms_icing_compact_interval_ms", 604800000L);

    /* renamed from: g */
    public static final bdyx f58987g = bdyx.m91607a(f58983cr, "gms_icing_maintenance_force_interval_ms", 2419200000L);

    /* renamed from: h */
    public static final bdyx f58988h = bdyx.m91607a(f58983cr, "gms_icing_storage_threshold_bytes", 0L);

    /* renamed from: i */
    public static final bdyx f58989i = bdyx.m91607a(f58983cr, "gms_icing_storage_threshold_percent", 0L);

    /* renamed from: j */
    public static final bdyx f58990j = bdyx.m91607a(f58983cr, "gms_icing_storage_compact_threshold", 10L);

    /* renamed from: k */
    public static final bdyx f58991k = bdyx.m91610a(f58983cr, "gms_icing_log_debug_ui_stats", true);

    /* renamed from: l */
    public static final bdyx f58992l = bdyx.m91610a(f58983cr, "gms_icing_log_corpus_stats", true);

    /* renamed from: m */
    public static final bdyx f58993m = bdyx.m91610a(f58983cr, "gms_icing_log_in_worker_thread", true);

    /* renamed from: n */
    public static final bdyx f58994n = bdyx.m91610a(f58983cr, "gms_icing_enable_logging_api_stats", true);

    /* renamed from: o */
    public static final bdyx f58995o = bdyx.m91610a(f58983cr, "gms_icing_enable_silent_feedback", true);

    /* renamed from: p */
    public static final bdyx f58996p = bdyx.m91609a(f58983cr, "gms_icing_context_engine_proto_base_url", "");

    /* renamed from: q */
    public static final bdyx f58997q = bdyx.m91609a(f58983cr, "gms_icing_context_engine_proto_path", "");

    /* renamed from: r */
    public static final bdyx f58998r = bdyx.m91609a(f58983cr, "gms_icing_context_engine_proto_override", "");

    /* renamed from: s */
    public static final bdyx f58999s = bdyx.m91610a(f58983cr, "gms_icing_context_engine_proto_enable_logging", false);

    /* renamed from: t */
    public static final bdyx f59000t = bdyx.m91606a(f58983cr, "gms_icing_context_engine_timeout_millis", (int) DefaultRetryPolicy.DEFAULT_TIMEOUT_MS);

    /* renamed from: u */
    public static final bdyx f59001u = bdyx.m91607a(f58983cr, "gms_icing_context_engine_request_timeout_millis", TimeUnit.SECONDS.toMillis(10));

    /* renamed from: v */
    public static final bdyx f59002v = bdyx.m91606a(f58983cr, "gms_icing_context_engine_retry_count", 1);

    /* renamed from: w */
    public static final bdyx f59003w = bdyx.m91605a(f58983cr, "gms_icing_context_engine_backoff_mult", 2.0d);

    /* renamed from: x */
    public static final bdyx f59004x = bdyx.m91609a(f58983cr, "gms_icing_seldon_base_auth_scope", "https://www.googleapis.com/auth/contextengine");

    /* renamed from: y */
    public static final bdyx f59005y = bdyx.m91609a(f58983cr, "gms_icing_footprints_api_auth_scope", "oauth2:https://www.googleapis.com/auth/webhistory");

    /* renamed from: z */
    public static final bdyx f59006z = bdyx.m91609a(f58983cr, "gms_icing_footprints_api_url_base", "https://history.google.com/history/api");

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
    static {
        bdyw bdyw = new bdyw(anef.m64088a("com.google.android.gms.icing"));
        f58983cr = bdyw;
        f58859a = bdyx.m91607a(bdyw, "gms_icing_maintenance_frequency_ms", 86400000L);
        bdyx.m91609a(f58983cr, "gms_icing_enabled_annotators_for_annotation_api", "");
        bdyx.m91607a(f58983cr, "gms_icing_contacts_update_all_interval_without_delta_ms", TimeUnit.DAYS.toMillis(1));
        bdyx.m91610a(f58983cr, "gms_icing_enable_send_rebuild_index_for_apdl_index", true);
        bdyx.m91606a(f58983cr, "gms_icing_message_indexing_max_remove_batch_size", 100);
        bdyx.m91609a(f58983cr, "gms_icing_ime_whitelisted_packages", "com.google.android.gm,com.google.android.gms");
        bdyx.m91610a(f58983cr, "Icing__contacts_logger_disabled", false);
    }

    /* renamed from: a */
    public static Set m48725a() {
        return new HashSet(Arrays.asList(TextUtils.split((String) f58963by.mo58455c(), ",")));
    }

    /* renamed from: b */
    public static boolean m48728b(String str) {
        return sqc.m35963b(((String) f58873aN.mo58455c()).split(","), str);
    }

    /* renamed from: c */
    public static boolean m48729c(String str) {
        return ((Boolean) f58900ao.mo58455c()).booleanValue() && !m48728b(str);
    }

    /* renamed from: a */
    public static boolean m48726a(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        int i = Build.VERSION.SDK_INT;
        return Settings.Global.getInt(contentResolver, "adb_enabled", 0) != 0;
    }

    /* renamed from: a */
    public static boolean m48727a(String str) {
        return sqc.m35963b(((String) f58841I.mo58455c()).split(","), str);
    }
}
