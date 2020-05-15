package p000;

import android.graphics.Bitmap;
import android.webkit.WebView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.octarine.p057ui.OctarineWebviewChimeraActivity;
import java.lang.ref.WeakReference;

/* renamed from: akze */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akze extends bece {

    /* renamed from: a */
    final /* synthetic */ OctarineWebviewChimeraActivity f73154a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public akze(OctarineWebviewChimeraActivity octarineWebviewChimeraActivity, becg becg) {
        super(becg, becg);
        this.f73154a = octarineWebviewChimeraActivity;
    }

    /* renamed from: a */
    private final boolean m60702a(String str, int i) {
        if (i != 3) {
            OctarineWebviewChimeraActivity octarineWebviewChimeraActivity = this.f73154a;
            Logger Logger = OctarineWebviewChimeraActivity.f81375e;
            octarineWebviewChimeraActivity.mo44762a(str, i);
            if (i == 1) {
                OctarineWebviewChimeraActivity octarineWebviewChimeraActivity2 = this.f73154a;
                if (octarineWebviewChimeraActivity2.f81377B) {
                    octarineWebviewChimeraActivity2.mo39988d();
                }
            }
            return true;
        }
        this.f73154a.mo44768f(str);
        this.f73154a.f81412z = str;
        return false;
    }

    /* renamed from: b */
    public final boolean mo36088b(String str) {
        return m60702a(str, 1);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.octarine.ui.OctarineWebviewChimeraActivity.a(java.lang.String, boolean):int
     arg types: [java.lang.String, int]
     candidates:
      com.google.android.gms.octarine.ui.OctarineWebviewChimeraActivity.a(android.net.Uri, of):boolean
      com.google.android.gms.octarine.ui.OctarineWebviewChimeraActivity.a(int, java.util.Map):void
      com.google.android.gms.octarine.ui.OctarineWebviewChimeraActivity.a(java.lang.String, int):void
      com.google.android.gms.octarine.ui.OctarineWebviewChimeraActivity.a(xrx, int):void
      akwn.a(xrx, int):void
      akym.a(int, java.util.Map):void
      com.google.android.gms.octarine.ui.OctarineWebviewChimeraActivity.a(java.lang.String, boolean):int */
    /* renamed from: c */
    public final boolean mo40007c(String str) {
        return m60702a(str, this.f73154a.mo44760a(str, true));
    }

    public final void onPageFinished(WebView webView, String str) {
        bhnh bhnh;
        OctarineWebviewChimeraActivity octarineWebviewChimeraActivity = this.f73154a;
        if (!octarineWebviewChimeraActivity.f81405s && octarineWebviewChimeraActivity.mo44773j()) {
            this.f73154a.f81404r.beginTransaction().remove(this.f73154a.f81404r.findFragmentByTag("error_tag")).commitAllowingStateLoss();
            this.f73154a.f81402p.setVisibility(0);
            akzw akzw = this.f73154a.f81403q;
            synchronized (akzw.f73192b) {
                WeakReference weakReference = akzw.f73193a;
                if (!(weakReference == null || (bhnh = (bhnh) weakReference.get()) == null || !bhnh.mo64023f())) {
                    bhnh.mo64021d();
                }
            }
        }
        OctarineWebviewChimeraActivity octarineWebviewChimeraActivity2 = this.f73154a;
        octarineWebviewChimeraActivity2.f81377B = false;
        octarineWebviewChimeraActivity2.f81400n.mo2090a(false);
        OctarineWebviewChimeraActivity octarineWebviewChimeraActivity3 = this.f73154a;
        if (octarineWebviewChimeraActivity3.f81409w) {
            octarineWebviewChimeraActivity3.f81402p.clearHistory();
            this.f73154a.f81409w = false;
        }
        OctarineWebviewChimeraActivity octarineWebviewChimeraActivity4 = this.f73154a;
        if (octarineWebviewChimeraActivity4.f81410x) {
            octarineWebviewChimeraActivity4.f81410x = false;
            octarineWebviewChimeraActivity4.f81402p.setImportantForAccessibility(0);
        }
        this.f73154a.f81389N.mo40046d();
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.f73154a.f81400n.mo2090a(true);
        OctarineWebviewChimeraActivity octarineWebviewChimeraActivity = this.f73154a;
        octarineWebviewChimeraActivity.f81380E = -1;
        octarineWebviewChimeraActivity.f81381F = -1;
        octarineWebviewChimeraActivity.f81382G = -1;
        octarineWebviewChimeraActivity.f81391P = -1;
        octarineWebviewChimeraActivity.mo39954b();
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        String str3;
        super.onReceivedError(webView, i, str, str2);
        OctarineWebviewChimeraActivity octarineWebviewChimeraActivity = this.f73154a;
        octarineWebviewChimeraActivity.f81412z = str2;
        if (str == null || !str.equals("net::ERR_INTERNET_DISCONNECTED")) {
            str3 = this.f73154a.getString(C0126R.string.common_something_went_wrong);
        } else {
            str3 = this.f73154a.getString(C0126R.string.common_offline);
        }
        octarineWebviewChimeraActivity.mo44766d(str3);
        OctarineWebviewChimeraActivity octarineWebviewChimeraActivity2 = this.f73154a;
        if (octarineWebviewChimeraActivity2.f81410x) {
            octarineWebviewChimeraActivity2.f81410x = false;
            octarineWebviewChimeraActivity2.f81402p.setImportantForAccessibility(0);
        }
        this.f73154a.f81389N.mo40046d();
    }
}
