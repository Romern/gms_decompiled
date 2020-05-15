package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.CreateWalletObjectsRequest;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.NotifyTransactionStatusRequest;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.android.gms.wallet.WebPaymentData;
import com.google.android.gms.wallet.WebPaymentDataRequest;
import com.google.android.gms.wallet.firstparty.ExecuteBuyFlowRequest;
import com.google.android.gms.wallet.firstparty.GetBuyFlowInitializationTokenRequest;
import com.google.android.gms.wallet.firstparty.GetBuyFlowInitializationTokenResponse;
import com.google.android.gms.wallet.firstparty.GetClientTokenRequest;
import com.google.android.gms.wallet.firstparty.GetClientTokenResponse;
import com.google.android.gms.wallet.firstparty.InitializeBuyFlowRequest;
import com.google.android.gms.wallet.firstparty.SetUpBiometricAuthenticationKeysRequest;
import com.google.android.gms.wallet.firstparty.SetUpBiometricAuthenticationKeysResponse;
import com.google.android.gms.wallet.firstparty.WarmUpUiProcessRequest;
import com.google.android.gms.wallet.firstparty.WarmUpUiProcessResponse;
import com.google.android.gms.wallet.firstparty.saveinstrument.GetSaveInstrumentDetailsRequest;
import com.google.android.gms.wallet.firstparty.saveinstrument.GetSaveInstrumentDetailsResponse;
import com.google.android.gms.wallet.firstparty.saveinstrument.SaveInstrumentRequest;

