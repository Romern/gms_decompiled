package p000;

import android.content.Context;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: aghn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aghn {

    /* renamed from: A */
    public static final aghm f65445A = m54209a("measurement.upload.retry_time", 1800000L, 1800000L, agen.f65361a);

    /* renamed from: B */
    public static final aghm f65446B = m54209a("measurement.upload.retry_count", 6, 6, ageo.f65362a);

    /* renamed from: C */
    public static final aghm f65447C = m54209a("measurement.upload.max_queue_time", 2419200000L, 2419200000L, agep.f65363a);

    /* renamed from: D */
    public static final aghm f65448D = m54209a("measurement.lifetimevalue.max_currency_tracked", 4, 4, ageq.f65364a);

    /* renamed from: E */
    public static final aghm f65449E;

    /* renamed from: F */
    public static final aghm f65450F = m54208a("measurement.upload.max_public_user_properties", 25);

    /* renamed from: G */
    public static final aghm f65451G = m54208a("measurement.upload.max_event_name_cardinality", 500);

    /* renamed from: H */
    public static final aghm f65452H = m54208a("measurement.upload.max_public_event_params", 25);

    /* renamed from: I */
    public static final aghm f65453I = m54209a("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, aget.f65367a);

    /* renamed from: J */
    public static final aghm f65454J = m54209a("measurement.experiment.max_ids", 50, 50, agez.f65373a);

    /* renamed from: K */
    public static final aghm f65455K = m54209a("measurement.max_bundles_per_iteration", 1, 1, agfa.f65374a);

    /* renamed from: L */
    public static final aghm f65456L = m54209a("measurement.validation.internal_limits_internal_event_params", false, false, agfb.f65375a);

    /* renamed from: M */
    public static final aghm f65457M = m54209a("measurement.referrer.enable_logging_install_referrer_cmp_from_apk", true, true, agfd.f65377a);

    /* renamed from: N */
    public static final aghm f65458N = m54209a("measurement.collection.firebase_global_collection_flag_enabled", true, true, agfe.f65378a);

    /* renamed from: O */
    public static final aghm f65459O = m54209a("measurement.collection.efficient_engagement_reporting_enabled_2", false, false, agff.f65379a);

    /* renamed from: P */
    public static final aghm f65460P = m54209a("measurement.collection.redundant_engagement_removal_enabled", false, false, agfg.f65380a);

    /* renamed from: Q */
    public static final aghm f65461Q = m54209a("measurement.client.freeride_engagement_fix", true, true, agfh.f65381a);

    /* renamed from: R */
    public static final aghm f65462R = m54209a("measurement.experiment.enable_experiment_reporting", true, true, agfi.f65382a);

    /* renamed from: S */
    public static final aghm f65463S = m54209a("measurement.collection.log_event_and_bundle_v2", true, true, agfj.f65383a);

    /* renamed from: T */
    public static final aghm f65464T = m54208a("measurement.quality.checksum", false);

    /* renamed from: U */
    public static final aghm f65465U = m54209a("measurement.sdk.dynamite.use_dynamite3", false, false, agfk.f65384a);

    /* renamed from: V */
    public static final aghm f65466V = m54209a("measurement.sdk.dynamite.allow_remote_dynamite", false, false, agfl.f65385a);

    /* renamed from: W */
    public static final aghm f65467W = m54209a("measurement.sdk.collection.validate_param_names_alphabetical", true, true, agfm.f65386a);

    /* renamed from: X */
    public static final aghm f65468X = m54209a("measurement.collection.event_safelist", true, true, agfo.f65388a);

    /* renamed from: Y */
    public static final aghm f65469Y = m54209a("measurement.service.audience.invalidate_config_cache_after_app_unisntall", true, true, agfp.f65389a);

    /* renamed from: Z */
    public static final aghm f65470Z = m54209a("measurement.service.audience.fix_skip_audience_with_failed_filters", true, true, agfq.f65390a);

    /* renamed from: a */
    public static final List f65471a = Collections.synchronizedList(new ArrayList());

    /* renamed from: aA */
    public static final aghm f65472aA = m54209a("measurement.androidId.delete_feature", true, true, aghd.f65429a);

    /* renamed from: aB */
    public static final aghm f65473aB = m54209a("measurement.sdk.attribution.cache", true, true, aghh.f65433a);

    /* renamed from: aC */
    public static final aghm f65474aC = m54209a("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, aghi.f65434a);

    /* renamed from: aa */
    public static final aghm f65475aa = m54209a("measurement.sdk.collection.retrieve_deeplink_from_bow_2", true, true, agfu.f65394a);

    /* renamed from: ab */
    public static final aghm f65476ab = m54209a("measurement.sdk.collection.last_deep_link_referrer2", true, true, agfv.f65395a);

    /* renamed from: ac */
    public static final aghm f65477ac = m54209a("measurement.sdk.collection.last_deep_link_referrer_campaign2", false, false, agfw.f65396a);

    /* renamed from: ad */
    public static final aghm f65478ad = m54209a("measurement.sdk.collection.last_gclid_from_referrer2", false, false, agfx.f65397a);

    /* renamed from: ae */
    public static final aghm f65479ae = m54209a("measurement.sdk.collection.enable_extend_user_property_size", true, true, agfz.f65399a);

    /* renamed from: af */
    public static final aghm f65480af = m54209a("measurement.upload.file_lock_state_check", false, false, agga.f65400a);

    /* renamed from: ag */
    public static final aghm f65481ag = m54209a("measurement.sampling.calculate_bundle_timestamp_before_sampling", true, true, aggb.f65401a);

    /* renamed from: ah */
    public static final aghm f65482ah = m54209a("measurement.lifecycle.app_backgrounded_tracking", true, true, aggd.f65403a);

    /* renamed from: ai */
    public static final aghm f65483ai = m54209a("measurement.lifecycle.app_in_background_parameter", false, false, agge.f65404a);

    /* renamed from: aj */
    public static final aghm f65484aj = m54209a("measurement.lifecycle.app_backgrounded_engagement", false, false, aggg.f65406a);

    /* renamed from: ak */
    public static final aghm f65485ak = m54209a("measurement.collection.service.update_with_analytics_fix", false, false, aggh.f65407a);

    /* renamed from: al */
    public static final aghm f65486al = m54209a("measurement.client.firebase_feature_rollout.v1.enable", true, true, aggk.f65410a);

    /* renamed from: am */
    public static final aghm f65487am = m54209a("measurement.config.string.always_update_disk_on_set", true, true, aggm.f65412a);

    /* renamed from: an */
    public static final aghm f65488an = m54209a("measurement.scheduler.task_thread.cleanup_on_exit", false, false, aggn.f65413a);

    /* renamed from: ao */
    public static final aghm f65489ao = m54209a("measurement.upload.file_truncate_fix", false, false, aggo.f65414a);

    /* renamed from: ap */
    public static final aghm f65490ap = m54209a("measurement.engagement_time_main_thread", true, true, aggp.f65415a);

    /* renamed from: aq */
    public static final aghm f65491aq = m54209a("measurement.sdk.referrer.delayed_install_referrer_api", false, false, aggq.f65416a);

    /* renamed from: ar */
    public static final aghm f65492ar = m54209a("measurement.sdk.screen.manual_screen_view_logging", true, true, aggs.f65418a);

    /* renamed from: as */
    public static final aghm f65493as = m54209a("measurement.gold.enhanced_ecommerce.format_logs", false, false, aggt.f65419a);

    /* renamed from: at */
    public static final aghm f65494at = m54209a("measurement.gold.enhanced_ecommerce.nested_param_daily_event_count", false, false, aggv.f65421a);

    /* renamed from: au */
    public static final aghm f65495au = m54209a("measurement.gold.enhanced_ecommerce.upload_nested_complex_events", false, false, aggw.f65422a);

    /* renamed from: av */
    public static final aghm f65496av = m54209a("measurement.gold.enhanced_ecommerce.log_nested_complex_events", false, false, aggx.f65423a);

    /* renamed from: aw */
    public static final aghm f65497aw = m54209a("measurement.gold.enhanced_ecommerce.updated_schema.client", false, false, aggy.f65424a);

    /* renamed from: ax */
    public static final aghm f65498ax = m54209a("measurement.gold.enhanced_ecommerce.updated_schema.service", false, false, aggz.f65425a);

    /* renamed from: ay */
    public static final aghm f65499ay = m54209a("measurement.service.configurable_service_limits", false, false, aghb.f65427a);

    /* renamed from: az */
    public static final aghm f65500az = m54209a("measurement.client.configurable_service_limits", false, false, aghc.f65428a);

    /* renamed from: b */
    public static final aghm f65501b = m54209a("measurement.ad_id_cache_time", 10000L, 10000L, agdv.f65343a);

    /* renamed from: c */
    public static final aghm f65502c = m54209a("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, ageg.f65354a);

    /* renamed from: d */
    public static final aghm f65503d = m54209a("measurement.config.cache_time", 86400000L, 3600000L, ager.f65365a);

    /* renamed from: e */
    public static final aghm f65504e = m54209a("measurement.config.url_scheme", "https", "https", agfc.f65376a);

    /* renamed from: f */
    public static final aghm f65505f = m54209a("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", agfn.f65387a);

    /* renamed from: g */
    public static final aghm f65506g = m54209a("measurement.upload.max_bundles", 100, 100, agfy.f65398a);

    /* renamed from: h */
    public static final aghm f65507h;

    /* renamed from: i */
    public static final aghm f65508i;

    /* renamed from: j */
    public static final aghm f65509j = m54209a("measurement.upload.max_events_per_bundle", 1000, 1000, aghf.f65431a);

    /* renamed from: k */
    public static final aghm f65510k = m54209a("measurement.upload.max_events_per_day", 100000, 100000, aghj.f65435a);

    /* renamed from: l */
    public static final aghm f65511l = m54209a("measurement.upload.max_error_events_per_day", 1000, 1000, agdw.f65344a);

    /* renamed from: m */
    public static final aghm f65512m = m54209a("measurement.upload.max_public_events_per_day", 50000, 50000, agdx.f65345a);

    /* renamed from: n */
    public static final aghm f65513n = m54209a("measurement.upload.max_conversions_per_day", 10000, 10000, agdy.f65346a);

    /* renamed from: o */
    public static final aghm f65514o = m54209a("measurement.upload.max_realtime_events_per_day", 10, 10, agdz.f65347a);

    /* renamed from: p */
    public static final aghm f65515p = m54209a("measurement.store.max_stored_events_per_app", 100000, 100000, agea.f65348a);

    /* renamed from: q */
    public static final aghm f65516q = m54209a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", ageb.f65349a);

    /* renamed from: r */
    public static final aghm f65517r = m54209a("measurement.upload.backoff_period", 43200000L, 43200000L, agec.f65350a);

    /* renamed from: s */
    public static final aghm f65518s = m54209a("measurement.upload.interval", 3600000L, 3600000L, agee.f65352a);

    /* renamed from: t */
    public static final aghm f65519t = m54209a("measurement.upload.realtime_upload_interval", 10000L, 10000L, agef.f65353a);

    /* renamed from: u */
    public static final aghm f65520u = m54209a("measurement.upload.debug_upload_interval", 1000L, 1000L, ageh.f65355a);

    /* renamed from: v */
    public static final aghm f65521v = m54209a("measurement.upload.minimum_delay", 500L, 500L, agei.f65356a);

    /* renamed from: w */
    public static final aghm f65522w = m54209a("measurement.alarm_manager.minimum_interval", 60000L, 60000L, agej.f65357a);

    /* renamed from: x */
    public static final aghm f65523x = m54209a("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, agek.f65358a);

    /* renamed from: y */
    public static final aghm f65524y = m54209a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, agel.f65359a);

    /* renamed from: z */
    public static final aghm f65525z = m54209a("measurement.upload.initial_upload_delay_time", 15000L, 15000L, agem.f65360a);

    static {
        Collections.synchronizedSet(new HashSet());
        Integer valueOf = Integer.valueOf((int) AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE);
        f65507h = m54209a("measurement.upload.max_batch_size", valueOf, valueOf, aggj.f65409a);
        f65508i = m54209a("measurement.upload.max_bundle_size", valueOf, valueOf, aggu.f65420a);
        m54209a("measurement.upload.window_interval", 3600000L, 3600000L, aged.f65351a);
        Integer valueOf2 = Integer.valueOf((int) BaseMfiEventCallback.TYPE_UNKNOWN_ERROR);
        f65449E = m54209a("measurement.audience.filter_result_max_count", valueOf2, valueOf2, ages.f65366a);
        m54209a("measurement.test.boolean_flag", false, false, ageu.f65368a);
        m54209a("measurement.test.string_flag", "---", "---", agev.f65369a);
        m54209a("measurement.test.long_flag", -1L, -1L, agew.f65370a);
        m54209a("measurement.test.int_flag", -2, -2, agex.f65371a);
        Double valueOf3 = Double.valueOf(-3.0d);
        m54209a("measurement.test.double_flag", valueOf3, valueOf3, agey.f65372a);
        m54209a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false, false, agfr.f65391a);
        m54209a("measurement.audience.refresh_event_count_filters_timestamp", false, false, agfs.f65392a);
        m54209a("measurement.audience.use_bundle_timestamp_for_event_count_filters", false, false, agft.f65393a);
        m54209a("measurement.ga.ga_app_id", false, false, aggc.f65402a);
        m54209a("measurement.integration.disable_firebase_instance_id", false, false, aggf.f65405a);
        m54209a("measurement.service.use_appinfo_modified", false, false, aggi.f65408a);
        m54209a("measurement.client.sessions.check_on_reset_and_enable2", true, true, aggl.f65411a);
        m54209a("measurement.sdk.screen.disabling_automatic_reporting", true, true, aggr.f65417a);
        m54209a("measurement.collection.synthetic_data_mitigation", false, false, agha.f65426a);
        m54209a("measurement.client.global_params.dev", false, false, aghe.f65430a);
        m54209a("measurement.client.string_reader", true, true, aghg.f65432a);
    }

    /* renamed from: a */
    static aghm m54208a(String str, Object obj) {
        return m54209a(str, obj, obj, null);
    }

    /* renamed from: a */
    static aghm m54209a(String str, Object obj, Object obj2, aghk aghk) {
        aghm aghm = new aghm(str, obj, obj2, aghk);
        f65471a.add(aghm);
        return aghm;
    }

    /* renamed from: a */
    public static Map m54210a(Context context) {
        bdxy a = bdxy.m91563a(context.getContentResolver(), bdyj.m91581a("com.google.android.gms.measurement"));
        return a != null ? a.mo58434a() : Collections.emptyMap();
    }
}
