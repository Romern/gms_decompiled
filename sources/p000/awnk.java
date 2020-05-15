package p000;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.WebPaymentData;
import com.google.android.gms.wallet.firstparty.GetBuyFlowInitializationTokenResponse;
import com.google.android.gms.wallet.firstparty.GetClientTokenResponse;
import com.google.android.gms.wallet.firstparty.SetUpBiometricAuthenticationKeysResponse;
import com.google.android.gms.wallet.firstparty.WarmUpUiProcessResponse;
import com.google.android.gms.wallet.firstparty.saveinstrument.GetSaveInstrumentDetailsResponse;

/* renamed from: awnk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class awnk extends dck implements awnl {
    public awnk() {
        super("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
    }

    /* renamed from: a */
    public final void mo52329a(int i, Bundle bundle) {
    }

    /* renamed from: a */
    public final void mo52330a(int i, FullWallet fullWallet, Bundle bundle) {
    }

    /* renamed from: a */
    public final void mo52331a(int i, MaskedWallet maskedWallet, Bundle bundle) {
    }

    /* renamed from: a */
    public final void mo52332a(int i, boolean z, Bundle bundle) {
    }

    /* renamed from: a */
    public void mo52195a(Status status, Bundle bundle) {
    }

    /* renamed from: a */
    public final void mo52333a(Status status, PaymentData paymentData, Bundle bundle) {
    }

    /* renamed from: a */
    public final void mo52334a(Status status, WebPaymentData webPaymentData, Bundle bundle) {
    }

    /* renamed from: a */
    public final void mo52335a(Status status, GetBuyFlowInitializationTokenResponse getBuyFlowInitializationTokenResponse, Bundle bundle) {
    }

    /* renamed from: a */
    public void mo52336a(Status status, GetClientTokenResponse getClientTokenResponse, Bundle bundle) {
    }

    /* renamed from: a */
    public final void mo52337a(Status status, SetUpBiometricAuthenticationKeysResponse setUpBiometricAuthenticationKeysResponse, Bundle bundle) {
    }

    /* renamed from: a */
    public final void mo52338a(Status status, WarmUpUiProcessResponse warmUpUiProcessResponse, Bundle bundle) {
    }

    /* renamed from: a */
    public void mo52197a(Status status, GetSaveInstrumentDetailsResponse getSaveInstrumentDetailsResponse, Bundle bundle) {
    }

    /* renamed from: a */
    public final void mo52339a(Status status, boolean z, Bundle bundle) {
    }

    /* renamed from: b */
    public final void mo52340b(int i, boolean z, Bundle bundle) {
    }

    /* renamed from: b */
    public void mo52196b(Status status, Bundle bundle) {
    }

    /* renamed from: c */
    public final void mo52341c(Status status, Bundle bundle) {
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                parcel.readInt();
                MaskedWallet maskedWallet = (MaskedWallet) dcl.m8163a(parcel, MaskedWallet.CREATOR);
                Bundle bundle = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
                return true;
            case 2:
                parcel.readInt();
                FullWallet fullWallet = (FullWallet) dcl.m8163a(parcel, FullWallet.CREATOR);
                Bundle bundle2 = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
                return true;
            case 3:
                parcel.readInt();
                dcl.m8167a(parcel);
                Bundle bundle3 = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
                return true;
            case 4:
                parcel.readInt();
                Bundle bundle4 = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
                return true;
            case 5:
            default:
                return false;
            case 6:
                parcel.readInt();
                dcl.m8167a(parcel);
                Bundle bundle5 = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
                return true;
            case 7:
                Status status = (Status) dcl.m8163a(parcel, Status.CREATOR);
                GetBuyFlowInitializationTokenResponse getBuyFlowInitializationTokenResponse = (GetBuyFlowInitializationTokenResponse) dcl.m8163a(parcel, GetBuyFlowInitializationTokenResponse.CREATOR);
                Bundle bundle6 = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
                return true;
            case 8:
                Status status2 = (Status) dcl.m8163a(parcel, Status.CREATOR);
                Bundle bundle7 = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
                return true;
            case 9:
                Status status3 = (Status) dcl.m8163a(parcel, Status.CREATOR);
                dcl.m8167a(parcel);
                Bundle bundle8 = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
                return true;
            case 10:
                mo52336a((Status) dcl.m8163a(parcel, Status.CREATOR), (GetClientTokenResponse) dcl.m8163a(parcel, GetClientTokenResponse.CREATOR), (Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
                return true;
            case 11:
                mo52195a((Status) dcl.m8163a(parcel, Status.CREATOR), (Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
                return true;
            case 12:
                Status status4 = (Status) dcl.m8163a(parcel, Status.CREATOR);
                WebPaymentData webPaymentData = (WebPaymentData) dcl.m8163a(parcel, WebPaymentData.CREATOR);
                Bundle bundle9 = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
                return true;
            case 13:
                mo52196b((Status) dcl.m8163a(parcel, Status.CREATOR), (Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
                return true;
            case 14:
                Status status5 = (Status) dcl.m8163a(parcel, Status.CREATOR);
                PaymentData paymentData = (PaymentData) dcl.m8163a(parcel, PaymentData.CREATOR);
                Bundle bundle10 = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
                return true;
            case 15:
                mo52197a((Status) dcl.m8163a(parcel, Status.CREATOR), (GetSaveInstrumentDetailsResponse) dcl.m8163a(parcel, GetSaveInstrumentDetailsResponse.CREATOR), (Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
                return true;
            case 16:
                Status status6 = (Status) dcl.m8163a(parcel, Status.CREATOR);
                SetUpBiometricAuthenticationKeysResponse setUpBiometricAuthenticationKeysResponse = (SetUpBiometricAuthenticationKeysResponse) dcl.m8163a(parcel, SetUpBiometricAuthenticationKeysResponse.CREATOR);
                Bundle bundle11 = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
                return true;
            case 17:
                Status status7 = (Status) dcl.m8163a(parcel, Status.CREATOR);
                WarmUpUiProcessResponse warmUpUiProcessResponse = (WarmUpUiProcessResponse) dcl.m8163a(parcel, WarmUpUiProcessResponse.CREATOR);
                Bundle bundle12 = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
                return true;
        }
    }
}
