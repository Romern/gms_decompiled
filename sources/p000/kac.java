package p000;

import android.accounts.Account;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.common.Feature;
import com.google.android.gms.fido.fido2.api.StateUpdate;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.u2f.api.common.BrowserSignRequestParams;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: kac */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kac {

    /* renamed from: a */
    private static final sek f23639a = ght.m13171a("MinuteMaid", "MinuteMaidJsBridge");

    /* renamed from: b */
    private static final sek f23640b = new sek("MinuteMaidLog", new String[0]);

    /* renamed from: c */
    private final kab f23641c;

    /* renamed from: d */
    private final Context f23642d;

    /* renamed from: e */
    private final String f23643e;

    /* renamed from: f */
    private final TelephonyManager f23644f;

    /* renamed from: g */
    private final adyd f23645g;

    /* renamed from: h */
    private final boolean f23646h;

    /* renamed from: i */
    private final boolean f23647i;

    public kac(kab kab, Context context, adyd adyd, TelephonyManager telephonyManager, String str, boolean z, boolean z2) {
        this.f23641c = kab;
        this.f23642d = context;
        this.f23643e = str;
        this.f23644f = telephonyManager;
        this.f23645g = adyd;
        this.f23646h = z;
        this.f23647i = z2;
    }

    /* renamed from: a */
    static String m17567a(jyk jyk) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("accountName", jyk.f23529b).put("status", jyk.f23528a);
            return jSONObject.toString();
        } catch (JSONException e) {
            f23639a.mo25417e("Exception", e, new Object[0]);
            return null;
        }
    }

    @JavascriptInterface
    public void addAccount(String str) {
        jyz jyz;
        f23639a.mo25412b("addAccount(...)", new Object[0]);
        kab kab = this.f23641c;
        try {
            JSONObject jSONObject = new JSONObject(str);
            jyz = new jyz(jSONObject.getString("authCode"), jSONObject.getString("obfuscatedGaiaId"));
        } catch (JSONException e) {
            f23639a.mo25417e("Caught exception", e, new Object[0]);
            jyz = null;
        }
        kaa kaa = (kaa) kab;
        kaa.f23632t.mo7907a(jyz, kaa.f23637y, kaa.f23638z, kaa.f23614A, kaa.f23615B, true);
    }

    @JavascriptInterface
    public void attemptLogin(String str, String str2) {
        f23639a.mo25412b("onAttemptLogin(...)", new Object[0]);
        kab kab = this.f23641c;
        kaa kaa = (kaa) kab;
        kaa.f23637y = str;
        if (!((Boolean) ((jxb) kab).mo14207b().mo13147a(kaa.f23605j, false)).booleanValue()) {
            str2 = null;
        }
        kaa.f23638z = str2;
    }

    @JavascriptInterface
    public final void cancelFido2SignRequest() {
        f23639a.mo25412b("cancelFido2SecurityKeyAssertionRequest", new Object[0]);
        kab kab = this.f23641c;
        kaa.f23599d.mo25412b("onCancelSecurityKeyAssertion", new Object[0]);
        ((kaa) kab).mo14273a(ErrorCode.TIMEOUT_ERR);
    }

    @JavascriptInterface
    public void cancelSecurityKeyAssertionRequest() {
        f23639a.mo25412b("cancelSecurityKeyAssertionRequest", new Object[0]);
        kab kab = this.f23641c;
        kaa.f23599d.mo25412b("onCancelSecurityKeyAssertion", new Object[0]);
        ((kaa) kab).mo14274a(com.google.android.gms.fido.u2f.api.common.ErrorCode.TIMEOUT);
    }

    @JavascriptInterface
    public void clearOldLoginAttempts() {
        f23639a.mo25412b("clearOldLoginAttempts", new Object[0]);
        kaa kaa = (kaa) this.f23641c;
        kaa.f23637y = null;
        kaa.f23638z = null;
    }

    @JavascriptInterface
    public void closeView() {
        f23639a.mo25412b("closeView", new Object[0]);
        ((kaa) this.f23641c).f23632t.mo7911m();
    }

    @JavascriptInterface
    public void fetchIIDToken(String str) {
        f23639a.mo25412b("fetchIIDToken", new Object[0]);
        new jzy(new jzt((kaa) this.f23641c)).execute(str);
    }

    @JavascriptInterface
    public void fetchVerifiedPhoneNumber(String str) {
        f23639a.mo25412b("fetchVerifiedPhoneNumber", new Object[0]);
        kab kab = this.f23641c;
        sxs a = sxm.m36556a(((Fragment) kab).getActivity());
        Bundle bundle = new Bundle();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle.putString(next, jSONObject.getString(next));
            }
        } catch (JSONException e) {
            kaa.f23599d.mo25417e("Parse verification params json fails.", e, new Object[0]);
        }
        aucb a2 = a.mo26222a(bundle);
        kaa kaa = (kaa) kab;
        a2.mo50373a(new jzv(kaa));
        a2.mo50372a(new jzu(kaa));
    }

    @JavascriptInterface
    public String getAccounts() {
        JSONArray jSONArray = new JSONArray();
        for (Account account : this.f23645g.mo33916a(this.f23643e)) {
            jSONArray.put(account.name);
        }
        return jSONArray.toString();
    }

    @JavascriptInterface
    public String getAllowedDomains() {
        return "{}";
    }

    @JavascriptInterface
    public String getAndroidId() {
        long a = spn.m35843a(this.f23642d);
        if (a != 0) {
            return Long.toHexString(a);
        }
        return null;
    }

    @JavascriptInterface
    public int getAuthModuleVersionCode() {
        Collection<ModuleManager.ModuleInfo> collection;
        try {
            collection = ModuleManager.get(this.f23642d).getAllModules();
        } catch (InvalidConfigException e) {
            f23639a.mo25416d("InvalidConfigException while trying to get all modules from module manager!", new Object[0]);
            collection = null;
        }
        if (collection == null) {
            f23639a.mo25416d("Was not able to fetch list of modules or list is emptry!", new Object[0]);
            return 0;
        }
        for (ModuleManager.ModuleInfo moduleInfo : collection) {
            if ("com.google.android.gms.auth_account_base".equals(moduleInfo.moduleId)) {
                return moduleInfo.moduleVersion;
            }
        }
        f23639a.mo25416d("Auth module is not found in the list of modules.", new Object[0]);
        return 0;
    }

    @JavascriptInterface
    public int getBuildVersionSdk() {
        return Build.VERSION.SDK_INT;
    }

    @JavascriptInterface
    public void getDeviceDataVersionInfo() {
        kab kab = this.f23641c;
        kaa kaa = (kaa) kab;
        kaa.f23617D = new jzz(kaa, ((Fragment) kab).getActivity().getApplicationContext());
        kaa.f23617D.execute(new Void[0]);
    }

    @JavascriptInterface
    public void getDroidGuardResult(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            ArrayList<String> arrayList = new ArrayList(str.length());
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.get(i).toString());
            }
            f23639a.mo25412b("onRequestDroidGuardResult", new Object[0]);
            kab kab = this.f23641c;
            StringBuilder sb = new StringBuilder();
            sb.append(Long.toHexString(spn.m35843a((Context) ((Fragment) kab).getActivity())));
            sb.append(':');
            sb.append(Build.VERSION.SDK_INT);
            sb.append(':');
            sb.append(201515033);
            for (String str2 : arrayList) {
                sb.append(':');
                sb.append(str2);
            }
            jyp jyp = ((kaa) kab).f23636x;
            Map singletonMap = Collections.singletonMap("dg_minutemaid", Base64.encodeToString(spn.m35862a(sb.toString(), "SHA-1"), 0));
            if (jyp.f23542e != null) {
                jyo jyo = new jyo(jyp, singletonMap);
                jyo.execute(new Void[0]);
                jyp.f23541d.add(jyo);
                return;
            }
            throw new IllegalStateException();
        } catch (JSONException e) {
            f23639a.mo25418e("Could not parse JSON array.", new Object[0]);
        }
    }

    @JavascriptInterface
    public String getPhoneNumber() {
        if (this.f23646h) {
            return this.f23644f.getLine1Number();
        }
        return null;
    }

    @JavascriptInterface
    public int getPlayServicesVersionCode() {
        return 201515033;
    }

    @JavascriptInterface
    public String getSimSerial() {
        if (this.f23646h) {
            return this.f23644f.getSimSerialNumber();
        }
        return null;
    }

    @JavascriptInterface
    public int getSimState() {
        return this.f23644f.getSimState();
    }

    @JavascriptInterface
    public void goBack() {
        f23639a.mo25412b("onBack", new Object[0]);
        kaa kaa = (kaa) this.f23641c;
        kaa.f23631s.post(new jzo(kaa));
    }

    @JavascriptInterface
    public boolean hasPhoneNumber() {
        return !TextUtils.isEmpty(getPhoneNumber());
    }

    @JavascriptInterface
    public boolean hasTelephony() {
        return this.f23644f.getPhoneType() != 0;
    }

    @JavascriptInterface
    public void hideKeyboard() {
        f23639a.mo25412b("onHideKeyboard", new Object[0]);
        kaa kaa = (kaa) this.f23641c;
        kaa.f23633u.hideSoftInputFromWindow(kaa.f23634v.getWindowToken(), 0);
    }

    @JavascriptInterface
    public boolean isUserOwner() {
        return this.f23647i;
    }

    @JavascriptInterface
    public void launchEmergencyDialer() {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setComponent(ComponentName.unflattenFromString("com.android.phone/.EmergencyDialer"));
        intent.addFlags(268435456);
        this.f23642d.startActivity(intent);
    }

    @JavascriptInterface
    public void log(String str) {
        f23640b.mo25412b(str, new Object[0]);
    }

    @JavascriptInterface
    public void notifyOnTermsOfServiceAccepted() {
        f23639a.mo25412b("onTermsOfServiceAccepted", new Object[0]);
        ((kaa) this.f23641c).f23615B = true;
    }

    @JavascriptInterface
    public final void sendFido2SkUiEvent(String str) {
        f23639a.mo25412b("sendFido2SkUiEvent(...)", new Object[0]);
        kab kab = this.f23641c;
        try {
            StateUpdate a = StateUpdate.m23439a(new JSONObject(str));
            if (a.equals(StateUpdate.f31690a) || a.equals(StateUpdate.f31693d)) {
                ((kaa) kab).mo14278d();
            } else {
                ((kaa) kab).f23618E.mo29958a(a);
            }
        } catch (JSONException e) {
            kaa.f23599d.mo25417e("Invalid user action json response.", e, new Object[0]);
            ((kaa) kab).mo14273a(ErrorCode.TIMEOUT_ERR);
        } catch (xoq e2) {
            kaa.f23599d.mo25417e("Unimplemented user action type.", e2, new Object[0]);
        }
    }

    @JavascriptInterface
    public void sendSkUiEvent(String str) {
        f23639a.mo25412b("sendSkUiEvent(...)", new Object[0]);
        kab kab = this.f23641c;
        try {
            com.google.android.gms.fido.u2f.api.StateUpdate a = com.google.android.gms.fido.u2f.api.StateUpdate.m23567a(new JSONObject(str));
            xwz xwz = ((kaa) kab).f23622I;
            if (xwz == null) {
                kaa.f23599d.mo25418e("onSecurityKeyUserAction should not be called when the api client is null.\nUserAction is %s", str);
                return;
            }
            xwz.mo30206a(a).mo50372a(new jze(str));
        } catch (JSONException e) {
            kaa.f23599d.mo25417e("Invalid user action json response.", e, new Object[0]);
            ((kaa) kab).mo14274a(com.google.android.gms.fido.u2f.api.common.ErrorCode.OTHER_ERROR);
        } catch (xxo e2) {
            kaa.f23599d.mo25417e("Unimplemented user action type.", e2, new Object[0]);
        }
    }

    @JavascriptInterface
    public void setAccountIdentifier(String str) {
        f23639a.mo25412b("onAccountIdentifierSet(...)", new Object[0]);
        kaa kaa = (kaa) this.f23641c;
        kaa.f23637y = str;
        kaa.f23638z = null;
    }

    @JavascriptInterface
    public void setAllActionsEnabled(boolean z) {
        kaa kaa = (kaa) this.f23641c;
        kaa.f23631s.post(new jzk(kaa, z));
    }

    @JavascriptInterface
    public void setBackButtonEnabled(boolean z) {
        f23639a.mo25412b("onRequestBackButton", new Object[0]);
        ((kaa) this.f23641c).f23632t.mo7909b(z);
    }

    @JavascriptInterface
    public void setNewAccountCreated() {
        f23639a.mo25412b("onNewAccountCreated", new Object[0]);
        ((kaa) this.f23641c).f23614A = true;
    }

    @JavascriptInterface
    public void setPrimaryActionEnabled(boolean z) {
        kaa kaa = (kaa) this.f23641c;
        kaa.f23631s.post(new jzi(kaa, z));
    }

    @JavascriptInterface
    public void setPrimaryActionLabel(String str, int i) {
        kaa kaa = (kaa) this.f23641c;
        kaa.f23631s.post(new jzg(kaa, str, i));
    }

    @JavascriptInterface
    public void setSecondaryActionEnabled(boolean z) {
        kaa kaa = (kaa) this.f23641c;
        kaa.f23631s.post(new jzj(kaa, z));
    }

    @JavascriptInterface
    public void setSecondaryActionLabel(String str, int i) {
        kaa kaa = (kaa) this.f23641c;
        kaa.f23631s.post(new jzh(kaa, str, i));
    }

    @JavascriptInterface
    public void showKeyboard() {
        f23639a.mo25412b("onShowKeyboard", new Object[0]);
        kaa kaa = (kaa) this.f23641c;
        kaa.f23633u.showSoftInput(kaa.f23634v, 1);
    }

    @JavascriptInterface
    public void showView() {
        f23639a.mo25412b("onShowView", new Object[0]);
        ((kaa) this.f23641c).f23632t.mo7910l();
    }

    @JavascriptInterface
    public void skipLogin() {
        f23639a.mo25412b("onSkip", new Object[0]);
        ((kaa) this.f23641c).f23632t.mo7913o();
    }

    @JavascriptInterface
    public void startAfw() {
        f23639a.mo25412b("onStartAndroidForWork", new Object[0]);
        ((kaa) this.f23641c).f23632t.mo7914p();
    }

    @JavascriptInterface
    public final void startFido2SignRequest(String str) {
        f23639a.mo25412b("startFido2SecurityKeyAssertionRequest", new Object[0]);
        kab kab = this.f23641c;
        sek sek = kaa.f23599d;
        String valueOf = String.valueOf(str);
        sek.mo25412b(valueOf.length() == 0 ? new String("Got Security Key request: ") : "Got Security Key request: ".concat(valueOf), new Object[0]);
        kaa kaa = (kaa) kab;
        kaa.f23618E = wzk.m42529c(((Fragment) kab).getActivity());
        try {
            PublicKeyCredentialRequestOptions a = PublicKeyCredentialRequestOptions.m23484a(new JSONObject(str));
            jzs jzs = new jzs(kaa, new jyq(kaa));
            xnw xnw = kaa.f23618E;
            roz b = rpa.m34196b();
            b.f43472a = new xnq(xnw, jzs, a);
            b.f43473b = new Feature[]{wzj.f51602c};
            xnw.mo24701a(b.mo24977a()).mo50371a(new jzf(kaa));
        } catch (JSONException e) {
            kaa.f23599d.mo25417e("Couldn't parse JSON request to SignRequestMessage!", e, new Object[0]);
            kaa.mo14273a(ErrorCode.ENCODING_ERR);
        } catch (xqr e2) {
            kaa.f23599d.mo25417e("UserVerfier is unsupported!", e2, new Object[0]);
            kaa.mo14273a(ErrorCode.ENCODING_ERR);
        }
    }

    /* JADX WARN: Type inference failed for: r7v6, types: [xxk, xxm], assign insn: 0x0068: IGET  (r7v6 ? I:xxk) = (r7v5 kaa) kaa.G xxk */
    @JavascriptInterface
    public void startSecurityKeyAssertionRequest(String str) {
        f23639a.mo25412b("startSecurityKeyAssertionRequest", new Object[0]);
        kab kab = this.f23641c;
        sek sek = kaa.f23599d;
        String valueOf = String.valueOf(str);
        sek.mo25412b(valueOf.length() == 0 ? new String("Got Security Key request: ") : "Got Security Key request: ".concat(valueOf), new Object[0]);
        try {
            yai yai = new yai(yah.m43722a(new JSONObject(str)));
            kaa kaa = (kaa) kab;
            kaa.f23616C = yai;
            kaa.f23619F = (BrowserSignRequestParams) kaa.f23616C.mo30309a(Uri.parse(kaa.f23635w));
            kaa.f23620G = new jzq(kaa, new kaf(kaa));
            kaa.f23622I = wzk.m42528b(((Fragment) kab).getActivity());
            kaa.f23622I.mo30207a(kaa.f23619F, (xxm) kaa.f23620G).mo50372a(jzd.f23562a);
        } catch (JSONException e) {
            kaa.f23599d.mo25417e("Couldn't parse JSON request to SignRequestMessage!", e, new Object[0]);
            ((kaa) kab).mo14274a(com.google.android.gms.fido.u2f.api.common.ErrorCode.BAD_REQUEST);
        }
    }
}
