package p000;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.view.inputmethod.InputMethodManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.android.chimera.ActivityBase;
import com.google.android.gms.notifications.GunsBrowserChimeraActivity;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: akob */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akob {

    /* renamed from: a */
    private final Context f72335a;

    /* renamed from: b */
    private final WebView f72336b;

    /* renamed from: c */
    private final InputMethodManager f72337c;

    /* renamed from: d */
    private final boolean f72338d;

    /* renamed from: e */
    private final akoa f72339e;

    /* renamed from: f */
    private String f72340f = null;

    /* renamed from: g */
    private int f72341g;

    public akob(Context context, akoa akoa, WebView webView) {
        TelephonyManager telephonyManager;
        int i = Build.VERSION.SDK_INT;
        this.f72335a = context;
        this.f72339e = akoa;
        this.f72336b = webView;
        this.f72337c = (InputMethodManager) context.getSystemService("input_method");
        boolean c = spn.m35874c(this.f72335a);
        this.f72338d = c;
        if (c && (telephonyManager = (TelephonyManager) this.f72335a.getSystemService("phone")) != null) {
            if (telephonyManager.getLine1Number() != null) {
                this.f72340f = telephonyManager.getLine1Number();
            }
            this.f72341g = telephonyManager.getSimState();
        }
    }

    @JavascriptInterface
    public void fetchIIDToken(String str) {
        akoa akoa = this.f72339e;
        new aknq((GunsBrowserChimeraActivity) akoa, ((ActivityBase) akoa).getApplicationContext(), str).start();
    }

    @JavascriptInterface
    public void fetchVerifiedPhoneNumber(String str) {
        akoa akoa = this.f72339e;
        sxs sxs = new sxs(((ActivityBase) akoa).getContainerActivity());
        Bundle bundle = new Bundle();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle.putString(next, jSONObject.getString(next));
            }
        } catch (JSONException e) {
            bnsl bnsl = (bnsl) GunsBrowserChimeraActivity.f81201a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68405a("Failed to parse phone verification params json.");
        }
        aucb a = sxs.mo26222a(bundle);
        GunsBrowserChimeraActivity gunsBrowserChimeraActivity = (GunsBrowserChimeraActivity) akoa;
        a.mo50373a(new akns(gunsBrowserChimeraActivity));
        a.mo50372a(new aknr(gunsBrowserChimeraActivity));
    }

    @JavascriptInterface
    public String getAndroidId() {
        long a = spn.m35843a(this.f72335a);
        if (a != 0) {
            return Long.toHexString(a);
        }
        return null;
    }

    @JavascriptInterface
    public int getBuildVersionSdk() {
        return Build.VERSION.SDK_INT;
    }

    @JavascriptInterface
    public String getPhoneNumber() {
        return this.f72340f;
    }

    @JavascriptInterface
    public int getPlayServicesVersionCode() {
        return 201515033;
    }

    @JavascriptInterface
    public int getSimState() {
        return this.f72341g;
    }

    @JavascriptInterface
    public boolean hasPhoneNumber() {
        return this.f72340f != null;
    }

    @JavascriptInterface
    public boolean hasTelephony() {
        return this.f72338d;
    }

    @JavascriptInterface
    public void hideKeyboard() {
        this.f72337c.hideSoftInputFromWindow(this.f72336b.getWindowToken(), 0);
    }

    @JavascriptInterface
    public void showKeyboard() {
        this.f72337c.showSoftInput(this.f72336b, 1);
    }
}
