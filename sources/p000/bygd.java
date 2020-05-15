package p000;

import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: bygd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bygd implements bxvp {
    UNSPECIFIED_EVENT_CODE(0),
    MODULE_CPID_REQUEST(1),
    MODULE_CPID_RESPONSE_SUCCESS(2),
    MODULE_CPID_RESPONSE_FAILURE(3),
    MODULE_DP_STATUS_REQUEST(4),
    MODULE_DP_STATUS_RESPONSE_SUCCESS(5),
    MODULE_DP_STATUS_RESPONSE_FAILURE(6),
    MODULE_US_OFFER_REQUEST(7),
    MODULE_US_OFFER_RESPONSE_SUCCESS(8),
    MODULE_US_OFFER_RESPONSE_FAILURE(9),
    MODULE_PURCHASE_REQUEST(10),
    MODULE_PURCHASE_RESPONSE_SUCCESS(11),
    MODULE_PURCHASE_RESPONSE_FAILURE(12),
    MODULE_GET_CONSENT_INFORMATION_REQUEST(13),
    MODULE_GET_CONSENT_INFORMATION_RESPONSE_SUCCESS(14),
    MODULE_GET_CONSENT_INFORMATION_RESPONSE_FAILURE(15),
    MODULE_SET_CONSENT_STATUS_REQUEST(16),
    MODULE_SET_CONSENT_STATUS_RESPONSE_SUCCESS(17),
    MODULE_SET_CONSENT_STATUS_RESPONSE_FAILURE(18),
    MODULE_SET_CONSENT_STATUS_RESPONSE_RPC(97),
    RECEIVED_BY_GCM(19),
    GCM_MESSAGE_ERROR_RECV_EMPTY(20),
    GCM_MESSAGE_ERROR_PARSE(21),
    GCM_MESSAGE_ERROR_NO_ICCID(22),
    GCM_MESSAGE_ERROR_UNMATCHED_CARRIER(23),
    GCM_MESSAGE_BLOCKED_BY_USER(24),
    GCM_MESSAGE_BLOCKED_BY_GMSCORE(25),
    GCM_MESSAGE_BLOCKED_BY_PHENOTYPE(26),
    GCM_MESSAGE_BLOCKED_BY_MDP(27),
    GCM_MESSAGE_BLOCKED_BY_TIMEOUT(73),
    GCM_MESSAGE_EMPTY_BODY(84),
    GCM_MESSAGE_NO_INFO(85),
    GCM_MESSAGE_NO_CARRIER_ID(86),
    GCM_MESSAGE_BLOCKED_EXTRA_WELCOME_NOTIFICATION(87),
    GCM_MESSAGE_NOT_CONSENTED(89),
    GCM_MESSAGE_HIDDEN(90),
    GCM_MESSAGE_ERROR_INVALID_CHANNEL(96),
    GCM_MESSAGE_WARN_UNMATCHED_SIM_ID(220),
    GCM_MESSAGE_WARN_NO_SIM_ID(221),
    GCM_MESSAGE_BLOCKED_NO_SUPPORTED_SIM(222),
    GCM_MESSAGE_BLOCKED_UNMATCHED_SIM_ID(223),
    GCM_MESSAGE_HIDDEN_NOTIFICATION_HANDLED_SUCCESSFULLY(AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_PASSWORD),
    GCM_MESSAGE_ERROR_HANDLING_HIDDEN_NOTIFICATION(225),
    GCM_MESSAGE_ERROR_NO_HANDLER_FOR_HIDDEN_NOTIFICATION(226),
    REENABLED_BY_USER(28),
    REENABLED_BY_GMSCORE(29),
    POP_UP(30),
    DISMISSED_BY_USER(31),
    CLEARED_ALL_BY_USER(32),
    WELCOME_JUMP_TO_UI(33),
    PLAN_STATUS_JUMP_TO_UI(34),
    UPSELL_OFFER_JUMP_TO_UI(35),
    ACCOUNT_ALERT_JUMP_TO_UI(120),
    OUT_OF_DATA_JUMP_TO_UI(121),
    EXPIRATION_REMINDER_JUMP_TO_UI(122),
    ACCOUNT_BALANCE_JUMP_TO_UI(123),
    PURCHASE_JUMP_TO_UI(124),
    DAILY_UPDATE_JUMP_TO_UI(125),
    PAYGO_JUMP_TO_UI(126),
    OTHER_JUMP_TO_UI(127),
    VIEW_PLAN_DETAILS(36),
    VIEW_OFFER_DETAILS(37),
    VIEW_FLEX_WIN_DETAILS(38),
    VIEW_CARRIER_LINK(39),
    VIEW_TERMS(40),
    PURCHASE_OFFER(41),
    PURCHASE_FAILED(42),
    SYSTEM_NOTIFICATION_CONTROL(43),
    ENABLE_NOTIFICATION(44),
    DISABLE_NOTIFICATION(45),
    REFRESH_DATA_PLAN(46),
    REFRESH_FAILED(47),
    EXIT_MDP_UI(48),
    ENTER_MDP_UI_VIA_MENU(49),
    ENTER_MDP_UI_VIA_NOTIFICATION(50),
    ENTER_MDP_UI_VIA_DEEP_LINK(51),
    CLICK_CONFIRM_PURCHASE(52),
    CLICK_CANCEL_PURCHASE(53),
    CLICK_WALLET_BALANCE(54),
    CLICK_CONSENT_DECLINE(55),
    CLICK_CONSENT_CONTINUE(56),
    CLICK_CONSENT_AGREE(57),
    CLICK_STOP_SYNCING_PLAN(58),
    MDP_UI_LANDING_PAGE_LOADED(59),
    CARRIER_LOGO_LOADED(60),
    DATA_PLAN_LOADED(61),
    UPSELL_OFFER_LOADED(62),
    ERROR_PAGE_SHOWN(63),
    ERROR_PAGE_HIDDEN(64),
    API_TIMEOUT(65),
    BACKGROUND_CPID_SCHEDULE(66),
    BACKGROUND_CPID_REQUEST(67),
    BACKGROUND_CPID_RESPONSE_SUCCESS(68),
    BACKGROUND_CPID_RESPONSE_FAILURE(69),
    CPID_REGISTER_ACTION(70),
    REGISTER_LISTENER_REQUEST(71),
    REGISTER_LISTENER_FAILURE(72),
    CLICK_CARRIER_SUPPORT(74),
    CARRIER_SUPPORT_LOADED(75),
    SUPPORT_METHOD_LAUNCHED(76),
    EXIT_CARRIER_SUPPORT(77),
    TERMINATE_MDP_UI(78),
    ENTER_CONSENT_UI_VIA_MDP(79),
    ENTER_CONSENT_UI_OTHERS(80),
    REENTER_MDP_UI_VIA_APP_PICKER(81),
    REENTER_MDP_UI_VIA_NOTIFICATION(82),
    REENTER_MDP_UI_VIA_DEEP_LINK(83),
    FINISH_UI_AFTER_USER_TRIGGER(88),
    BG_TRIGGERING_EVENT(91),
    CACHING_CACHED_PLAN_SHOWN(100),
    CACHING_LOADING_SNACKBAR_SHOWN(101),
    CACHING_ERROR_SNACKBAR_SHOWN(102),
    CACHING_SNACKBAR_RETRY_CLICKED(ErrorInfo.TYPE_SDU_COMMUNICATIONERROR),
    CACHING_SAVE_ATTEMPT(ErrorInfo.TYPE_SDU_FAILED),
    CACHING_ERROR_NON_EXISTING_DEVICE_TABLE_ON_WELCOME_NOTIFICATION(ErrorInfo.TYPE_SDU_MEMORY_FULL),
    CACHING_FLUSH_DEVICE_TABLE(106),
    CACHING_ERROR_FLUSHING_DEVICE_TABLE(107),
    CACHING_INVALIDATE_CPID_REQUEST(108),
    BACKGROUND_CONSENT_SCHEDULE(92),
    BACKGROUND_CONSENT_REQUEST(93),
    BACKGROUND_CONSENT_SUCCESS(94),
    BACKGROUND_CONSENT_FAILURE(95),
    SCHEDULE_PERIODIC_WORKFLOW(140),
    RUN_PERIODIC_WORKFLOW(141),
    REGISTER_CELL_NETWORK_EVENT_CALLBACK(142),
    CELL_NETWORK_LOST(143),
    NEW_CELL_NETWORK_AVAILABLE(AndroidInputTypeSignal.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD),
    SET_TRIGGERING_VECTORS(145),
    CHECK_IF_TASK_DUE(146),
    BACKGROUND_SET_CONSENT_ATTEMPT(147),
    BACKGROUND_SET_CONSENT_SUCCESS(148),
    BACKGROUND_SET_CONSENT_FAILURE(149),
    BACKGROUND_LIST_CPID_ENDPOINTS_ATTEMPT(MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED),
    BACKGROUND_LIST_CPID_ENDPOINTS_SKIPPED(MfiClientException.TYPE_MFICLIENT_NOT_FOUND),
    BACKGROUND_LIST_CPID_ENDPOINTS_SUCCESS(MfiClientException.TYPE_MFICLIENT_NOT_ACTIVATED),
    BACKGROUND_LIST_CPID_ENDPOINTS_FAILURE(MfiClientException.TYPE_MFICLIENT_STARTED),
    BACKGROUND_SET_CONSENT_OPT_IN_AFTER_TIMEOUT(MfiClientException.TYPE_MFICLIENT_NOT_STARTED),
    REPURCHASE_OFFER_LOADED(160),
    VIEW_REPURCHASE_DETAILS(161),
    CLICK_CONFIRM_REPURCHASE(162),
    CLICK_CANCEL_REPURCHASE(163),
    DEVICE_STATUS_SIM_STATE_CHANGED(170),
    DEVICE_STATUS_SUBSCRIPTIONS_CHANGED(171),
    DEVICE_STATUS_LOCALE_CHANGED(172),
    CLICK_CONSENT_TERMS(190),
    CONSENT_SHOWS_AGREE_ON_LOAD(191),
    CONSENT_BUTTON_CHANGED(AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PHONETIC),
    OPT_OUT_PAGE_SHOWN(193),
    CLICK_OPT_IN(194),
    SHOW_PRIVACY_NOTICE(195),
    DISMISS_PRIVACY_NOTICE(196),
    ENTER_SETTINGS_VIA_MDP(BaseMfiEventCallback.TYPE_UNKNOWN_ERROR),
    ENTER_SETTINGS_VIA_NOTIFICATION(ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR),
    ENTER_SETTINGS_VIA_OTHER(202),
    ENTER_MDP_UI_VIA_SETTINGS(BaseMfiEventCallback.TYPE_ILLEGAL_LINKAGE_DATA),
    SETTINGS_ENABLE_CHANNEL(203),
    SETTINGS_DISABLE_CHANNEL(204),
    SETTINGS_REVOKE_CONSENT(205),
    EXIT_MDP_SETTINGS(BaseMfiEventCallback.TYPE_SERVER_GENERAL_ERROR),
    NOTIFICATION_ACTION_TAKEN(BaseMfiEventCallback.TYPE_EXPIRED_MFI),
    JUMP_TO_SETTINGS(208),
    CONSENT_STATUS_CONVERSION_ABORTED_ALREADY_CONVERTED(240),
    CONSENT_STATUS_CONVERSION_EXECUTED(241),
    CONSENT_STATUS_CONVERSION_FAILURE_SAVING_STATUS(242),
    CONSENT_STATUS_CONVERSION_FAILURE_FLAG_DISABLED(243),
    CONSENT_STATUS_CONVERSION_FAILURE_SAVING_SIM_CONSENT_MODE(244),
    CONSENT_STATUS_CONVERSION_FAILURE_NO_SIM_CARDS(245),
    CONSENT_STATUS_CONVERSION_SCHEDULED(246),
    CONSENT_STATUS_CONVERSION_ABORTED_NO_SUPPORTED_MCC_MNC(247),
    DB_VERSION_UPGRADE(260),
    DB_VERSION_DOWNGRADE(261),
    LIST_CPID_ENDPOINTS_REQUEST(280),
    LIST_CPID_ENDPOINTS_RESPONSE(281),
    LIST_CPID_ENDPOINTS_ERROR(282);
    

    /* renamed from: cs */
    public final int f166288cs;

    private bygd(int i) {
        this.f166288cs = i;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f166288cs;
    }

    public final String toString() {
        return Integer.toString(this.f166288cs);
    }
}
