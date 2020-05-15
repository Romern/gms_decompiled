package com.google.android.wallet.redirect;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.p002v7.widget.Toolbar;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.wallet.clientlog.LogContext;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class StartAndroidAppRedirectActivity extends deu implements Runnable, View.OnClickListener, ciqx {

    /* renamed from: b */
    ViewGroup f151835b;

    /* renamed from: c */
    View f151836c;

    /* renamed from: d */
    ImageView f151837d;

    /* renamed from: e */
    Handler f151838e;

    /* renamed from: f */
    private boolean f151839f;

    /* renamed from: g */
    private boolean f151840g;

    /* renamed from: h */
    private ciqw f151841h;

    /* renamed from: a */
    public static Intent m118364a(Context context, Uri uri) {
        Intent intent = new Intent(context, StartAndroidAppRedirectActivity.class);
        intent.setAction("com.google.android.wallet.redirect.intent.action.FINISH_REDIRECT");
        intent.setData(uri);
        intent.addFlags(67108864);
        return intent;
    }

    /* renamed from: e */
    private final void m118366e() {
        this.f151836c.setVisibility(4);
        this.f151835b.setVisibility(0);
        setTitle((int) C0126R.string.wallet_uic_android_app_redirect_canceled_title);
    }

    /* renamed from: G */
    public final void mo65398G() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo59965b(Intent intent) {
        setTheme(intent.getIntExtra("activityThemeResId", -1));
    }

    public void onClick(View view) {
        m118365a(62);
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        aymt.m84282a(getApplicationContext());
        bdyx.m91614a(getApplicationContext());
        Intent intent = getIntent();
        if ("com.google.android.wallet.redirect.intent.action.FINISH_REDIRECT".equals(intent.getAction())) {
            Log.i("StartAndroidAppRedirect", "Ignoring unexpected finish redirect intent");
            super.onCreate(bundle);
            finish();
            return;
        }
        mo59965b(intent);
        intent.getByteArrayExtra("logToken");
        LogContext logContext = (LogContext) intent.getParcelableExtra("parentLogContext");
        this.f151840g = intent.hasExtra("startAndroidAppIntent");
        if (bundle != null) {
            this.f151839f = bundle.getBoolean("startingAndroidAppRedirect");
        } else {
            this.f151839f = true;
        }
        if (this.f151840g) {
            super.onCreate(bundle);
            setContentView((int) C0126R.C0128layout.activity_start_android_app_redirect);
            mo8626a((Toolbar) findViewById(C0126R.C0129id.toolbar));
            mo8628aW().mo15853b(true);
            setTitle((int) C0126R.string.wallet_uic_android_app_redirect_indeterminate_title);
            this.f151835b = (ViewGroup) findViewById(C0126R.C0129id.message_and_button_container);
            this.f151836c = ((ViewStub) findViewById(C0126R.C0129id.loading_progress)).inflate();
            mo59964a(this.f151835b).setOnClickListener(this);
            this.f151837d = (ImageView) findViewById(C0126R.C0129id.logo);
            TypedArray obtainStyledAttributes = obtainStyledAttributes(new int[]{C0126R.attr.uicPopupRedirectIntegratorLogoDrawable});
            TypedValue peekValue = obtainStyledAttributes.peekValue(0);
            obtainStyledAttributes.recycle();
            bkfr.m105566a(this.f151837d, peekValue);
            if (bundle != null && bundle.getBoolean("showingCanceledText", false)) {
                m118366e();
            }
            if (this.f151839f) {
                Intent intent2 = (Intent) getIntent().getParcelableExtra("startAndroidAppIntent");
                if (intent2 == null) {
                    Log.e("StartAndroidAppRedirect", "Starting Activity without a redirect Intent");
                    m118365a(60);
                    finish();
                    return;
                }
                startActivity(intent2);
            }
            this.f151838e = new adzt(Looper.getMainLooper());
            return;
        }
        super.onCreate(bundle);
        if (this.f151839f) {
            ciqw ciqw = new ciqw(this);
            this.f151841h = ciqw;
            if (!ahi.m752a(this, "com.android.chrome", ciqw)) {
                m118365a(63);
                finish();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        super.onDestroy();
        ciqw ciqw = this.f151841h;
        if (ciqw != null) {
            unbindService(ciqw);
            this.f151841h = null;
        }
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (!"com.google.android.wallet.redirect.intent.action.FINISH_REDIRECT".equals(intent.getAction()) || intent.getData() == null) {
            Log.e("StartAndroidAppRedirect", String.format("onNewIntent() with action: %s and data: %s", intent.getAction(), intent.getData()));
            m118365a(61);
        } else {
            Intent intent2 = new Intent();
            intent2.setData(intent.getData());
            setResult(-1, intent2);
        }
        finish();
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        m118365a(62);
        finish();
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        super.onPause();
        this.f151839f = false;
        if (this.f151840g) {
            this.f151838e.removeCallbacks(this);
        }
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        if (this.f151839f) {
            return;
        }
        if (!this.f151840g) {
            m118365a(62);
            finish();
        } else if (this.f151836c.getVisibility() == 0) {
            this.f151838e.postDelayed(this, ((Long) bjwe.f123493n.mo54082a()).longValue());
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        boolean z;
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("startingAndroidAppRedirect", this.f151839f);
        if (this.f151840g) {
            if (this.f151835b.getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            bundle.putBoolean("showingCanceledText", z);
        }
    }

    public final void run() {
        if (((bmkd) bjvp.m104729a(getIntent(), "androidAppInfo", (bxxk) bmkd.f129781l.mo74142c(7))).f129793k) {
            m118365a(62);
            finish();
            return;
        }
        m118366e();
    }

    /* renamed from: a */
    private final void m118365a(int i) {
        Intent intent = new Intent();
        intent.putExtra("analyticsResult", i);
        setResult(0, intent);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo59964a(ViewGroup viewGroup) {
        return LayoutInflater.from(this).inflate((int) C0126R.C0128layout.view_start_android_app_redirect_ok_button, viewGroup).findViewById(C0126R.C0129id.ok_button);
    }

    /* renamed from: a */
    public final void mo65399a(ahi ahi) {
        ahj ahj = new ahj(ahi.mo702a(new bjxq()));
        TypedArray obtainStyledAttributes = getTheme().obtainStyledAttributes(new int[]{C0126R.attr.colorPrimary});
        int color = obtainStyledAttributes.getColor(0, -3355444);
        obtainStyledAttributes.recycle();
        ahj.mo704a(color);
        ahj.mo705b();
        ahk a = ahj.mo703a();
        ciqv.m150908a(this, a.f545a);
        a.f545a.setFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS);
        a.mo706a(this, Uri.parse(getIntent().getStringExtra("initialUrl")));
    }
}
