package com.google.android.gms.googlehelp.webview;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.WebView;
import java.lang.ref.WeakReference;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GoogleHelpRenderingApiWebViewChimeraActivity extends abbi {

    /* renamed from: b */
    public String f79005b;

    /* renamed from: c */
    public String f79006c;

    /* renamed from: d */
    public boolean f79007d;

    /* renamed from: e */
    public boolean f79008e;

    /* renamed from: f */
    public LinearLayout f79009f;

    /* renamed from: g */
    private String f79010g;

    /* renamed from: h */
    private boolean f79011h;

    /* renamed from: i */
    private aasm f79012i;

    /* renamed from: j */
    private boolean f79013j;

    /* renamed from: k */
    private boolean f79014k;

    /* renamed from: l */
    private WebView f79015l;

    /* renamed from: m */
    private bqgj f79016m;

    /* renamed from: a */
    public static final bzps m66624a(int i) {
        int i2 = i - 2;
        if (i != 0) {
            if (i2 != 0) {
                if (i2 == 1) {
                    return bzps.CHAT;
                }
                if (i2 == 2) {
                    return bzps.HANGOUTS;
                }
                if (i2 == 3) {
                    return bzps.C2C;
                }
                if (i2 != 50) {
                    return bzps.UNKNOWN_CONTACT_MODE;
                }
            }
            return bzps.EMAIL;
        }
        throw null;
    }

    /* renamed from: m */
    private final void m66626m() {
        setResult(0);
        finish();
    }

    /* renamed from: e */
    public final void mo43376e() {
        aasm aasm = this.f79012i;
        boolean z = this.f79011h;
        if (this.f79016m == null) {
            this.f79016m = snp.m35702a(9);
        }
        bqgj bqgj = this.f79016m;
        new abhb(new WeakReference(this), aasm, z, bqgj).executeOnExecutor(bqgj, new Void[0]);
    }

    /* renamed from: i */
    public final aaxx mo18628i() {
        throw null;
    }

    /* renamed from: j */
    public final aatc mo18629j() {
        throw null;
    }

    public final void onBackPressed() {
        WebView webView = this.f79015l;
        if (webView == null || !webView.canGoBack()) {
            super.onBackPressed();
        } else {
            this.f79015l.goBack();
        }
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        aasm aasm = this.f79012i;
        if (aasm == null || !aasm.mo31733p()) {
            return super.onCreateOptionsMenu(menu);
        }
        if (this.f56986y != null) {
            getMenuInflater().inflate(C0126R.C0130menu.gh_rendering_api_webview_activity_menu, menu);
        } else {
            getMenuInflater().inflate(C0126R.C0130menu.gh_rendering_api_activity_menu, menu);
        }
        if (!aayi.m47270b()) {
            return true;
        }
        aayh.m47248a(menu.findItem(C0126R.C0129id.gh_rendering_api_activity_menu_close), this, aayi.m47263a(this, C0126R.attr.ghf_greyIconColor));
        return true;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            finish();
            return true;
        } else if (itemId != C0126R.C0129id.gh_rendering_api_activity_menu_close) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            setResult(1);
            finish();
            return true;
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        if (!(getIntent() == null || getIntent().getData() == null)) {
            bundle.putParcelable("EXTRA_HELP_CONFIG", this.f56986y);
            bundle.putString("saved_instance_state_content_url", this.f79005b);
            bundle.putString("saved_instance_state_page_title", this.f79006c);
        }
        super.onSaveInstanceState(bundle);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: abht.a(aasf, com.google.android.chimera.WebView):void
     arg types: [com.google.android.gms.googlehelp.webview.GoogleHelpRenderingApiWebViewChimeraActivity, com.google.android.chimera.WebView]
     candidates:
      abht.a(android.content.Context, com.google.android.chimera.WebView):void
      abht.a(aasf, com.google.android.chimera.WebView):void */
    /* renamed from: l */
    public final void mo43377l() {
        WebView webView = new WebView(this);
        webView.setWebViewClient(abht.m47722a((aasf) this));
        abht.m47724a((aasf) this, webView);
        if (!aaya.m47229b(cehp.m136861d()) && this.f79014k) {
            webView.addJavascriptInterface(new abhh(this), "activity");
        } else {
            webView.addJavascriptInterface(new abhi(this), "activity");
        }
        abht.m47732b(webView, this.f79010g, this.f79006c, this.f79005b, abfm.m47619a(this.f56986y), this.f79014k);
        setContentView(webView);
        if (!aaya.m47229b(cehp.m136861d()) && this.f79014k) {
            this.f79015l = webView;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: abhp.a(android.net.Uri, boolean):boolean
     arg types: [android.net.Uri, int]
     candidates:
      abhp.a(java.lang.String, boolean):boolean
      abhp.a(android.net.Uri, boolean):boolean */
    public final void onCreate(Bundle bundle) {
        int i;
        int i2;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null) {
            Log.w("gH_RndrApiWebViewActvty", "The intent that started the Activity is null.");
            m66626m();
            return;
        }
        Uri data = intent.getData();
        if (data == null) {
            Log.w("gH_RndrApiWebViewActvty", "The intent data is null.");
            m66626m();
        } else if (!abhp.m47717a(data, true)) {
            String valueOf = String.valueOf(data);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
            sb.append("The URL is not whitelisted to be shown: ");
            sb.append(valueOf);
            Log.w("gH_RndrApiWebViewActvty", sb.toString());
            m66625a(data);
        } else {
            if (this.f56986y != null) {
                boolean a = aayi.m47267a();
                int i3 = C0126R.style.gh_DarkActivityStyle;
                if (a) {
                    aayi.m47266a(this, this.f56986y, (int) C0126R.style.gh_LightActivityStyle, (int) C0126R.style.gh_DarkActivityStyle, (int) C0126R.style.gh_DayNightActivityStyle);
                } else {
                    if (!aayi.m47269a(this.f56986y)) {
                        i3 = C0126R.style.gh_LightActivityStyle;
                    }
                    setTheme(i3);
                }
                C1341rz aW = mo8628aW();
                if (aW != null) {
                    if (aayi.m47270b()) {
                        aW.mo15856c(aayh.m47257b(C1133kh.m17836a(this, (int) C0126R.C0127drawable.quantum_ic_arrow_back_black_24), this, aayi.m47263a(this, C0126R.attr.ghf_greyIconColor)));
                    } else {
                        aW.mo15863e((int) C0126R.C0127drawable.quantum_ic_arrow_back_black_24);
                    }
                    if (!this.f79007d) {
                        i2 = C0126R.string.close_button_label;
                    } else {
                        i2 = C0126R.string.gh_switch_back_to_chat_button_description;
                    }
                    aW.mo15865f(i2);
                    aW.mo15853b(true);
                    aW.mo15858c(true);
                }
            }
            this.f79007d = intent.getBooleanExtra("extra_is_from_chat", false);
            this.f79008e = intent.getBooleanExtra("extra_is_from_email", false);
            this.f79013j = intent.getBooleanExtra("extra_is_from_c2c", false);
            this.f79014k = intent.getBooleanExtra("extra_is_from_sj", false);
            this.f79010g = data.toString();
            if (!this.f79007d) {
                i = !this.f79008e ? !this.f79013j ? 1 : 4 : 3;
            } else {
                i = 2;
            }
            aasm a2 = aasm.m46883a(this.f79010g, aasw.m46952a(), this.f56986y, this.f79007d, i);
            this.f79012i = a2;
            if (a2 != null) {
                if (!aaya.m47228a(cefe.m136708b())) {
                    aatj.m46985a(this);
                }
                this.f79011h = intent.getBooleanExtra("requireGcmToken", false);
                if (bundle != null) {
                    this.f79005b = bundle.getString("saved_instance_state_content_url");
                    this.f79006c = bundle.getString("saved_instance_state_page_title");
                    mo43377l();
                } else {
                    if (this.f79008e) {
                        this.f79006c = getString(C0126R.string.gh_email_form_title);
                    } else if (this.f79012i.mo31733p()) {
                        this.f79006c = getString(C0126R.string.gh_survey);
                    } else if (this.f79012i.f56495e == 21) {
                        abcx.m47524g(this, 164);
                        this.f79006c = getString(C0126R.string.gh_c2c_form_title);
                    } else if (this.f79014k) {
                        this.f79006c = getString(C0126R.string.gh_top_appbar_support_label);
                    } else {
                        this.f79006c = getString(C0126R.string.common_list_apps_menu_help);
                    }
                    mo43376e();
                }
                setTitle(this.f79006c);
                mo8628aW().mo15845a(this.f79006c);
                setResult(-1);
                return;
            }
            Log.w("gH_RndrApiWebViewActvty", String.format("Not a recognized support URL: %s", this.f79010g));
            m66625a(data);
        }
    }

    /* renamed from: a */
    private final void m66625a(Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        if (!spn.m35860a(this, intent)) {
            String valueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
            sb.append("No activity can handle this URL: ");
            sb.append(valueOf);
            Log.w("gH_RndrApiWebViewActvty", sb.toString());
            m66626m();
            return;
        }
        startActivity(intent);
        finish();
    }
}