/* renamed from: awww */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awww extends awne {

    /* renamed from: a */
    private final awne f95208a;

    /* renamed from: b */
    private final Context f95209b;

    public awww(Context context, awne awne) {
        this.f95209b = context.getApplicationContext();
        this.f95208a = awne;
    }

    /* renamed from: a */
    public final void mo52308a(Bundle bundle) {
        try {
            this.f95208a.mo52308a(bundle);
        } catch (Throwable th) {
            awye.m81493a(this.f95209b, th);
        }
    }

    /* renamed from: b */
    public final void mo52326b(Bundle bundle) {
        try {
            this.f95208a.mo52326b(bundle);
        } catch (Throwable th) {
            awye.m81493a(this.f95209b, th);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awnl.a(int, boolean, android.os.Bundle):void
     arg types: [int, int, android.os.Bundle]
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
        try {
            this.f95208a.mo52309a(bundle, awnl);
        } catch (DeadObjectException e) {
            Log.w("ExceptionHandlingOwServ", "checkForPreAuthorization: DeadObjectException");
        } catch (Throwable th) {
            awye.m81493a(this.f95209b, th);
            awnl.mo52332a(8, false, Bundle.EMPTY);
        }
    }

    /* renamed from: b */
    public final void mo52327b(Bundle bundle, awnl awnl) {
        try {
            this.f95208a.mo52327b(bundle, awnl);
        } catch (DeadObjectException e) {
            Log.w("ExceptionHandlingOwServ", "isNewUser: DeadObjectException");
        } catch (Throwable th) {
            awye.m81493a(this.f95209b, th);
            awnl.mo52340b(8, false, Bundle.EMPTY);
        }
    }

    /* renamed from: a */
    public final void mo52310a(CreateWalletObjectsRequest createWalletObjectsRequest, Bundle bundle, awnl awnl) {
        try {
            this.f95208a.mo52310a(createWalletObjectsRequest, bundle, awnl);
        } catch (DeadObjectException e) {
            Log.w("ExceptionHandlingOwServ", "createWalletObjects: DeadObjectException");
        } catch (Throwable th) {
            awye.m81493a(this.f95209b, th);
            awnl.mo52329a(8, Bundle.EMPTY);
        }
    }

    /* renamed from: a */
    public final void mo52311a(FullWalletRequest fullWalletRequest, Bundle bundle, awnl awnl) {
        try {
            this.f95208a.mo52311a(fullWalletRequest, bundle, awnl);
        } catch (DeadObjectException e) {
            Log.w("ExceptionHandlingOwServ", "getFullWallet: DeadObjectException");
        } catch (Throwable th) {
            awye.m81493a(this.f95209b, th);
            awap a = FullWallet.m93786a();
            a.mo51791b(fullWalletRequest.f109796b);
            a.mo51790a(fullWalletRequest.f109795a);
            awnl.mo52330a(8, a.f94139a, Bundle.EMPTY);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awnl.a(com.google.android.gms.common.api.Status, boolean, android.os.Bundle):void
     arg types: [com.google.android.gms.common.api.Status, int, android.os.Bundle]
     candidates:
      awnl.a(int, com.google.android.gms.wallet.FullWallet, android.os.Bundle):void
      awnl.a(int, com.google.android.gms.wallet.MaskedWallet, android.os.Bundle):void
      awnl.a(int, boolean, android.os.Bundle):void
      awnl.a(com.google.android.gms.common.api.Status, com.google.android.gms.wallet.PaymentData, android.os.Bundle):void
      awnl.a(com.google.android.gms.common.api.Status, com.google.android.gms.wallet.WebPaymentData, android.os.Bundle):void
      awnl.a(com.google.android.gms.common.api.Status, com.google.android.gms.wallet.firstparty.GetBuyFlowInitializationTokenResponse, android.os.Bundle):void
      awnl.a(com.google.android.gms.common.api.Status, com.google.android.gms.wallet.firstparty.GetClientTokenResponse, android.os.Bundle):void
      awnl.a(com.google.android.gms.common.api.Status, com.google.android.gms.wallet.firstparty.SetUpBiometricAuthenticationKeysResponse, android.os.Bundle):void
      awnl.a(com.google.android.gms.common.api.Status, com.google.android.gms.wallet.firstparty.WarmUpUiProcessResponse, android.os.Bundle):void
      awnl.a(com.google.android.gms.common.api.Status, com.google.android.gms.wallet.firstparty.saveinstrument.GetSaveInstrumentDetailsResponse, android.os.Bundle):void
      awnl.a(com.google.android.gms.common.api.Status, boolean, android.os.Bundle):void */
    /* renamed from: a */
    public final void mo52312a(IsReadyToPayRequest isReadyToPayRequest, Bundle bundle, awnl awnl) {
        try {
            this.f95208a.mo52312a(isReadyToPayRequest, bundle, awnl);
        } catch (DeadObjectException e) {
            Log.w("ExceptionHandlingOwServ", "isReadyToPay: DeadObjectException");
        } catch (Throwable th) {
            awye.m81493a(this.f95209b, th);
            awnl.mo52339a(Status.f30109c, false, Bundle.EMPTY);
        }
    }

    /* renamed from: a */
    public final void mo52313a(MaskedWalletRequest maskedWalletRequest, Bundle bundle, awnl awnl) {
        try {
            this.f95208a.mo52313a(maskedWalletRequest, bundle, awnl);
        } catch (DeadObjectException e) {
            Log.w("ExceptionHandlingOwServ", "getMaskedWalletForPreauthorizedBuyer: DeadObjectException");
        } catch (Throwable th) {
            awye.m81493a(this.f95209b, th);
            awbb a = MaskedWallet.m93790a();
            a.mo51809b(maskedWalletRequest.f109856a);
            awnl.mo52331a(8, a.f94143a, Bundle.EMPTY);
        }
    }

    /* renamed from: a */
    public final void mo52314a(NotifyTransactionStatusRequest notifyTransactionStatusRequest, Bundle bundle) {
        try {
            this.f95208a.mo52314a(notifyTransactionStatusRequest, bundle);
        } catch (Throwable th) {
            awye.m81493a(this.f95209b, th);
        }
    }

    /* renamed from: a */
    public final void mo52315a(PaymentDataRequest paymentDataRequest, Bundle bundle, awnl awnl) {
        try {
            this.f95208a.mo52315a(paymentDataRequest, bundle, awnl);
        } catch (DeadObjectException e) {
            Log.w("ExceptionHandlingOwServ", "loadPaymentData: DeadObjectException");
        } catch (Throwable th) {
            awye.m81493a(this.f95209b, th);
            awnl.mo52333a(Status.f30109c, PaymentData.m93791a().f94145a, Bundle.EMPTY);
        }
    }

    /* renamed from: a */
    public final void mo52316a(WebPaymentDataRequest webPaymentDataRequest, Bundle bundle, awnl awnl) {
        try {
            this.f95208a.mo52316a(webPaymentDataRequest, bundle, awnl);
        } catch (DeadObjectException e) {
            Log.w("ExceptionHandlingOwServ", "loadWebPaymentData: DeadObjectException");
        } catch (Throwable th) {
            awye.m81493a(this.f95209b, th);
            awnl.mo52334a(Status.f30109c, WebPaymentData.m93795a().f94158a, Bundle.EMPTY);
        }
    }

    /* renamed from: a */
    public final void mo52317a(ExecuteBuyFlowRequest executeBuyFlowRequest, Bundle bundle, awnl awnl) {
        try {
            this.f95208a.mo52317a(executeBuyFlowRequest, bundle, awnl);
        } catch (DeadObjectException e) {
            Log.w("ExceptionHandlingOwServ", "executeBuyFlow: DeadObjectException");
        } catch (Throwable th) {
            awye.m81493a(this.f95209b, th);
            awnl.mo52195a(Status.f30109c, Bundle.EMPTY);
        }
    }

    /* renamed from: a */
    public final void mo52318a(GetBuyFlowInitializationTokenRequest getBuyFlowInitializationTokenRequest, Bundle bundle, awnl awnl) {
        try {
            this.f95208a.mo52318a(getBuyFlowInitializationTokenRequest, bundle, awnl);
        } catch (DeadObjectException e) {
            Log.w("ExceptionHandlingOwServ", "getBuyFlowInitializationToken: DeadObjectException");
        } catch (Throwable th) {
            awye.m81493a(this.f95209b, th);
            awnl.mo52335a(Status.f30109c, new GetBuyFlowInitializationTokenResponse(new byte[0]), Bundle.EMPTY);
        }
    }

    /* renamed from: a */
    public final void mo52319a(GetClientTokenRequest getClientTokenRequest, Bundle bundle, awnl awnl) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            this.f95208a.mo52319a(getClientTokenRequest, bundle, awnl);
        } catch (DeadObjectException e) {
            Log.w("ExceptionHandlingOwServ", "getClientToken: DeadObjectException");
        } catch (Throwable th) {
            awxj.m81402a(this.f95209b, awxj.m81404b(bundle), bpic.f137715f.mo74144da(), 5, elapsedRealtime);
            awye.m81493a(this.f95209b, th);
            awnl.mo52336a(Status.f30109c, new GetClientTokenResponse(new byte[0]), Bundle.EMPTY);
        }
    }

    /* renamed from: a */
    public final void mo52320a(InitializeBuyFlowRequest initializeBuyFlowRequest, Bundle bundle, awnl awnl) {
        try {
            this.f95208a.mo52320a(initializeBuyFlowRequest, bundle, awnl);
        } catch (DeadObjectException e) {
            Log.w("ExceptionHandlingOwServ", "initializeBuyFlow: DeadObjectException");
        } catch (Throwable th) {
            awye.m81493a(this.f95209b, th);
            awnl.mo52341c(Status.f30109c, Bundle.EMPTY);
        }
    }

    /* renamed from: a */
    public final void mo52321a(SetUpBiometricAuthenticationKeysRequest setUpBiometricAuthenticationKeysRequest, Bundle bundle, awnl awnl) {
        try {
            this.f95208a.mo52321a(setUpBiometricAuthenticationKeysRequest, bundle, awnl);
        } catch (DeadObjectException e) {
            Log.w("ExceptionHandlingOwServ", "setUpBiometricAuthenticationKeys: DeadObjectException");
        } catch (Throwable th) {
            awye.m81493a(this.f95209b, th);
            awnl.mo52337a(Status.f30109c, new SetUpBiometricAuthenticationKeysResponse(null), Bundle.EMPTY);
        }
    }

    /* renamed from: a */
    public final void mo52322a(WarmUpUiProcessRequest warmUpUiProcessRequest, Bundle bundle, awnl awnl) {
        try {
            this.f95208a.mo52322a(warmUpUiProcessRequest, bundle, awnl);
        } catch (DeadObjectException e) {
            Log.w("ExceptionHandlingOwServ", "warmUpUiProcess: DeadObjectException");
        } catch (Throwable th) {
            awye.m81493a(this.f95209b, th);
            awnl.mo52338a(Status.f30109c, new WarmUpUiProcessResponse(null), Bundle.EMPTY);
        }
    }

    /* renamed from: a */
    public final void mo52323a(GetSaveInstrumentDetailsRequest getSaveInstrumentDetailsRequest, Bundle bundle, awnl awnl) {
        try {
            this.f95208a.mo52323a(getSaveInstrumentDetailsRequest, bundle, awnl);
        } catch (DeadObjectException e) {
            Log.w("ExceptionHandlingOwServ", "saveInstrument: DeadObjectException");
        } catch (Throwable th) {
            awye.m81493a(this.f95209b, th);
            awnl.mo52197a(Status.f30109c, GetSaveInstrumentDetailsResponse.m93939a().mo52247a(), Bundle.EMPTY);
        }
    }

    /* renamed from: a */
    public final void mo52324a(SaveInstrumentRequest saveInstrumentRequest, Bundle bundle, awnl awnl) {
        try {
            this.f95208a.mo52324a(saveInstrumentRequest, bundle, awnl);
        } catch (DeadObjectException e) {
            Log.w("ExceptionHandlingOwServ", "saveInstrument: DeadObjectException");
        } catch (Throwable th) {
            awye.m81493a(this.f95209b, th);
            awnl.mo52196b(Status.f30109c, Bundle.EMPTY);
        }
    }

    /* renamed from: a */
    public final void mo52325a(String str, String str2, Bundle bundle, awnl awnl) {
        try {
            this.f95208a.mo52325a(str, str2, bundle, awnl);
        } catch (DeadObjectException e) {
            Log.w("ExceptionHandlingOwServ", "changeMaskedWallet: DeadObjectException");
        } catch (Throwable th) {
            awye.m81493a(this.f95209b, th);
            awbb a = MaskedWallet.m93790a();
            a.mo51809b(str2);
            a.mo51808a(str);
            awnl.mo52331a(8, a.f94143a, Bundle.EMPTY);
        }
    }
}
