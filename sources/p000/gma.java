package p000;

import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

/* renamed from: gma */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class gma {

    /* renamed from: a */
    protected static final bnic f18618a;

    /* renamed from: b */
    protected static final bnic f18619b;

    /* renamed from: c */
    protected final Context f18620c;

    /* renamed from: d */
    protected final Map f18621d = new HashMap();

    /* renamed from: e */
    private final boolean f18622e;

    static {
        bnia j = bnic.m109500j();
        j.mo67629b("Token");
        j.mo67629b("EncryptedPasswd");
        j.mo67629b("droidguard_results");
        j.mo67629b("logintoken");
        j.mo67629b("logincaptcha");
        f18618a = j.mo67751a();
        bnia j2 = bnic.m109500j();
        j2.mo67629b("Email");
        j2.mo67629b("parentAndroidId");
        j2.mo67629b("delegatee_user_id");
        j2.mo67629b("client_sig");
        j2.mo67629b("callerSig");
        j2.mo67629b("androidId");
        j2.mo67629b("consent_result");
        f18619b = j2.mo67751a();
    }

    public gma(Context context) {
        boolean f = rfy.m33549f(context);
        sdo.m34959a(context);
        this.f18620c = context;
        this.f18622e = f;
    }

    /* renamed from: a */
    public final List mo12052a() {
        ComponentName profileOwner;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("androidId", ryv.m34679a(this.f18620c)));
        if (cbzq.m128974b()) {
            Locale locale = Locale.getDefault();
            int i = Build.VERSION.SDK_INT;
            arrayList.add(new BasicNameValuePair("lang", locale.toLanguageTag()));
        } else {
            arrayList.add(new BasicNameValuePair("lang", Locale.getDefault().toString()));
        }
        arrayList.add(new BasicNameValuePair("google_play_services_version", "201515033"));
        arrayList.add(new BasicNameValuePair("sdk_version", String.valueOf(Build.VERSION.SDK_INT)));
        String a = ryv.m34681a(this.f18620c, "device_country", null);
        if (a != null) {
            arrayList.add(new BasicNameValuePair("device_country", a));
        }
        if (this.f18622e) {
            arrayList.add(new BasicNameValuePair("is_dev_key_gmscore", "1"));
        }
        if (gnv.m13549av()) {
            DevicePolicyManager devicePolicyManager = (DevicePolicyManager) this.f18620c.getSystemService("device_policy");
            int i2 = Build.VERSION.SDK_INT;
            if (!(devicePolicyManager == null || (profileOwner = devicePolicyManager.getProfileOwner()) == null || !rfz.m33557a(this.f18620c).mo24610b(profileOwner.getPackageName()))) {
                arrayList.add(new BasicNameValuePair("profile_owner", profileOwner.flattenToString()));
            }
        }
        for (Map.Entry entry : this.f18621d.entrySet()) {
            if (entry.getValue() != null) {
                arrayList.add(new BasicNameValuePair((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: gma.a(java.lang.String, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      gma.a(java.lang.String, java.lang.String):void
      gma.a(java.lang.String, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo12056b(AccountCredentials accountCredentials) {
        String str = accountCredentials.f10829c;
        String str2 = accountCredentials.f10832f;
        String str3 = accountCredentials.f10831e;
        if (!TextUtils.isEmpty(str)) {
            mo12053a("Email", accountCredentials.f10829c);
        }
        if (!TextUtils.isEmpty(str3)) {
            mo12054a("ACCESS_TOKEN", true);
            mo12053a("Token", str3);
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            Context context = this.f18620c;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
            sb.append(str);
            sb.append("\u0000");
            sb.append(str2);
            mo12053a("EncryptedPasswd", ils.m15671a(sb.toString(), context));
        }
    }

    /* renamed from: d */
    public final void mo12059d(String str) {
        this.f18621d.remove(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo12060e(String str) {
        mo12053a("Email", str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo12061f(String str) {
        mo12053a("oauth2_redirect_uri", str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo12062g(String str) {
        mo12053a("oauth2_authcode_verifier", str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo12057b(CaptchaSolution captchaSolution) {
        if (captchaSolution != null) {
            mo12053a("logintoken", captchaSolution.f10853b);
            mo12053a("logincaptcha", captchaSolution.f10854c);
            return;
        }
        mo12059d("logintoken");
        mo12059d("logincaptcha");
    }

    /* renamed from: b */
    public final void mo12058b(String str, String str2) {
        mo12053a("callerPkg", str);
        mo12053a("callerSig", str2);
    }

    /* renamed from: a */
    public final void mo12053a(String str, String str2) {
        this.f18621d.put(str, str2);
    }

    /* renamed from: a */
    public final void mo12054a(String str, boolean z) {
        if (z) {
            mo12053a(str, "1");
        } else {
            mo12059d(str);
        }
    }

    /* renamed from: a */
    public final void mo12055a(sek sek) {
        List a = mo12052a();
        ArrayList arrayList = new ArrayList();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            NameValuePair nameValuePair = (NameValuePair) a.get(i);
            String name = nameValuePair.getName();
            if (f18618a.contains(name)) {
                arrayList.add(new BasicNameValuePair(name, "(SECRET)"));
            } else if (f18619b.contains(name)) {
                arrayList.add(new BasicNameValuePair(name, sek.m35081a(nameValuePair.getValue())));
            } else {
                arrayList.add(nameValuePair);
            }
        }
        sek.mo25409a(URLEncodedUtils.format(arrayList, bmwy.f131158c.name()), new Object[0]);
    }
}
