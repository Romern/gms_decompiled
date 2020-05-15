package p000;

import android.net.Uri;

/* renamed from: chqe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chqe implements chqd {

    /* renamed from: a */
    public static final bdyx f188990a;

    /* renamed from: b */
    public static final bdyx f188991b;

    /* renamed from: c */
    public static final bdyx f188992c;

    /* renamed from: d */
    public static final bdyx f188993d;

    /* renamed from: e */
    public static final bdyx f188994e;

    /* renamed from: f */
    public static final bdyx f188995f;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.lighter.android"));
        Uri uri = bdyw.f106641b;
        if (uri != null) {
            bdyw bdyw2 = new bdyw(bdyw.f106640a, uri, bdyw.f106642c, bdyw.f106643d, bdyw.f106644e, bdyw.f106645f, true, bdyw.f106648i);
            bdyx.m91610a(bdyw2, "enable_periodic_pull_messages", false);
            f188990a = bdyx.m91610a(bdyw2, "capability_reporting_enabled", false);
            bdyx.m91607a(bdyw2, "delivery_receipt_retry_time_ms", 300000L);
            bdyx.m91610a(bdyw2, "enable_delivery_receipts", true);
            bdyx.m91610a(bdyw2, "enable_delivery_receipt_retry", true);
            bdyx.m91610a(bdyw2, "enable_action_callback_failure_handling", false);
            bdyx.m91610a(bdyw2, "enable_action_callback_failure_parsing", false);
            bdyx.m91610a(bdyw2, "enable_android_restricted_api_key_auth", false);
            bdyx.m91610a(bdyw2, "enable_bind_channel_loading_indicator", false);
            f188991b = bdyx.m91610a(bdyw2, "enable_bind_channel_retry", false);
            bdyx.m91610a(bdyw2, "enable_capabilities", false);
            bdyx.m91610a(bdyw2, "enable_cloud_bootstrap", false);
            bdyx.m91610a(bdyw2, "enable_handle_cloud_delete_conversation_event", false);
            bdyx.m91610a(bdyw2, "enable_cloud_delete_event_sending", false);
            bdyx.m91610a(bdyw2, "enable_composed_overlay_action", false);
            bdyx.m91610a(bdyw2, "enable_copy_functionality_for_text", false);
            bdyx.m91610a(bdyw2, "enable_custom_channel_builder", false);
            bdyx.m91610a(bdyw2, "enable_custom_content_view_on_header", false);
            bdyx.m91610a(bdyw2, "enable_grpc_preemptive_connect", false);
            bdyx.m91610a(bdyw2, "enable_header_buttons_from_profile", false);
            bdyx.m91610a(bdyw2, "enable_lighter_intent_welcome_message", false);
            bdyx.m91610a(bdyw2, "enable_live_data_support", false);
            bdyx.m91610a(bdyw2, "enable_menu_item_parsing", false);
            bdyx.m91610a(bdyw2, "enable_overlay_richcard_message", false);
            bdyx.m91610a(bdyw2, "enable_photos_messaging", false);
            bdyx.m91610a(bdyw2, "enable_profile_label_styles", false);
            f188992c = bdyx.m91610a(bdyw2, "enable_receiving_typing_indicators_if_master_flag_on", true);
            bdyx.m91610a(bdyw2, "enable_rich_card_v2_messaging", false);
            bdyx.m91610a(bdyw2, "enable_rich_cards_messaging", false);
            bdyx.m91610a(bdyw2, "enable_rich_text_proto_composing", false);
            bdyx.m91610a(bdyw2, "enable_rich_text_proto_parsing", false);
            bdyx.m91610a(bdyw2, "enable_rich_text_rendering", false);
            bdyx.m91610a(bdyw2, "enable_send_conversation_intent_opened", false);
            f188993d = bdyx.m91610a(bdyw2, "enable_sending_typing_indicators_if_master_flag_on", true);
            bdyx.m91610a(bdyw2, "enable_suggestion_chip_rendering", false);
            bdyx.m91610a(bdyw2, "enable_suggestion_chip_second_line_parsing", false);
            bdyx.m91610a(bdyw2, "enable_suggestion_chip_storage", false);
            bdyx.m91610a(bdyw2, "enable_suggestion_hint_text_parsing", false);
            bdyx.m91610a(bdyw2, "enable_tombstone_action_handling", false);
            bdyx.m91610a(bdyw2, "enable_tombstone_action_parsing", false);
            bdyx.m91610a(bdyw2, "enable_tombstone_parsing", false);
            bdyx.m91610a(bdyw2, "enable_tombstone_rendering", false);
            bdyx.m91610a(bdyw2, "enable_typing_indicators", false);
            bdyx.m91610a(bdyw2, "enable_ui_configurations_parsing", false);
            bdyx.m91610a(bdyw2, "enable_unsupported_message_handling", false);
            bdyx.m91607a(bdyw2, "max_stale_receipt_retry_time_ms", 604800000L);
            bdyx.m91607a(bdyw2, "max_thumbnail_size_bytes", 16384L);
            bdyx.m91607a(bdyw2, "max_token_validity_window_in_millis", 604800000L);
            f188994e = bdyx.m91610a(bdyw2, "override_enable_receiving_typing_indicators", false);
            f188995f = bdyx.m91610a(bdyw2, "override_enable_sending_typing_indicators", false);
            bdyx.m91607a(bdyw2, "profile_refresh_interval_millis", 604800000L);
            bdyx.m91607a(bdyw2, "profile_refresh_jitter_millis", 7200000L);
            bdyx.m91610a(bdyw2, "refresh_token_in_get_account_context", false);
            bdyx.m91610a(bdyw2, "refreshes_after_conversation_opened_intent_enabled", false);
            bdyx.m91607a(bdyw2, "rich_card_max_height", 0L);
            bdyx.m91607a(bdyw2, "rich_card_max_standalone_width", 480L);
            bdyx.m91610a(bdyw2, "should_handle_read_notifications", false);
            bdyx.m91610a(bdyw2, "show_call_button_on_header", false);
            bdyx.m91607a(bdyw2, "welcome_message_latency", 0L);
            return;
        }
        throw new IllegalStateException("Cannot set enableAutoSubpackage on SharedPrefs-backed flags");
    }

    /* renamed from: a */
    public final boolean mo85526a() {
        return ((Boolean) f188990a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo85527b() {
        return ((Boolean) f188992c.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo85528c() {
        return ((Boolean) f188993d.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo85529d() {
        return ((Boolean) f188994e.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo85530e() {
        return ((Boolean) f188995f.mo58455c()).booleanValue();
    }
}
