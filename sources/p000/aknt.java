package p000;

import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.notifications.GunsBrowserChimeraActivity;

/* renamed from: aknt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aknt extends WebViewClient {

    /* renamed from: a */
    final /* synthetic */ GunsBrowserChimeraActivity f72318a;

    public aknt(GunsBrowserChimeraActivity gunsBrowserChimeraActivity) {
        this.f72318a = gunsBrowserChimeraActivity;
    }

    public final void onPageFinished(WebView webView, String str) {
        GunsBrowserChimeraActivity gunsBrowserChimeraActivity = this.f72318a;
        srn srn = GunsBrowserChimeraActivity.f81201a;
        gunsBrowserChimeraActivity.f81206e.setVisibility(8);
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        GunsBrowserChimeraActivity gunsBrowserChimeraActivity = this.f72318a;
        srn srn = GunsBrowserChimeraActivity.f81201a;
        gunsBrowserChimeraActivity.f81206e.setVisibility(0);
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        GunsBrowserChimeraActivity gunsBrowserChimeraActivity = this.f72318a;
        srn srn = GunsBrowserChimeraActivity.f81201a;
        gunsBrowserChimeraActivity.f81206e.setVisibility(8);
        this.f72318a.f81205d = true;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            if (!parse.isHierarchical()) {
                GunsBrowserChimeraActivity gunsBrowserChimeraActivity = this.f72318a;
                srn srn = GunsBrowserChimeraActivity.f81201a;
                gunsBrowserChimeraActivity.mo44694a(str);
                return true;
            }
            String queryParameter = parse.getQueryParameter("gnotswvaction");
            if (!TextUtils.isEmpty(queryParameter)) {
                if ("close".equals(queryParameter)) {
                    GunsBrowserChimeraActivity gunsBrowserChimeraActivity2 = this.f72318a;
                    srn srn2 = GunsBrowserChimeraActivity.f81201a;
                    gunsBrowserChimeraActivity2.mo44695a(false);
                    this.f72318a.finish();
                    return true;
                } else if ("browser".equals(queryParameter)) {
                    GunsBrowserChimeraActivity gunsBrowserChimeraActivity3 = this.f72318a;
                    srn srn3 = GunsBrowserChimeraActivity.f81201a;
                    gunsBrowserChimeraActivity3.mo44694a(str);
                    return true;
                }
            }
            if (!TextUtils.isEmpty(cfqb.m142535c())) {
                String path = parse.getPath();
                if (!TextUtils.isEmpty(path) && path.matches(cfqb.m142535c())) {
                    GunsBrowserChimeraActivity gunsBrowserChimeraActivity4 = this.f72318a;
                    srn srn4 = GunsBrowserChimeraActivity.f81201a;
                    gunsBrowserChimeraActivity4.mo44694a(str);
                    return true;
                }
            }
            GunsBrowserChimeraActivity gunsBrowserChimeraActivity5 = this.f72318a;
            srn srn5 = GunsBrowserChimeraActivity.f81201a;
            if (gunsBrowserChimeraActivity5.mo44696b(str)) {
                this.f72318a.f81203b.contains(parse.getHost());
                GunsBrowserChimeraActivity gunsBrowserChimeraActivity6 = this.f72318a;
                gunsBrowserChimeraActivity6.mo44695a(gunsBrowserChimeraActivity6.f81203b.contains(parse.getHost()));
                return false;
            }
            this.f72318a.mo44694a(str);
        }
        return true;
    }
}
