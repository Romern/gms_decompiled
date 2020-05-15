package com.google.android.gms.recaptcha;

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
    public static String f83485j = "https://www.google.com/recaptcha/api2/mframe";

    /* renamed from: k */
    public static long f83486k = TimeUnit.MINUTES.toMillis(2);

    /* renamed from: a */
    public String f83487a;

    /* renamed from: b */
    public int f83488b;

    /* renamed from: c */
    public int f83489c;

    /* renamed from: d */
    public float f83490d;

    /* renamed from: e */
    public LinearLayout f83491e;

    /* renamed from: f */
    public WebView f83492f;

    /* renamed from: g */
    public ResultReceiver f83493g;

    /* renamed from: h */
    public long f83494h;

    /* renamed from: i */
    public boolean f83495i;

    /* renamed from: l */
    private aorf f83496l = null;

    /* renamed from: m */
    private ScheduledExecutorService f83497m;

    /* renamed from: b */
    public final void mo46808b() {
        mo46806a("Session Timeout", 15);
        finish();
    }

    /* renamed from: c */
    public final aorf mo46810c() {
        if (this.f83496l == null) {
            this.f83496l = new aorf();
        }
        return this.f83496l;
    }

    public final void finish() {
        if (this.f83492f != null) {
            mo46809b(0, 0, false);
        }
        synchronized (this) {
            ScheduledExecutorService scheduledExecutorService = this.f83497m;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
                this.f83497m = null;
            }
        }
        super.finish();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.recaptcha.RecaptchaChimeraActivity.a(java.lang.StringBuilder, java.lang.String, boolean):void
     arg types: [java.lang.StringBuilder, java.lang.String, int]
     candidates:
      com.google.android.gms.recaptcha.RecaptchaChimeraActivity.a(int, int, boolean):void
      com.google.android.gms.recaptcha.RecaptchaChimeraActivity.a(java.lang.Runnable, long, java.util.concurrent.TimeUnit):void
      com.google.android.gms.recaptcha.RecaptchaChimeraActivity.a(java.lang.StringBuilder, java.lang.String, boolean):void */
    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        ResultReceiver resultReceiver = (ResultReceiver) intent.getParcelableExtra("result");
        this.f83493g = resultReceiver;
        if (resultReceiver != null) {
            this.f83487a = intent.getStringExtra("params");
            requestWindowFeature(1);
            setContentView((int) C0126R.C0128layout.recaptcha_activity);
            this.f83491e = (LinearLayout) findViewById(C0126R.C0129id.recaptcha_loading_layout);
            WebView webView = (WebView) findViewById(C0126R.C0129id.recaptcha_webview);
            this.f83492f = webView;
            int i = Build.VERSION.SDK_INT;
            webView.setWebViewClient(new aoqj(this));
            WebSettings settings = this.f83492f.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setUseWideViewPort(true);
            settings.setSupportZoom(false);
            settings.setDisplayZoomControls(false);
            settings.setCacheMode(2);
            this.f83492f.addJavascriptInterface(new aoql(this), "RecaptchaEmbedder");
            this.f83492f.setVisibility(8);
            if (!sre.m36081a(getResources())) {
                int i2 = Build.VERSION.SDK_INT;
                setRequestedOrientation(1);
            }
            this.f83497m = snp.m35703a(1, 9);
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            this.f83490d = displayMetrics.density;
            this.f83488b = displayMetrics.widthPixels;
            this.f83489c = (displayMetrics.heightPixels - spa.m35814a(getContainerActivity())) - ((int) (this.f83490d * 20.0f));
            mo46803a();
            mo46805a(new aoqn(this), f83486k, TimeUnit.MILLISECONDS);
            mo46807a(new StringBuilder(this.f83487a), "frame", true);
            return;
        }
        finish();
    }

    /* renamed from: a */
    public final void mo46803a() {
        this.f83494h = SystemClock.elapsedRealtime();
    }

    /* renamed from: b */
    public final void mo46809b(int i, int i2, boolean z) {
        runOnUiThread(new aoqe(this, i, i2, z));
    }

    /* renamed from: a */
    public final void mo46804a(int i, int i2, boolean z) {
        runOnUiThread(new aoqc(this, Math.min((int) (((float) i) * this.f83490d), this.f83488b), Math.min((int) (((float) i2) * this.f83490d), this.f83489c), z));
    }

    /* renamed from: a */
    public final void mo46805a(Runnable runnable, long j, TimeUnit timeUnit) {
        synchronized (this) {
            ScheduledExecutorService scheduledExecutorService = this.f83497m;
            if (scheduledExecutorService != null) {
                ((sny) scheduledExecutorService).schedule(runnable, j, timeUnit);
            }
        }
    }

    /* renamed from: a */
    public final void mo46806a(String str, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("error", str);
        bundle.putInt("errorCode", i);
        this.f83493g.send(i, bundle);
    }

    /* renamed from: a */
    public final void mo46807a(StringBuilder sb, String str, boolean z) {
        aore.m66306a(sb, "mt", String.valueOf(System.currentTimeMillis()));
        new soa(9, new aoqg(this, str, sb.toString(), z)).start();
    }
}
