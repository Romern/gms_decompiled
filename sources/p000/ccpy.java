package p000;

/* renamed from: ccpy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccpy implements ccpw {

    /* renamed from: a */
    public static final bdyx f179722a;

    /* renamed from: b */
    public static final bdyx f179723b;

    /* renamed from: c */
    public static final bdyx f179724c;

    /* renamed from: d */
    public static final bdyx f179725d;

    /* renamed from: e */
    public static final bdyx f179726e;

    /* renamed from: f */
    public static final bdyx f179727f;

    /* renamed from: g */
    public static final bdyx f179728g;

    /* renamed from: h */
    public static final bdyx f179729h;

    /* renamed from: i */
    public static final bdyx f179730i;

    /* renamed from: j */
    public static final bdyx f179731j;

    /* renamed from: k */
    public static final bdyx f179732k;

    /* renamed from: l */
    public static final bdyx f179733l;

    /* renamed from: m */
    public static final bdyx f179734m;

    /* renamed from: n */
    public static final bdyx f179735n;

    /* renamed from: o */
    public static final bdyx f179736o;

    /* renamed from: p */
    public static final bdyx f179737p;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.car"));
        bdyx.m91610a(bdyw, "CarConnectionHandoffFeature__check_session_id_on_all_handoff_methods", true);
        bdyx.m91610a(bdyw, "CarConnectionHandoffFeature__drop_endpoint_messages_after_channel_disconnects", true);
        f179722a = bdyx.m91610a(bdyw, "CarConnectionHandoffFeature__eagerly_create_handoff_state_manager", false);
        f179723b = bdyx.m91610a(bdyw, "CarConnectionHandoffFeature__enable_valid_analytics_session_id", true);
        f179724c = bdyx.m91610a(bdyw, "CarConnectionHandoffFeature__enable_wireless_handoff", true);
        bdyx.m91610a(bdyw, "CarConnectionHandoffFeature__filter_received_proxy_only_control_messages", false);
        f179725d = bdyx.m91610a(bdyw, "CarConnectionHandoffFeature__handle_null_startup_when_tearing_down_from_startup_manager", true);
        try {
            f179726e = bdyx.m91608a(bdyw, "CarConnectionHandoffFeature__handoff_handlers", (bydj) bxvk.m124014a(bydj.f165795b, new byte[]{10, 126, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 112, 114, 111, 106, 101, 99, 116, 105, 111, 110, 46, 103, 101, 97, 114, 104, 101, 97, 100, 47, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 97, 112, 112, 115, 46, 97, 117, 116, 111, 46, 99, 97, 114, 115, 101, 114, 118, 105, 99, 101, 46, 115, 101, 114, 118, 105, 99, 101, 46, 105, 109, 112, 108, 46, 71, 101, 97, 114, 104, 101, 97, 100, 67, 97, 114, 83, 116, 97, 114, 116, 117, 112, 83, 101, 114, 118, 105, 99, 101, 58, 52, 57, 48, 57, 52, 55, 51, 48}), ccpx.f179721a);
            bdyx.m91610a(bdyw, "CarConnectionHandoffFeature__log_device_ssl_telemetry_event", true);
            f179727f = bdyx.m91610a(bdyw, "CarConnectionHandoffFeature__notify_frx_listener_only_when_setup_ongoing", true);
            f179728g = bdyx.m91610a(bdyw, "CarConnectionHandoffFeature__only_quit_lite_background_thread_on_teardown", true);
            bdyx.m91610a(bdyw, "CarConnectionHandoffFeature__pass_bundled_metadata_with_sdr", true);
            f179729h = bdyx.m91610a(bdyw, "CarConnectionHandoffFeature__propagate_protocol_errors_to_car_setup_service", true);
            bdyx.m91610a(bdyw, "CarConnectionHandoffFeature__reject_handoff_when_developer_mode_on", false);
            f179730i = bdyx.m91610a(bdyw, "CarConnectionHandoffFeature__retrieve_car_info_from_gh_in_gms", true);
            f179731j = bdyx.m91610a(bdyw, "CarConnectionHandoffFeature__route_csb_byebye_through_gearhead", false);
            f179732k = bdyx.m91610a(bdyw, "CarConnectionHandoffFeature__should_fall_back_to_gms_core", true);
            f179733l = bdyx.m91610a(bdyw, "CarConnectionHandoffFeature__should_handoff", true);
            bdyx.m91610a(bdyw, "CarConnectionHandoffFeature__tear_down_proxy_csb_during_session_teardown", true);
            f179734m = bdyx.m91610a(bdyw, "CarConnectionHandoffFeature__trigger_protocol_error_on_mtmc_io_exception", true);
            f179735n = bdyx.m91610a(bdyw, "CarConnectionHandoffFeature__use_background_thread_for_car_setup_service", false);
            bdyx.m91610a(bdyw, "CarConnectionHandoffFeature__use_direct_stream_for_socket", true);
            f179736o = bdyx.m91610a(bdyw, "CarConnectionHandoffFeature__use_safe_parcelable_serializer", true);
            f179737p = bdyx.m91610a(bdyw, "CarConnectionHandoffFeature__validate_start_connection_intents_via_handshake", false);
        } catch (bxwf e) {
            throw new AssertionError("Could not parse proto flag \"CarConnectionHandoffFeature__handoff_handlers\"");
        }
    }

    /* renamed from: a */
    public final boolean mo76613a() {
        return ((Boolean) f179722a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo76614b() {
        return ((Boolean) f179723b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo76615c() {
        return ((Boolean) f179724c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo76616d() {
        return ((Boolean) f179725d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final bydj mo76617e() {
        return (bydj) f179726e.mo58455c();
    }

    /* renamed from: f */
    public final boolean mo76618f() {
        return ((Boolean) f179727f.mo58455c()).booleanValue();
    }

    /* renamed from: g */
    public final boolean mo76619g() {
        return ((Boolean) f179728g.mo58455c()).booleanValue();
    }

    /* renamed from: h */
    public final boolean mo76620h() {
        return ((Boolean) f179729h.mo58455c()).booleanValue();
    }

    /* renamed from: i */
    public final boolean mo76621i() {
        return ((Boolean) f179730i.mo58455c()).booleanValue();
    }

    /* renamed from: j */
    public final boolean mo76622j() {
        return ((Boolean) f179731j.mo58455c()).booleanValue();
    }

    /* renamed from: k */
    public final boolean mo76623k() {
        return ((Boolean) f179732k.mo58455c()).booleanValue();
    }

    /* renamed from: l */
    public final boolean mo76624l() {
        return ((Boolean) f179733l.mo58455c()).booleanValue();
    }

    /* renamed from: m */
    public final boolean mo76625m() {
        return ((Boolean) f179734m.mo58455c()).booleanValue();
    }

    /* renamed from: n */
    public final boolean mo76626n() {
        return ((Boolean) f179735n.mo58455c()).booleanValue();
    }

    /* renamed from: o */
    public final boolean mo76627o() {
        return ((Boolean) f179736o.mo58455c()).booleanValue();
    }

    /* renamed from: p */
    public final boolean mo76628p() {
        return ((Boolean) f179737p.mo58455c()).booleanValue();
    }
}
