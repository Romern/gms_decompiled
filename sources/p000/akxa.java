package p000;

import android.webkit.WebView;
import com.google.android.gms.safetynet.HarmfulAppsInfo;

/* renamed from: akxa */
final /* synthetic */ class akxa implements aubq {

    /* renamed from: a */
    private final akxe f73039a;

    /* renamed from: b */
    private final int f73040b;

    public akxa(akxe akxe, int i) {
        this.f73039a = akxe;
        this.f73040b = i;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        long j;
        akxe akxe = this.f73039a;
        int i = this.f73040b;
        if (aucb.mo50384b()) {
            WebView webView = akxe.f73045a;
            HarmfulAppsInfo harmfulAppsInfo = ((apgm) ((rkj) aucb.mo50386d()).f43190a).f84339a;
            if (harmfulAppsInfo != null) {
                j = harmfulAppsInfo.f107318a;
            } else {
                j = 0;
            }
            akxe.m60636a(webView, i, j);
            return;
        }
        akxe.m60635a(akxe.f73045a, i);
    }
}
