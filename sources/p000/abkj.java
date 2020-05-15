package p000;

import android.accounts.Account;
import android.app.ActivityManager;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.chimera.Activity;
import com.google.android.gms.common.Feature;
import com.google.android.gms.romanesco.protomodel.RestoreInfoEntity;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: abkj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abkj {

    /* renamed from: a */
    public static final srn f57613a = srn.m36127a(sgj.GROWTH);

    /* renamed from: b */
    private final Activity f57614b;

    /* renamed from: c */
    private final Account f57615c;

    /* renamed from: d */
    private final ablh f57616d;

    /* renamed from: e */
    private final WebView f57617e;

    /* renamed from: f */
    private final String f57618f;

    /* renamed from: g */
    private final abij f57619g;

    /* renamed from: h */
    private final int f57620h;

    public abkj(abij abij, ablh ablh, Activity activity, WebView webView, Account account, String str, int i) {
        this.f57619g = abij;
        this.f57614b = activity;
        this.f57618f = str;
        this.f57620h = i;
        this.f57616d = ablh;
        this.f57617e = webView;
        this.f57615c = account;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Intent mo32151a(String str, String str2, String str3) {
        HashSet a = bnpf.m110050a(ceka.f182818a.mo6606a().mo79213k().split("\\s"));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("#");
        sb.append(str2);
        if (!a.contains(sb.toString())) {
            bnsl bnsl = (bnsl) f57613a.mo68388c();
            bnsl.mo68432a("abkj", "a", 346, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68424a("Invalid intent: %s#%s", str, str2);
            return null;
        }
        Intent className = new Intent().setClassName(str, str2);
        if (!TextUtils.isEmpty(str3)) {
            try {
                JSONArray jSONArray = new JSONArray(str3);
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    String string = jSONObject.getString("key");
                    if (jSONObject.has("value")) {
                        className.putExtra(string, jSONObject.getString("value"));
                    } else if (jSONObject.has("int-value")) {
                        className.putExtra(string, jSONObject.getInt("int-value"));
                    } else if (jSONObject.has("bool-value")) {
                        className.putExtra(string, jSONObject.getBoolean("bool-value"));
                    }
                }
            } catch (JSONException e) {
                bnsl bnsl2 = (bnsl) f57613a.mo68388c();
                bnsl2.mo68437a(e);
                bnsl2.mo68432a("abkj", "a", 365, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68420a("Invalid extras: %s", str3);
                return null;
            }
        }
        return className;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo32155b(String str, aucb aucb) {
        mo32154a(str, aucb.mo50384b());
        if (!aucb.mo50384b()) {
            bnsl bnsl = (bnsl) f57613a.mo68388c();
            bnsl.mo68437a(aucb.mo50387e());
            bnsl.mo68432a("abkj", "b", 441, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to restore contacts");
        }
    }

    @JavascriptInterface
    public void closeWindow() {
        this.f57614b.finish();
    }

    @JavascriptInterface
    public void closeWindowAndRemoveTask() {
        this.f57614b.finishAndRemoveTask();
    }

    @JavascriptInterface
    public void fetchContactsRestoreInfo(String[] strArr, String str) {
        aoxr a = aoxb.m69771a(this.f57614b);
        String str2 = this.f57615c.name;
        roz b = rpa.m34196b();
        b.f43473b = new Feature[]{aoxa.f83781b};
        b.f43472a = new aoxf(str2);
        a.mo24701a(b.mo24977a()).mo50371a(new abkh(this, str));
    }

    @JavascriptInterface
    public String getAccounts(String str) {
        JSONArray jSONArray = new JSONArray();
        for (Account account : adyd.m51363a(this.f57614b).mo33916a(str)) {
            jSONArray.put(account.name);
        }
        return jSONArray.toString();
    }

    @JavascriptInterface
    public int getAndroidSdkVersion() {
        return Build.VERSION.SDK_INT;
    }

    @JavascriptInterface
    public int getGmsCoreVersion() {
        return stu.m36316b();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{org.json.JSONObject.put(java.lang.String, boolean):org.json.JSONObject throws org.json.JSONException}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{org.json.JSONObject.put(java.lang.String, double):org.json.JSONObject throws org.json.JSONException}
      ClspMth{org.json.JSONObject.put(java.lang.String, long):org.json.JSONObject throws org.json.JSONException}
      ClspMth{org.json.JSONObject.put(java.lang.String, int):org.json.JSONObject throws org.json.JSONException}
      ClspMth{org.json.JSONObject.put(java.lang.String, java.lang.Object):org.json.JSONObject throws org.json.JSONException}
      ClspMth{org.json.JSONObject.put(java.lang.String, boolean):org.json.JSONObject throws org.json.JSONException} */
    @JavascriptInterface
    public String getGoogleAppAppInfo(String str) {
        String str2;
        JSONObject jSONObject = new JSONObject();
        if (ablg.m47851a(str)) {
            try {
                PackageInfo packageInfo = this.f57614b.getPackageManager().getPackageInfo(str, 0);
                jSONObject.put("installed", true);
                if (packageInfo.applicationInfo != null) {
                    str2 = Boolean.toString(packageInfo.applicationInfo.enabled);
                } else {
                    str2 = "unknown";
                }
                jSONObject.put("enabled", str2);
                jSONObject.put("version_code", packageInfo.versionCode);
            } catch (PackageManager.NameNotFoundException e) {
                jSONObject.put("installed", false);
            }
        }
        return jSONObject.toString();
    }

    @JavascriptInterface
    public long getGoogleAppVersionCode(String str) {
        if (ablg.m47851a(str)) {
            try {
                PackageInfo packageInfo = this.f57614b.getPackageManager().getPackageInfo(str, 0);
                if (packageInfo != null) {
                    return (long) packageInfo.versionCode;
                }
                return -1;
            } catch (PackageManager.NameNotFoundException e) {
            }
        }
        return -1;
    }

    @JavascriptInterface
    public int getGrowthModuleVersion() {
        return abkv.m47827a(this.f57614b);
    }

    @JavascriptInterface
    public String getPhenotypeConfigurationVersion() {
        return cejo.f182799a.mo6606a().mo79190a();
    }

    @JavascriptInterface
    public String getPhenotypeServerToken() {
        return cejo.f182799a.mo6606a().mo79191b();
    }

    @JavascriptInterface
    public long getRamMb() {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) this.f57614b.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return (memoryInfo.totalMem / 1024) / 1024;
    }

    @JavascriptInterface
    public boolean hasSystemFeature(String str) {
        return this.f57614b.getPackageManager().hasSystemFeature(str);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    @JavascriptInterface
    public void installApp(String str, String str2) {
        if (str != null) {
            try {
                if (!str.startsWith("com.google.")) {
                    if (!str.startsWith("com.android.")) {
                        return;
                    }
                }
                if (str2 == null) {
                    str2 = "";
                }
                Intent putExtra = new Intent("android.intent.action.VIEW").setData(Uri.parse(String.format("market://details?id=%s%s", str, str2)).buildUpon().appendQueryParameter("cont_btn", "1").build()).putExtra("overlay", true).putExtra("callerId", "com.google.android.gms");
                if (ceka.f182818a.mo6606a().mo79205c()) {
                    Account account = this.f57615c;
                    if (account != null) {
                        putExtra.putExtra("authAccount", account.name);
                    }
                }
                this.f57614b.startActivityForResult(putExtra, 1);
                ablh ablh = this.f57616d;
                bxvd da = bsmh.f145025e.mo74144da();
                String str3 = this.f57615c.name;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bsmh bsmh = (bsmh) da.f164949b;
                str3.getClass();
                int i = 2 | bsmh.f145027a;
                bsmh.f145027a = i;
                bsmh.f145029c = str3;
                int i2 = this.f57620h;
                bsmh.f145027a = i | 4;
                bsmh.f145030d = i2;
                ablh.mo32204a(str, da);
            } catch (Exception e) {
                bnsl bnsl = (bnsl) f57613a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68432a("abkj", "installApp", (int) MfiClientException.TYPE_CARD_NOT_CACHED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Error in installApp");
                throw e;
            }
        }
    }

    @JavascriptInterface
    public void invokeIntent(int i, String str) {
        cejj b = ceka.m137017b();
        if (b.mo79188a(i)) {
            bxww bxww = b.f182773a;
            Integer valueOf = Integer.valueOf(i);
            if (bxww.containsKey(valueOf)) {
                cejh cejh = (cejh) bxww.get(valueOf);
                cejn cejn = cejh.f182767a;
                if (cejn == null) {
                    cejn = cejn.f182791g;
                }
                Intent a = abkw.m47829a(cejn);
                if (str != null) {
                    try {
                        abkw.m47830a(a, (cejm) GeneratedMessageLite.m124014a(cejm.f182788b, Base64.decode(str, 0)));
                    } catch (bxwf e) {
                        bnsl bnsl = (bnsl) f57613a.mo68387b();
                        bnsl.mo68432a("abkj", "invokeIntent", 403, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68420a("Failed to decode IntentExtras from %s, skipping intent", str);
                        return;
                    }
                }
                try {
                    Activity activity = this.f57614b;
                    cejg cejg = cejh.f182768b;
                    if (cejg == null) {
                        cejg = cejg.f182761c;
                    }
                    abkw.m47831a(activity, a, cejg);
                } catch (Exception e2) {
                    bnsl bnsl2 = (bnsl) f57613a.mo68387b();
                    bnsl2.mo68437a(e2);
                    bnsl2.mo68432a("abkj", "invokeIntent", 411, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68409a("Failed to invoke intent %s", i);
                    throw e2;
                }
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            bnsl bnsl3 = (bnsl) f57613a.mo68388c();
            bnsl3.mo68432a("abkj", "invokeIntent", 387, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68409a("Intent with id %d is not in whitelist", i);
        }
    }

    @JavascriptInterface
    public boolean isGoogleAppInstalled(String str) {
        if (ablg.m47851a(str)) {
            try {
                this.f57614b.getPackageManager().getApplicationInfo(str, 0);
                return true;
            } catch (PackageManager.NameNotFoundException e) {
            }
        }
        return false;
    }

    @JavascriptInterface
    public boolean isIntentWhitelisted(int i) {
        return ceka.m137017b().mo79188a(i);
    }

    @JavascriptInterface
    public void logEvent(String str) {
        if (str != null && str.length() > 50) {
            str = str.substring(0, 50);
        }
        abij abij = this.f57619g;
        String str2 = this.f57615c.name;
        int i = this.f57620h;
        bxvd da = bspu.f146587f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bspu bspu = (bspu) da.f164949b;
        bspu.f146591c = 12;
        int i2 = bspu.f146589a | 2;
        bspu.f146589a = i2;
        str.getClass();
        bspu.f146589a = i2 | 8;
        bspu.f146593e = str;
        abij.mo32129a(str2, i, da);
    }

    @JavascriptInterface
    public String queryContentResolver(String str, String str2, String[] strArr, String str3, String[] strArr2, String str4) {
        Cursor query;
        int i;
        try {
            query = this.f57614b.getContentResolver().query(Uri.parse(str), strArr, str3, strArr2, str4);
            if (query == null) {
                return null;
            }
            if (!query.moveToFirst()) {
                query.close();
                return null;
            }
            if (str2 != null) {
                i = query.getColumnIndex(str2);
                if (i < 0) {
                    query.close();
                    return null;
                }
            } else {
                i = 0;
            }
            String string = query.getString(i);
            query.close();
            return string;
        } catch (Exception e) {
            return null;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    @JavascriptInterface
    public void refreshCookies(String str) {
        abku.m47822a().mo32188a(this.f57615c, this.f57618f).mo50371a(new abki(this, str));
    }

    @JavascriptInterface
    public void restoreContacts(String str, String str2, String str3, String[] strArr, String str4) {
        aoxb.m69771a(this.f57614b).mo46973a(str, this.f57615c.name, str2, str3, strArr).mo50371a(new abkg(this, str4));
    }

    @JavascriptInterface
    public void startPaySetupWizard(int i, String str) {
        awlr awlr = new awlr(this.f57614b);
        awlr.mo52188a(this.f57615c);
        awlr.mo52187a((int) ceka.f182818a.mo6606a().mo79208f());
        if (!bmxx.m108577a(str)) {
            awlr.f94574a.putExtra("theme", str);
        }
        this.f57614b.startActivityForResult(awlr.mo52186a(), i);
    }

    @JavascriptInterface
    public void trackDefaultInputMethod() {
        ablh ablh = this.f57616d;
        bxvd da = bsmh.f145025e.mo74144da();
        String str = this.f57615c.name;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bsmh bsmh = (bsmh) da.f164949b;
        str.getClass();
        int i = bsmh.f145027a | 2;
        bsmh.f145027a = i;
        bsmh.f145029c = str;
        int i2 = this.f57620h;
        bsmh.f145027a = i | 4;
        bsmh.f145030d = i2;
        ablh.mo32205b(da);
    }

    @JavascriptInterface
    public void trackDuoRegistration() {
        ablh ablh = this.f57616d;
        bxvd da = bsmh.f145025e.mo74144da();
        String str = this.f57615c.name;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bsmh bsmh = (bsmh) da.f164949b;
        str.getClass();
        int i = bsmh.f145027a | 2;
        bsmh.f145027a = i;
        bsmh.f145029c = str;
        int i2 = this.f57620h;
        bsmh.f145027a = i | 4;
        bsmh.f145030d = i2;
        ablh.mo32202a(da);
    }

    @JavascriptInterface
    public void startActivityForIntent(String str, String str2, String str3) {
        HashSet a = bnpf.m110050a(ceka.f182818a.mo6606a().mo79213k().split("\\s"));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("#");
        sb.append(str2);
        Intent intent = null;
        if (!a.contains(sb.toString())) {
            bnsl bnsl = (bnsl) f57613a.mo68388c();
            bnsl.mo68432a("abkj", "a", 346, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68424a("Invalid intent: %s#%s", str, str2);
        } else {
            Intent className = new Intent().setClassName(str, str2);
            if (!TextUtils.isEmpty(str3)) {
                try {
                    JSONArray jSONArray = new JSONArray(str3);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        String string = jSONObject.getString("key");
                        if (jSONObject.has("value")) {
                            className.putExtra(string, jSONObject.getString("value"));
                        } else if (jSONObject.has("int-value")) {
                            className.putExtra(string, jSONObject.getInt("int-value"));
                        } else if (jSONObject.has("bool-value")) {
                            className.putExtra(string, jSONObject.getBoolean("bool-value"));
                        }
                    }
                } catch (JSONException e) {
                    bnsl bnsl2 = (bnsl) f57613a.mo68388c();
                    bnsl2.mo68437a(e);
                    bnsl2.mo68432a("abkj", "a", 365, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68420a("Invalid extras: %s", str3);
                }
            }
            intent = className;
        }
        if (intent != null) {
            this.f57614b.startActivity(intent);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: abkj.a(java.lang.String, java.lang.String, boolean):void
     arg types: [java.lang.String, java.lang.String, int]
     candidates:
      abkj.a(java.lang.String, java.lang.String, java.lang.String):android.content.Intent
      abkj.a(java.lang.String, java.lang.String, boolean):void */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo32152a(String str, aucb aucb) {
        if (aucb.mo50384b()) {
            try {
                JSONObject jSONObject = new JSONObject();
                for (RestoreInfoEntity restoreInfoEntity : (List) aucb.mo50386d()) {
                    jSONObject.put(restoreInfoEntity.f107246a, restoreInfoEntity.f107247b);
                }
                mo32153a(str, jSONObject.toString(), true);
            } catch (JSONException e) {
                bnsl bnsl = (bnsl) f57613a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68432a("abkj", "a", 472, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Failed to fetch restore info from Romanesco");
                mo32153a(str, JSONObject.NULL.toString(), false);
            }
        } else {
            bnsl bnsl2 = (bnsl) f57613a.mo68388c();
            bnsl2.mo68437a(aucb.mo50387e());
            bnsl2.mo68432a("abkj", "a", 456, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Failed to fetch restore info from Romanesco");
            mo32153a(str, JSONObject.NULL.toString(), false);
        }
    }

    /* renamed from: a */
    public final void mo32153a(String str, String str2, boolean z) {
        this.f57617e.evaluateJavascript(String.format(Locale.ROOT, "%s(%s, %s)", str, str2, Boolean.valueOf(z)), null);
    }

    /* renamed from: a */
    public final void mo32154a(String str, boolean z) {
        this.f57617e.evaluateJavascript(String.format(Locale.ROOT, "%s(%s)", str, Boolean.valueOf(z)), null);
    }
}
