package p000;

import android.accounts.Account;
import android.content.SharedPreferences;
import android.net.Uri;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

/* renamed from: lhn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lhn extends lhf implements lho {

    /* renamed from: h */
    public static final /* synthetic */ int f26112h = 0;

    /* renamed from: g */
    public final SharedPreferences f26113g;

    /* renamed from: i */
    private final adyd f26114i;

    public lhn(adyd adyd, SharedPreferences sharedPreferences) {
        this.f26114i = adyd;
        this.f26113g = sharedPreferences;
        this.f26113g.registerOnSharedPreferenceChangeListener(new lhk(this));
    }

    /* renamed from: b */
    private final boolean m19080b(kdi kdi) {
        Account account = kdi.f23888d;
        if (account == null) {
            return true;
        }
        for (Account account2 : lqo.m19535a(this.f26114i)) {
            if (account.equals(account2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    private static String m19081f(String str) {
        String valueOf = String.valueOf(boan.f132471e.mo68794a(str.getBytes(StandardCharsets.UTF_8)));
        return valueOf.length() == 0 ? new String("credential_save_rejection_count_for_") : "credential_save_rejection_count_for_".concat(valueOf);
    }

    /* renamed from: s */
    private final void m19082s() {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f26113g.getLong("weekly_timestamp", 0) + 604800000 < currentTimeMillis) {
            this.f26113g.edit().putLong("weekly_timestamp", currentTimeMillis).apply();
            this.f26113g.edit().putInt("weekly_fill_promo_rejected_count", 0).apply();
        }
    }

    /* renamed from: a */
    public final int mo15080a(String str) {
        return this.f26113g.getInt(m19081f(str), 0);
    }

    /* renamed from: c */
    public final int mo15083c() {
        m19082s();
        return this.f26113g.getInt("weekly_fill_promo_rejected_count", 0);
    }

    /* renamed from: d */
    public final int mo15084d() {
        return this.f26113g.getInt("save_promo_rejected_count", 0);
    }

    /* renamed from: e */
    public final int mo15085e() {
        return this.f26113g.getInt("fill_promo_presented_count", 0);
    }

    /* renamed from: g */
    public final void mo15113g(boolean z) {
        this.f26113g.edit().putBoolean("should_show_post_opt_in_dialog", z).apply();
    }

    /* renamed from: h */
    public final boolean mo15088h() {
        return this.f26113g.getBoolean("debug_submit_feedback_enabled", false);
    }

    /* renamed from: i */
    public final boolean mo15089i() {
        return this.f26113g.getBoolean("debug_info_enabled", false);
    }

    /* renamed from: j */
    public final lhh mo15090j() {
        Uri uri;
        Uri uri2 = null;
        String string = this.f26113g.getString("debug_ml_model_config_file", null);
        if (string != null) {
            uri = Uri.parse(string);
        } else {
            uri = null;
        }
        String string2 = this.f26113g.getString("debug_ml_model_neural_network_file", null);
        if (string2 != null) {
            uri2 = Uri.parse(string2);
        }
        return new lhg(bmxv.m108567c(uri), bmxv.m108567c(uri2));
    }

    /* renamed from: k */
    public final bmxv mo15091k() {
        return bmxv.m108567c(this.f26113g.getString("last_domain_fill_promo_rejected", null));
    }

    /* renamed from: l */
    public final bmxv mo15092l() {
        return bmxv.m108567c(this.f26113g.getString("last_activity_class_fill_promo_presented", null));
    }

    /* renamed from: m */
    public final boolean mo15093m() {
        return this.f26113g.getBoolean("payment_info_biometrics_enabled", true);
    }

    /* renamed from: n */
    public final boolean mo15094n() {
        return this.f26113g.getBoolean("credential_biometrics_enabled", false);
    }

    /* renamed from: o */
    public final boolean mo15095o() {
        return this.f26113g.getBoolean("autofill_enabled", true);
    }

    /* renamed from: p */
    public final boolean mo15096p() {
        return this.f26113g.getBoolean("should_show_post_opt_in_dialog", false);
    }

    /* renamed from: q */
    public final void mo15114q() {
        this.f26113g.edit().putInt("fill_promo_presented_count", mo15085e() + 1).apply();
    }

    /* renamed from: r */
    public final void mo15115r() {
        this.f26113g.edit().putInt("save_promo_rejected_count", mo15084d() + 1).apply();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006b A[RETURN] */
    /* renamed from: a */
    public final kdi mo15081a() {
        kdi kdi;
        String string = this.f26113g.getString("profile", null);
        if (string == null) {
            return kdi.f23885a;
        }
        if (!kdi.f23885a.f23887c.equals(string)) {
            if (!kdi.f23886b.f23887c.equals(string)) {
                String[] split = string.split("\\|");
                if (split.length == 3 && "account".equals(split[0])) {
                    String a = kdi.m17667a(split[1]);
                    String a2 = kdi.m17667a(split[2]);
                    kdi = (a == null || a2 == null) ? kdi.f23885a : new kdi(string, new Account(a2, a));
                }
            } else {
                kdi = kdi.f23886b;
            }
            if (!m19080b(kdi)) {
                return kdi;
            }
            mo15101a(kdi.f23885a);
            return kdi.f23885a;
        }
        kdi = kdi.f23885a;
        if (!m19080b(kdi)) {
        }
    }

    /* renamed from: c */
    public final void mo15106c(String str) {
        this.f26113g.edit().putInt(m19081f(str), mo15080a(str) + 1).commit();
    }

    /* renamed from: d */
    public final void mo15108d(String str) {
        bmxv b = bmxv.m108566b(str);
        m19082s();
        SharedPreferences.Editor putInt = this.f26113g.edit().putInt("fill_promo_rejected_count", mo15082b() + 1).putInt("weekly_fill_promo_rejected_count", mo15083c() + 1);
        putInt.putString("last_domain_fill_promo_rejected", (String) ((bmyg) b).f131198a);
        putInt.apply();
    }

    /* renamed from: e */
    public final void mo15110e(String str) {
        this.f26113g.edit().putString("last_activity_class_fill_promo_presented", str).apply();
    }

    /* renamed from: f */
    public final bngx mo15086f() {
        return bngx.m109368a((Collection) ((Set) this.f26113g.getAll().entrySet().stream().filter(new lhl(this)).map(lhm.f26111a).collect(Collectors.toSet())));
    }

    /* renamed from: g */
    public final boolean mo15087g() {
        return this.f26113g.getBoolean("debug_settings_detection_fill_option_enabled", false);
    }

    /* renamed from: b */
    public final int mo15082b() {
        return this.f26113g.getInt("fill_promo_rejected_count", 0);
    }

    /* renamed from: e */
    public final void mo15111e(boolean z) {
        this.f26113g.edit().putBoolean("debug_submit_feedback_enabled", z).apply();
    }

    /* renamed from: b */
    public final void mo15103b(bmxv bmxv) {
        String str;
        SharedPreferences.Editor edit = this.f26113g.edit();
        if (bmxv.mo66813a()) {
            str = ((Uri) bmxv.mo66814b()).toString();
        } else {
            str = null;
        }
        edit.putString("debug_ml_model_neural_network_file", str).apply();
    }

    /* renamed from: f */
    public final void mo15112f(boolean z) {
        this.f26113g.edit().putBoolean("payment_info_biometrics_enabled", z).apply();
    }

    /* renamed from: c */
    public final void mo15107c(boolean z) {
        this.f26113g.edit().putBoolean("debug_info_enabled", z).apply();
    }

    /* renamed from: d */
    public final void mo15109d(boolean z) {
        this.f26113g.edit().putBoolean("debug_settings_detection_fill_option_enabled", z).apply();
    }

    /* renamed from: b */
    public final void mo15104b(String str) {
        this.f26113g.edit().remove(m19081f(str)).commit();
    }

    /* renamed from: b */
    public final void mo15105b(boolean z) {
        this.f26113g.edit().putBoolean("credential_biometrics_enabled", z).apply();
    }

    /* renamed from: a */
    public final void mo15100a(bmxv bmxv) {
        String str;
        SharedPreferences.Editor edit = this.f26113g.edit();
        if (bmxv.mo66813a()) {
            str = ((Uri) bmxv.mo66814b()).toString();
        } else {
            str = null;
        }
        edit.putString("debug_ml_model_config_file", str).apply();
    }

    /* renamed from: a */
    public final void mo15101a(kdi kdi) {
        if (m19080b(kdi)) {
            this.f26113g.edit().putString("profile", kdi.f23887c).apply();
        }
    }

    /* renamed from: a */
    public final void mo15102a(boolean z) {
        this.f26113g.edit().putBoolean("autofill_enabled", z).apply();
    }
}
