package p000;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.CreateWalletObjectsRequest;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.NotifyTransactionStatusRequest;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.android.gms.wallet.WebPaymentDataRequest;
import com.google.android.gms.wallet.firstparty.ExecuteBuyFlowRequest;
import com.google.android.gms.wallet.firstparty.GetBuyFlowInitializationTokenRequest;
import com.google.android.gms.wallet.firstparty.GetClientTokenRequest;
import com.google.android.gms.wallet.firstparty.InitializeBuyFlowRequest;
import com.google.android.gms.wallet.firstparty.SetUpBiometricAuthenticationKeysRequest;
import com.google.android.gms.wallet.firstparty.SetUpBiometricAuthenticationKeysResponse;
import com.google.android.gms.wallet.firstparty.WarmUpUiProcessRequest;
import com.google.android.gms.wallet.firstparty.WarmUpUiProcessResponse;
import com.google.android.gms.wallet.firstparty.saveinstrument.GetSaveInstrumentDetailsRequest;
import com.google.android.gms.wallet.firstparty.saveinstrument.GetSaveInstrumentDetailsResponse;
import com.google.android.gms.wallet.firstparty.saveinstrument.SaveInstrumentRequest;

/* renamed from: awxg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awxg extends awne {

    /* renamed from: a */
    private final Context f95232a;

    /* renamed from: b */
    private final awne f95233b;

    public awxg(Context context, awne awne) {
        this.f95232a = context.getApplicationContext();
        this.f95233b = awne;
    }

    /* renamed from: c */
    private final void m81376c(Bundle bundle) {
        Log.w("NetworkPanoOwService", "Wallet API is not available on Android TV");
        awxj.m81401a(this.f95232a, (int) ErrorInfo.TYPE_FELICA_EXCEPTION_TIMEOUT_OCCURRED, "Wallet API is not available on Android TV", bundle.getString("androidPackageName"), bundle);
    }

    /* renamed from: a */
    public final void mo52308a(Bundle bundle) {
        m81376c(bundle);
    }

    /* renamed from: a */
    public final void mo52320a(InitializeBuyFlowRequest initializeBuyFlowRequest, Bundle bundle, awnl awnl) {
    }

    /* renamed from: b */
    public final void mo52326b(Bundle bundle) {
        m81376c(bundle);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awnl.a(int, boolean, android.os.Bundle):void
     arg types: [?, int, android.os.Bundle]
     candidates:
      awnl.a(int, com.google.android.gms.wallet.FullWallet, android.os.Bundle):void
      awnl.a(int, com.google.android.gms.wallet.MaskedWallet, android.os.Bundle):void
      awnl.a(com.google.android.gms.common.api.Status, com.google.android.gms.wallet.PaymentData, android.os.Bundle):void
      awnl.a(com.google.android.gms.common.api.Status, com.google.android.gms.wallet.WebPaymentData, android.os.Bundle):void
      awnl.a(com.google.android.gms.common.api.Status, com.google.android.gms.wallet.firstparty.GetBuyFlowInitializationTokenResponse, android.os.Bundle):void
      awnl.a(com.google.android.gms.common.api.Status, com.google.android.gms.wallet.firstparty.GetClientTokenResponse, android.os.Bundle):void
      awnl.a(com.google.android.gms.common.api.Status, com.google.android.gms.wallet.firstparty.SetUpBiometricAuthenticationKeysResponse, android.os.Bundle):void
      awnl.a(com.google.android.gms.common.api.Status, com.google.android.gms.wallet.firstparty.WarmUpUiProcessResponse, android.os.Bundle):void
      awnl.a(com.google.android.gms.common.api.Status, com.google.android.gms.wallet.firstparty.saveinstrument.GetSaveInstrumentDetailsResponse, android.os.Bundle):void
      awnl.a(com.google.android.gms.common.api.Status, boolean, android.os.Bundle):void
      awnl.a(int, boolean, android.os.Bundle):void */
    /* renamed from: a */
    public final void mo52309a(Bundle bundle, awnl awnl) {
        m81376c(bundle);
        awnl.mo52332a((int) ErrorInfo.TYPE_FELICA_EXCEPTION_TIMEOUT_OCCURRED, false, Bundle.EMPTY);
    }

    /* renamed from: b */
    public final void mo52327b(Bundle bundle, awnl awnl) {
        m81376c(bundle);
        awnl.mo52340b(ErrorInfo.TYPE_FELICA_EXCEPTION_TIMEOUT_OCCURRED, false, Bundle.EMPTY);
    }

    /* renamed from: a */
    public final void mo52310a(CreateWalletObjectsRequest createWalletObjectsRequest, Bundle bundle, awnl awnl) {
        m81376c(bundle);
        awnl.mo52329a((int) ErrorInfo.TYPE_FELICA_EXCEPTION_TIMEOUT_OCCURRED, Bundle.EMPTY);
    }

    /* renamed from: a */
    public final void mo52311a(FullWalletRequest fullWalletRequest, Bundle bundle, awnl awnl) {
        m81376c(bundle);
        awnl.mo52330a((int) ErrorInfo.TYPE_FELICA_EXCEPTION_TIMEOUT_OCCURRED, (FullWallet) null, Bundle.EMPTY);
    }

    /* renamed from: a */
    public final void mo52312a(IsReadyToPayRequest isReadyToPayRequest, Bundle bundle, awnl awnl) {
        m81376c(bundle);
        this.f95233b.mo52312a(isReadyToPayRequest, bundle, awnl);
    }

    /* renamed from: a */
    public final void mo52313a(MaskedWalletRequest maskedWalletRequest, Bundle bundle, awnl awnl) {
        m81376c(bundle);
        awnl.mo52331a((int) ErrorInfo.TYPE_FELICA_EXCEPTION_TIMEOUT_OCCURRED, (MaskedWallet) null, Bundle.EMPTY);
    }

    /* renamed from: a */
    public final void mo52314a(NotifyTransactionStatusRequest notifyTransactionStatusRequest, Bundle bundle) {
        m81376c(bundle);
    }

    /* renamed from: a */
    public final void mo52315a(PaymentDataRequest paymentDataRequest, Bundle bundle, awnl awnl) {
        this.f95233b.mo52315a(paymentDataRequest, bundle, awnl);
    }

    /* renamed from: a */
    public final void mo52316a(WebPaymentDataRequest webPaymentDataRequest, Bundle bundle, awnl awnl) {
        this.f95233b.mo52316a(webPaymentDataRequest, bundle, awnl);
    }

    /* renamed from: a */
    public final void mo52317a(ExecuteBuyFlowRequest executeBuyFlowRequest, Bundle bundle, awnl awnl) {
        this.f95233b.mo52317a(executeBuyFlowRequest, bundle, awnl);
    }

    /* renamed from: a */
    public final void mo52318a(GetBuyFlowInitializationTokenRequest getBuyFlowInitializationTokenRequest, Bundle bundle, awnl awnl) {
        this.f95233b.mo52318a(getBuyFlowInitializationTokenRequest, bundle, awnl);
    }

    /* renamed from: a */
    public final void mo52319a(GetClientTokenRequest getClientTokenRequest, Bundle bundle, awnl awnl) {
        this.f95233b.mo52319a(getClientTokenRequest, bundle, awnl);
    }

    /* renamed from: a */
    public final void mo52321a(SetUpBiometricAuthenticationKeysRequest setUpBiometricAuthenticationKeysRequest, Bundle bundle, awnl awnl) {
        m81376c(bundle);
        awnl.mo52337a(Status.f30109c, new SetUpBiometricAuthenticationKeysResponse(null), Bundle.EMPTY);
    }

    /* renamed from: a */
    public final void mo52322a(WarmUpUiProcessRequest warmUpUiProcessRequest, Bundle bundle, awnl awnl) {
        m81376c(bundle);
        awnl.mo52338a(Status.f30109c, new WarmUpUiProcessResponse(null), Bundle.EMPTY);
    }

    /* renamed from: a */
    public final void mo52323a(GetSaveInstrumentDetailsRequest getSaveInstrumentDetailsRequest, Bundle bundle, awnl awnl) {
        m81376c(bundle);
        awnl.mo52197a(Status.f30109c, GetSaveInstrumentDetailsResponse.m93939a().mo52247a(), Bundle.EMPTY);
    }

    /* renamed from: a */
    public final void mo52324a(SaveInstrumentRequest saveInstrumentRequest, Bundle bundle, awnl awnl) {
        m81376c(bundle);
        awnl.mo52196b(Status.f30109c, Bundle.EMPTY);
    }

    /* renamed from: a */
    public final void mo52325a(String str, String str2, Bundle bundle, awnl awnl) {
        m81376c(bundle);
        awnl.mo52331a((int) ErrorInfo.TYPE_FELICA_EXCEPTION_TIMEOUT_OCCURRED, (MaskedWallet) null, Bundle.EMPTY);
    }
}
