package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.io.UnsupportedEncodingException;

/* renamed from: bjnk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjnk extends bjyr implements View.OnKeyListener, bjyk {

    /* renamed from: a */
    bjyl f123008a;

    /* renamed from: b */
    String f123009b;

    /* renamed from: c */
    String f123010c;

    /* renamed from: d */
    boolean f123011d;

    /* renamed from: e */
    boolean f123012e;

    /* renamed from: f */
    public bjnj f123013f;

    public bjnk(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo65388a() {
    }

    /* renamed from: a */
    public final void mo65390a(WebView webView) {
    }

    /* renamed from: b */
    public final void mo65393b(WebView webView) {
        bjnj bjnj = this.f123013f;
        if (bjnj != null) {
            ((bjnn) ((bjjm) bjnj).f122830n).mo65105a(bwsm.f160881c, 1);
        }
        this.f123011d = true;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bjyl bjyl = this.f123008a;
        if (bjyl != null) {
            setWebViewClient(bjyl);
            setOnKeyListener(this);
            WebSettings settings = getSettings();
            settings.setSupportZoom(true);
            settings.setJavaScriptEnabled(true);
            settings.setAllowFileAccess(false);
            settings.setBuiltInZoomControls(true);
            settings.setDisplayZoomControls(false);
            settings.setDomStorageEnabled(true);
            this.f123012e = true;
            if (TextUtils.isEmpty(getOriginalUrl())) {
                this.f123011d = false;
                if (!TextUtils.isEmpty(this.f123009b)) {
                    mo65392a(this.f123009b, this.f123010c);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("A webViewClient needs to be set on the web view.");
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (i != 4 || !canGoBack()) {
            return false;
        }
        goBack();
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            super.onRestoreInstanceState(bundle.getParcelable("superSavedInstanceState"));
            boolean z = bundle.getBoolean("pageLoaded");
            this.f123011d = z;
            if (!z || restoreState(bundle) == null) {
                this.f123011d = false;
                mo65392a(this.f123009b, this.f123010c);
                return;
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public final /* bridge */ /* synthetic */ Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("superSavedInstanceState", super.onSaveInstanceState());
        bundle.putBoolean("pageLoaded", this.f123011d);
        if (this.f123011d) {
            saveState(bundle);
        }
        return bundle;
    }

    /* renamed from: a */
    public final void mo65389a(Message message) {
        message.sendToTarget();
    }

    /* renamed from: a */
    public final void mo65391a(WebView webView, String str) {
        bjnj bjnj = this.f123013f;
        if (bjnj != null) {
            ((bjnn) ((bjjm) bjnj).f122830n).mo65105a(bwsm.f160881c, 2);
        }
    }

    /* renamed from: a */
    public final void mo65392a(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            loadUrl(str);
            return;
        }
        try {
            postUrl(str, str2.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Couldn't post to url: ") : "Couldn't post to url: ".concat(valueOf));
        }
    }
}
