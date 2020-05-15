package p000;

import android.content.Intent;
import android.os.Bundle;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.wallet.service.p086ib.IbBuyFlowInput;
import com.google.android.gms.wallet.service.p086ib.IbMerchantParameters;
import com.google.android.gms.wallet.service.p086ib.ProcessBuyFlowResultRequest;
import com.google.android.gms.wallet.service.p086ib.ProcessBuyFlowResultResponse;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.wallet.bender3.framework.client.WidgetResult;

/* renamed from: aweh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aweh extends awei implements bjfg {

    /* renamed from: a */
    private final dnx f94212a;

    /* renamed from: b */
    private final bjhm f94213b;

    /* renamed from: c */
    private final bjfh f94214c;

    /* renamed from: d */
    private Bundle f94215d;

    /* renamed from: e */
    private ProcessBuyFlowResultResponse f94216e;

    public aweh(dnx dnx, bjhm bjhm, Bundle bundle) {
        this.f94212a = dnx;
        this.f94213b = bjhm;
        if (bundle != null) {
            this.f94216e = (ProcessBuyFlowResultResponse) bundle.getParcelable("processBuyFlowResultResponse");
            Bundle bundle2 = (Bundle) bundle.getParcelable("IbWidgetAdapterextras");
            this.f94215d = bundle2;
            bundle2.setClassLoader(getClass().getClassLoader());
        }
        bjfh a = bjfh.m103300a(this.f94212a, this, bjil.m103603a(1, bundle));
        mo65286a(1, a);
        this.f94214c = a;
    }

    /* renamed from: c */
    private final IbBuyFlowInput m79700c() {
        return (IbBuyFlowInput) ((Bundle) this.f94215d.getParcelable("com.google.android.gms.wallet.firstparty.EXTRA_ACTIVITY_PARAMETERS")).getParcelable("com.google.android.gms.wallet.ib.IbActivity.buyFlowInputFactory");
    }

    /* renamed from: a */
    public final void mo52008a() {
        if (this.f94212a.getIntent().hasExtra("IbWidgetAdapterprotectedExtras")) {
            Bundle bundle = (Bundle) awsp.m80966a(Bundle.CREATOR, this.f94212a.getIntent().getStringExtra("IbWidgetAdapterprotectedExtras"));
            this.f94215d = bundle;
            bundle.setClassLoader(getClass().getClassLoader());
        } else {
            this.f94215d = this.f94212a.getIntent().getExtras();
        }
        byte[] d = m79700c().mo59992d();
        bjhm bjhm = this.f94213b;
        bxvd da = bwzf.f161591f.mo74144da();
        bxtx a = bxtx.m123261a(d);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwzf bwzf = (bwzf) da.f164949b;
        a.getClass();
        bwzf.f161593a |= 8;
        bwzf.f161597e = a;
        bjhm.mo65234a(da);
    }

    /* renamed from: a */
    public final void mo52014a(int i, bjfd bjfd) {
        if (i == 201 && bjfd.mo65080a() == 0) {
            ProcessBuyFlowResultResponse processBuyFlowResultResponse = (ProcessBuyFlowResultResponse) bjfd.f122613a.getParcelableExtra("processBuyFlowResultResponse");
            if (processBuyFlowResultResponse.f110361a == 1) {
                this.f94216e = processBuyFlowResultResponse;
                this.f94212a.setResult(processBuyFlowResultResponse.f110362b, processBuyFlowResultResponse.f110363c);
                this.f94212a.finish();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52015a(Bundle bundle) {
        ProcessBuyFlowResultResponse processBuyFlowResultResponse = this.f94216e;
        if (processBuyFlowResultResponse != null) {
            bundle.putParcelable("processBuyFlowResultResponse", processBuyFlowResultResponse);
        }
        Bundle bundle2 = this.f94215d;
        if (bundle2 != null) {
            bundle.putParcelable("IbWidgetAdapterextras", bundle2);
        }
    }

    /* renamed from: a */
    public final void mo52009a(WidgetResult widgetResult) {
        blzw blzw = blzw.f128403k;
        byte[] bArr = widgetResult.f151771b;
        if (bArr.length > 0) {
            blzw = (blzw) bjvp.m104733a(bArr, (bxxk) blzw.f128403k.mo74142c(7));
        }
        if ((blzw.f128405a & 1) == 0) {
            byte[] bArr2 = widgetResult.f151771b;
            Intent a = bjfc.m103292a("Bender3ProcessBuyFlowResultAction", this.f94213b.f122735a.f122724a, new Intent());
            a.putExtra("processBuyFlowResultRequest", new ProcessBuyFlowResultRequest(m79700c(), (IbMerchantParameters) ((Bundle) this.f94215d.getParcelable("com.google.android.gms.wallet.firstparty.EXTRA_ACTIVITY_PARAMETERS")).getParcelable("com.google.android.gms.wallet.ib.IbActivity.merchantParameters"), new byte[0], bArr2, 1));
            a.putExtra("buyFlowConfig", (BuyFlowConfig) this.f94215d.getParcelable("buyflowConfig"));
            this.f94214c.mo65084a((int) ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR, new bjfc(a));
        }
    }
}
