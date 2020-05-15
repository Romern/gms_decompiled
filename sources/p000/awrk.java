package p000;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.wallet.service.p086ib.IbBuyFlowInput;
import com.google.android.gms.wallet.service.p086ib.LoadFullWalletServiceRequest;
import com.google.android.gms.wallet.service.p086ib.LoadFullWalletServiceResponse;
import com.google.android.gms.wallet.service.p086ib.LoadMaskedWalletServiceRequest;
import com.google.android.gms.wallet.service.p086ib.LoadMaskedWalletServiceResponse;
import com.google.android.gms.wallet.service.p086ib.ProcessBuyFlowResultRequest;
import com.google.android.gms.wallet.service.p086ib.ProcessBuyFlowResultResponse;
import com.google.android.gms.wallet.service.p086ib.RefreshUserSpecificDataResponse;
import com.google.android.gms.wallet.shared.BuyFlowConfig;

/* renamed from: awrk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awrk extends awrm {

    /* renamed from: a */
    private final Context f94927a;

    /* renamed from: b */
    private final awrn f94928b;

    public awrk(Context context, awrn awrn) {
        this.f94927a = context;
        this.f94928b = awrn;
    }

    /* renamed from: a */
    public final LoadFullWalletServiceResponse mo52505a(BuyFlowConfig buyFlowConfig, LoadFullWalletServiceRequest loadFullWalletServiceRequest) {
        return this.f94928b.mo52505a(buyFlowConfig, loadFullWalletServiceRequest);
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        try {
            return super.onTransact(i, parcel, parcel2, i2);
        } catch (Throwable th) {
            awye.m81493a(this.f94927a, th);
            return true;
        }
    }

    /* renamed from: a */
    public final LoadMaskedWalletServiceResponse mo52506a(LoadMaskedWalletServiceRequest loadMaskedWalletServiceRequest) {
        return this.f94928b.mo52506a(loadMaskedWalletServiceRequest);
    }

    /* renamed from: a */
    public final ProcessBuyFlowResultResponse mo52507a(BuyFlowConfig buyFlowConfig, ProcessBuyFlowResultRequest processBuyFlowResultRequest) {
        return this.f94928b.mo52507a(buyFlowConfig, processBuyFlowResultRequest);
    }

    /* renamed from: a */
    public final RefreshUserSpecificDataResponse mo52508a(BuyFlowConfig buyFlowConfig, IbBuyFlowInput ibBuyFlowInput) {
        return this.f94928b.mo52508a(buyFlowConfig, ibBuyFlowInput);
    }
}
