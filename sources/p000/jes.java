package p000;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.FACLConfig;
import com.google.android.gms.auth.firstparty.shared.PACLConfig;

/* renamed from: jes */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jes {

    /* renamed from: a */
    public final Bundle f22302a;

    public jes() {
        this(new Bundle());
    }

    /* renamed from: a */
    public final String mo13672a() {
        return this.f22302a.getString("url");
    }

    /* renamed from: b */
    public final AppDescription mo13677b() {
        return (AppDescription) this.f22302a.getParcelable("calling_app_description");
    }

    /* renamed from: c */
    public final boolean mo13679c() {
        return this.f22302a.getBoolean("suppress_progress_screen", false);
    }

    /* renamed from: d */
    public final String mo13680d() {
        return this.f22302a.getString("account_name");
    }

    /* renamed from: e */
    public final String mo13681e() {
        return this.f22302a.getString("account_type");
    }

    /* renamed from: f */
    public final String mo13682f() {
        return this.f22302a.getString("service");
    }

    /* renamed from: g */
    public final PACLConfig mo13683g() {
        return (PACLConfig) this.f22302a.getParcelable("pacl");
    }

    /* renamed from: h */
    public final Intent mo13684h() {
        return (Intent) this.f22302a.getParcelable("grant_credential_response_status");
    }

    /* renamed from: i */
    public final boolean mo13685i() {
        return this.f22302a.getInt("request_type", 0) == 3;
    }

    /* renamed from: j */
    public final int mo13686j() {
        return this.f22302a.getInt("request_type", 0);
    }

    /* renamed from: k */
    public final boolean mo13687k() {
        return this.f22302a.getBoolean("is_minute_maid", false);
    }

    public jes(Bundle bundle) {
        this.f22302a = bundle;
    }

    /* renamed from: a */
    public final void mo13673a(Account account) {
        sdo.m34959a(account);
        mo13676a(account.name);
        String str = account.type;
        Bundle bundle = this.f22302a;
        sdo.m34977c(str);
        bundle.putString("account_type", str);
    }

    /* renamed from: b */
    public final void mo13678b(String str) {
        this.f22302a.putString("url", str);
    }

    /* renamed from: a */
    public final void mo13674a(FACLConfig fACLConfig) {
        this.f22302a.putParcelable("facl", fACLConfig);
    }

    /* renamed from: a */
    public final void mo13675a(PACLConfig pACLConfig) {
        this.f22302a.putParcelable("pacl", pACLConfig);
    }

    /* renamed from: a */
    public final void mo13676a(String str) {
        this.f22302a.putString("account_name", str);
    }
}
