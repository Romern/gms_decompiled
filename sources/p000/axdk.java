package p000;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.wallet.analytics.events.OrchestrationViewEvent;
import com.google.android.gms.wallet.p088ui.common.PageDetails;
import com.google.android.gms.wallet.p088ui.common.ProgressSpinnerView;
import com.google.android.gms.wallet.webview.WebViewWidgetFragment$WebViewWidgetPageDetails;
import com.google.android.gms.wallet.webview.WebViewWidgetResult;

/* renamed from: axdk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axdk extends awzk {

    /* renamed from: c */
    public static final /* synthetic */ int f95837c = 0;

    /* renamed from: a */
    boolean f95838a;

    /* renamed from: b */
    final awpc f95839b = new axdi(this);

    /* renamed from: d */
    private byte[] f95840d;

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final PageDetails mo52038J() {
        return new WebViewWidgetFragment$WebViewWidgetPageDetails();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo51901a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f95357A = layoutInflater.inflate((int) C0126R.C0128layout.wallet_fragment_web_view_widget, viewGroup, false);
        mo52851a((awib) ((ProgressSpinnerView) this.f95357A.findViewById(C0126R.C0129id.progress_spinner_container)));
        if (this.f95838a) {
            mo52808n(false);
            this.f95838a = false;
            bxvd da = bwlj.f160137d.mo74144da();
            bmaj a = awfx.m79878a((byte[]) null);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bwlj bwlj = (bwlj) da.f164949b;
            a.getClass();
            bwlj.f160140b = a;
            bwlj.f160139a = 1 | bwlj.f160139a;
            byte[] bArr = this.f95840d;
            if (bArr != null) {
                bxtx a2 = bxtx.m123261a(bArr);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bwlj bwlj2 = (bwlj) da.f164949b;
                a2.getClass();
                bwlj2.f160139a |= 2;
                bwlj2.f160141c = a2;
            }
            mo52864a(da.mo74062i(), 2);
            mo52865a((Runnable) new axdh(this, da));
        } else if (this.f95368L == 1) {
            mo52888b("onInitialLoad");
        }
        return this.f95357A;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bxxc mo52042a(long j) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final awpc mo51913b() {
        return this.f95839b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo51916b(boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo51917c() {
    }

    /* renamed from: co */
    public final bjes mo51919co() {
        return new bjes(31);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final bxxk mo51920d() {
        return (bxxk) bwlj.f160137d.mo74142c(7);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final bmlz mo51924h() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo51925l() {
        throw new UnsupportedOperationException("makeResponseContextOnlySubmitRequest() is not supported by WebViewWidget.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final bxxk mo51926m() {
        return (bxxk) bwll.f160150c.mo74142c(7);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f95840d = arguments.getByteArray("parameters");
        if (bundle != null) {
            this.f95838a = bundle.getBoolean("shouldMakeInitializeRequest");
            return;
        }
        if (arguments.containsKey("initializationToken")) {
            this.f95368L = 1;
            bwlk bwlk = (bwlk) bjvp.m104730a(arguments, "initializationToken", (bxxk) bwlk.f160142f.mo74142c(7));
            WebViewWidgetFragment$WebViewWidgetPageDetails webViewWidgetFragment$WebViewWidgetPageDetails = new WebViewWidgetFragment$WebViewWidgetPageDetails();
            if ((bwlk.f160144a & 8) != 0) {
                bwll bwll = bwlk.f160148e;
                if (bwll == null) {
                    bwll = bwll.f160150c;
                }
                webViewWidgetFragment$WebViewWidgetPageDetails.f110460i = bwll;
                bwll bwll2 = bwlk.f160148e;
                if (bwll2 == null) {
                    bwll2 = bwll.f160150c;
                }
                if ((bwll2.f160152a & 4) != 0) {
                    bwll bwll3 = bwlk.f160148e;
                    if (bwll3 == null) {
                        bwll3 = bwll.f160150c;
                    }
                    bmkw bmkw = bwll3.f160153b;
                    if (bmkw == null) {
                        bmkw = bmkw.f129898c;
                    }
                    webViewWidgetFragment$WebViewWidgetPageDetails.f110463l = bmkw;
                }
            }
            bmaq bmaq = bwlk.f160146c;
            if (bmaq == null) {
                bmaq = bmaq.f128479l;
            }
            webViewWidgetFragment$WebViewWidgetPageDetails.f110465n = bmaq;
            if ((bwlk.f160144a & 1) != 0) {
                bmav bmav = bwlk.f160145b;
                if (bmav == null) {
                    bmav = bmav.f128500h;
                }
                webViewWidgetFragment$WebViewWidgetPageDetails.f110468q = bmav;
            }
            bwgz a = bwgz.m121952a(bwlk.f160147d);
            if (a == null) {
                a = bwgz.UNKNOWN_FLOW_INSTRUCTION;
            }
            webViewWidgetFragment$WebViewWidgetPageDetails.f110454c = a;
            this.f95399al = webViewWidgetFragment$WebViewWidgetPageDetails;
        } else {
            this.f95838a = true;
        }
        OrchestrationViewEvent.m93828c(getActivity(), this.f95359C, mo51919co());
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("shouldMakeInitializeRequest", this.f95838a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final PageDetails mo52043a(Intent intent) {
        byte[] byteArray = intent.getBundleExtra("webViewComponentCallbackData").getByteArray("EventListener.EXTRA_WEBVIEW_COMPONENT_COMPLETE_WITH_CALLBACK_DATA");
        WebViewWidgetFragment$WebViewWidgetPageDetails webViewWidgetFragment$WebViewWidgetPageDetails = new WebViewWidgetFragment$WebViewWidgetPageDetails();
        webViewWidgetFragment$WebViewWidgetPageDetails.f110454c = bwgz.COMPLETE_FLOW_IMMEDIATELY;
        webViewWidgetFragment$WebViewWidgetPageDetails.f110466o = new WebViewWidgetResult(byteArray);
        return webViewWidgetFragment$WebViewWidgetPageDetails;
    }

    /* renamed from: a */
    public final void mo51904a(int i) {
        super.mo51904a(i);
        if (i == 1) {
            this.f95357A.setVisibility(0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo51911a(Object obj) {
        if (obj instanceof bwlj) {
            mo52900j(2);
            mo52839Y().f94357a.mo52422a((bwlj) obj);
            mo52808n(false);
        }
    }
}
