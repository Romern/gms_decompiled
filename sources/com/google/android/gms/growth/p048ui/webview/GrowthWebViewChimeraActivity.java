package com.google.android.gms.growth.p048ui.webview;

import android.accounts.Account;
import android.app.ActivityManager;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.chimera.Activity;
import com.google.android.libraries.material.progress.MaterialProgressBar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.growth.ui.webview.GrowthWebViewChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GrowthWebViewChimeraActivity extends Activity {

    /* renamed from: a */
    public static final String f79030a = abkv.m47828a(GrowthWebViewChimeraActivity.class);

    /* renamed from: b */
    public static final srn f79031b = srn.m36127a(sgj.GROWTH);

    /* renamed from: c */
    public WebView f79032c;

    /* renamed from: d */
    View f79033d;

    /* renamed from: e */
    public MaterialProgressBar f79034e;

    /* renamed from: f */
    abkj f79035f;

    /* renamed from: g */
    public String f79036g;

    /* renamed from: h */
    private final abhu f79037h;

    /* renamed from: i */
    private final Random f79038i;

    /* renamed from: j */
    private final bqgj f79039j;

    /* renamed from: k */
    private final abkk f79040k;

    /* renamed from: l */
    private String f79041l;

    /* renamed from: m */
    private Account f79042m;

    /* renamed from: n */
    private int f79043n;

    /* renamed from: o */
    private abij f79044o;

    /* renamed from: p */
    private abku f79045p;

    public GrowthWebViewChimeraActivity(abij abij, abhu abhu, Random random, bqgj bqgj, abkk abkk) {
        this.f79044o = abij;
        this.f79037h = abhu;
        this.f79038i = random;
        this.f79039j = bqgj;
        this.f79040k = abkk;
    }

    /* renamed from: a */
    private final void m66648a(int i) {
        abij abij = this.f79044o;
        String str = this.f79041l;
        int i2 = this.f79043n;
        bxvd da = bspu.f146587f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bspu bspu = (bspu) da.f164949b;
        bspu.f146591c = i - 1;
        bspu.f146589a |= 2;
        abij.mo32129a(str, i2, da);
    }

    public static GrowthWebViewChimeraActivity provideInstance() {
        abkb abkb = new abkb();
        abig a = abif.m47744a();
        cazf.m127594a(a);
        abkb.f57599a = a;
        cazf.m127595a(abkb.f57599a, abig.class);
        abkf abkf = new abkf(abkb.f57599a);
        abij d = abkf.f57603a.mo32121d();
        cazf.m127593a(d, "Cannot return null from a non-@Nullable component method");
        abhu c = abkf.f57603a.mo32120c();
        cazf.m127593a(c, "Cannot return null from a non-@Nullable component method");
        Random i = abkf.f57603a.mo32126i();
        cazf.m127593a(i, "Cannot return null from a non-@Nullable component method");
        bqgj f = abkf.f57603a.mo32123f();
        cazf.m127593a(f, "Cannot return null from a non-@Nullable component method");
        return new GrowthWebViewChimeraActivity(d, c, i, f, new abkk(abkf.f57604b, abkf.f57605c, abkf.f57606d));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo43380b() {
        setResult(-1);
        finish();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (intent != null) {
            StringBuilder sb = new StringBuilder();
            if (intent.getComponent() != null) {
                sb.append(intent.getComponent());
            }
            if (intent.getData() != null) {
                sb.append("\n  Data: ");
                sb.append(intent.getData());
            }
            if (intent.getAction() != null) {
                sb.append("\n  Action: ");
                sb.append(intent.getAction());
            }
            Bundle extras = intent.getExtras();
            if (extras != null) {
                for (String str : extras.keySet()) {
                    sb.append("\n  ");
                    sb.append(str);
                    sb.append(": ");
                    sb.append(extras.get(str));
                }
            }
            sb.toString();
        }
        if (this.f79032c != null) {
            JSONObject jSONObject = null;
            if (!(intent == null || intent.getExtras() == null)) {
                try {
                    jSONObject = abkx.m47832a(intent.getExtras());
                } catch (JSONException e) {
                    bnsl bnsl = (bnsl) f79031b.mo68388c();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("com.google.android.gms.growth.ui.webview.GrowthWebViewChimeraActivity", "onActivityResult", 246, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Failed to encode intent extras to json.");
                }
            }
            this.f79032c.post(new abkl(this, i, i2, jSONObject == null ? JSONObject.NULL.toString() : jSONObject.toString()));
        }
    }

    public final void onBackPressed() {
        if (this.f79032c.canGoBack()) {
            this.f79032c.goBack();
        } else {
            mo43380b();
        }
    }

    public void onClose(View view) {
        m66648a(9);
        mo43380b();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.widget.FrameLayout, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x02ef  */
    public final void onCreate(Bundle bundle) {
        int i;
        String str;
        String str2;
        Uri.Builder builder;
        super.onCreate(bundle);
        int i2 = Build.VERSION.SDK_INT;
        setTheme(2132018639);
        if (ceka.f182818a.mo6606a().mo79212j()) {
            int i3 = Build.VERSION.SDK_INT;
            setRequestedOrientation(1);
            Intent intent = getIntent();
            if (intent == null) {
                bnsl bnsl = (bnsl) f79031b.mo68388c();
                bnsl.mo68432a("com.google.android.gms.growth.ui.webview.GrowthWebViewChimeraActivity", "onCreate", (int) MfiClientException.TYPE_ILLEGAL_CARD_OPERATION, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("GrowthWebViewChimeraActivity called with no intent");
                mo43379a();
                return;
            }
            setContentView((int) C0126R.C0128layout.growth_webview);
            FrameLayout frameLayout = (FrameLayout) findViewById(C0126R.C0129id.growth_webview_container);
            frameLayout.addView(getLayoutInflater().inflate((int) C0126R.C0128layout.growth_webview_loading, (ViewGroup) frameLayout, false));
            int i4 = Build.VERSION.SDK_INT;
            String d = ceka.f182818a.mo6606a().mo79206d();
            String stringExtra = intent.getStringExtra("task_description");
            if (stringExtra != null) {
                d = stringExtra;
            }
            setTaskDescription(new ActivityManager.TaskDescription(d, BitmapFactory.decodeResource(getResources(), C0126R.C0127drawable.product_logo_googleg_color_48)));
            this.f79032c = (WebView) findViewById(C0126R.C0129id.webview);
            this.f79033d = findViewById(C0126R.C0129id.no_connection);
            findViewById(C0126R.C0129id.retry);
            findViewById(C0126R.C0129id.close);
            this.f79034e = (MaterialProgressBar) findViewById(C0126R.C0129id.progress);
            this.f79045p = abku.m47822a();
            if (intent.hasExtra("backend_logging_id")) {
                String stringExtra2 = intent.getStringExtra("backend_logging_id");
                if (stringExtra2 != null) {
                    try {
                        i = Integer.parseInt(stringExtra2);
                    } catch (NumberFormatException e) {
                        i = 0;
                    }
                } else {
                    i = 0;
                }
            } else {
                i = intent.hasExtra("logging_id") ? intent.getIntExtra("logging_id", 0) : this.f79038i.nextInt();
            }
            this.f79043n = i;
            Uri data = intent.getData();
            if (data != null) {
                str = data.getQueryParameter("account");
            } else {
                str = intent.getStringExtra("account");
            }
            this.f79041l = str;
            if (str == null) {
                List a = this.f79037h.mo32118a();
                if (!a.isEmpty()) {
                    this.f79041l = (String) a.get(0);
                }
            }
            this.f79042m = new Account(this.f79041l, "com.google");
            Uri data2 = intent.getData();
            if (data2 != null) {
                builder = data2.buildUpon();
                builder.scheme("https");
                String query = data2.getQuery();
                if (query != null) {
                    String str3 = this.f79041l;
                    StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 10);
                    sb.append("account=");
                    sb.append(str3);
                    sb.append("&?");
                    builder.encodedQuery(query.replaceFirst(sb.toString(), ""));
                }
                m66648a(5);
            } else if (intent.hasExtra("url")) {
                Uri.Builder buildUpon = Uri.parse(intent.getStringExtra("url")).buildUpon();
                m66648a(4);
                bxvd da = bsqe.f146627e.mo74144da();
                int i5 = this.f79043n;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bsqe bsqe = (bsqe) da.f164949b;
                bsqe.f146629a |= 1;
                bsqe.f146630b = i5;
                String stringExtra3 = intent.getStringExtra("ctr_token");
                if (stringExtra3 != null) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bsqe bsqe2 = (bsqe) da.f164949b;
                    stringExtra3.getClass();
                    bsqe2.f146629a |= 2;
                    bsqe2.f146631c = stringExtra3;
                }
                abij abij = this.f79044o;
                String str4 = this.f79041l;
                bxvd da2 = bspy.f146601f.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bspy bspy = (bspy) da2.f164949b;
                bspy.f146604b = 4;
                bspy.f146603a |= 1;
                bsqe bsqe3 = (bsqe) da.mo74062i();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bspy bspy2 = (bspy) da2.f164949b;
                bsqe3.getClass();
                bspy2.f146606d = bsqe3;
                bspy2.f146603a |= 4;
                abij.mo32130a(str4, da2);
                builder = buildUpon;
            } else {
                str2 = null;
                this.f79036g = str2;
                if (str2 == null) {
                    this.f79032c.clearCache(true);
                    WebView webView = this.f79032c;
                    android.app.Activity containerActivity = getContainerActivity();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(String.format("https://%s/*", ceka.m137018c()));
                    Collections.addAll(arrayList, ceka.f182818a.mo6606a().mo79215m().split("\\s"));
                    webView.setWebViewClient(new abkr(containerActivity, arrayList));
                    WebSettings settings = this.f79032c.getSettings();
                    String userAgentString = settings.getUserAgentString();
                    String a2 = ablf.m47850a(this);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(userAgentString).length() + 1 + String.valueOf(a2).length());
                    sb2.append(userAgentString);
                    sb2.append(" ");
                    sb2.append(a2);
                    settings.setUserAgentString(sb2.toString());
                    settings.setJavaScriptEnabled(true);
                    abkk abkk = this.f79040k;
                    WebView webView2 = this.f79032c;
                    Account account = this.f79042m;
                    String str5 = this.f79036g;
                    int i6 = this.f79043n;
                    abkk.m47815a((ablc) abkk.f57621a.mo6445a(), 1);
                    abij abij2 = (abij) abkk.f57622b.mo6445a();
                    abkk.m47815a(abij2, 2);
                    ablh ablh = (ablh) abkk.f57623c.mo6445a();
                    abkk.m47815a(ablh, 3);
                    abkk.m47815a(this, 4);
                    abkk.m47815a(webView2, 5);
                    abkk.m47815a(account, 6);
                    abkk.m47815a(str5, 7);
                    abkj abkj = new abkj(abij2, ablh, this, webView2, account, str5, i6);
                    this.f79035f = abkj;
                    this.f79032c.addJavascriptInterface(abkj, "Android");
                    mo43382c();
                    return;
                }
                bnsl bnsl2 = (bnsl) f79031b.mo68388c();
                bnsl2.mo68432a("com.google.android.gms.growth.ui.webview.GrowthWebViewChimeraActivity", "onCreate", 204, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("GrowthWebViewChimeraActivity called with no url");
                mo43379a();
                return;
            }
            builder.encodedAuthority(ceka.m137018c());
            String valueOf = String.valueOf(this.f79043n);
            if (builder.build().getQueryParameter("gdsid") == null) {
                builder.appendQueryParameter("gdsid", valueOf);
            }
            str2 = builder.build().toString();
            this.f79036g = str2;
            if (str2 == null) {
            }
        } else {
            mo43379a();
        }
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        super.onPause();
        abij abij = this.f79044o;
        String str = this.f79041l;
        int i = this.f79043n;
        bxvd da = bspu.f146587f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bspu bspu = (bspu) da.f164949b;
        bspu.f146591c = 15;
        bspu.f146589a |= 2;
        abij.mo32129a(str, i, da);
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        abij abij = this.f79044o;
        String str = this.f79041l;
        int i = this.f79043n;
        bxvd da = bspu.f146587f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bspu bspu = (bspu) da.f164949b;
        bspu.f146591c = 16;
        bspu.f146589a |= 2;
        abij.mo32129a(str, i, da);
    }

    public void onRetry(View view) {
        m66648a(10);
        this.f79034e.mo60481a();
        this.f79039j.execute(new abkp(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo43381b(Exception exc) {
        bnsl bnsl = (bnsl) f79031b.mo68387b();
        bnsl.mo68437a(exc);
        bnsl.mo68432a("com.google.android.gms.growth.ui.webview.GrowthWebViewChimeraActivity", "b", 403, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Webview initialization failed.");
        mo43379a();
    }

    /* renamed from: c */
    public final void mo43382c() {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting()) {
            this.f79032c.setVisibility(8);
            this.f79033d.setVisibility(0);
            m66648a(7);
            return;
        }
        findViewById(C0126R.C0129id.webview_loading).setVisibility(0);
        this.f79033d.setVisibility(8);
        if (!ceka.f182818a.mo6606a().mo79214l()) {
            this.f79032c.loadUrl(this.f79036g);
        } else {
            aucb a = this.f79045p.mo32188a(this.f79042m, this.f79036g);
            a.mo50372a(abko.f57630a);
            a.mo50369a(getContainerActivity(), new abkm(this));
            a.mo50368a(getContainerActivity(), new abkn(this));
        }
        m66648a(6);
    }

    /* renamed from: a */
    static final /* synthetic */ void m66649a(Exception exc) {
        bnsl bnsl = (bnsl) f79031b.mo68387b();
        bnsl.mo68437a(exc);
        bnsl.mo68432a("com.google.android.gms.growth.ui.webview.GrowthWebViewChimeraActivity", "a", 423, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Failed to set user auth cookies.");
    }

    /* renamed from: a */
    public final void mo43379a() {
        setResult(0);
        finish();
    }
}
