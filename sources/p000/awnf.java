package p000;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.wallet.CreateWalletObjectsRequest;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.NotifyTransactionStatusRequest;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.android.gms.wallet.WebPaymentDataRequest;
import com.google.android.gms.wallet.firstparty.ExecuteBuyFlowRequest;
import com.google.android.gms.wallet.firstparty.GetBuyFlowInitializationTokenRequest;
import com.google.android.gms.wallet.firstparty.GetClientTokenRequest;
import com.google.android.gms.wallet.firstparty.InitializeBuyFlowRequest;
import com.google.android.gms.wallet.firstparty.SetUpBiometricAuthenticationKeysRequest;
import com.google.android.gms.wallet.firstparty.WarmUpUiProcessRequest;
import com.google.android.gms.wallet.firstparty.saveinstrument.GetSaveInstrumentDetailsRequest;
import com.google.android.gms.wallet.firstparty.saveinstrument.SaveInstrumentRequest;

/* renamed from: awnf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface awnf extends IInterface {
    /* renamed from: a */
    void mo52308a(Bundle bundle);

    /* renamed from: a */
    void mo52309a(Bundle bundle, awnl awnl);

    /* renamed from: a */
    void mo52310a(CreateWalletObjectsRequest createWalletObjectsRequest, Bundle bundle, awnl awnl);

    /* renamed from: a */
    void mo52311a(FullWalletRequest fullWalletRequest, Bundle bundle, awnl awnl);

    /* renamed from: a */
    void mo52312a(IsReadyToPayRequest isReadyToPayRequest, Bundle bundle, awnl awnl);

    /* renamed from: a */
    void mo52313a(MaskedWalletRequest maskedWalletRequest, Bundle bundle, awnl awnl);

    /* renamed from: a */
    void mo52314a(NotifyTransactionStatusRequest notifyTransactionStatusRequest, Bundle bundle);

    /* renamed from: a */
    void mo52315a(PaymentDataRequest paymentDataRequest, Bundle bundle, awnl awnl);

    /* renamed from: a */
    void mo52316a(WebPaymentDataRequest webPaymentDataRequest, Bundle bundle, awnl awnl);

    /* renamed from: a */
    void mo52317a(ExecuteBuyFlowRequest executeBuyFlowRequest, Bundle bundle, awnl awnl);

    /* renamed from: a */
    void mo52318a(GetBuyFlowInitializationTokenRequest getBuyFlowInitializationTokenRequest, Bundle bundle, awnl awnl);

    /* renamed from: a */
    void mo52319a(GetClientTokenRequest getClientTokenRequest, Bundle bundle, awnl awnl);

    /* renamed from: a */
    void mo52320a(InitializeBuyFlowRequest initializeBuyFlowRequest, Bundle bundle, awnl awnl);

    /* renamed from: a */
    void mo52321a(SetUpBiometricAuthenticationKeysRequest setUpBiometricAuthenticationKeysRequest, Bundle bundle, awnl awnl);

    /* renamed from: a */
    void mo52322a(WarmUpUiProcessRequest warmUpUiProcessRequest, Bundle bundle, awnl awnl);

    /* renamed from: a */
    void mo52323a(GetSaveInstrumentDetailsRequest getSaveInstrumentDetailsRequest, Bundle bundle, awnl awnl);

    /* renamed from: a */
    void mo52324a(SaveInstrumentRequest saveInstrumentRequest, Bundle bundle, awnl awnl);

    /* renamed from: a */
    void mo52325a(String str, String str2, Bundle bundle, awnl awnl);

    /* renamed from: b */
    void mo52326b(Bundle bundle);

    /* renamed from: b */
    void mo52327b(Bundle bundle, awnl awnl);
}
