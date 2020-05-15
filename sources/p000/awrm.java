package p000;

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

/* renamed from: awrm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class awrm extends dck implements awrn {
    public awrm() {
        super("com.google.android.gms.wallet.service.ib.IIbService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            LoadFullWalletServiceResponse a = mo52505a((BuyFlowConfig) dcl.m8163a(parcel, BuyFlowConfig.CREATOR), (LoadFullWalletServiceRequest) dcl.m8163a(parcel, LoadFullWalletServiceRequest.CREATOR));
            parcel2.writeNoException();
            dcl.m8169b(parcel2, a);
        } else if (i == 2) {
            LoadMaskedWalletServiceResponse a2 = mo52506a((LoadMaskedWalletServiceRequest) dcl.m8163a(parcel, LoadMaskedWalletServiceRequest.CREATOR));
            parcel2.writeNoException();
            dcl.m8169b(parcel2, a2);
        } else if (i == 3) {
            ProcessBuyFlowResultResponse a3 = mo52507a((BuyFlowConfig) dcl.m8163a(parcel, BuyFlowConfig.CREATOR), (ProcessBuyFlowResultRequest) dcl.m8163a(parcel, ProcessBuyFlowResultRequest.CREATOR));
            parcel2.writeNoException();
            dcl.m8169b(parcel2, a3);
        } else if (i != 4) {
            return false;
        } else {
            RefreshUserSpecificDataResponse a4 = mo52508a((BuyFlowConfig) dcl.m8163a(parcel, BuyFlowConfig.CREATOR), (IbBuyFlowInput) dcl.m8163a(parcel, IbBuyFlowInput.CREATOR));
            parcel2.writeNoException();
            dcl.m8169b(parcel2, a4);
        }
        return true;
    }
}
