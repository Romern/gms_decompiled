package com.google.android.gms.security.recaptcha;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.webkit.WebSettings;
import android.widget.LinearLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.WebView;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RecaptchaChimeraActivity extends Activity {

    /* renamed from: j */
    public static String f107498j = "https://www.google.com/recaptcha/api2/mframe";

    /* renamed from: k */
    public static long f107499k = TimeUnit.MINUTES.toMillis(2);

    /* renamed from: a */
    public String f107500a;

    /* renamed from: b */
    public int f107501b;

    /* renamed from: c */
    public int f107502c;

    /* renamed from: d */
    public float f107503d;

    /* renamed from: e */
    public LinearLayout f107504e;

    /* renamed from: f */
    public WebView f107505f;

    /* renamed from: g */
    public ResultReceiver f107506g;

    /* renamed from: h */
    public long f107507h;

    /* renamed from: i */
    public boolean f107508i;

    /* renamed from: l */
    private apvo f107509l = null;

    /* renamed from: m */
    private ScheduledExecutorService f107510m;

    /* renamed from: b */
    public final void mo58929b() {
        mo58927a("Session Timeout", 15);
        finish();
    }

    /* renamed from: c */
    public final apvo mo58931c() {
        if (this.f107509l == null) {
            this.f107509l = new apvo();
        }
        return this.f107509l;
    }

    public final void finish() {
        if (this.f107505f != null) {
            mo58930b(0, 0, false);
        }
        synchronized (this) {
            ScheduledExecutorService scheduledExecutorService = this.f107510m;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
                this.f107510m = null;
            }
        }
        super.finish();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.security.recaptcha.RecaptchaChimeraActivity.a(java.lang.StringBuilder, java.lang.String, boolean):void
     arg types: [java.lang.StringBuilder, java.lang.String, int]
     candidates:
      com.google.android.gms.security.recaptcha.RecaptchaChimeraActivity.a(int, int, boolean):void
      com.google.android.gms.security.recaptcha.RecaptchaChimeraActivity.a(java.lang.Runnable, long, java.util.concurrent.TimeUnit):void
      com.google.android.gms.security.recaptcha.RecaptchaChimeraActivity.a(java.lang.StringBuilder, java.lang.String, boolean):void */
    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        ResultReceiver resultReceiver = (ResultReceiver) intent.getParcelableExtra("result");
        this.f107506g = resultReceiver;
        if (resultReceiver != null) {
            this.f107500a = intent.getStringExtra("params");
            requestWindowFeature(1);
            setContentView((int) C0126R.C0128layout.recaptcha_activity);
            this.f107504e = (LinearLayout) findViewById(C0126R.C0129id.recaptcha_loading_layout);
            WebView webView = (WebView) findViewById(C0126R.C0129id.recaptcha_webview);
            this.f107505f = webView;
            int i = Build.VERSION.SDK_INT;
            webView.setWebViewClient(new apvg(this));
            WebSettings settings = this.f107505f.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setUseWideViewPort(true);
            settings.setSupportZoom(false);
            settings.setDisplayZoomControls(false);
            settings.setCacheMode(2);
            this.f107505f.addJavascriptInterface(new apvi(this), "RecaptchaEmbedder");
            this.f107505f.setVisibility(8);
            if (!sre.m36081a(getResources())) {
                int i2 = Build.VERSION.SDK_INT;
                setRequestedOrientation(1);
            }
            this.f107510m = snp.m35703a(1, 9);
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            this.f107503d = displayMetrics.density;
            this.f107501b = displayMetrics.widthPixels;
            this.f107502c = (displayMetrics.heightPixels - spa.m35814a(getContainerActivity())) - ((int) (this.f107503d * 20.0f));
            mo58924a();
            mo58926a(new apvk(this), f107499k, TimeUnit.MILLISECONDS);
            mo58928a(new StringBuilder(this.f107500a), "frame", true);
            return;
        }
        finish();
    }

    /* renamed from: a */
    public final void mo58924a() {
        this.f107507h = SystemClock.elapsedRealtime();
    }

    /* renamed from: b */
    public final void mo58930b(int i, int i2, boolean z) {
        runOnUiThread(new apvb(this, i, i2, z));
    }

    /* renamed from: a */
    public final void mo58925a(int i, int i2, boolean z) {
        runOnUiThread(new apuz(this, Math.min((int) (((float) i) * this.f107503d), this.f107501b), Math.min((int) (((float) i2) * this.f107503d), this.f107502c), z));
    }

    /* renamed from: a */
    public final void mo58926a(Runnable runnable, long j, TimeUnit timeUnit) {
        synchronized (this) {
            ScheduledExecutorService scheduledExecutorService = this.f107510m;
            if (scheduledExecutorService != null) {
                ((sny) scheduledExecutorService).schedule(runnable, j, timeUnit);
            }
        }
    }

    /* renamed from: a */
    public final void mo58927a(String str, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("error", str);
        bundle.putInt("errorCode", i);
        this.f107506g.send(i, bundle);
    }

    /* renamed from: a */
    public final void mo58928a(StringBuilder sb, String str, boolean z) {
        apum.m71046a(sb, "mt", String.valueOf(System.currentTimeMillis()));
        new soa(9, new apvd(this, str, sb.toString(), z)).start();
    }
}
