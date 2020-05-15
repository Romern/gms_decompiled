package p000;

import com.google.android.gms.wallet.service.p086ib.IbBuyFlowInput;
import com.google.android.gms.wallet.service.p086ib.LoadFullWalletServiceRequest;
import com.google.android.gms.wallet.service.p086ib.LoadFullWalletServiceResponse;
import com.google.android.gms.wallet.service.p086ib.LoadMaskedWalletServiceRequest;
import com.google.android.gms.wallet.service.p086ib.LoadMaskedWalletServiceResponse;
import com.google.android.gms.wallet.service.p086ib.ProcessBuyFlowResultRequest;
import com.google.android.gms.wallet.service.p086ib.ProcessBuyFlowResultResponse;
import com.google.android.gms.wallet.service.p086ib.RefreshUserSpecificDataResponse;
import com.google.android.gms.wallet.shared.BuyFlowConfig;

/* renamed from: awsx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awsx extends awrm {

    /* renamed from: a */
    private final awrn f95068a;

    public awsx(awrn awrn) {
        this.f95068a = awrn;
    }

    /* renamed from: a */
    public final LoadFullWalletServiceResponse mo52505a(BuyFlowConfig buyFlowConfig, LoadFullWalletServiceRequest loadFullWalletServiceRequest) {
        if (awye.m81494a()) {
            return this.f95068a.mo52505a(buyFlowConfig, loadFullWalletServiceRequest);
        }
        return null;
    }

    /* renamed from: a */
    public final LoadMaskedWalletServiceResponse mo52506a(LoadMaskedWalletServiceRequest loadMaskedWalletServiceRequest) {
        if (awye.m81494a()) {
            return this.f95068a.mo52506a(loadMaskedWalletServiceRequest);
        }
        return null;
    }

    /* renamed from: a */
    public final ProcessBuyFlowResultResponse mo52507a(BuyFlowConfig buyFlowConfig, ProcessBuyFlowResultRequest processBuyFlowResultRequest) {
        if (awye.m81494a()) {
            return this.f95068a.mo52507a(buyFlowConfig, processBuyFlowResultRequest);
        }
        return null;
    }

    /* renamed from: a */
    public final RefreshUserSpecificDataResponse mo52508a(BuyFlowConfig buyFlowConfig, IbBuyFlowInput ibBuyFlowInput) {
        if (awye.m81494a()) {
            return this.f95068a.mo52508a(buyFlowConfig, ibBuyFlowInput);
        }
        return null;
    }
}
