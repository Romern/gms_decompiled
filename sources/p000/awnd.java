package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
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

/* renamed from: awnd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awnd extends dcj implements awnf {
    public awnd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.wallet.internal.IOwService");
    }

    /* renamed from: a */
    public final void mo52308a(Bundle bundle) {
        throw null;
    }

    /* renamed from: a */
    public final void mo52309a(Bundle bundle, awnl awnl) {
        throw null;
    }

    /* renamed from: a */
    public final void mo52310a(CreateWalletObjectsRequest createWalletObjectsRequest, Bundle bundle, awnl awnl) {
        throw null;
    }

    /* renamed from: a */
    public final void mo52311a(FullWalletRequest fullWalletRequest, Bundle bundle, awnl awnl) {
        throw null;
    }

    /* renamed from: a */
    public final void mo52312a(IsReadyToPayRequest isReadyToPayRequest, Bundle bundle, awnl awnl) {
        throw null;
    }

    /* renamed from: a */
    public final void mo52313a(MaskedWalletRequest maskedWalletRequest, Bundle bundle, awnl awnl) {
        throw null;
    }

    /* renamed from: a */
    public final void mo52314a(NotifyTransactionStatusRequest notifyTransactionStatusRequest, Bundle bundle) {
        throw null;
    }

    /* renamed from: a */
    public final void mo52315a(PaymentDataRequest paymentDataRequest, Bundle bundle, awnl awnl) {
        throw null;
    }

    /* renamed from: a */
    public final void mo52316a(WebPaymentDataRequest webPaymentDataRequest, Bundle bundle, awnl awnl) {
        throw null;
    }

    /* renamed from: a */
    public final void mo52318a(GetBuyFlowInitializationTokenRequest getBuyFlowInitializationTokenRequest, Bundle bundle, awnl awnl) {
        throw null;
    }

    /* renamed from: a */
    public final void mo52320a(InitializeBuyFlowRequest initializeBuyFlowRequest, Bundle bundle, awnl awnl) {
        throw null;
    }

    /* renamed from: a */
    public final void mo52321a(SetUpBiometricAuthenticationKeysRequest setUpBiometricAuthenticationKeysRequest, Bundle bundle, awnl awnl) {
        throw null;
    }

    /* renamed from: a */
    public final void mo52322a(WarmUpUiProcessRequest warmUpUiProcessRequest, Bundle bundle, awnl awnl) {
        throw null;
    }

    /* renamed from: a */
    public final void mo52325a(String str, String str2, Bundle bundle, awnl awnl) {
        throw null;
    }

    /* renamed from: b */
    public final void mo52326b(Bundle bundle) {
        throw null;
    }

    /* renamed from: b */
    public final void mo52327b(Bundle bundle, awnl awnl) {
        throw null;
    }

    /* renamed from: a */
    public final void mo52317a(ExecuteBuyFlowRequest executeBuyFlowRequest, Bundle bundle, awnl awnl) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, executeBuyFlowRequest);
        dcl.m8165a(bj, bundle);
        dcl.m8164a(bj, awnl);
        mo8530c(16, bj);
    }

    /* renamed from: a */
    public final void mo52319a(GetClientTokenRequest getClientTokenRequest, Bundle bundle, awnl awnl) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, getClientTokenRequest);
        dcl.m8165a(bj, bundle);
        dcl.m8164a(bj, awnl);
        mo8530c(15, bj);
    }

    /* renamed from: a */
    public final void mo52323a(GetSaveInstrumentDetailsRequest getSaveInstrumentDetailsRequest, Bundle bundle, awnl awnl) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, getSaveInstrumentDetailsRequest);
        dcl.m8165a(bj, bundle);
        dcl.m8164a(bj, awnl);
        mo8530c(20, bj);
    }

    /* renamed from: a */
    public final void mo52324a(SaveInstrumentRequest saveInstrumentRequest, Bundle bundle, awnl awnl) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, saveInstrumentRequest);
        dcl.m8165a(bj, bundle);
        dcl.m8164a(bj, awnl);
        mo8530c(18, bj);
    }
}
