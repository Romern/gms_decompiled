package p000;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: afba */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afba {

    /* renamed from: a */
    public static final Set f64112a = new HashSet(Arrays.asList("magictether_performance_advertisement_to_connection_duration_host", "magictether_performance_connection_to_authentication_duration_host", "magictether_performance_connect_tethering_response_duration", "magictether_performance_provisioning_check_duration", "magictether_performance_tether_availability_response_duration_host"));

    /* renamed from: b */
    public final qxq f64113b = new qxq(new qws(rpr.m34216b(), null, null), "MAGICTETHER_COUNTERS", (int) cfcm.f183627a.mo6606a().mo80839b());

    /* renamed from: e */
    public static final void m52799e(int i) {
        if (cfcm.m138682b()) {
            new aezv(rpr.m34216b()).mo34690a("KEY_HOST_STATUS", i);
        }
    }

    /* renamed from: a */
    public final void mo34722a(int i) {
        if (cfcm.m138682b()) {
            mo34723a("magictether_connect_tethering_response_code", i);
            aezv aezv = new aezv(rpr.m34216b());
            aezv.f64056b.edit().putLong("KEY_LAST_ACTIVE_TIMESTAMP", System.currentTimeMillis()).commit();
            this.f64113b.mo24388e();
        }
    }

    /* renamed from: b */
    public final void mo34724b(int i) {
        if (cfcm.m138682b()) {
            mo34723a("magictether_report_feature_support_result", i);
            this.f64113b.mo24388e();
        }
    }

    /* renamed from: c */
    public final void mo34725c(int i) {
        if (cfcm.m138682b()) {
            mo34723a("magictether_get_devices_from_proximity_auth_result", i);
            this.f64113b.mo24388e();
        }
    }

    /* renamed from: d */
    public final void mo34726d(int i) {
        if (cfcm.m138682b()) {
            mo34723a("magictether_latest_entitlement_value_result_code", i);
            this.f64113b.mo24388e();
        }
    }

    /* renamed from: a */
    public final void mo34723a(String str, int i) {
        this.f64113b.mo24385d(str).mo24367a(i);
    }
}
