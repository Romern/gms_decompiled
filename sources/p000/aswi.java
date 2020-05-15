package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.felicanetworks.mfc.FelicaException;
import com.felicanetworks.mfc.KeyInformation;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.firstparty.RetrieveInAppPaymentCredentialRequest;
import com.google.android.gms.tapandpay.firstparty.SendTransmissionEventRequest;
import com.google.android.gms.tapandpay.firstparty.SyncDeviceInfoRequest;
import com.google.android.gms.tapandpay.globalactions.GetGlobalActionCardsRequest;
import com.google.android.gms.tapandpay.globalactions.SelectGlobalActionCardRequest;
import com.google.android.gms.tapandpay.internal.firstparty.AddOtherPaymentOptionRequest;
import com.google.android.gms.tapandpay.internal.firstparty.DeleteTokenRequest;
import com.google.android.gms.tapandpay.internal.firstparty.DisableSelectedTokenRequest;
import com.google.android.gms.tapandpay.internal.firstparty.EnablePayOnWearRequest;
import com.google.android.gms.tapandpay.internal.firstparty.FirstPartyTokenizePanRequest;
import com.google.android.gms.tapandpay.internal.firstparty.GetActiveAccountRequest;
import com.google.android.gms.tapandpay.internal.firstparty.GetActiveCardsForAccountRequest;
import com.google.android.gms.tapandpay.internal.firstparty.GetActiveTokensForAccountRequest;
import com.google.android.gms.tapandpay.internal.firstparty.GetAllCardsRequest;
import com.google.android.gms.tapandpay.internal.firstparty.GetAvailableOtherPaymentMethodsRequest;
import com.google.android.gms.tapandpay.internal.firstparty.GetLastAttestationResultRequest;
import com.google.android.gms.tapandpay.internal.firstparty.GetNotificationSettingsRequest;
import com.google.android.gms.tapandpay.internal.firstparty.GetReceivesTransactionNotificationsRequest;
import com.google.android.gms.tapandpay.internal.firstparty.GetSeChipTransactionsRequest;
import com.google.android.gms.tapandpay.internal.firstparty.IsDeviceUnlockedForInAppPaymentRequest;
import com.google.android.gms.tapandpay.internal.firstparty.IsDeviceUnlockedForPaymentRequest;
import com.google.android.gms.tapandpay.internal.firstparty.PromptDeviceUnlockForPaymentRequest;
import com.google.android.gms.tapandpay.internal.firstparty.RefreshSeCardsRequest;
import com.google.android.gms.tapandpay.internal.firstparty.ReleaseResourceRequest;
import com.google.android.gms.tapandpay.internal.firstparty.ReportInAppTransactionCompletedRequest;
import com.google.android.gms.tapandpay.internal.firstparty.ReserveResourceRequest;
import com.google.android.gms.tapandpay.internal.firstparty.SendTapEventRequest;
import com.google.android.gms.tapandpay.internal.firstparty.SetActiveAccountRequest;
import com.google.android.gms.tapandpay.internal.firstparty.SetFelicaTosAcceptanceRequest;
import com.google.android.gms.tapandpay.internal.firstparty.SetNotificationSettingsRequest;
import com.google.android.gms.tapandpay.internal.firstparty.SetReceivesTransactionNotificationsRequest;
import com.google.android.gms.tapandpay.internal.firstparty.SetSelectedTokenRequest;
import com.google.android.gms.tapandpay.internal.firstparty.ShowNotificationSettingsRequest;
import com.google.android.gms.tapandpay.internal.firstparty.ShowSecurityPromptRequest;
import com.google.android.gms.tapandpay.internal.firstparty.TokenizeAccountRequest;
import com.google.android.gms.tapandpay.issuer.CreatePushTokenizeSessionRequest;
import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import com.google.android.gms.tapandpay.quickaccesswallet.GetQuickAccessWalletConfigRequest;
import com.google.android.gms.tapandpay.quickaccesswallet.SetQuickAccessWalletCardsRequest;

