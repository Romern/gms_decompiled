package p000;

import android.os.Bundle;
import android.os.IInterface;
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

/* renamed from: awnl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface awnl extends IInterface {
    /* renamed from: a */
    void mo52329a(int i, Bundle bundle);

    /* renamed from: a */
    void mo52330a(int i, FullWallet fullWallet, Bundle bundle);

    /* renamed from: a */
    void mo52331a(int i, MaskedWallet maskedWallet, Bundle bundle);

    /* renamed from: a */
    void mo52332a(int i, boolean z, Bundle bundle);

    /* renamed from: a */
    void mo52195a(Status status, Bundle bundle);

    /* renamed from: a */
    void mo52333a(Status status, PaymentData paymentData, Bundle bundle);

    /* renamed from: a */
    void mo52334a(Status status, WebPaymentData webPaymentData, Bundle bundle);

    /* renamed from: a */
    void mo52335a(Status status, GetBuyFlowInitializationTokenResponse getBuyFlowInitializationTokenResponse, Bundle bundle);

    /* renamed from: a */
    void mo52336a(Status status, GetClientTokenResponse getClientTokenResponse, Bundle bundle);

    /* renamed from: a */
    void mo52337a(Status status, SetUpBiometricAuthenticationKeysResponse setUpBiometricAuthenticationKeysResponse, Bundle bundle);

    /* renamed from: a */
    void mo52338a(Status status, WarmUpUiProcessResponse warmUpUiProcessResponse, Bundle bundle);

    /* renamed from: a */
    void mo52197a(Status status, GetSaveInstrumentDetailsResponse getSaveInstrumentDetailsResponse, Bundle bundle);

    /* renamed from: a */
    void mo52339a(Status status, boolean z, Bundle bundle);

    /* renamed from: b */
    void mo52340b(int i, boolean z, Bundle bundle);

    /* renamed from: b */
    void mo52196b(Status status, Bundle bundle);

    /* renamed from: c */
    void mo52341c(Status status, Bundle bundle);
}
