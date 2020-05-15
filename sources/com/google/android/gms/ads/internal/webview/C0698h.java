package com.google.android.gms.ads.internal.webview;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Build;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.C0387d;
import com.google.android.gms.ads.internal.flag.C0410w;
import com.google.android.gms.ads.internal.safebrowsing.C0580b;
import com.google.android.gms.ads.internal.util.client.C0633h;

/* renamed from: com.google.android.gms.ads.internal.webview.h */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0698h extends WebChromeClient {

    /* renamed from: a */
    private final C0699i f9044a;

    public C0698h(C0699i iVar) {
        this.f9044a = iVar;
    }

    /* renamed from: a */
    private static final Context m5758a(WebView webView) {
        if (!(webView instanceof C0699i)) {
            return webView.getContext();
        }
        C0699i iVar = (C0699i) webView;
        Activity c = iVar.mo6918c();
        return c == null ? iVar.getContext() : c;
    }

    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof C0699i)) {
            C0633h.m5672d("Tried to close a WebView that wasn't an AdWebView.");
        } else if (((C0699i) webView).mo6921e() == null) {
            C0633h.m5672d("Tried to close an AdWebView not associated with an overlay.");
        } else {
            throw null;
        }
    }

    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String message = consoleMessage.message();
        String sourceId = consoleMessage.sourceId();
        int lineNumber = consoleMessage.lineNumber();
        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 19 + String.valueOf(sourceId).length());
        sb.append("JS: ");
        sb.append(message);
        sb.append(" (");
        sb.append(sourceId);
        sb.append(":");
        sb.append(lineNumber);
        sb.append(")");
        String sb2 = sb.toString();
        if (sb2.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i = C0697g.f9043a[consoleMessage.messageLevel().ordinal()];
        if (i == 1) {
            C0633h.m5668b(sb2);
        } else if (i == 2) {
            C0633h.m5672d(sb2);
        } else if (i == 3 || i == 4) {
            C0633h.m5670c(sb2);
        } else if (i != 5) {
            C0633h.m5670c(sb2);
        } else {
            C0633h.m5664a(sb2);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        if (this.f9044a.mo6929h() != null) {
            webView2.setWebViewClient(this.f9044a.mo6929h());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(float, float):float}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(long, long):long} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(float, float):float}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(long, long):long} */
    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        long j4;
        long j5 = 5242880 - j3;
        if (j5 > 0) {
            if (j == 0) {
                if (j2 > j5 || j2 > 1048576) {
                    j2 = 0;
                }
                j4 = j2;
            } else if (j2 == 0) {
                j4 = Math.min(j + Math.min(131072L, j5), 1048576L);
            } else {
                if (j2 <= Math.min(1048576 - j, j5)) {
                    j += j2;
                }
                j4 = j;
            }
            quotaUpdater.updateQuota(j4);
            return;
        }
        quotaUpdater.updateQuota(j);
    }

    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        boolean z;
        if (callback != null) {
            if (!C0387d.m5363a().mo6856a(this.f9044a.getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
                z = C0387d.m5363a().mo6856a(this.f9044a.getContext(), "android.permission.ACCESS_COARSE_LOCATION");
            } else {
                z = true;
            }
            callback.invoke(str, z, true);
        }
    }

    public final void onHideCustomView() {
        if (this.f9044a.mo6921e() == null) {
            C0633h.m5672d("Could not get ad overlay when hiding custom view.");
            return;
        }
        throw null;
    }

    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        mo6898a(m5758a(webView), str, str2, null, jsResult, null, false);
        return true;
    }

    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        mo6898a(m5758a(webView), str, str2, null, jsResult, null, false);
        return true;
    }

    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        mo6898a(m5758a(webView), str, str2, null, jsResult, null, false);
        return true;
    }

    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        mo6898a(m5758a(webView), str, str2, str3, null, jsPromptResult, true);
        return true;
    }

    public final void onReachedMaxAppCacheSize(long j, long j2, WebStorage.QuotaUpdater quotaUpdater) {
        long j3 = j + 131072;
        if (5242880 - j2 < j3) {
            quotaUpdater.updateQuota(0);
        } else {
            quotaUpdater.updateQuota(j3);
        }
    }

    @Deprecated
    public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        if (this.f9044a.mo6921e() == null) {
            C0633h.m5672d("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
            return;
        }
        throw null;
    }

    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        int i = Build.VERSION.SDK_INT;
        if (!((Boolean) C0410w.f8368a.mo6621a()).booleanValue()) {
            C0699i iVar = this.f9044a;
            if (iVar == null || iVar.mo6923g() == null || this.f9044a.mo6923g().mo6887c() == null) {
                super.onPermissionRequest(permissionRequest);
                return;
            }
            C0580b c = this.f9044a.mo6923g().mo6887c();
            permissionRequest.getResources();
            String[] a = c.mo6763a();
            if (a.length > 0) {
                permissionRequest.grant(a);
            } else {
                permissionRequest.deny();
            }
        } else {
            super.onPermissionRequest(permissionRequest);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6898a(Context context, String str, String str2, String str3, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        try {
            C0699i iVar = this.f9044a;
            if (iVar != null) {
                if (!(iVar.mo6923g() == null || this.f9044a.mo6923g().mo6884a() == null)) {
                    if (this.f9044a.mo6923g().mo6884a() != null) {
                        throw null;
                    }
                }
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setTitle(str);
            if (z) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                TextView textView = new TextView(context);
                textView.setText(str2);
                EditText editText = new EditText(context);
                editText.setText(str3);
                linearLayout.addView(textView);
                linearLayout.addView(editText);
                builder.setView(linearLayout).setPositiveButton(17039370, new C0696f(jsPromptResult, editText)).setNegativeButton(17039360, new C0695e(jsPromptResult)).setOnCancelListener(new C0694d(jsPromptResult)).create().show();
                return;
            }
            builder.setMessage(str2).setPositiveButton(17039370, new C0693c(jsResult)).setNegativeButton(17039360, new C0692b(jsResult)).setOnCancelListener(new C0684a(jsResult)).create().show();
        } catch (WindowManager.BadTokenException e) {
            C0633h.m5673d("Fail to display Dialog.", e);
        }
    }

    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}