/* renamed from: aswi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aswi extends dck implements aswj {
    public aswi() {
        super("com.google.android.gms.tapandpay.internal.ITapAndPayService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        aswm aswm = null;
        switch (i) {
            case 1:
                SetSelectedTokenRequest setSelectedTokenRequest = (SetSelectedTokenRequest) dcl.m8163a(parcel, SetSelectedTokenRequest.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
                    if (queryLocalInterface instanceof aswm) {
                        aswm = (aswm) queryLocalInterface;
                    } else {
                        aswm = new aswk(readStrongBinder);
                    }
                }
                mo49579a(setSelectedTokenRequest, aswm);
                parcel2.writeNoException();
                return true;
            case 2:
                GetAllCardsRequest getAllCardsRequest = (GetAllCardsRequest) dcl.m8163a(parcel, GetAllCardsRequest.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
                    aswm = queryLocalInterface2 instanceof aswm ? (aswm) queryLocalInterface2 : new aswk(readStrongBinder2);
                }
                mo49561a(getAllCardsRequest, aswm);
                parcel2.writeNoException();
                return true;
            case 3:
                DeleteTokenRequest deleteTokenRequest = (DeleteTokenRequest) dcl.m8163a(parcel, DeleteTokenRequest.CREATOR);
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
                    if (queryLocalInterface3 instanceof aswm) {
                        aswm = (aswm) queryLocalInterface3;
                    } else {
                        aswm = new aswk(readStrongBinder3);
                    }
                }
                mo49554a(deleteTokenRequest, aswm);
                parcel2.writeNoException();
                return true;
            case 4:
                FirstPartyTokenizePanRequest firstPartyTokenizePanRequest = (FirstPartyTokenizePanRequest) dcl.m8163a(parcel, FirstPartyTokenizePanRequest.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
                    if (queryLocalInterface4 instanceof aswm) {
                        aswm = (aswm) queryLocalInterface4;
                    } else {
                        aswm = new aswk(readStrongBinder4);
                    }
                }
                mo49557a(firstPartyTokenizePanRequest, aswm);
                parcel2.writeNoException();
                return true;
            case 5:
                SetActiveAccountRequest setActiveAccountRequest = (SetActiveAccountRequest) dcl.m8163a(parcel, SetActiveAccountRequest.CREATOR);
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
                    if (queryLocalInterface5 instanceof aswm) {
                        aswm = (aswm) queryLocalInterface5;
                    } else {
                        aswm = new aswk(readStrongBinder5);
                    }
                }
                mo49575a(setActiveAccountRequest, aswm);
                parcel2.writeNoException();
                return true;
            case 6:
            case 7:
            case 17:
            case 19:
            case 36:
            case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
            case FelicaException.TYPE_GET_CONTAINER_ID_FAILED:
            case 47:
            case 48:
            default:
                return false;
            case 8:
                ShowSecurityPromptRequest showSecurityPromptRequest = (ShowSecurityPromptRequest) dcl.m8163a(parcel, ShowSecurityPromptRequest.CREATOR);
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
                    if (queryLocalInterface6 instanceof aswm) {
                        aswm = (aswm) queryLocalInterface6;
                    } else {
                        aswm = new aswk(readStrongBinder6);
                    }
                }
                mo49581a(showSecurityPromptRequest, aswm);
                parcel2.writeNoException();
                return true;
            case 9:
                GetActiveAccountRequest getActiveAccountRequest = (GetActiveAccountRequest) dcl.m8163a(parcel, GetActiveAccountRequest.CREATOR);
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
                    if (queryLocalInterface7 instanceof aswm) {
                        aswm = (aswm) queryLocalInterface7;
                    } else {
                        aswm = new aswk(readStrongBinder7);
                    }
                }
                mo49558a(getActiveAccountRequest, aswm);
                parcel2.writeNoException();
                return true;
            case 10:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
                    if (queryLocalInterface8 instanceof aswm) {
                        aswm = (aswm) queryLocalInterface8;
                    } else {
                        aswm = new aswk(readStrongBinder8);
                    }
                }
                mo49594d(aswm);
                parcel2.writeNoException();
                return true;
            case 11:
                IsDeviceUnlockedForPaymentRequest isDeviceUnlockedForPaymentRequest = (IsDeviceUnlockedForPaymentRequest) dcl.m8163a(parcel, IsDeviceUnlockedForPaymentRequest.CREATOR);
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
                    if (queryLocalInterface9 instanceof aswm) {
                        aswm = (aswm) queryLocalInterface9;
                    } else {
                        aswm = new aswk(readStrongBinder9);
                    }
                }
                mo49568a(isDeviceUnlockedForPaymentRequest, aswm);
                parcel2.writeNoException();
                return true;
            case 12:
                PromptDeviceUnlockForPaymentRequest promptDeviceUnlockForPaymentRequest = (PromptDeviceUnlockForPaymentRequest) dcl.m8163a(parcel, PromptDeviceUnlockForPaymentRequest.CREATOR);
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
                    if (queryLocalInterface10 instanceof aswm) {
                        aswm = (aswm) queryLocalInterface10;
                    } else {
                        aswm = new aswk(readStrongBinder10);
                    }
                }
                mo49569a(promptDeviceUnlockForPaymentRequest, aswm);
                parcel2.writeNoException();
                return true;
            case 13:
                SendTapEventRequest sendTapEventRequest = (SendTapEventRequest) dcl.m8163a(parcel, SendTapEventRequest.CREATOR);
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
                    if (queryLocalInterface11 instanceof aswm) {
                        aswm = (aswm) queryLocalInterface11;
                    } else {
                        aswm = new aswk(readStrongBinder11);
                    }
                }
                mo49574a(sendTapEventRequest, aswm);
                parcel2.writeNoException();
                return true;
            case 14:
                GetReceivesTransactionNotificationsRequest getReceivesTransactionNotificationsRequest = (GetReceivesTransactionNotificationsRequest) dcl.m8163a(parcel, GetReceivesTransactionNotificationsRequest.CREATOR);
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
                    if (queryLocalInterface12 instanceof aswm) {
                        aswm = (aswm) queryLocalInterface12;
                    } else {
                        aswm = new aswk(readStrongBinder12);
                    }
                }
                mo49565a(getReceivesTransactionNotificationsRequest, aswm);
                parcel2.writeNoException();
                return true;
            case 15:
                SetReceivesTransactionNotificationsRequest setReceivesTransactionNotificationsRequest = (SetReceivesTransactionNotificationsRequest) dcl.m8163a(parcel, SetReceivesTransactionNotificationsRequest.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
                    if (queryLocalInterface13 instanceof aswm) {
                        aswm = (aswm) queryLocalInterface13;
                    } else {
                        aswm = new aswk(readStrongBinder13);
                    }
                }
                mo49578a(setReceivesTransactionNotificationsRequest, aswm);
                parcel2.writeNoException();
                return true;
            case 16:
                RetrieveInAppPaymentCredentialRequest retrieveInAppPaymentCredentialRequest = (RetrieveInAppPaymentCredentialRequest) dcl.m8163a(parcel, RetrieveInAppPaymentCredentialRequest.CREATOR);
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
                    if (queryLocalInterface14 instanceof aswm) {
                        aswm = (aswm) queryLocalInterface14;
                    } else {
                        aswm = new aswk(readStrongBinder14);
                    }
                }
                mo49548a(retrieveInAppPaymentCredentialRequest, aswm);
                parcel2.writeNoException();
                return true;
            case 18:
                GetActiveCardsForAccountRequest getActiveCardsForAccountRequest = (GetActiveCardsForAccountRequest) dcl.m8163a(parcel, GetActiveCardsForAccountRequest.CREATOR);
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
                    if (queryLocalInterface15 instanceof aswm) {
                        aswm = (aswm) queryLocalInterface15;
                    } else {
                        aswm = new aswk(readStrongBinder15);
                    }
                }
                mo49559a(getActiveCardsForAccountRequest, aswm);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
                    if (queryLocalInterface16 instanceof aswm) {
                        aswm = (aswm) queryLocalInterface16;
                    } else {
                        aswm = new aswk(readStrongBinder16);
                    }
                }
                mo49595e(aswm);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
                    if (queryLocalInterface17 instanceof aswm) {
                        aswm = (aswm) queryLocalInterface17;
                    } else {
                        aswm = new aswk(readStrongBinder17);
                    }
                }
                mo49602l(aswm);
                parcel2.writeNoException();
                return true;
            case 22:
                int readInt = parcel.readInt();
                String readString = parcel.readString();
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
                    if (queryLocalInterface18 instanceof aswm) {
                        aswm = (aswm) queryLocalInterface18;
                    } else {
                        aswm = new aswk(readStrongBinder18);
                    }
                }
                mo49544a(readInt, readString, aswm);
                parcel2.writeNoException();
                return true;
            case 23:
                int readInt2 = parcel.readInt();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                parcel.readInt();
                IBinder readStrongBinder19 = parcel.readStrongBinder();
                if (readStrongBinder19 != null) {
                    IInterface queryLocalInterface19 = readStrongBinder19.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
                    if (queryLocalInterface19 instanceof aswm) {
                        aswm = (aswm) queryLocalInterface19;
                    } else {
                        aswm = new aswk(readStrongBinder19);
                    }
                }
                mo49545a(readInt2, readString2, readString3, aswm);
                parcel2.writeNoException();
                return true;
            case 24:
                int readInt3 = parcel.readInt();
                String readString4 = parcel.readString();
                IBinder readStrongBinder20 = parcel.readStrongBinder();
                if (readStrongBinder20 != null) {
                    IInterface queryLocalInterface20 = readStrongBinder20.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
                    if (queryLocalInterface20 instanceof aswm) {
                        aswm = (aswm) queryLocalInterface20;
                    } else {
                        aswm = new aswk(readStrongBinder20);
                    }
                }
                mo49589b(readInt3, readString4, aswm);
                parcel2.writeNoException();
                return true;
            case 25:
                int readInt4 = parcel.readInt();
                String readString5 = parcel.readString();
                IBinder readStrongBinder21 = parcel.readStrongBinder();
                if (readStrongBinder21 != null) {
                    IInterface queryLocalInterface21 = readStrongBinder21.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
                    if (queryLocalInterface21 instanceof aswm) {
                        aswm = (aswm) queryLocalInterface21;
                    } else {
                        aswm = new aswk(readStrongBinder21);
                    }
                }
                mo49592c(readInt4, readString5, aswm);
                parcel2.writeNoException();
                return true;
            case 26:
                IsDeviceUnlockedForInAppPaymentRequest isDeviceUnlockedForInAppPaymentRequest = (IsDeviceUnlockedForInAppPaymentRequest) dcl.m8163a(parcel, IsDeviceUnlockedForInAppPaymentRequest.CREATOR);
                IBinder readStrongBinder22 = parcel.readStrongBinder();
                if (readStrongBinder22 != null) {
                    IInterface queryLocalInterface22 = readStrongBinder22.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
                    if (queryLocalInterface22 instanceof aswm) {
                        aswm = (aswm) queryLocalInterface22;
                    } else {
                        aswm = new aswk(readStrongBinder22);
                    }
                }
                mo49567a(isDeviceUnlockedForInAppPaymentRequest, aswm);
                parcel2.writeNoException();
                return true;
            case 27:
                ReportInAppTransactionCompletedRequest reportInAppTransactionCompletedRequest = (ReportInAppTransactionCompletedRequest) dcl.m8163a(parcel, ReportInAppTransactionCompletedRequest.CREATOR);
                IBinder readStrongBinder23 = parcel.readStrongBinder();
                if (readStrongBinder23 != null) {
                    IInterface queryLocalInterface23 = readStrongBinder23.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
                    if (queryLocalInterface23 instanceof aswm) {
                        aswm = (aswm) queryLocalInterface23;
                    } else {
                        aswm = new aswk(readStrongBinder23);
                    }
                }
                mo49572a(reportInAppTransactionCompletedRequest, aswm);
                parcel2.writeNoException();
                return true;
            case 28:
                PushTokenizeRequest pushTokenizeRequest = (PushTokenizeRequest) dcl.m8163a(parcel, PushTokenizeRequest.CREATOR);
                IBinder readStrongBinder24 = parcel.readStrongBinder();
                if (readStrongBinder24 != null) {
                    IInterface queryLocalInterface24 = readStrongBinder24.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
                    if (queryLocalInterface24 instanceof aswm) {
                        aswm = (aswm) queryLocalInterface24;
                    } else {
                        aswm = new aswk(readStrongBinder24);
                    }
                }
                mo49584a(pushTokenizeRequest, aswm);
                parcel2.writeNoException();
                return true;
            case 29:
                IBinder readStrongBinder25 = parcel.readStrongBinder();
                if (readStrongBinder25 != null) {
                    IInterface queryLocalInterface25 = readStrongBinder25.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
                    if (queryLocalInterface25 instanceof aswm) {
                        aswm = (aswm) queryLocalInterface25;
                    } else {
                        aswm = new aswk(readStrongBinder25);
                    }
                }
                mo49603m(aswm);
                parcel2.writeNoException();
                return true;
            case 30:
                IBinder readStrongBinder26 = parcel.readStrongBinder();
                if (readStrongBinder26 != null) {
                    IInterface queryLocalInterface26 = readStrongBinder26.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
                    if (queryLocalInterface26 instanceof aswm) {
                        aswm = (aswm) queryLocalInterface26;
                    } else {
                        aswm = new aswk(readStrongBinder26);
                    }
                }
                mo49604n(aswm);
                parcel2.writeNoException();
                return true;
            case 31:
                IBinder readStrongBinder27 = parcel.readStrongBinder();
                if (readStrongBinder27 != null) {
                    IInterface queryLocalInterface27 = readStrongBinder27.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
                    if (queryLocalInterface27 instanceof aswm) {
                        aswm = (aswm) queryLocalInterface27;
                    } else {
                        aswm = new aswk(readStrongBinder27);
                    }
                }
                mo49605o(aswm);
                parcel2.writeNoException();
                return true;
            case 32:
                EnablePayOnWearRequest enablePayOnWearRequest = (EnablePayOnWearRequest) dcl.m8163a(parcel, EnablePayOnWearRequest.CREATOR);
                IBinder readStrongBinder28 = parcel.readStrongBinder();
                if (readStrongBinder28 != null) {
                    IInterface queryLocalInterface28 = readStrongBinder28.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
                    if (queryLocalInterface28 instanceof aswm) {
                        aswm = (aswm) queryLocalInterface28;
                    } else {
                        aswm = new aswk(readStrongBinder28);
                    }
                }
                mo49556a(enablePayOnWearRequest, aswm);
                parcel2.writeNoException();
                return true;
            case 33:
                IBinder readStrongBinder29 = parcel.readStrongBinder();
                if (readStrongBinder29 != null) {
                    IInterface queryLocalInterface29 = readStrongBinder29.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
                    if (queryLocalInterface29 instanceof aswm) {
                        aswm = (aswm) queryLocalInterface29;
                    } else {
                        aswm = new aswk(readStrongBinder29);
                    }
                }
                mo49596f(aswm);
                parcel2.writeNoException();
                return true;
            case 34:
                IBinder readStrongBinder30 = parcel.readStrongBinder();
                if (readStrongBinder30 != null) {
                    IInterface queryLocalInterface30 = readStrongBinder30.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
                    if (queryLocalInterface30 instanceof aswm) {
                        aswm = (aswm) queryLocalInterface30;
                    } else {
                        aswm = new aswk(readStrongBinder30);
                    }
                }
                mo49597g(aswm);
                parcel2.writeNoException();
                return true;
            case 35:
                IBinder readStrongBinder31 = parcel.readStrongBinder();
                if (readStrongBinder31 != null) {
                    IInterface queryLocalInterface31 = readStrongBinder31.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
                    if (queryLocalInterface31 instanceof aswm) {
                        aswm = (aswm) queryLocalInterface31;
                    } else {
                        aswm = new aswk(readStrongBinder31);
                    }
                }
                mo49598h(aswm);
                parcel2.writeNoException();
                return true;
            case FelicaException.TYPE_NOT_CLOSED:
                GetNotificationSettingsRequest getNotificationSettingsRequest = (GetNotificationSettingsRequest) dcl.m8163a(parcel, GetNotificationSettingsRequest.CREATOR);
                IBinder readStrongBinder32 = parcel.readStrongBinder();
                if (readStrongBinder32 != null) {
                    IInterface queryLocalInterface32 = readStrongBinder32.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
                    if (queryLocalInterface32 instanceof aswm) {
                        aswm = (aswm) queryLocalInterface32;
                    } else {
                        aswm = new aswk(readStrongBinder32);
                    }
                }
                mo49564a(getNotificationSettingsRequest, aswm);
                parcel2.writeNoException();
                return true;
            case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                SetNotificationSettingsRequest setNotificationSettingsRequest = (SetNotificationSettingsRequest) dcl.m8163a(parcel, SetNotificationSettingsRequest.CREATOR);
                IBinder readStrongBinder33 = parcel.readStrongBinder();
                if (readStrongBinder33 != null) {
                    IInterface queryLocalInterface33 = readStrongBinder33.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
                    if (queryLocalInterface33 instanceof aswm) {
                        aswm = (aswm) queryLocalInterface33;
                    } else {
                        aswm = new aswk(readStrongBinder33);
                    }
                }
                mo49577a(setNotificationSettingsRequest, aswm);
                parcel2.writeNoException();
                return true;
            case FelicaException.TYPE_USED_BY_OTHER_APP:
                AddOtherPaymentOptionRequest addOtherPaymentOptionRequest = (AddOtherPaymentOptionRequest) dcl.m8163a(parcel, AddOtherPaymentOptionRequest.CREATOR);
                IBinder readStrongBinder34 = parcel.readStrongBinder();
                if (readStrongBinder34 != null) {
                    IInterface queryLocalInterface34 = readStrongBinder34.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
                    if (queryLocalInterface34 instanceof aswm) {
                        aswm = (aswm) queryLocalInterface34;
                    } else {
                        aswm = new aswk(readStrongBinder34);
                    }
                }
                mo49553a(addOtherPaymentOptionRequest, aswm);
                parcel2.writeNoException();
                return true;
            case FelicaException.TYPE_PUSH_FAILED:
                GetAvailableOtherPaymentMethodsRequest getAvailableOtherPaymentMethodsRequest = (GetAvailableOtherPaymentMethodsRequest) dcl.m8163a(parcel, GetAvailableOtherPaymentMethodsRequest.CREATOR);
                IBinder readStrongBinder35 = parcel.readStrongBinder();
                if (readStrongBinder35 != null) {
                    IInterface queryLocalInterface35 = readStrongBinder35.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
                    if (queryLocalInterface35 instanceof aswm) {
                        aswm = (aswm) queryLocalInterface35;
                    } else {
                        aswm = new aswk(readStrongBinder35);
                    }
                }
                mo49562a(getAvailableOtherPaymentMethodsRequest, aswm);
                parcel2.writeNoException();
                return true;
            case 41:
                IBinder readStrongBinder36 = parcel.readStrongBinder();
                if (readStrongBinder36 != null) {
                    IInterface queryLocalInterface36 = readStrongBinder36.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
                    if (queryLocalInterface36 instanceof aswm) {
                        aswm = (aswm) queryLocalInterface36;
                    } else {
                        aswm = new aswk(readStrongBinder36);
                    }
                }
                mo49599i(aswm);
                parcel2.writeNoException();
                return true;
            case FelicaException.TYPE_ALREADY_ACTIVATED:
                IBinder readStrongBinder37 = parcel.readStrongBinder();
                if (readStrongBinder37 != null) {
                    IInterface queryLocalInterface37 = readStrongBinder37.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
                    if (queryLocalInterface37 instanceof aswm) {
                        aswm = (aswm) queryLocalInterface37;
                    } else {
                        aswm = new aswk(readStrongBinder37);
                    }
                }
                mo49600j(aswm);
                parcel2.writeNoException();
                return true;
            case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                Status a = mo49543a();
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a);
                return true;
            case FelicaException.TYPE_RESET_FAILED:
                GetActiveTokensForAccountRequest getActiveTokensForAccountRequest = (GetActiveTokensForAccountRequest) dcl.m8163a(parcel, GetActiveTokensForAccountRequest.CREATOR);
                IBinder readStrongBinder38 = parcel.readStrongBinder();
                if (readStrongBinder38 != null) {
                    IInterface queryLocalInterface38 = readStrongBinder38.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
                    if (queryLocalInterface38 instanceof aswm) {
                        aswm = (aswm) queryLocalInterface38;
                    } else {
                        aswm = new aswk(readStrongBinder38);
                    }
                }
                mo49560a(getActiveTokensForAccountRequest, aswm);
                parcel2.writeNoException();
                return true;
            case FelicaException.TYPE_CURRENTLY_ACTIVATING:
                GetSeChipTransactionsRequest getSeChipTransactionsRequest = (GetSeChipTransactionsRequest) dcl.m8163a(parcel, GetSeChipTransactionsRequest.CREATOR);
                IBinder readStrongBinder39 = parcel.readStrongBinder();
                if (readStrongBinder39 != null) {
                    IInterface queryLocalInterface39 = readStrongBinder39.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
                    if (queryLocalInterface39 instanceof aswm) {
                        aswm = (aswm) queryLocalInterface39;
                    } else {
                        aswm = new aswk(readStrongBinder39);
                    }
                }
                mo49566a(getSeChipTransactionsRequest, aswm);
                parcel2.writeNoException();
                return true;
            case 50:
                IBinder readStrongBinder40 = parcel.readStrongBinder();
                if (readStrongBinder40 != null) {
                    IInterface queryLocalInterface40 = readStrongBinder40.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
                    if (queryLocalInterface40 instanceof aswm) {
                        aswm = (aswm) queryLocalInterface40;
                    } else {
                        aswm = new aswk(readStrongBinder40);
                    }
                }
                mo49547a(aswm);
                parcel2.writeNoException();
                return true;
            case 51:
                ReserveResourceRequest reserveResourceRequest = (ReserveResourceRequest) dcl.m8163a(parcel, ReserveResourceRequest.CREATOR);
                IBinder readStrongBinder41 = parcel.readStrongBinder();
                if (readStrongBinder41 != null) {
                    IInterface queryLocalInterface41 = readStrongBinder41.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
                    if (queryLocalInterface41 instanceof aswm) {
                        aswm = (aswm) queryLocalInterface41;
                    } else {
                        aswm = new aswk(readStrongBinder41);
                    }
                }
                mo49573a(reserveResourceRequest, aswm);
                parcel2.writeNoException();
                return true;
            case 52:
                ReleaseResourceRequest releaseResourceRequest = (ReleaseResourceRequest) dcl.m8163a(parcel, ReleaseResourceRequest.CREATOR);
                IBinder readStrongBinder42 = parcel.readStrongBinder();
                if (readStrongBinder42 != null) {
                    IInterface queryLocalInterface42 = readStrongBinder42.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
                    if (queryLocalInterface42 instanceof aswm) {
                        aswm = (aswm) queryLocalInterface42;
                    } else {
                        aswm = new aswk(readStrongBinder42);
                    }
                }
                mo49571a(releaseResourceRequest, aswm);
                parcel2.writeNoException();
                return true;
            case 53:
                DisableSelectedTokenRequest disableSelectedTokenRequest = (DisableSelectedTokenRequest) dcl.m8163a(parcel, DisableSelectedTokenRequest.CREATOR);
                IBinder readStrongBinder43 = parcel.readStrongBinder();
                if (readStrongBinder43 != null) {
                    IInterface queryLocalInterface43 = readStrongBinder43.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
                    if (queryLocalInterface43 instanceof aswm) {
                        aswm = (aswm) queryLocalInterface43;
                    } else {
                        aswm = new aswk(readStrongBinder43);
                    }
                }
                mo49555a(disableSelectedTokenRequest, aswm);
                parcel2.writeNoException();
                return true;
            case 54:
                SetFelicaTosAcceptanceRequest setFelicaTosAcceptanceRequest = (SetFelicaTosAcceptanceRequest) dcl.m8163a(parcel, SetFelicaTosAcceptanceRequest.CREATOR);
                IBinder readStrongBinder44 = parcel.readStrongBinder();
                if (readStrongBinder44 != null) {
                    IInterface queryLocalInterface44 = readStrongBinder44.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
                    if (queryLocalInterface44 instanceof aswm) {
                        aswm = (aswm) queryLocalInterface44;
                    } else {
                        aswm = new aswk(readStrongBinder44);
                    }
                }
                mo49576a(setFelicaTosAcceptanceRequest, aswm);
                parcel2.writeNoException();
                return true;
            case 55:
                IBinder readStrongBinder45 = parcel.readStrongBinder();
                if (readStrongBinder45 != null) {
                    IInterface queryLocalInterface45 = readStrongBinder45.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
                    if (queryLocalInterface45 instanceof aswm) {
                        aswm = (aswm) queryLocalInterface45;
                    } else {
                        aswm = new aswk(readStrongBinder45);
                    }
                }
                mo49590b(aswm);
                parcel2.writeNoException();
                return true;
            case FelicaException.TYPE_ACTIVATE_FAILED:
                byte[] createByteArray = parcel.createByteArray();
                IBinder readStrongBinder46 = parcel.readStrongBinder();
                if (readStrongBinder46 != null) {
                    IInterface queryLocalInterface46 = readStrongBinder46.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
                    if (queryLocalInterface46 instanceof aswm) {
                        aswm = (aswm) queryLocalInterface46;
                    } else {
                        aswm = new aswk(readStrongBinder46);
                    }
                }
                mo49588a(createByteArray, aswm);
                parcel2.writeNoException();
                return true;
            case 57:
                RefreshSeCardsRequest refreshSeCardsRequest = (RefreshSeCardsRequest) dcl.m8163a(parcel, RefreshSeCardsRequest.CREATOR);
                IBinder readStrongBinder47 = parcel.readStrongBinder();
                if (readStrongBinder47 != null) {
                    IInterface queryLocalInterface47 = readStrongBinder47.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
                    if (queryLocalInterface47 instanceof aswm) {
                        aswm = (aswm) queryLocalInterface47;
                    } else {
                        aswm = new aswk(readStrongBinder47);
                    }
                }
                mo49570a(refreshSeCardsRequest, aswm);
                parcel2.writeNoException();
                return true;
            case FelicaException.TYPE_OFFLINE_CANCELED:
                TokenizeAccountRequest tokenizeAccountRequest = (TokenizeAccountRequest) dcl.m8163a(parcel, TokenizeAccountRequest.CREATOR);
                IBinder readStrongBinder48 = parcel.readStrongBinder();
                if (readStrongBinder48 != null) {
                    IInterface queryLocalInterface48 = readStrongBinder48.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
                    if (queryLocalInterface48 instanceof aswm) {
                        aswm = (aswm) queryLocalInterface48;
                    } else {
                        aswm = new aswk(readStrongBinder48);
                    }
                }
                mo49582a(tokenizeAccountRequest, aswm);
                parcel2.writeNoException();
                return true;
            case FelicaException.TYPE_NOW_EXECUTING_FALP:
                GetGlobalActionCardsRequest getGlobalActionCardsRequest = (GetGlobalActionCardsRequest) dcl.m8163a(parcel, GetGlobalActionCardsRequest.CREATOR);
                IBinder readStrongBinder49 = parcel.readStrongBinder();
                if (readStrongBinder49 != null) {
                    IInterface queryLocalInterface49 = readStrongBinder49.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
                    if (queryLocalInterface49 instanceof aswm) {
                        aswm = (aswm) queryLocalInterface49;
                    } else {
                        aswm = new aswk(readStrongBinder49);
                    }
                }
                mo49551a(getGlobalActionCardsRequest, aswm);
                parcel2.writeNoException();
                return true;
            case FelicaException.TYPE_MFC_NOT_FOUND:
                SelectGlobalActionCardRequest selectGlobalActionCardRequest = (SelectGlobalActionCardRequest) dcl.m8163a(parcel, SelectGlobalActionCardRequest.CREATOR);
                IBinder readStrongBinder50 = parcel.readStrongBinder();
                if (readStrongBinder50 != null) {
                    IInterface queryLocalInterface50 = readStrongBinder50.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
                    if (queryLocalInterface50 instanceof aswm) {
                        aswm = (aswm) queryLocalInterface50;
                    } else {
                        aswm = new aswk(readStrongBinder50);
                    }
                }
                mo49552a(selectGlobalActionCardRequest, aswm);
                parcel2.writeNoException();
                return true;
            case FelicaException.TYPE_INITIATE_ADHOC_ERROR:
                String readString6 = parcel.readString();
                IBinder readStrongBinder51 = parcel.readStrongBinder();
                if (readStrongBinder51 != null) {
                    IInterface queryLocalInterface51 = readStrongBinder51.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
                    if (queryLocalInterface51 instanceof aswm) {
                        aswm = (aswm) queryLocalInterface51;
                    } else {
                        aswm = new aswk(readStrongBinder51);
                    }
                }
                mo49587a(readString6, aswm);
                parcel2.writeNoException();
                return true;
            case 62:
                long readLong = parcel.readLong();
                IBinder readStrongBinder52 = parcel.readStrongBinder();
                if (readStrongBinder52 != null) {
                    IInterface queryLocalInterface52 = readStrongBinder52.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
                    if (queryLocalInterface52 instanceof aswm) {
                        aswm = (aswm) queryLocalInterface52;
                    } else {
                        aswm = new aswk(readStrongBinder52);
                    }
                }
                mo49546a(readLong, aswm);
                parcel2.writeNoException();
                return true;
            case 63:
                IBinder readStrongBinder53 = parcel.readStrongBinder();
                if (readStrongBinder53 != null) {
                    IInterface queryLocalInterface53 = readStrongBinder53.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
                    if (queryLocalInterface53 instanceof aswm) {
                        aswm = (aswm) queryLocalInterface53;
                    } else {
                        aswm = new aswk(readStrongBinder53);
                    }
                }
                mo49601k(aswm);
                parcel2.writeNoException();
                return true;
            case 64:
                ShowNotificationSettingsRequest showNotificationSettingsRequest = (ShowNotificationSettingsRequest) dcl.m8163a(parcel, ShowNotificationSettingsRequest.CREATOR);
                IBinder readStrongBinder54 = parcel.readStrongBinder();
                if (readStrongBinder54 != null) {
                    IInterface queryLocalInterface54 = readStrongBinder54.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
                    if (queryLocalInterface54 instanceof aswm) {
                        aswm = (aswm) queryLocalInterface54;
                    } else {
                        aswm = new aswk(readStrongBinder54);
                    }
                }
                mo49580a(showNotificationSettingsRequest, aswm);
                parcel2.writeNoException();
                return true;
            case KeyInformation.AES128_DES56:
                SyncDeviceInfoRequest syncDeviceInfoRequest = (SyncDeviceInfoRequest) dcl.m8163a(parcel, SyncDeviceInfoRequest.CREATOR);
                IBinder readStrongBinder55 = parcel.readStrongBinder();
                if (readStrongBinder55 != null) {
                    IInterface queryLocalInterface55 = readStrongBinder55.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
                    if (queryLocalInterface55 instanceof aswm) {
                        aswm = (aswm) queryLocalInterface55;
                    } else {
                        aswm = new aswk(readStrongBinder55);
                    }
                }
                mo49550a(syncDeviceInfoRequest, aswm);
                parcel2.writeNoException();
                return true;
            case 66:
                SendTransmissionEventRequest sendTransmissionEventRequest = (SendTransmissionEventRequest) dcl.m8163a(parcel, SendTransmissionEventRequest.CREATOR);
                IBinder readStrongBinder56 = parcel.readStrongBinder();
                if (readStrongBinder56 != null) {
                    IInterface queryLocalInterface56 = readStrongBinder56.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
                    if (queryLocalInterface56 instanceof aswm) {
                        aswm = (aswm) queryLocalInterface56;
                    } else {
                        aswm = new aswk(readStrongBinder56);
                    }
                }
                mo49549a(sendTransmissionEventRequest, aswm);
                parcel2.writeNoException();
                return true;
            case KeyInformation.AES128_DES112:
                CreatePushTokenizeSessionRequest createPushTokenizeSessionRequest = (CreatePushTokenizeSessionRequest) dcl.m8163a(parcel, CreatePushTokenizeSessionRequest.CREATOR);
                IBinder readStrongBinder57 = parcel.readStrongBinder();
                if (readStrongBinder57 != null) {
                    IInterface queryLocalInterface57 = readStrongBinder57.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
                    if (queryLocalInterface57 instanceof aswm) {
                        aswm = (aswm) queryLocalInterface57;
                    } else {
                        aswm = new aswk(readStrongBinder57);
                    }
                }
                mo49583a(createPushTokenizeSessionRequest, aswm);
                parcel2.writeNoException();
                return true;
            case 68:
                String readString7 = parcel.readString();
                IBinder readStrongBinder58 = parcel.readStrongBinder();
                if (readStrongBinder58 != null) {
                    IInterface queryLocalInterface58 = readStrongBinder58.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
                    if (queryLocalInterface58 instanceof aswm) {
                        aswm = (aswm) queryLocalInterface58;
                    } else {
                        aswm = new aswk(readStrongBinder58);
                    }
                }
                mo49591b(readString7, aswm);
                parcel2.writeNoException();
                return true;
            case 69:
                GetLastAttestationResultRequest getLastAttestationResultRequest = (GetLastAttestationResultRequest) dcl.m8163a(parcel, GetLastAttestationResultRequest.CREATOR);
                IBinder readStrongBinder59 = parcel.readStrongBinder();
                if (readStrongBinder59 != null) {
                    IInterface queryLocalInterface59 = readStrongBinder59.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
                    if (queryLocalInterface59 instanceof aswm) {
                        aswm = (aswm) queryLocalInterface59;
                    } else {
                        aswm = new aswk(readStrongBinder59);
                    }
                }
                mo49563a(getLastAttestationResultRequest, aswm);
                parcel2.writeNoException();
                return true;
            case 70:
                IBinder readStrongBinder60 = parcel.readStrongBinder();
                if (readStrongBinder60 != null) {
                    IInterface queryLocalInterface60 = readStrongBinder60.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
                    if (queryLocalInterface60 instanceof aswm) {
                        aswm = (aswm) queryLocalInterface60;
                    } else {
                        aswm = new aswk(readStrongBinder60);
                    }
                }
                mo49593c(aswm);
                parcel2.writeNoException();
                return true;
            case 71:
                GetQuickAccessWalletConfigRequest getQuickAccessWalletConfigRequest = (GetQuickAccessWalletConfigRequest) dcl.m8163a(parcel, GetQuickAccessWalletConfigRequest.CREATOR);
                IBinder readStrongBinder61 = parcel.readStrongBinder();
                if (readStrongBinder61 != null) {
                    IInterface queryLocalInterface61 = readStrongBinder61.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
                    if (queryLocalInterface61 instanceof aswm) {
                        aswm = (aswm) queryLocalInterface61;
                    } else {
                        aswm = new aswk(readStrongBinder61);
                    }
                }
                mo49585a(getQuickAccessWalletConfigRequest, aswm);
                parcel2.writeNoException();
                return true;
            case 72:
                SetQuickAccessWalletCardsRequest setQuickAccessWalletCardsRequest = (SetQuickAccessWalletCardsRequest) dcl.m8163a(parcel, SetQuickAccessWalletCardsRequest.CREATOR);
                IBinder readStrongBinder62 = parcel.readStrongBinder();
                if (readStrongBinder62 != null) {
                    IInterface queryLocalInterface62 = readStrongBinder62.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
                    if (queryLocalInterface62 instanceof aswm) {
                        aswm = (aswm) queryLocalInterface62;
                    } else {
                        aswm = new aswk(readStrongBinder62);
                    }
                }
                mo49586a(setQuickAccessWalletCardsRequest, aswm);
                parcel2.writeNoException();
                return true;
        }
    }
}
