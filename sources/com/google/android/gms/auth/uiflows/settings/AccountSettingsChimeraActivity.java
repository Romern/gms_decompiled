package com.google.android.gms.auth.uiflows.settings;

import android.accounts.Account;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.widget.AdapterView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.auth.login.CustomWebView;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AccountSettingsChimeraActivity extends jwy implements AdapterView.OnItemSelectedListener, jxc {

    /* renamed from: b */
    public static final sek f11573b = ght.m13171a("AccountSettingsActivity");

    /* renamed from: c */
    static final imr f11574c = imr.m15727a("account_type");

    /* renamed from: d */
    static final imr f11575d = imr.m15727a("account");

    /* renamed from: e */
    public String f11576e;

    /* renamed from: f */
    public jxd f11577f;

    /* renamed from: g */
    private suo f11578g;

    /* renamed from: h */
    private Map f11579h;

    /* renamed from: a */
    private final void m7103a(Account account) {
        mo14202g().mo13148b(f11575d, account);
        new kal(this, account).execute(new Void[0]);
    }

    /* renamed from: b */
    private static String m7104b(Account account) {
        String str = account.name;
        int lastIndexOf = str.lastIndexOf(64);
        return lastIndexOf != -1 ? str.substring(0, lastIndexOf) : str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final String mo7917e() {
        return "AccountSettingsActivity";
    }

    public final void onBackPressed() {
        CustomWebView customWebView = this.f11577f.f23425c;
        if (customWebView.canGoBack()) {
            customWebView.goBack();
        } else {
            super.onBackPressed();
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f11578g.mo26116a(mo8628aW());
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        Uri.Builder buildUpon = Uri.parse((String) gnv.f18750u.mo58455c()).buildUpon();
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        if (!language.isEmpty() && !locale.getCountry().isEmpty()) {
            String valueOf = String.valueOf(language);
            String country = locale.getCountry();
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(country).length());
            sb.append(valueOf);
            sb.append('-');
            sb.append(country);
            language = sb.toString();
        }
        if (!language.isEmpty()) {
            buildUpon.appendQueryParameter("hl", language);
        }
        this.f11576e = buildUpon.build().toString();
        String str2 = (String) mo14202g().mo13146a(f11574c);
        Account[] a = adyd.m51363a(this).mo33916a(str2);
        int length = a.length;
        if (length == 0) {
            sek sek = f11573b;
            String valueOf2 = String.valueOf(str2);
            sek.mo25416d(valueOf2.length() == 0 ? new String("No accounts found for account type: ") : "No accounts found for account type: ".concat(valueOf2), new Object[0]);
            finish();
            return;
        }
        jxd jxd = (jxd) getSupportFragmentManager().findFragmentByTag("browser");
        this.f11577f = jxd;
        if (jxd == null) {
            this.f11577f = jxd.m17456a();
            getSupportFragmentManager().beginTransaction().add(16908290, this.f11577f, "browser").commit();
        }
        this.f11579h = new HashMap();
        String[] strArr = new String[length];
        for (int i = 0; i < a.length; i++) {
            Account account = a[i];
            String b = m7104b(account);
            this.f11579h.put(b, account);
            strArr[i] = b;
        }
        Account account2 = (Account) mo14202g().mo13146a(f11575d);
        if (account2 != null) {
            str = m7104b(account2);
        } else {
            str = null;
        }
        C1341rz aW = mo8628aW();
        sun sun = new sun(aW);
        sun.f45177c = strArr;
        sun.mo26112a(C0126R.string.auth_account_settings_title);
        sun.f45175a = this;
        sun.f45176b = str;
        this.f11578g = sun.mo26111a();
        aW.mo15841a(4, 4);
        aW.mo15853b(true);
        m7103a(account2);
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        Account account = (Account) this.f11579h.get(this.f11578g.getItem(i));
        sek sek = f11573b;
        String valueOf = String.valueOf(account);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 9);
        sb.append("Selected ");
        sb.append(valueOf);
        sek.mo25414c(sb.toString(), new Object[0]);
        if (!account.equals(mo14202g().mo13146a(f11575d))) {
            m7103a(account);
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
        f11573b.mo25414c("Nothing selected", new Object[0]);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    /* renamed from: a */
    public final void mo7866a(jxd jxd) {
        WebSettings settings = jxd.f23425c.getSettings();
        String userAgentString = settings.getUserAgentString();
        String a = stn.m36304a("gms.auth.useragent", "");
        StringBuilder sb = new StringBuilder(String.valueOf(userAgentString).length() + 1 + String.valueOf(a).length());
        sb.append(userAgentString);
        sb.append(" ");
        sb.append(a);
        settings.setUserAgentString(sb.toString());
    }

    /* renamed from: a */
    public final void mo7867a(jyl jyl) {
        sek sek = f11573b;
        String str = jyl.f23531b;
        String str2 = jyl.f23530a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 10 + String.valueOf(str2).length());
        sb.append("Success! ");
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        sek.mo25414c(sb.toString(), new Object[0]);
    }
}
