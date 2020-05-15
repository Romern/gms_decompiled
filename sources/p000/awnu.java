package p000;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.wallet.analytics.events.OrchestrationViewEvent;
import com.google.android.gms.wallet.invoicesummary.InvoiceSummaryFragment$InvoiceSummaryPageDetails;
import com.google.android.gms.wallet.p088ui.common.PageDetails;
import com.google.android.gms.wallet.p088ui.common.ProgressSpinnerView;
import com.google.android.gms.wallet.service.orchestration.InvoiceSummarySubmitRequest;

/* renamed from: awnu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awnu extends awzk {

    /* renamed from: c */
    public static final /* synthetic */ int f94672c = 0;

    /* renamed from: a */
    boolean f94673a;

    /* renamed from: b */
    final awpc f94674b = new awns(this);

    /* renamed from: d */
    private byte[] f94675d;

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final PageDetails mo52038J() {
        return new InvoiceSummaryFragment$InvoiceSummaryPageDetails();
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
        this.f95357A = layoutInflater.inflate((int) C0126R.C0128layout.wallet_fragment_invoice_summary, viewGroup, false);
        mo52851a((awib) ((ProgressSpinnerView) this.f95357A.findViewById(C0126R.C0129id.progress_spinner_container)));
        if (this.f94673a) {
            mo52808n(false);
            this.f94673a = false;
            bxvd da = bwjq.f159852d.mo74144da();
            bmaj a = awfx.m79878a((byte[]) null);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bwjq bwjq = (bwjq) da.f164949b;
            a.getClass();
            bwjq.f159855b = a;
            bwjq.f159854a = 1 | bwjq.f159854a;
            ByteString a2 = ByteString.m123261a(this.f94675d);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bwjq bwjq2 = (bwjq) da.f164949b;
            a2.getClass();
            bwjq2.f159854a |= 2;
            bwjq2.f159856c = a2;
            bwjq bwjq3 = (bwjq) da.mo74062i();
            mo52864a(bwjq3, 2);
            mo52865a((Runnable) new awnr(this, bwjq3));
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
        return this.f94674b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo51917c() {
    }

    /* renamed from: co */
    public final bjes mo51919co() {
        return new bjes(30);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final bxxk mo51920d() {
        return (bxxk) bwjq.f159852d.mo74142c(7);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final bmlz mo51924h() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo51925l() {
        throw new UnsupportedOperationException("makeResponseContextOnlySubmitRequest() is not supported by invoice summary.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final bxxk mo51926m() {
        return (bxxk) bwjs.f159864a.mo74142c(7);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    public final void onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        if (i != 1004) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(z, (Object) "WebViewComponent is not supported yet.");
        super.onActivityResult(i, i2, intent);
    }

    public final void onCreate(Bundle bundle) {
        bwjs bwjs;
        bmaq bmaq;
        bmav bmav;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f94675d = arguments.getByteArray("parameters");
        if (bundle == null) {
            if (arguments.containsKey("initializeToken")) {
                this.f95368L = 1;
                bwjr bwjr = (bwjr) bjvp.m104730a(arguments, "initializeToken", (bxxk) bwjr.f159857f.mo74142c(7));
                InvoiceSummaryFragment$InvoiceSummaryPageDetails invoiceSummaryFragment$InvoiceSummaryPageDetails = new InvoiceSummaryFragment$InvoiceSummaryPageDetails();
                bmar bmar = null;
                if ((bwjr.f159859a & 8) != 0) {
                    bwjs = bwjr.f159863e;
                    if (bwjs == null) {
                        bwjs = bwjs.f159864a;
                    }
                } else {
                    bwjs = null;
                }
                invoiceSummaryFragment$InvoiceSummaryPageDetails.f110460i = bwjs;
                if ((bwjr.f159859a & 1) != 0) {
                    bmaq = bwjr.f159860b;
                    if (bmaq == null) {
                        bmaq = bmaq.f128479l;
                    }
                } else {
                    bmaq = null;
                }
                invoiceSummaryFragment$InvoiceSummaryPageDetails.f110465n = bmaq;
                if ((bwjr.f159859a & 2) != 0) {
                    bmav = bwjr.f159861c;
                    if (bmav == null) {
                        bmav = bmav.f128500h;
                    }
                } else {
                    bmav = null;
                }
                invoiceSummaryFragment$InvoiceSummaryPageDetails.f110468q = bmav;
                if ((bwjr.f159859a & 4) != 0 && (bmar = bwjr.f159862d) == null) {
                    bmar = bmar.f128490c;
                }
                invoiceSummaryFragment$InvoiceSummaryPageDetails.f110467p = bmar;
                this.f95399al = invoiceSummaryFragment$InvoiceSummaryPageDetails;
            } else {
                this.f94673a = true;
            }
            OrchestrationViewEvent.m93828c(getActivity(), this.f95359C, mo51919co());
            return;
        }
        this.f94673a = bundle.getBoolean("shouldMakeInitializeRequest", false);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("shouldMakeInitializeRequest", this.f94673a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo51916b(boolean z) {
        mo52892d(z);
        if (z) {
            this.f95357A.setVisibility(4);
        }
    }

    /* renamed from: a */
    public final void mo51904a(int i) {
        super.mo51904a(i);
        if (i == 1) {
            this.f95357A.setVisibility(0);
        }
    }

    /* renamed from: a */
    public final void mo52347a(bmaq bmaq, bmav bmav, bwgz bwgz, bmar bmar, bwjs bwjs, boolean z, String str) {
        mo52853a(bmav, bmaq);
        InvoiceSummaryFragment$InvoiceSummaryPageDetails invoiceSummaryFragment$InvoiceSummaryPageDetails = new InvoiceSummaryFragment$InvoiceSummaryPageDetails();
        invoiceSummaryFragment$InvoiceSummaryPageDetails.f110460i = bwjs;
        invoiceSummaryFragment$InvoiceSummaryPageDetails.f110468q = bmav;
        invoiceSummaryFragment$InvoiceSummaryPageDetails.f110454c = bwgz;
        invoiceSummaryFragment$InvoiceSummaryPageDetails.f110465n = bmaq;
        invoiceSummaryFragment$InvoiceSummaryPageDetails.f110467p = bmar;
        mo52364a(invoiceSummaryFragment$InvoiceSummaryPageDetails, z, str);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo51911a(Object obj) {
        if (obj instanceof bwjq) {
            mo52900j(2);
            mo52839Y().f94357a.mo52415a((bwjq) obj);
            mo52808n(false);
        } else if (obj instanceof bwjt) {
            mo52900j(3);
            awpb awpb = mo52839Y().f94357a;
            bwjt bwjt = (bwjt) obj;
            bmar bmar = this.f95398ak.f110467p;
            awou awou = (awou) awpb;
            sdo.m34971a(awou.mo52431f(), (Object) "Must specify connection to OrchestrationService!");
            if (!awou.mo52425a(bwjt)) {
                Message.obtain(awou.f94784u, 57, new InvoiceSummarySubmitRequest(awou.f94765b, bwjt, bmar.f128492a)).sendToTarget();
            }
            mo52808n(false);
        }
    }
}
