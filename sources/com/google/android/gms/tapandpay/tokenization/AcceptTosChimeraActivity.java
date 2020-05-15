package com.google.android.gms.tapandpay.tokenization;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AcceptTosChimeraActivity extends atex {

    /* renamed from: b */
    public boolean f108744b;

    /* renamed from: c */
    public boolean f108745c;

    /* renamed from: d */
    public WebView f108746d;

    /* renamed from: e */
    public Button f108747e;

    /* renamed from: f */
    ayxa f108748f;

    /* renamed from: g */
    atpf f108749g;

    /* renamed from: aX */
    public final boolean mo8629aX() {
        setResult(0);
        finish();
        return true;
    }

    /* renamed from: e */
    public final void mo59426e() {
        int scrollY = this.f108746d.getScrollY();
        int contentHeight = this.f108746d.getContentHeight();
        double d = 200.0d;
        try {
            double scale = (double) ((((int) (((float) contentHeight) * this.f108746d.getScale())) - scrollY) / this.f108746d.getMeasuredHeight());
            Double.isNaN(scale);
            d = (Math.log(scale + 1.0d) * 200.0d) / Math.log(2.0d);
        } catch (ArithmeticException e) {
        }
        this.f108746d.evaluateJavascript(String.format("androidPay_scrollToBottom(%s);", Double.valueOf(d)), null);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        setContentView((int) C0126R.C0128layout.tp_activity_accept_tos);
        String stringExtra = getIntent().getStringExtra("TOS_TITLE");
        mo8628aW().mo15853b(true);
        mo8628aW().mo15863e((int) C0126R.C0127drawable.quantum_gm_ic_close_vd_theme_24);
        mo8628aW().mo15865f((int) C0126R.string.common_dismiss);
        setTitle(stringExtra);
        mo8628aW().mo15858c(false);
        ((TextView) findViewById(C0126R.C0129id.title)).setText(stringExtra);
        findViewById(C0126R.C0129id.title).setVisibility(!TextUtils.isEmpty(stringExtra) ? 0 : 8);
        if (bundle != null) {
            this.f108744b = bundle.getBoolean("IS_ACCEPT_ON_LOAD", false);
        }
        this.f108746d = (WebView) findViewById(C0126R.C0129id.web_view);
        this.f108747e = (Button) findViewById(C0126R.C0129id.more_or_accept_button);
        if (getIntent().getBooleanExtra("EXTRA_USE_SUW_UI", false) && cgwn.m147270t()) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f108747e.getLayoutParams();
            layoutParams.gravity = 8388613;
            this.f108747e.setLayoutParams(layoutParams);
            float dimension = getResources().getDimension(C0126R.dimen.tp_default_spacing);
            int[] iArr = {C0126R.C0129id.title, C0126R.C0129id.WebViewContainer};
            int i2 = (int) dimension;
            for (int i3 = 0; i3 < 2; i3++) {
                View findViewById = findViewById(iArr[i3]);
                if (findViewById != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById.getLayoutParams();
                    marginLayoutParams.setMarginStart(i2);
                    marginLayoutParams.setMarginEnd(i2);
                    findViewById.setLayoutParams(marginLayoutParams);
                }
            }
        }
        if (this.f108744b) {
            Button button = this.f108747e;
            if (!cgwn.m147270t()) {
                i = C0126R.string.accept_and_continue_label;
            } else {
                i = C0126R.string.accept_label;
            }
            button.setText(i);
            this.f108745c = true;
        }
        this.f108747e.setOnClickListener(new atox(this));
        this.f108746d.setWebViewClient(new atpa(this));
        this.f108746d.setHorizontalScrollBarEnabled(false);
        this.f108746d.getSettings().setJavaScriptEnabled(true);
        this.f108746d.addJavascriptInterface(new atoy(this), "androidPayPageHandler");
        String stringExtra2 = getIntent().getStringExtra("TOS_URL");
        if (stringExtra2 != null) {
            this.f108746d.loadUrl(stringExtra2);
        } else {
            try {
                this.f108746d.loadData(URLEncoder.encode(getIntent().getStringExtra("TOS_CONTENT"), "UTF-8").replaceAll("\\+", "%20"), String.valueOf(getIntent().getStringExtra("TOS_CONTENT_TYPE")).concat("; charset=UTF-8"), "url-encoded-if-binary");
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
        }
        if (this.f108749g == null) {
            atpe atpe = new atpe();
            alir a = aliq.m60909a();
            cazf.m127594a(a);
            atpe.f90627a = a;
            cazf.m127595a(atpe.f90627a, alir.class);
            this.f108749g = new atpf(atpe.f90627a);
        }
        ayxa a2 = this.f108749g.f90628a.mo40366a();
        cazf.m127593a(a2, "Cannot return null from a non-@Nullable component method");
        this.f108748f = a2;
        AccountInfo accountInfo = (AccountInfo) getIntent().getParcelableExtra("extra_account_info");
        if (cgwn.m147275y() && accountInfo != null) {
            aywx a3 = this.f108748f.f98673b.mo54504a(92630);
            a3.mo54481a(ayxb.m85017a(accountInfo.f108326b));
            a3.mo54503a(getContainerActivity());
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("IS_ACCEPT_ON_LOAD", this.f108745c);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        asjl.m74236a(this, "Accept TOS");
    }
}
