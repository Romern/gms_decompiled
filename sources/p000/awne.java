package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
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

/* renamed from: awne */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class awne extends dck implements awnf {
    public awne() {
        super("com.google.android.gms.wallet.internal.IOwService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        awnl awnl = null;
        switch (i) {
            case 1:
                MaskedWalletRequest maskedWalletRequest = (MaskedWalletRequest) dcl.m8163a(parcel, MaskedWalletRequest.CREATOR);
                Bundle bundle = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                    if (queryLocalInterface instanceof awnl) {
                        awnl = (awnl) queryLocalInterface;
                    } else {
                        awnl = new awnj(readStrongBinder);
                    }
                }
                mo52313a(maskedWalletRequest, bundle, awnl);
                return true;
            case 2:
                FullWalletRequest fullWalletRequest = (FullWalletRequest) dcl.m8163a(parcel, FullWalletRequest.CREATOR);
                Bundle bundle2 = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                    awnl = queryLocalInterface2 instanceof awnl ? (awnl) queryLocalInterface2 : new awnj(readStrongBinder2);
                }
                mo52311a(fullWalletRequest, bundle2, awnl);
                return true;
            case 3:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle3 = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                    if (queryLocalInterface3 instanceof awnl) {
                        awnl = (awnl) queryLocalInterface3;
                    } else {
                        awnl = new awnj(readStrongBinder3);
                    }
                }
                mo52325a(readString, readString2, bundle3, awnl);
                return true;
            case 4:
                mo52314a((NotifyTransactionStatusRequest) dcl.m8163a(parcel, NotifyTransactionStatusRequest.CREATOR), (Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
                return true;
            case 5:
                Bundle bundle4 = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                    if (queryLocalInterface4 instanceof awnl) {
                        awnl = (awnl) queryLocalInterface4;
                    } else {
                        awnl = new awnj(readStrongBinder4);
                    }
                }
                mo52309a(bundle4, awnl);
                return true;
            case 6:
                CreateWalletObjectsRequest createWalletObjectsRequest = (CreateWalletObjectsRequest) dcl.m8163a(parcel, CreateWalletObjectsRequest.CREATOR);
                Bundle bundle5 = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                    if (queryLocalInterface5 instanceof awnl) {
                        awnl = (awnl) queryLocalInterface5;
                    } else {
                        awnl = new awnj(readStrongBinder5);
                    }
                }
                mo52310a(createWalletObjectsRequest, bundle5, awnl);
                return true;
            case 7:
            case 8:
            default:
                return false;
            case 9:
                mo52308a((Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
                return true;
            case 10:
                mo52326b((Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
                return true;
            case 11:
                Bundle bundle6 = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                    if (queryLocalInterface6 instanceof awnl) {
                        awnl = (awnl) queryLocalInterface6;
                    } else {
                        awnl = new awnj(readStrongBinder6);
                    }
                }
                mo52327b(bundle6, awnl);
                return true;
            case 12:
                GetBuyFlowInitializationTokenRequest getBuyFlowInitializationTokenRequest = (GetBuyFlowInitializationTokenRequest) dcl.m8163a(parcel, GetBuyFlowInitializationTokenRequest.CREATOR);
                Bundle bundle7 = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                    if (queryLocalInterface7 instanceof awnl) {
                        awnl = (awnl) queryLocalInterface7;
                    } else {
                        awnl = new awnj(readStrongBinder7);
                    }
                }
                mo52318a(getBuyFlowInitializationTokenRequest, bundle7, awnl);
                return true;
            case 13:
                InitializeBuyFlowRequest initializeBuyFlowRequest = (InitializeBuyFlowRequest) dcl.m8163a(parcel, InitializeBuyFlowRequest.CREATOR);
                Bundle bundle8 = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                    if (queryLocalInterface8 instanceof awnl) {
                        awnl = (awnl) queryLocalInterface8;
                    } else {
                        awnl = new awnj(readStrongBinder8);
                    }
                }
                mo52320a(initializeBuyFlowRequest, bundle8, awnl);
                return true;
            case 14:
                IsReadyToPayRequest isReadyToPayRequest = (IsReadyToPayRequest) dcl.m8163a(parcel, IsReadyToPayRequest.CREATOR);
                Bundle bundle9 = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                    if (queryLocalInterface9 instanceof awnl) {
                        awnl = (awnl) queryLocalInterface9;
                    } else {
                        awnl = new awnj(readStrongBinder9);
                    }
                }
                mo52312a(isReadyToPayRequest, bundle9, awnl);
                return true;
            case 15:
                GetClientTokenRequest getClientTokenRequest = (GetClientTokenRequest) dcl.m8163a(parcel, GetClientTokenRequest.CREATOR);
                Bundle bundle10 = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                    if (queryLocalInterface10 instanceof awnl) {
                        awnl = (awnl) queryLocalInterface10;
                    } else {
                        awnl = new awnj(readStrongBinder10);
                    }
                }
                mo52319a(getClientTokenRequest, bundle10, awnl);
                return true;
            case 16:
                ExecuteBuyFlowRequest executeBuyFlowRequest = (ExecuteBuyFlowRequest) dcl.m8163a(parcel, ExecuteBuyFlowRequest.CREATOR);
                Bundle bundle11 = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                    if (queryLocalInterface11 instanceof awnl) {
                        awnl = (awnl) queryLocalInterface11;
                    } else {
                        awnl = new awnj(readStrongBinder11);
                    }
                }
                mo52317a(executeBuyFlowRequest, bundle11, awnl);
                return true;
            case 17:
                WebPaymentDataRequest webPaymentDataRequest = (WebPaymentDataRequest) dcl.m8163a(parcel, WebPaymentDataRequest.CREATOR);
                Bundle bundle12 = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                    if (queryLocalInterface12 instanceof awnl) {
                        awnl = (awnl) queryLocalInterface12;
                    } else {
                        awnl = new awnj(readStrongBinder12);
                    }
                }
                mo52316a(webPaymentDataRequest, bundle12, awnl);
                return true;
            case 18:
                SaveInstrumentRequest saveInstrumentRequest = (SaveInstrumentRequest) dcl.m8163a(parcel, SaveInstrumentRequest.CREATOR);
                Bundle bundle13 = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                    if (queryLocalInterface13 instanceof awnl) {
                        awnl = (awnl) queryLocalInterface13;
                    } else {
                        awnl = new awnj(readStrongBinder13);
                    }
                }
                mo52324a(saveInstrumentRequest, bundle13, awnl);
                return true;
            case 19:
                PaymentDataRequest paymentDataRequest = (PaymentDataRequest) dcl.m8163a(parcel, PaymentDataRequest.CREATOR);
                Bundle bundle14 = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                    if (queryLocalInterface14 instanceof awnl) {
                        awnl = (awnl) queryLocalInterface14;
                    } else {
                        awnl = new awnj(readStrongBinder14);
                    }
                }
                mo52315a(paymentDataRequest, bundle14, awnl);
                return true;
            case 20:
                GetSaveInstrumentDetailsRequest getSaveInstrumentDetailsRequest = (GetSaveInstrumentDetailsRequest) dcl.m8163a(parcel, GetSaveInstrumentDetailsRequest.CREATOR);
                Bundle bundle15 = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                    if (queryLocalInterface15 instanceof awnl) {
                        awnl = (awnl) queryLocalInterface15;
                    } else {
                        awnl = new awnj(readStrongBinder15);
                    }
                }
                mo52323a(getSaveInstrumentDetailsRequest, bundle15, awnl);
                return true;
            case 21:
                SetUpBiometricAuthenticationKeysRequest setUpBiometricAuthenticationKeysRequest = (SetUpBiometricAuthenticationKeysRequest) dcl.m8163a(parcel, SetUpBiometricAuthenticationKeysRequest.CREATOR);
                Bundle bundle16 = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                    if (queryLocalInterface16 instanceof awnl) {
                        awnl = (awnl) queryLocalInterface16;
                    } else {
                        awnl = new awnj(readStrongBinder16);
                    }
                }
                mo52321a(setUpBiometricAuthenticationKeysRequest, bundle16, awnl);
                return true;
            case 22:
                WarmUpUiProcessRequest warmUpUiProcessRequest = (WarmUpUiProcessRequest) dcl.m8163a(parcel, WarmUpUiProcessRequest.CREATOR);
                Bundle bundle17 = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                    if (queryLocalInterface17 instanceof awnl) {
                        awnl = (awnl) queryLocalInterface17;
                    } else {
                        awnl = new awnj(readStrongBinder17);
                    }
                }
                mo52322a(warmUpUiProcessRequest, bundle17, awnl);
                return true;
        }
    }
}
