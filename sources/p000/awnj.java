package p000;

import android.os.Bundle;
import android.os.IBinder;
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

/* renamed from: awnj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awnj extends dcj implements awnl {
    public awnj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
    }

    /* renamed from: a */
    public final void mo52329a(int i, Bundle bundle) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        dcl.m8165a(bj, bundle);
        mo8530c(4, bj);
    }

    /* renamed from: b */
    public final void mo52340b(int i, boolean z, Bundle bundle) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        dcl.m8166a(bj, z);
        dcl.m8165a(bj, bundle);
        mo8530c(6, bj);
    }

    /* renamed from: c */
    public final void mo52341c(Status status, Bundle bundle) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, bundle);
        mo8530c(8, bj);
    }

    /* renamed from: a */
    public final void mo52330a(int i, FullWallet fullWallet, Bundle bundle) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        dcl.m8165a(bj, fullWallet);
        dcl.m8165a(bj, bundle);
        mo8530c(2, bj);
    }

    /* renamed from: b */
    public final void mo52196b(Status status, Bundle bundle) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, bundle);
        mo8530c(13, bj);
    }

    /* renamed from: a */
    public final void mo52331a(int i, MaskedWallet maskedWallet, Bundle bundle) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        dcl.m8165a(bj, maskedWallet);
        dcl.m8165a(bj, bundle);
        mo8530c(1, bj);
    }

    /* renamed from: a */
    public final void mo52332a(int i, boolean z, Bundle bundle) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        dcl.m8166a(bj, z);
        dcl.m8165a(bj, bundle);
        mo8530c(3, bj);
    }

    /* renamed from: a */
    public final void mo52195a(Status status, Bundle bundle) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, bundle);
        mo8530c(11, bj);
    }

    /* renamed from: a */
    public final void mo52333a(Status status, PaymentData paymentData, Bundle bundle) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, paymentData);
        dcl.m8165a(bj, bundle);
        mo8530c(14, bj);
    }

    /* renamed from: a */
    public final void mo52334a(Status status, WebPaymentData webPaymentData, Bundle bundle) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, webPaymentData);
        dcl.m8165a(bj, bundle);
        mo8530c(12, bj);
    }

    /* renamed from: a */
    public final void mo52335a(Status status, GetBuyFlowInitializationTokenResponse getBuyFlowInitializationTokenResponse, Bundle bundle) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, getBuyFlowInitializationTokenResponse);
        dcl.m8165a(bj, bundle);
        mo8530c(7, bj);
    }

    /* renamed from: a */
    public final void mo52336a(Status status, GetClientTokenResponse getClientTokenResponse, Bundle bundle) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, getClientTokenResponse);
        dcl.m8165a(bj, bundle);
        mo8530c(10, bj);
    }

    /* renamed from: a */
    public final void mo52337a(Status status, SetUpBiometricAuthenticationKeysResponse setUpBiometricAuthenticationKeysResponse, Bundle bundle) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, setUpBiometricAuthenticationKeysResponse);
        dcl.m8165a(bj, bundle);
        mo8530c(16, bj);
    }

    /* renamed from: a */
    public final void mo52338a(Status status, WarmUpUiProcessResponse warmUpUiProcessResponse, Bundle bundle) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, warmUpUiProcessResponse);
        dcl.m8165a(bj, bundle);
        mo8530c(17, bj);
    }

    /* renamed from: a */
    public final void mo52197a(Status status, GetSaveInstrumentDetailsResponse getSaveInstrumentDetailsResponse, Bundle bundle) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, getSaveInstrumentDetailsResponse);
        dcl.m8165a(bj, bundle);
        mo8530c(15, bj);
    }

    /* renamed from: a */
    public final void mo52339a(Status status, boolean z, Bundle bundle) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8166a(bj, z);
        dcl.m8165a(bj, bundle);
        mo8530c(9, bj);
    }
}
