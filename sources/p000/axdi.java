package p000;

import com.google.android.gms.wallet.p088ui.common.PageDetails;
import com.google.android.gms.wallet.webview.WebViewWidgetFragment$WebViewWidgetPageDetails;

/* renamed from: axdi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class axdi extends awpc {

    /* renamed from: a */
    final /* synthetic */ axdk f95836a;

    public axdi(axdk axdk) {
        this.f95836a = axdk;
    }

    /* renamed from: a */
    public final void mo51894a() {
        axdk axdk = this.f95836a;
        int i = axdk.f95837c;
        axdk.mo52898h(21);
        this.f95836a.mo52874ag();
    }

    /* renamed from: b */
    public final void mo51897b() {
        axdk axdk = this.f95836a;
        int i = axdk.f95837c;
        axdk.mo52898h(20);
        this.f95836a.mo52897g(-1);
    }

    /* renamed from: c */
    public final void mo51898c() {
        axdk axdk = this.f95836a;
        int i = axdk.f95837c;
        axdk.mo52898h(22);
        this.f95836a.mo52897g(-1);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awzk.a(com.google.android.gms.wallet.ui.common.PageDetails, boolean, java.lang.String):void
     arg types: [com.google.android.gms.wallet.webview.WebViewWidgetFragment$WebViewWidgetPageDetails, int, java.lang.String]
     candidates:
      axdk.a(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View
      awzk.a(com.google.android.gms.wallet.shared.BuyFlowConfig, java.lang.String, com.google.android.wallet.clientlog.LogContext):android.os.Bundle
      awzk.a(bmdb, android.view.ViewGroup, boolean):bkbn
      awzk.a(android.os.Bundle, byte[], java.util.List):java.lang.Object
      awzk.a(long, int, int):void
      awzk.a(awyy, int, long):void
      awzk.a(bmav, boolean, boolean):void
      awzk.a(bmnr, android.view.ViewGroup, boolean):void
      awzk.a(com.google.android.gms.wallet.ui.common.PageDetails, int, int):void
      awzk.a(java.util.List, android.view.ViewGroup, boolean):void
      bkbr.a(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View
      awzk.a(com.google.android.gms.wallet.ui.common.PageDetails, boolean, java.lang.String):void */
    /* renamed from: a */
    public final void mo52442a(bwlk bwlk) {
        bmav bmav;
        axdk axdk = this.f95836a;
        bmaq bmaq = bwlk.f160146c;
        if (bmaq == null) {
            bmaq = bmaq.f128479l;
        }
        bwll bwll = null;
        if ((bwlk.f160144a & 1) != 0) {
            bmav = bwlk.f160145b;
            if (bmav == null) {
                bmav = bmav.f128500h;
            }
        } else {
            bmav = null;
        }
        bwgz a = bwgz.m121952a(bwlk.f160147d);
        if (a == null) {
            a = bwgz.UNKNOWN_FLOW_INSTRUCTION;
        }
        if ((bwlk.f160144a & 8) != 0 && (bwll = bwlk.f160148e) == null) {
            bwll = bwll.f160150c;
        }
        int i = axdk.f95837c;
        axdk.mo52853a(bmav, bmaq);
        WebViewWidgetFragment$WebViewWidgetPageDetails webViewWidgetFragment$WebViewWidgetPageDetails = new WebViewWidgetFragment$WebViewWidgetPageDetails();
        webViewWidgetFragment$WebViewWidgetPageDetails.f110460i = bwll;
        if (bwll != null) {
            bmkw bmkw = bwll.f160153b;
            if (bmkw == null) {
                bmkw = bmkw.f129898c;
            }
            webViewWidgetFragment$WebViewWidgetPageDetails.f110463l = bmkw;
        }
        webViewWidgetFragment$WebViewWidgetPageDetails.f110468q = bmav;
        webViewWidgetFragment$WebViewWidgetPageDetails.f110454c = a;
        webViewWidgetFragment$WebViewWidgetPageDetails.f110465n = bmaq;
        axdk.mo52364a((PageDetails) webViewWidgetFragment$WebViewWidgetPageDetails, true, "onInitializeWebViewWidgetResponse");
    }
}
