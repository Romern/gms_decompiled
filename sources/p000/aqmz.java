package p000;

import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;

/* renamed from: aqmz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqmz extends CookieManager {
    public final boolean acceptCookie() {
        return false;
    }

    public final boolean acceptThirdPartyCookies(WebView webView) {
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean allowFileSchemeCookiesImpl() {
        return false;
    }

    public final void flush() {
    }

    public final String getCookie(String str) {
        return null;
    }

    public final String getCookie(String str, boolean z) {
        return null;
    }

    public final boolean hasCookies() {
        return false;
    }

    public final boolean hasCookies(boolean z) {
        return false;
    }

    public final void removeAllCookie() {
    }

    public final void removeAllCookies(ValueCallback valueCallback) {
    }

    public final void removeExpiredCookie() {
    }

    public final void removeSessionCookie() {
    }

    public final void removeSessionCookies(ValueCallback valueCallback) {
    }

    public final void setAcceptCookie(boolean z) {
    }

    /* access modifiers changed from: protected */
    public final void setAcceptFileSchemeCookiesImpl(boolean z) {
    }

    public final void setAcceptThirdPartyCookies(WebView webView, boolean z) {
    }

    public final void setCookie(String str, String str2) {
    }

    public final void setCookie(String str, String str2, ValueCallback valueCallback) {
    }
}
