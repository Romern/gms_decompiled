package com.google.android.gms.constellation.p038ui;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ProgressBar;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.HashSet;
import java.util.Locale;
import java.util.Timer;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: com.google.android.gms.constellation.ui.ApiConsentChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ApiConsentChimeraActivity extends Activity {

    /* renamed from: a */
    public static final sek f30509a = tea.m36798a("jibe_terms_of_services");

    /* renamed from: b */
    public String f30510b;

    /* renamed from: c */
    public tdx f30511c;

    /* renamed from: d */
    public int f30512d = 0;

    /* renamed from: e */
    public final Handler f30513e = new adzt();

    /* renamed from: f */
    public CountDownLatch f30514f;

    /* renamed from: g */
    public ProgressBar f30515g;

    /* renamed from: h */
    public WebView f30516h;

    /* renamed from: i */
    public View f30517i;

    /* renamed from: j */
    public int f30518j;

    /* renamed from: k */
    public String f30519k;

    /* renamed from: l */
    public String f30520l;

    /* renamed from: m */
    public String f30521m;

    /* renamed from: n */
    public boolean f30522n = false;

    /* renamed from: o */
    public boolean f30523o = false;

    /* renamed from: p */
    public Timer f30524p;

    /* renamed from: q */
    public gbd f30525q;

    /* renamed from: r */
    private UUID f30526r;

    /* renamed from: s */
    private final ExecutorService f30527s = new soc(1, 9);

    /* renamed from: t */
    private tds f30528t;

    /* renamed from: u */
    private String f30529u;

    /* renamed from: v */
    private View f30530v;

    /* renamed from: w */
    private Button f30531w;

    /* renamed from: x */
    private Button f30532x;

    /* renamed from: y */
    private boolean f30533y = false;

    /* renamed from: a */
    public final String mo17974a() {
        Uri.Builder buildUpon = Uri.parse(this.f30510b).buildUpon();
        String locale = Locale.getDefault().toString();
        this.f30519k = locale;
        buildUpon.appendQueryParameter("locale", locale);
        buildUpon.appendQueryParameter("hl", this.f30519k);
        if (!this.f30533y) {
            int i = Build.VERSION.SDK_INT;
            this.f30520l = "p_light";
        } else {
            this.f30520l = "p_dark";
        }
        buildUpon.appendQueryParameter("theme", this.f30520l);
        if (!TextUtils.isEmpty(this.f30529u) && this.f30529u.length() >= 6) {
            String substring = this.f30529u.substring(0, 6);
            this.f30521m = substring;
            buildUpon.appendQueryParameter("imsi_prefix", substring);
        }
        return buildUpon.build().toString();
    }

    /* renamed from: b */
    public final boolean mo17975b() {
        tdi.m36751a(this);
        return tdi.m36752b(this);
    }

    public final void finish() {
        switch (this.f30512d) {
            case -1:
                this.f30528t.mo26406a(this.f30511c, 52);
                break;
            case 0:
                this.f30528t.mo26406a(this.f30511c, 62);
                this.f30512d = 7;
                break;
            case 1:
                this.f30528t.mo26406a(this.f30511c, 53);
                break;
            case 2:
                this.f30528t.mo26406a(this.f30511c, 63);
                break;
            case 3:
                this.f30528t.mo26406a(this.f30511c, 64);
                break;
            case 4:
                this.f30528t.mo26406a(this.f30511c, 66);
                break;
            case 5:
                this.f30528t.mo26406a(this.f30511c, 69);
                break;
            case 6:
                this.f30528t.mo26406a(this.f30511c, 65);
                break;
            case 7:
                this.f30528t.mo26406a(this.f30511c, 67);
                break;
            default:
                this.f30528t.mo26406a(this.f30511c, 68);
                break;
        }
        setResult(this.f30512d);
        super.finish();
    }

    public final void onBackPressed() {
        WebView webView = this.f30516h;
        if (webView == null || !webView.canGoBack()) {
            finish();
        } else {
            this.f30516h.goBack();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f30518j = 0;
        boolean b = cdfk.f180651a.mo6606a().mo77392b();
        this.f30510b = cdfk.f180651a.mo6606a().mo77395e();
        int i = Build.VERSION.SDK_INT;
        this.f30533y = getIntent().getBooleanExtra("dark_theme", false);
        requestWindowFeature(1);
        getWindow().getDecorView().setSystemUiVisibility(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        if (this.f30533y) {
            getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(C0126R.color.external_consent_context_color_dark_theme)));
        }
        this.f30528t = tds.m36774a(getApplicationContext());
        this.f30526r = UUID.randomUUID();
        tdx tdx = new tdx(this.f30526r.toString(), new tdj());
        this.f30511c = tdx;
        this.f30528t.mo26406a(tdx, 51);
        if (cdfk.f180651a.mo6606a().mo77391a()) {
            if (!new HashSet(bmyx.m108640a(',').mo66925c((CharSequence) cdfk.f180651a.mo6606a().mo77393c())).contains(getCallingPackage())) {
                this.f30512d = 3;
            } else if (!mo17975b()) {
                this.f30512d = 6;
            } else if (!TextUtils.isEmpty(this.f30510b)) {
                setContentView(!b ? C0126R.C0128layout.asterism_client_consent : C0126R.C0128layout.asterism_client_consent_centered);
                this.f30525q = new gbd(getApplicationContext());
                this.f30515g = (ProgressBar) findViewById(C0126R.C0129id.c11n_tos_progress_bar);
                this.f30516h = (WebView) findViewById(C0126R.C0129id.c11n_tos_webview);
                this.f30530v = findViewById(C0126R.C0129id.c11n_tos_container);
                this.f30517i = findViewById(C0126R.C0129id.c11n_buttons_container);
                this.f30532x = (Button) findViewById(C0126R.C0129id.c11n_tos_button_agree);
                this.f30531w = (Button) findViewById(C0126R.C0129id.c11n_tos_button_no_thanks);
                if (this.f30533y) {
                    GradientDrawable gradientDrawable = (GradientDrawable) this.f30530v.getBackground();
                    gradientDrawable.mutate();
                    gradientDrawable.setColor(getResources().getColor(C0126R.color.external_consent_background_color_dark_theme));
                    ColorDrawable colorDrawable = (ColorDrawable) this.f30517i.getBackground();
                    colorDrawable.mutate();
                    colorDrawable.setColor(getResources().getColor(C0126R.color.external_consent_background_color_dark_theme));
                    this.f30516h.setBackgroundDrawable(new ColorDrawable(getResources().getColor(C0126R.color.external_consent_background_color_dark_theme)));
                    this.f30515g.setBackgroundDrawable(new ColorDrawable(getResources().getColor(C0126R.color.external_consent_background_color_dark_theme)));
                    if (!b) {
                        findViewById(C0126R.C0129id.c11n_tos_button_divider_box).setBackgroundDrawable(new ColorDrawable(getResources().getColor(C0126R.color.external_consent_background_color_dark_theme)));
                        findViewById(C0126R.C0129id.c11n_tos_button_divider).setBackgroundDrawable(new ColorDrawable(getResources().getColor(C0126R.color.external_consent_button_divider_color_dark_theme)));
                    } else {
                        this.f30532x.setTextColor(getResources().getColor(C0126R.color.external_consent_centered_button_text_color_dark_theme));
                        this.f30531w.setTextColor(getResources().getColor(C0126R.color.external_consent_buttonless_text_color_dark_theme));
                    }
                }
                this.f30516h.getSettings().setJavaScriptEnabled(true);
                this.f30516h.setWebViewClient(new tag(this));
                this.f30529u = getIntent().getStringExtra("IMSI");
                this.f30514f = new CountDownLatch(2);
                this.f30517i.setVisibility(4);
                this.f30516h.setVisibility(4);
                this.f30515g.setVisibility(8);
                this.f30531w.setOnClickListener(new szz(this, false));
                this.f30532x.setOnClickListener(new szz(this, true));
                try {
                    ((soc) this.f30527s).submit(new tad(this));
                } catch (RejectedExecutionException e) {
                    f30509a.mo25417e("Couldn't start background task", e, new Object[0]);
                    finish();
                }
                sxt.m36563a();
                sxt.m36567a(this, this.f30526r, new taf(this, this.f30513e));
                return;
            } else {
                this.f30512d = 8;
            }
        } else {
            this.f30512d = 2;
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        this.f30527s.shutdown();
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        Timer timer = new Timer("Consent progress timer");
        this.f30524p = timer;
        timer.schedule(new szt(this), 400);
        this.f30516h.loadUrl(mo17974a());
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        super.onStop();
        this.f30524p.cancel();
        this.f30524p = null;
    }
}
