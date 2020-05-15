package p000;

import android.os.IInterface;
import com.google.android.gms.wallet.service.p086ib.IbBuyFlowInput;
import com.google.android.gms.wallet.service.p086ib.LoadFullWalletServiceRequest;
import com.google.android.gms.wallet.service.p086ib.LoadFullWalletServiceResponse;
import com.google.android.gms.wallet.service.p086ib.LoadMaskedWalletServiceRequest;
import com.google.android.gms.wallet.service.p086ib.LoadMaskedWalletServiceResponse;
import com.google.android.gms.wallet.service.p086ib.ProcessBuyFlowResultRequest;
import com.google.android.gms.wallet.service.p086ib.ProcessBuyFlowResultResponse;
import com.google.android.gms.wallet.service.p086ib.RefreshUserSpecificDataResponse;
import com.google.android.gms.wallet.shared.BuyFlowConfig;

/* renamed from: awrn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface awrn extends IInterface {
    /* renamed from: a */
    LoadFullWalletServiceResponse mo52505a(BuyFlowConfig buyFlowConfig, LoadFullWalletServiceRequest loadFullWalletServiceRequest);

    /* renamed from: a */
    LoadMaskedWalletServiceResponse mo52506a(LoadMaskedWalletServiceRequest loadMaskedWalletServiceRequest);

    /* renamed from: a */
    ProcessBuyFlowResultResponse mo52507a(BuyFlowConfig buyFlowConfig, ProcessBuyFlowResultRequest processBuyFlowResultRequest);

    /* renamed from: a */
    RefreshUserSpecificDataResponse mo52508a(BuyFlowConfig buyFlowConfig, IbBuyFlowInput ibBuyFlowInput);
}
