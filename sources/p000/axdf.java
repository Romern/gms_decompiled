package p000;

import android.os.Bundle;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;

/* renamed from: axdf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axdf extends axcs {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo51901a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a = super.mo51901a(layoutInflater, viewGroup, bundle);
        this.f124361c.f152238a.addJavascriptInterface(this, "comGoogleAndroidGmsWalletWebviewWebViewComponent");
        WebSettings settings = this.f124361c.f152238a.getSettings();
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        return a;
    }

    /* renamed from: bR */
    public final boolean mo52775bR() {
        return false;
    }

    @JavascriptInterface
    public void completeFlowWithCallbackData(String str) {
        byte[] decode = Base64.decode(str, 8);
        Bundle bundle = new Bundle();
        bundle.putByteArray("EventListener.EXTRA_WEBVIEW_COMPONENT_COMPLETE_WITH_CALLBACK_DATA", decode);
        mo51905a(23, bundle);
    }

    @JavascriptInterface
    public void completeFlowWithError(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("EventListener.EXTRA_WEBVIEW_COMPONENT_COMPLETE_WITH_ERROR", str);
        mo51905a(24, bundle);
    }

    @JavascriptInterface
    public void setPageTitle(String str) {
        getActivity().runOnUiThread(new axde(this, str));
    }
}
