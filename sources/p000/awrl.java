package p000;

import android.os.IBinder;
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

/* renamed from: awrl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awrl extends dcj implements awrn {
    public awrl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.wallet.service.ib.IIbService");
    }

    /* renamed from: a */
    public final LoadFullWalletServiceResponse mo52505a(BuyFlowConfig buyFlowConfig, LoadFullWalletServiceRequest loadFullWalletServiceRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, buyFlowConfig);
        dcl.m8165a(bj, loadFullWalletServiceRequest);
        Parcel a = mo8526a(1, bj);
        LoadFullWalletServiceResponse loadFullWalletServiceResponse = (LoadFullWalletServiceResponse) dcl.m8163a(a, LoadFullWalletServiceResponse.CREATOR);
        a.recycle();
        return loadFullWalletServiceResponse;
    }

    /* renamed from: a */
    public final LoadMaskedWalletServiceResponse mo52506a(LoadMaskedWalletServiceRequest loadMaskedWalletServiceRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, loadMaskedWalletServiceRequest);
        Parcel a = mo8526a(2, bj);
        LoadMaskedWalletServiceResponse loadMaskedWalletServiceResponse = (LoadMaskedWalletServiceResponse) dcl.m8163a(a, LoadMaskedWalletServiceResponse.CREATOR);
        a.recycle();
        return loadMaskedWalletServiceResponse;
    }

    /* renamed from: a */
    public final ProcessBuyFlowResultResponse mo52507a(BuyFlowConfig buyFlowConfig, ProcessBuyFlowResultRequest processBuyFlowResultRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, buyFlowConfig);
        dcl.m8165a(bj, processBuyFlowResultRequest);
        Parcel a = mo8526a(3, bj);
        ProcessBuyFlowResultResponse processBuyFlowResultResponse = (ProcessBuyFlowResultResponse) dcl.m8163a(a, ProcessBuyFlowResultResponse.CREATOR);
        a.recycle();
        return processBuyFlowResultResponse;
    }

    /* renamed from: a */
    public final RefreshUserSpecificDataResponse mo52508a(BuyFlowConfig buyFlowConfig, IbBuyFlowInput ibBuyFlowInput) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, buyFlowConfig);
        dcl.m8165a(bj, ibBuyFlowInput);
        Parcel a = mo8526a(4, bj);
        RefreshUserSpecificDataResponse refreshUserSpecificDataResponse = (RefreshUserSpecificDataResponse) dcl.m8163a(a, RefreshUserSpecificDataResponse.CREATOR);
        a.recycle();
        return refreshUserSpecificDataResponse;
    }
}
