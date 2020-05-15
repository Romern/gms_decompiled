package com.google.android.wallet.p097ui.common;

import android.app.DownloadManager;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStub;
import android.webkit.DownloadListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.wallet.ui.common.WebViewLayout */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WebViewLayout extends RelativeLayout implements View.OnKeyListener, View.OnTouchListener, View.OnClickListener, DownloadListener, bjer, bjyk {

    /* renamed from: a */
    public WebView f152238a;

    /* renamed from: b */
    ProgressBar f152239b;

    /* renamed from: c */
    public View f152240c;

    /* renamed from: d */
    public TextView f152241d;

    /* renamed from: e */
    ImageButton f152242e;

    /* renamed from: f */
    public View f152243f;

    /* renamed from: g */
    public TextView f152244g;

    /* renamed from: h */
    public View f152245h;

    /* renamed from: i */
    public String f152246i;

    /* renamed from: j */
    public String f152247j;

    /* renamed from: k */
    public bjyl f152248k = new bjyl(this);

    /* renamed from: l */
    public int f152249l = 1;

    /* renamed from: m */
    public int f152250m = 2;

    /* renamed from: n */
    private boolean f152251n;

    /* renamed from: o */
    private boolean f152252o;

    /* renamed from: p */
    private String f152253p;

    /* renamed from: q */
    private String f152254q;

    /* renamed from: r */
    private bjyq f152255r;

    public WebViewLayout(Context context) {
        super(context);
        new bjes(1630);
    }

    /* renamed from: b */
    private final void m118771b(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            this.f152238a.loadUrl(str);
            return;
        }
        try {
            this.f152238a.postUrl(str, str2.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            if (!((Boolean) bjwe.f123489j.mo54082a()).booleanValue()) {
                String valueOf = String.valueOf(str);
                throw new IllegalStateException(valueOf.length() == 0 ? new String("Couldn't post to url: ") : "Couldn't post to url: ".concat(valueOf));
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(str2).length());
            sb.append("Couldn't post to url: ");
            sb.append(str);
            sb.append(" with data: ");
            sb.append(str2);
            throw new IllegalStateException(sb.toString(), e);
        }
    }

    /* renamed from: c */
    private final void m118772c(WebView webView) {
        this.f152243f.setVisibility(8);
        this.f152255r.mo65649a(true);
        if (this.f152240c.getVisibility() != 0 && webView.getVisibility() != 0) {
            webView.setVisibility(0);
            webView.scrollTo(0, 0);
        }
    }

    /* renamed from: a */
    public final void mo65388a() {
        this.f152243f.setVisibility(8);
        this.f152255r.mo65649a(true);
        this.f152240c.setVisibility(0);
        this.f152238a.setVisibility(4);
        this.f152251n = false;
    }

    /* renamed from: bV */
    public final List mo52777bV() {
        View view = this.f152245h;
        if (view instanceof bjer) {
            return Collections.singletonList(view);
        }
        return null;
    }

    /* renamed from: bZ */
    public final void mo52779bZ() {
    }

    /* renamed from: co */
    public final bjes mo51919co() {
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f152252o = true;
        if (TextUtils.isEmpty(this.f152238a.getOriginalUrl())) {
            this.f152251n = false;
            if (!TextUtils.isEmpty(this.f152253p)) {
                m118771b(this.f152253p, this.f152254q);
            }
        }
        if (this.f152239b == null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{C0126R.attr.internalUicWebViewProgressBarId});
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            obtainStyledAttributes.recycle();
            if (resourceId != 0) {
                this.f152239b = (ProgressBar) getRootView().findViewById(resourceId);
            }
            if (this.f152239b == null) {
                this.f152239b = (ProgressBar) findViewById(C0126R.C0129id.progress_bar_web_view);
            }
            bjyq bjyq = this.f152255r;
            bjyq.f123653a = this.f152239b;
            bjyq.f123653a.setMax(100);
            bjyq.mo65647a();
        }
    }

    public void onClick(View view) {
        if (view == this.f152242e) {
            this.f152240c.setVisibility(8);
            this.f152238a.setVisibility(0);
            this.f152238a.reload();
        }
    }

    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setNotificationVisibility(1);
        ((DownloadManager) this.f152238a.getContext().getSystemService("download")).enqueue(request);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        int i;
        super.onFinishInflate();
        View findViewById = findViewById(C0126R.C0129id.error_overlay);
        this.f152240c = findViewById;
        this.f152241d = (TextView) findViewById.findViewById(C0126R.C0129id.error_msg);
        if (!TextUtils.isEmpty(this.f152247j)) {
            this.f152241d.setText(this.f152247j);
        }
        ImageButton imageButton = (ImageButton) this.f152240c.findViewById(C0126R.C0129id.refresh_button);
        this.f152242e = imageButton;
        imageButton.setOnClickListener(this);
        View findViewById2 = findViewById(C0126R.C0129id.loading_overlay);
        this.f152243f = findViewById2;
        ((ViewStub) findViewById2.findViewById(C0126R.C0129id.loading_progress)).inflate();
        TextView textView = (TextView) this.f152243f.findViewById(C0126R.C0129id.loading_msg);
        this.f152244g = textView;
        textView.setText(this.f152246i);
        TextView textView2 = this.f152244g;
        if (!TextUtils.isEmpty(this.f152246i)) {
            i = 0;
        } else {
            i = 8;
        }
        textView2.setVisibility(i);
        try {
            this.f152238a = new bjyr(getContext());
        } catch (Resources.NotFoundException e) {
            this.f152238a = new bjyr(getContext().getApplicationContext());
        }
        this.f152238a.setLayoutParams(mo72120b());
        this.f152238a.setId(C0126R.C0129id.web_view_layout_web_view);
        this.f152238a.setVisibility(4);
        this.f152238a.setOnKeyListener(this);
        this.f152238a.setOnTouchListener(this);
        WebSettings settings = this.f152238a.getSettings();
        settings.setSupportZoom(true);
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setBuiltInZoomControls(true);
        this.f152238a.setDownloadListener(this);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(true);
        this.f152238a.setWebViewClient(this.f152248k);
        bjyq bjyq = new bjyq(this.f152238a.getContext());
        this.f152255r = bjyq;
        this.f152238a.setWebChromeClient(bjyq);
        addView(this.f152238a, 0);
        this.f152238a.requestFocus();
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (i != 4 || !this.f152238a.canGoBack()) {
            return false;
        }
        this.f152238a.goBack();
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("superSavedInstanceState"));
        boolean z = bundle.getBoolean("pageLoaded");
        this.f152251n = z;
        if (!z || this.f152238a.restoreState(bundle) == null) {
            this.f152251n = false;
            m118771b(this.f152253p, this.f152254q);
        }
    }

    public final /* bridge */ /* synthetic */ Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("superSavedInstanceState", super.onSaveInstanceState());
        bundle.putBoolean("pageLoaded", this.f152251n);
        if (this.f152251n) {
            this.f152238a.saveState(bundle);
        }
        return bundle;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() <= 1) {
            return false;
        }
        view.getParent().requestDisallowInterceptTouchEvent(true);
        return false;
    }

    /* renamed from: a */
    public final void mo65389a(Message message) {
        message.sendToTarget();
    }

    /* renamed from: a */
    public final void mo65390a(WebView webView) {
        if (!this.f152251n && this.f152250m == 3) {
            m118772c(webView);
        }
    }

    public WebViewLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new bjes(1630);
    }

    /* renamed from: a */
    public final void mo65391a(WebView webView, String str) {
        if (!str.equals(this.f152253p)) {
            return;
        }
        if (this.f152250m != 4) {
            this.f152243f.setVisibility(0);
            this.f152255r.mo65649a(false);
            webView.setVisibility(8);
            return;
        }
        m118772c(webView);
    }

    public WebViewLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new bjes(1630);
    }

    /* renamed from: a */
    public final void mo72119a(String str, String str2) {
        if (!this.f152252o) {
            this.f152253p = str;
            this.f152254q = str2;
            return;
        }
        m118771b(str, str2);
    }

    /* renamed from: b */
    public final RelativeLayout.LayoutParams mo72120b() {
        if (this.f152249l != 2) {
            return new RelativeLayout.LayoutParams(-2, -2);
        }
        return new RelativeLayout.LayoutParams(-1, -1);
    }

    /* renamed from: b */
    public final void mo65393b(WebView webView) {
        m118772c(webView);
        this.f152251n = true;
    }

    public WebViewLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        new bjes(1630);
    }
}
