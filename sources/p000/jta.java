package p000;

/* renamed from: jta */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jta {

    /* renamed from: a */
    public final qxq f23166a = new qxq(new qws(rpr.m34216b(), null, null), "PROXIMITY_AUTH_COUNTERS", (int) ccia.f179029a.mo6606a().mo75999d());

    /* renamed from: A */
    public final void mo14034A(int i) {
        mo14043a("better_together_disabling_result", i);
    }

    /* renamed from: B */
    public final void mo14035B(int i) {
        mo14043a("set_feature_enabled_operation_result", i);
    }

    /* renamed from: C */
    public final void mo14036C(int i) {
        mo14043a("set_feature_supported_operation_result", i);
    }

    /* renamed from: D */
    public final void mo14037D(int i) {
        mo14043a("cryptauth_device_sync_account_fetch_result", i);
    }

    /* renamed from: E */
    public final void mo14038E(int i) {
        mo14043a("cryptauth_device_sync_gcm_task_result", i);
    }

    /* renamed from: F */
    public final void mo14039F(int i) {
        mo14043a("cryptauth_device_sync_v2_gcm_task_result", i);
    }

    /* renamed from: a */
    public final qxo mo14040a(String str) {
        return this.f23166a.mo24389f(str).mo24372a();
    }

    /* renamed from: b */
    public final void mo14046b(int i) {
        mo14043a("setup_ble_advertisement_background_result", i);
    }

    /* renamed from: c */
    public final void mo14047c(int i) {
        mo14043a("setup_ble_advertisement_foreground_result", i);
    }

    /* renamed from: d */
    public final void mo14048d(int i) {
        mo14043a("central_role_create_connection_result", i);
    }

    /* renamed from: e */
    public final void mo14049e(int i) {
        mo14043a("central_role_connected_to_authenticated_result", i);
    }

    /* renamed from: f */
    public final void mo14050f(int i) {
        mo14043a("peripheral_role_connected_to_authenticated_result", i);
    }

    /* renamed from: g */
    public final void mo14051g(int i) {
        mo14043a("ble_weave_socket_connection_result", i);
    }

    /* renamed from: h */
    public final void mo14052h(int i) {
        mo14043a("ble_weave_socket_write_result", i);
    }

    /* renamed from: i */
    public final void mo14053i(int i) {
        mo14043a("receive_advertisement_result", i);
    }

    /* renamed from: j */
    public final void mo14054j(int i) {
        mo14043a("device_sync_result", i);
    }

    /* renamed from: k */
    public final void mo14055k(int i) {
        mo14043a("device_sync_v2_registration_result", i);
    }

    /* renamed from: l */
    public final void mo14056l(int i) {
        mo14043a("set_feature_enabled_result", i);
    }

    /* renamed from: m */
    public final void mo14057m(int i) {
        mo14043a("feature_enabled_controller_set_result", i);
    }

    /* renamed from: n */
    public final void mo14058n(int i) {
        mo14043a("reconcile_individual_feature_attempt_result", i);
    }

    /* renamed from: o */
    public final void mo14059o(int i) {
        mo14043a("feature_reconcile_intent_operation_result", i);
    }

    /* renamed from: p */
    public final void mo14060p(int i) {
        mo14043a("force_cryptauth_sync_result", i);
    }

    /* renamed from: q */
    public final void mo14061q(int i) {
        mo14043a("key_agreement_result", i);
    }

    /* renamed from: r */
    public final void mo14062r(int i) {
        mo14043a("disable_better_together_result", i);
    }

    /* renamed from: s */
    public final void mo14063s(int i) {
        if (ccia.m129784b()) {
            mo14043a("generate_foreground_advertisement_result", i);
        }
    }

    /* renamed from: t */
    public final void mo14064t(int i) {
        if (ccia.m129784b()) {
            mo14043a("generate_advertisement_result", i);
        }
    }

    /* renamed from: u */
    public final void mo14065u(int i) {
        if (ccia.m129784b()) {
            mo14043a("generate_eid_data_with_timestamp_result", i);
        }
    }

    /* renamed from: v */
    public final void mo14066v(int i) {
        if (ccia.m129784b()) {
            mo14043a("get_eid_period_timestamps_result", i);
        }
    }

    /* renamed from: w */
    public final void mo14067w(int i) {
        if (cchr.m129715c() && cchr.m129721i()) {
            mo14043a("get_my_synced_metadata_operation_result", i);
        }
    }

    /* renamed from: x */
    public final void mo14068x(int i) {
        if (cchr.m129715c() && cchr.m129721i()) {
            mo14043a("get_synced_devices_operation_result", i);
        }
    }

    /* renamed from: y */
    public final void mo14069y(int i) {
        mo14043a("get_my_synced_metadata_backfill_count", i);
    }

    /* renamed from: z */
    public final void mo14070z(int i) {
        mo14043a("better_together_setup_result", i);
    }

    /* renamed from: a */
    public final void mo14041a() {
        mo14043a("start_ble_advertising_result", 0);
    }

    /* renamed from: a */
    public final void mo14042a(int i) {
        mo14043a("start_ble_advertising_result", i);
    }

    /* renamed from: a */
    public final void mo14043a(String str, int i) {
        if (ccia.m129785c()) {
            this.f23166a.mo24385d(str).mo24367a(i);
            this.f23166a.mo24388e();
        }
    }

    /* renamed from: a */
    public final void mo14044a(qxo qxo) {
        if (ccia.m129785c()) {
            qxo.mo24371b();
            this.f23166a.mo24388e();
        }
    }

    /* renamed from: a */
    public final void mo14045a(boolean z) {
        if (ccia.m129785c()) {
            this.f23166a.mo24383c("set_feature_supported_enrollment_count").mo24359a();
            if (z) {
                this.f23166a.mo24383c("set_feature_supported_immediate_enrollment_count").mo24359a();
            }
            this.f23166a.mo24388e();
        }
    }
}
