package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.felicanetworks.mfc.FelicaException;
import com.felicanetworks.mfc.KeyInformation;
import com.google.android.gms.pay.CheckPayFeaturesAvailableRequest;
import com.google.android.gms.pay.ClearSmartTapOverrideRequest;
import com.google.android.gms.pay.DataChangeListenerRequest;
import com.google.android.gms.pay.DeleteCardCentricProductRequest;
import com.google.android.gms.pay.DeleteTicketCentricCardRequest;
import com.google.android.gms.pay.DeleteTicketCentricProductRequest;
import com.google.android.gms.pay.DeleteValuablesRequest;
import com.google.android.gms.pay.DigitizeCardCentricRequest;
import com.google.android.gms.pay.DigitizeTicketCentricRequest;
import com.google.android.gms.pay.GetAttestationSignalRequest;
import com.google.android.gms.pay.GetBulletinsRequest;
import com.google.android.gms.pay.GetCardCentricBundleRequest;
import com.google.android.gms.pay.GetClosedLoopBundleRequest;
import com.google.android.gms.pay.GetClosedLoopCardsFromServerRequest;
import com.google.android.gms.pay.GetClosedLoopCardsRequest;
import com.google.android.gms.pay.GetLegalDocumentsRequest;
import com.google.android.gms.pay.GetLinkedValuablesRequest;
import com.google.android.gms.pay.GetOnboardingInfoRequest;
import com.google.android.gms.pay.GetOutstandingPurchaseOrderIdRequest;
import com.google.android.gms.pay.GetPayCardArtRequest;
import com.google.android.gms.pay.GetPayGlobalActionCardsRequest;
import com.google.android.gms.pay.GetPaymentMethodActionTokensRequest;
import com.google.android.gms.pay.GetPaymentMethodsRequest;
import com.google.android.gms.pay.GetSettingsRequest;
import com.google.android.gms.pay.GetSortOrderRequest;
import com.google.android.gms.pay.GetTransactionsRequest;
import com.google.android.gms.pay.GetValuablesFromServerRequest;
import com.google.android.gms.pay.GetValuablesRequest;
import com.google.android.gms.pay.HasAcceptedTosForPartnerRequest;
import com.google.android.gms.pay.HasAcceptedTosRequest;
import com.google.android.gms.pay.IsAddSignUpValuableDeepLinksMigratedRequest;
import com.google.android.gms.pay.IsClosedLoopHceMigratedRequest;
import com.google.android.gms.pay.IsPassesScheduledNotificationsMigratedRequest;
import com.google.android.gms.pay.IsPassesUpdateNotificationsEnabledRequest;
import com.google.android.gms.pay.IsSaveValuableDeepLinksMigratedRequest;
import com.google.android.gms.pay.IsSmartTapMigratedRequest;
import com.google.android.gms.pay.IsViewValuableDeepLinksMigratedRequest;
import com.google.android.gms.pay.MigrateAddSignUpValuableDeepLinksRequest;
import com.google.android.gms.pay.MigrateClosedLoopHceRequest;
import com.google.android.gms.pay.MigratePassesScheduledNotificationsRequest;
import com.google.android.gms.pay.MigrateSaveValuableDeepLinksRequest;
import com.google.android.gms.pay.MigrateSmartTapRequest;
import com.google.android.gms.pay.MigrateViewValuableDeepLinksRequest;
import com.google.android.gms.pay.PerformPaymentMethodServerActionRequest;
import com.google.android.gms.pay.RecordBulletinInteractionsRequest;
import com.google.android.gms.pay.RequestPayModuleRequest;
import com.google.android.gms.pay.ReversePurchaseRequest;
import com.google.android.gms.pay.SaveCardCentricRequest;
import com.google.android.gms.pay.SavePurchasedCardRequest;
import com.google.android.gms.pay.SaveTicketCentricRequest;
import com.google.android.gms.pay.SelectPayGlobalActionCardRequest;
import com.google.android.gms.pay.SetAcceptedTosForPartnerRequest;
import com.google.android.gms.pay.SetOnboardingInfoRequest;
import com.google.android.gms.pay.SetPassesUpdateNotificationsEnabledRequest;
import com.google.android.gms.pay.SetSmartTapOverrideRequest;
import com.google.android.gms.pay.SetSortOrderRequest;
import com.google.android.gms.pay.SetValuableSmartTapEnabledRequest;
import com.google.android.gms.pay.StartClosedLoopHceMigrationRequest;
import com.google.android.gms.pay.SyncTransactionsRequest;
import com.google.android.gms.pay.UndigitizeTicketCentricCardRequest;
import com.google.android.gms.pay.UndigitizeTicketCentricProductRequest;
import com.google.android.gms.pay.UpdateBalanceRequest;
import com.google.android.gms.pay.UpdateClosedLoopBundleRequest;
import com.google.android.gms.pay.UpdateLegalDocumentsRequest;
import com.google.android.gms.pay.UpdateSettingsRequest;
import com.google.android.gms.pay.ValidateCardCentricRequest;
import com.google.android.gms.pay.ValidateTicketCentricRequest;
import com.google.android.gms.pay.ViewCardRequest;
import com.google.android.gms.pay.ViewFopListRequest;
import com.google.android.gms.pay.ViewHomescreenRequest;
import com.google.android.gms.pay.ViewTransactionListRequest;
import com.google.android.gms.pay.ViewTransactionRequest;

/* renamed from: alit */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class alit extends dck implements aliu {
    public alit() {
        super("com.google.android.gms.pay.internal.IPayService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        alix alix = null;
        switch (i) {
            case 2:
                GetPayGlobalActionCardsRequest getPayGlobalActionCardsRequest = (GetPayGlobalActionCardsRequest) dcl.m8163a(parcel, GetPayGlobalActionCardsRequest.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    if (queryLocalInterface instanceof alix) {
                        alix = (alix) queryLocalInterface;
                    } else {
                        alix = new aliv(readStrongBinder);
                    }
                }
                mo40395a(getPayGlobalActionCardsRequest, alix);
                break;
            case 3:
                SelectPayGlobalActionCardRequest selectPayGlobalActionCardRequest = (SelectPayGlobalActionCardRequest) dcl.m8163a(parcel, SelectPayGlobalActionCardRequest.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    alix = queryLocalInterface2 instanceof alix ? (alix) queryLocalInterface2 : new aliv(readStrongBinder2);
                }
                mo40398a(selectPayGlobalActionCardRequest, alix);
                break;
            case 4:
                ViewCardRequest viewCardRequest = (ViewCardRequest) dcl.m8163a(parcel, ViewCardRequest.CREATOR);
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    if (queryLocalInterface3 instanceof alix) {
                        alix = (alix) queryLocalInterface3;
                    } else {
                        alix = new aliv(readStrongBinder3);
                    }
                }
                mo40411am(alix);
                break;
            case 5:
                GetValuablesRequest getValuablesRequest = (GetValuablesRequest) dcl.m8163a(parcel, GetValuablesRequest.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    if (queryLocalInterface4 instanceof alix) {
                        alix = (alix) queryLocalInterface4;
                    } else {
                        alix = new aliv(readStrongBinder4);
                    }
                }
                mo40438x(alix);
                break;
            case 6:
                GetValuablesFromServerRequest getValuablesFromServerRequest = (GetValuablesFromServerRequest) dcl.m8163a(parcel, GetValuablesFromServerRequest.CREATOR);
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    if (queryLocalInterface5 instanceof alix) {
                        alix = (alix) queryLocalInterface5;
                    } else {
                        alix = new aliv(readStrongBinder5);
                    }
                }
                mo40439y(alix);
                break;
            case 7:
                DeleteValuablesRequest deleteValuablesRequest = (DeleteValuablesRequest) dcl.m8163a(parcel, DeleteValuablesRequest.CREATOR);
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    if (queryLocalInterface6 instanceof alix) {
                        alix = (alix) queryLocalInterface6;
                    } else {
                        alix = new aliv(readStrongBinder6);
                    }
                }
                mo40420f(alix);
                break;
            case 8:
                GetClosedLoopCardsRequest getClosedLoopCardsRequest = (GetClosedLoopCardsRequest) dcl.m8163a(parcel, GetClosedLoopCardsRequest.CREATOR);
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    if (queryLocalInterface7 instanceof alix) {
                        alix = (alix) queryLocalInterface7;
                    } else {
                        alix = new aliv(readStrongBinder7);
                    }
                }
                mo40427m(alix);
                break;
            case 9:
                GetClosedLoopCardsFromServerRequest getClosedLoopCardsFromServerRequest = (GetClosedLoopCardsFromServerRequest) dcl.m8163a(parcel, GetClosedLoopCardsFromServerRequest.CREATOR);
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    if (queryLocalInterface8 instanceof alix) {
                        alix = (alix) queryLocalInterface8;
                    } else {
                        alix = new aliv(readStrongBinder8);
                    }
                }
                mo40428n(alix);
                break;
            case 10:
                ViewHomescreenRequest viewHomescreenRequest = (ViewHomescreenRequest) dcl.m8163a(parcel, ViewHomescreenRequest.CREATOR);
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    if (queryLocalInterface9 instanceof alix) {
                        alix = (alix) queryLocalInterface9;
                    } else {
                        alix = new aliv(readStrongBinder9);
                    }
                }
                mo40413ao(alix);
                break;
            case 11:
                SetValuableSmartTapEnabledRequest setValuableSmartTapEnabledRequest = (SetValuableSmartTapEnabledRequest) dcl.m8163a(parcel, SetValuableSmartTapEnabledRequest.CREATOR);
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    if (queryLocalInterface10 instanceof alix) {
                        alix = (alix) queryLocalInterface10;
                    } else {
                        alix = new aliv(readStrongBinder10);
                    }
                }
                mo40399aa(alix);
                break;
            case 12:
                DataChangeListenerRequest dataChangeListenerRequest = (DataChangeListenerRequest) dcl.m8163a(parcel, DataChangeListenerRequest.CREATOR);
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    if (queryLocalInterface11 instanceof alix) {
                        alix = (alix) queryLocalInterface11;
                    } else {
                        alix = new aliv(readStrongBinder11);
                    }
                }
                mo40383Q(alix);
                break;
            case 13:
                DataChangeListenerRequest dataChangeListenerRequest2 = (DataChangeListenerRequest) dcl.m8163a(parcel, DataChangeListenerRequest.CREATOR);
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    if (queryLocalInterface12 instanceof alix) {
                        alix = (alix) queryLocalInterface12;
                    } else {
                        alix = new aliv(readStrongBinder12);
                    }
                }
                mo40404af(alix);
                break;
            case 14:
                ValidateCardCentricRequest validateCardCentricRequest = (ValidateCardCentricRequest) dcl.m8163a(parcel, ValidateCardCentricRequest.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    if (queryLocalInterface13 instanceof alix) {
                        alix = (alix) queryLocalInterface13;
                    } else {
                        alix = new aliv(readStrongBinder13);
                    }
                }
                mo40409ak(alix);
                break;
            case 15:
                SaveCardCentricRequest saveCardCentricRequest = (SaveCardCentricRequest) dcl.m8163a(parcel, SaveCardCentricRequest.CREATOR);
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    if (queryLocalInterface14 instanceof alix) {
                        alix = (alix) queryLocalInterface14;
                    } else {
                        alix = new aliv(readStrongBinder14);
                    }
                }
                mo40385S(alix);
                break;
            case 16:
                DigitizeCardCentricRequest digitizeCardCentricRequest = (DigitizeCardCentricRequest) dcl.m8163a(parcel, DigitizeCardCentricRequest.CREATOR);
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    if (queryLocalInterface15 instanceof alix) {
                        alix = (alix) queryLocalInterface15;
                    } else {
                        alix = new aliv(readStrongBinder15);
                    }
                }
                mo40421g(alix);
                break;
            case 17:
                GetBulletinsRequest getBulletinsRequest = (GetBulletinsRequest) dcl.m8163a(parcel, GetBulletinsRequest.CREATOR);
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    if (queryLocalInterface16 instanceof alix) {
                        alix = (alix) queryLocalInterface16;
                    } else {
                        alix = new aliv(readStrongBinder16);
                    }
                }
                mo40424j(alix);
                break;
            case 18:
                ValidateTicketCentricRequest validateTicketCentricRequest = (ValidateTicketCentricRequest) dcl.m8163a(parcel, ValidateTicketCentricRequest.CREATOR);
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    if (queryLocalInterface17 instanceof alix) {
                        alix = (alix) queryLocalInterface17;
                    } else {
                        alix = new aliv(readStrongBinder17);
                    }
                }
                mo40410al(alix);
                break;
            case 19:
                SaveTicketCentricRequest saveTicketCentricRequest = (SaveTicketCentricRequest) dcl.m8163a(parcel, SaveTicketCentricRequest.CREATOR);
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    if (queryLocalInterface18 instanceof alix) {
                        alix = (alix) queryLocalInterface18;
                    } else {
                        alix = new aliv(readStrongBinder18);
                    }
                }
                mo40387U(alix);
                break;
            case 20:
                DigitizeTicketCentricRequest digitizeTicketCentricRequest = (DigitizeTicketCentricRequest) dcl.m8163a(parcel, DigitizeTicketCentricRequest.CREATOR);
                IBinder readStrongBinder19 = parcel.readStrongBinder();
                if (readStrongBinder19 != null) {
                    IInterface queryLocalInterface19 = readStrongBinder19.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    if (queryLocalInterface19 instanceof alix) {
                        alix = (alix) queryLocalInterface19;
                    } else {
                        alix = new aliv(readStrongBinder19);
                    }
                }
                mo40422h(alix);
                break;
            case 21:
                RecordBulletinInteractionsRequest recordBulletinInteractionsRequest = (RecordBulletinInteractionsRequest) dcl.m8163a(parcel, RecordBulletinInteractionsRequest.CREATOR);
                IBinder readStrongBinder20 = parcel.readStrongBinder();
                if (readStrongBinder20 != null) {
                    IInterface queryLocalInterface20 = readStrongBinder20.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    if (queryLocalInterface20 instanceof alix) {
                        alix = (alix) queryLocalInterface20;
                    } else {
                        alix = new aliv(readStrongBinder20);
                    }
                }
                mo40382P(alix);
                break;
            case 22:
                ViewTransactionRequest viewTransactionRequest = (ViewTransactionRequest) dcl.m8163a(parcel, ViewTransactionRequest.CREATOR);
                IBinder readStrongBinder21 = parcel.readStrongBinder();
                if (readStrongBinder21 != null) {
                    IInterface queryLocalInterface21 = readStrongBinder21.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    if (queryLocalInterface21 instanceof alix) {
                        alix = (alix) queryLocalInterface21;
                    } else {
                        alix = new aliv(readStrongBinder21);
                    }
                }
                mo40414ap(alix);
                break;
            case 23:
                MigrateClosedLoopHceRequest migrateClosedLoopHceRequest = (MigrateClosedLoopHceRequest) dcl.m8163a(parcel, MigrateClosedLoopHceRequest.CREATOR);
                IBinder readStrongBinder22 = parcel.readStrongBinder();
                if (readStrongBinder22 != null) {
                    IInterface queryLocalInterface22 = readStrongBinder22.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    if (queryLocalInterface22 instanceof alix) {
                        alix = (alix) queryLocalInterface22;
                    } else {
                        alix = new aliv(readStrongBinder22);
                    }
                }
                mo40376J(alix);
                break;
            case 24:
                GetSortOrderRequest getSortOrderRequest = (GetSortOrderRequest) dcl.m8163a(parcel, GetSortOrderRequest.CREATOR);
                IBinder readStrongBinder23 = parcel.readStrongBinder();
                if (readStrongBinder23 != null) {
                    IInterface queryLocalInterface23 = readStrongBinder23.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    if (queryLocalInterface23 instanceof alix) {
                        alix = (alix) queryLocalInterface23;
                    } else {
                        alix = new aliv(readStrongBinder23);
                    }
                }
                mo40396a(getSortOrderRequest, alix);
                break;
            case 25:
                UndigitizeTicketCentricProductRequest undigitizeTicketCentricProductRequest = (UndigitizeTicketCentricProductRequest) dcl.m8163a(parcel, UndigitizeTicketCentricProductRequest.CREATOR);
                IBinder readStrongBinder24 = parcel.readStrongBinder();
                if (readStrongBinder24 != null) {
                    IInterface queryLocalInterface24 = readStrongBinder24.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    if (queryLocalInterface24 instanceof alix) {
                        alix = (alix) queryLocalInterface24;
                    } else {
                        alix = new aliv(readStrongBinder24);
                    }
                }
                mo40403ae(alix);
                break;
            case 26:
                DeleteTicketCentricProductRequest deleteTicketCentricProductRequest = (DeleteTicketCentricProductRequest) dcl.m8163a(parcel, DeleteTicketCentricProductRequest.CREATOR);
                IBinder readStrongBinder25 = parcel.readStrongBinder();
                if (readStrongBinder25 != null) {
                    IInterface queryLocalInterface25 = readStrongBinder25.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    if (queryLocalInterface25 instanceof alix) {
                        alix = (alix) queryLocalInterface25;
                    } else {
                        alix = new aliv(readStrongBinder25);
                    }
                }
                mo40419e(alix);
                break;
            case 27:
                UndigitizeTicketCentricCardRequest undigitizeTicketCentricCardRequest = (UndigitizeTicketCentricCardRequest) dcl.m8163a(parcel, UndigitizeTicketCentricCardRequest.CREATOR);
                IBinder readStrongBinder26 = parcel.readStrongBinder();
                if (readStrongBinder26 != null) {
                    IInterface queryLocalInterface26 = readStrongBinder26.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    if (queryLocalInterface26 instanceof alix) {
                        alix = (alix) queryLocalInterface26;
                    } else {
                        alix = new aliv(readStrongBinder26);
                    }
                }
                mo40402ad(alix);
                break;
            case 28:
                DeleteTicketCentricCardRequest deleteTicketCentricCardRequest = (DeleteTicketCentricCardRequest) dcl.m8163a(parcel, DeleteTicketCentricCardRequest.CREATOR);
                IBinder readStrongBinder27 = parcel.readStrongBinder();
                if (readStrongBinder27 != null) {
                    IInterface queryLocalInterface27 = readStrongBinder27.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    if (queryLocalInterface27 instanceof alix) {
                        alix = (alix) queryLocalInterface27;
                    } else {
                        alix = new aliv(readStrongBinder27);
                    }
                }
                mo40418d(alix);
                break;
            case 29:
                SetSortOrderRequest setSortOrderRequest = (SetSortOrderRequest) dcl.m8163a(parcel, SetSortOrderRequest.CREATOR);
                IBinder readStrongBinder28 = parcel.readStrongBinder();
                if (readStrongBinder28 != null) {
                    IInterface queryLocalInterface28 = readStrongBinder28.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    if (queryLocalInterface28 instanceof alix) {
                        alix = (alix) queryLocalInterface28;
                    } else {
                        alix = new aliv(readStrongBinder28);
                    }
                }
                mo40392Z(alix);
                break;
            case 30:
                GetPaymentMethodsRequest getPaymentMethodsRequest = (GetPaymentMethodsRequest) dcl.m8163a(parcel, GetPaymentMethodsRequest.CREATOR);
                IBinder readStrongBinder29 = parcel.readStrongBinder();
                if (readStrongBinder29 != null) {
                    IInterface queryLocalInterface29 = readStrongBinder29.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    if (queryLocalInterface29 instanceof alix) {
                        alix = (alix) queryLocalInterface29;
                    } else {
                        alix = new aliv(readStrongBinder29);
                    }
                }
                mo40435u(alix);
                break;
            case 31:
                GetPaymentMethodActionTokensRequest getPaymentMethodActionTokensRequest = (GetPaymentMethodActionTokensRequest) dcl.m8163a(parcel, GetPaymentMethodActionTokensRequest.CREATOR);
                IBinder readStrongBinder30 = parcel.readStrongBinder();
                if (readStrongBinder30 != null) {
                    IInterface queryLocalInterface30 = readStrongBinder30.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    if (queryLocalInterface30 instanceof alix) {
                        alix = (alix) queryLocalInterface30;
                    } else {
                        alix = new aliv(readStrongBinder30);
                    }
                }
                mo40434t(alix);
                break;
            case 32:
                IsClosedLoopHceMigratedRequest isClosedLoopHceMigratedRequest = (IsClosedLoopHceMigratedRequest) dcl.m8163a(parcel, IsClosedLoopHceMigratedRequest.CREATOR);
                IBinder readStrongBinder31 = parcel.readStrongBinder();
                if (readStrongBinder31 != null) {
                    IInterface queryLocalInterface31 = readStrongBinder31.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    if (queryLocalInterface31 instanceof alix) {
                        alix = (alix) queryLocalInterface31;
                    } else {
                        alix = new aliv(readStrongBinder31);
                    }
                }
                mo40369C(alix);
                break;
            case 33:
                SyncTransactionsRequest syncTransactionsRequest = (SyncTransactionsRequest) dcl.m8163a(parcel, SyncTransactionsRequest.CREATOR);
                IBinder readStrongBinder32 = parcel.readStrongBinder();
                if (readStrongBinder32 != null) {
                    IInterface queryLocalInterface32 = readStrongBinder32.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    if (queryLocalInterface32 instanceof alix) {
                        alix = (alix) queryLocalInterface32;
                    } else {
                        alix = new aliv(readStrongBinder32);
                    }
                }
                mo40401ac(alix);
                break;
            case 34:
                ViewFopListRequest viewFopListRequest = (ViewFopListRequest) dcl.m8163a(parcel, ViewFopListRequest.CREATOR);
                IBinder readStrongBinder33 = parcel.readStrongBinder();
                if (readStrongBinder33 != null) {
                    IInterface queryLocalInterface33 = readStrongBinder33.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    if (queryLocalInterface33 instanceof alix) {
                        alix = (alix) queryLocalInterface33;
                    } else {
                        alix = new aliv(readStrongBinder33);
                    }
                }
                mo40412an(alix);
                break;
            case 35:
                DeleteCardCentricProductRequest deleteCardCentricProductRequest = (DeleteCardCentricProductRequest) dcl.m8163a(parcel, DeleteCardCentricProductRequest.CREATOR);
                IBinder readStrongBinder34 = parcel.readStrongBinder();
                if (readStrongBinder34 != null) {
                    IInterface queryLocalInterface34 = readStrongBinder34.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    if (queryLocalInterface34 instanceof alix) {
                        alix = (alix) queryLocalInterface34;
                    } else {
                        alix = new aliv(readStrongBinder34);
                    }
                }
                mo40417c(alix);
                break;
            case 36:
                GetLegalDocumentsRequest getLegalDocumentsRequest = (GetLegalDocumentsRequest) dcl.m8163a(parcel, GetLegalDocumentsRequest.CREATOR);
                IBinder readStrongBinder35 = parcel.readStrongBinder();
                if (readStrongBinder35 != null) {
                    IInterface queryLocalInterface35 = readStrongBinder35.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    if (queryLocalInterface35 instanceof alix) {
                        alix = (alix) queryLocalInterface35;
                    } else {
                        alix = new aliv(readStrongBinder35);
                    }
                }
                mo40429o(alix);
                break;
            case FelicaException.TYPE_NOT_CLOSED:
                UpdateLegalDocumentsRequest updateLegalDocumentsRequest = (UpdateLegalDocumentsRequest) dcl.m8163a(parcel, UpdateLegalDocumentsRequest.CREATOR);
                IBinder readStrongBinder36 = parcel.readStrongBinder();
                if (readStrongBinder36 != null) {
                    IInterface queryLocalInterface36 = readStrongBinder36.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    if (queryLocalInterface36 instanceof alix) {
                        alix = (alix) queryLocalInterface36;
                    } else {
                        alix = new aliv(readStrongBinder36);
                    }
                }
                mo40407ai(alix);
                break;
            case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                HasAcceptedTosRequest hasAcceptedTosRequest = (HasAcceptedTosRequest) dcl.m8163a(parcel, HasAcceptedTosRequest.CREATOR);
                IBinder readStrongBinder37 = parcel.readStrongBinder();
                if (readStrongBinder37 != null) {
                    IInterface queryLocalInterface37 = readStrongBinder37.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    if (queryLocalInterface37 instanceof alix) {
                        alix = (alix) queryLocalInterface37;
                    } else {
                        alix = new aliv(readStrongBinder37);
                    }
                }
                mo40440z(alix);
                break;
            case FelicaException.TYPE_USED_BY_OTHER_APP:
            case 50:
            case 54:
            default:
                return false;
            case FelicaException.TYPE_PUSH_FAILED:
                ClearSmartTapOverrideRequest clearSmartTapOverrideRequest = (ClearSmartTapOverrideRequest) dcl.m8163a(parcel, ClearSmartTapOverrideRequest.CREATOR);
                IBinder readStrongBinder38 = parcel.readStrongBinder();
                if (readStrongBinder38 != null) {
                    IInterface queryLocalInterface38 = readStrongBinder38.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    if (queryLocalInterface38 instanceof alix) {
                        alix = (alix) queryLocalInterface38;
                    } else {
                        alix = new aliv(readStrongBinder38);
                    }
                }
                mo40416b(alix);
                break;
            case 41:
                SetSmartTapOverrideRequest setSmartTapOverrideRequest = (SetSmartTapOverrideRequest) dcl.m8163a(parcel, SetSmartTapOverrideRequest.CREATOR);
                IBinder readStrongBinder39 = parcel.readStrongBinder();
                if (readStrongBinder39 != null) {
                    IInterface queryLocalInterface39 = readStrongBinder39.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    if (queryLocalInterface39 instanceof alix) {
                        alix = (alix) queryLocalInterface39;
                    } else {
                        alix = new aliv(readStrongBinder39);
                    }
                }
                mo40391Y(alix);
                break;
            case FelicaException.TYPE_ALREADY_ACTIVATED:
                PerformPaymentMethodServerActionRequest performPaymentMethodServerActionRequest = (PerformPaymentMethodServerActionRequest) dcl.m8163a(parcel, PerformPaymentMethodServerActionRequest.CREATOR);
                IBinder readStrongBinder40 = parcel.readStrongBinder();
                if (readStrongBinder40 != null) {
                    IInterface queryLocalInterface40 = readStrongBinder40.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    if (queryLocalInterface40 instanceof alix) {
                        alix = (alix) queryLocalInterface40;
                    } else {
                        alix = new aliv(readStrongBinder40);
                    }
                }
                mo40381O(alix);
                break;
            case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                GetTransactionsRequest getTransactionsRequest = (GetTransactionsRequest) dcl.m8163a(parcel, GetTransactionsRequest.CREATOR);
                IBinder readStrongBinder41 = parcel.readStrongBinder();
                if (readStrongBinder41 != null) {
                    IInterface queryLocalInterface41 = readStrongBinder41.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    if (queryLocalInterface41 instanceof alix) {
                        alix = (alix) queryLocalInterface41;
                    } else {
                        alix = new aliv(readStrongBinder41);
                    }
                }
                mo40437w(alix);
                break;
            case FelicaException.TYPE_RESET_FAILED:
                ReversePurchaseRequest reversePurchaseRequest = (ReversePurchaseRequest) dcl.m8163a(parcel, ReversePurchaseRequest.CREATOR);
                IBinder readStrongBinder42 = parcel.readStrongBinder();
                if (readStrongBinder42 != null) {
                    IInterface queryLocalInterface42 = readStrongBinder42.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    if (queryLocalInterface42 instanceof alix) {
                        alix = (alix) queryLocalInterface42;
                    } else {
                        alix = new aliv(readStrongBinder42);
                    }
                }
                mo40384R(alix);
                break;
            case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                MigrateSmartTapRequest migrateSmartTapRequest = (MigrateSmartTapRequest) dcl.m8163a(parcel, MigrateSmartTapRequest.CREATOR);
                IBinder readStrongBinder43 = parcel.readStrongBinder();
                if (readStrongBinder43 != null) {
                    IInterface queryLocalInterface43 = readStrongBinder43.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    if (queryLocalInterface43 instanceof alix) {
                        alix = (alix) queryLocalInterface43;
                    } else {
                        alix = new aliv(readStrongBinder43);
                    }
                }
                mo40379M(alix);
                break;
            case FelicaException.TYPE_GET_CONTAINER_ID_FAILED:
                IsSmartTapMigratedRequest isSmartTapMigratedRequest = (IsSmartTapMigratedRequest) dcl.m8163a(parcel, IsSmartTapMigratedRequest.CREATOR);
                IBinder readStrongBinder44 = parcel.readStrongBinder();
                if (readStrongBinder44 != null) {
                    IInterface queryLocalInterface44 = readStrongBinder44.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    if (queryLocalInterface44 instanceof alix) {
                        alix = (alix) queryLocalInterface44;
                    } else {
                        alix = new aliv(readStrongBinder44);
                    }
                }
                mo40373G(alix);
                break;
            case 47:
                HasAcceptedTosForPartnerRequest hasAcceptedTosForPartnerRequest = (HasAcceptedTosForPartnerRequest) dcl.m8163a(parcel, HasAcceptedTosForPartnerRequest.CREATOR);
                IBinder readStrongBinder45 = parcel.readStrongBinder();
                if (readStrongBinder45 != null) {
                    IInterface queryLocalInterface45 = readStrongBinder45.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    if (queryLocalInterface45 instanceof alix) {
                        alix = (alix) queryLocalInterface45;
                    } else {
                        alix = new aliv(readStrongBinder45);
                    }
                }
                mo40367A(alix);
                break;
            case 48:
                SetAcceptedTosForPartnerRequest setAcceptedTosForPartnerRequest = (SetAcceptedTosForPartnerRequest) dcl.m8163a(parcel, SetAcceptedTosForPartnerRequest.CREATOR);
                IBinder readStrongBinder46 = parcel.readStrongBinder();
                if (readStrongBinder46 != null) {
                    IInterface queryLocalInterface46 = readStrongBinder46.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    if (queryLocalInterface46 instanceof alix) {
                        alix = (alix) queryLocalInterface46;
                    } else {
                        alix = new aliv(readStrongBinder46);
                    }
                }
                mo40388V(alix);
                break;
            case FelicaException.TYPE_CURRENTLY_ACTIVATING:
                UpdateBalanceRequest updateBalanceRequest = (UpdateBalanceRequest) dcl.m8163a(parcel, UpdateBalanceRequest.CREATOR);
                IBinder readStrongBinder47 = parcel.readStrongBinder();
                if (readStrongBinder47 != null) {
                    IInterface queryLocalInterface47 = readStrongBinder47.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    if (queryLocalInterface47 instanceof alix) {
                        alix = (alix) queryLocalInterface47;
                    } else {
                        alix = new aliv(readStrongBinder47);
                    }
                }
                mo40405ag(alix);
                break;
            case 51:
                GetOutstandingPurchaseOrderIdRequest getOutstandingPurchaseOrderIdRequest = (GetOutstandingPurchaseOrderIdRequest) dcl.m8163a(parcel, GetOutstandingPurchaseOrderIdRequest.CREATOR);
                IBinder readStrongBinder48 = parcel.readStrongBinder();
                if (readStrongBinder48 != null) {
                    IInterface queryLocalInterface48 = readStrongBinder48.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    if (queryLocalInterface48 instanceof alix) {
                        alix = (alix) queryLocalInterface48;
                    } else {
                        alix = new aliv(readStrongBinder48);
                    }
                }
                mo40433s(alix);
                break;
            case 52:
                GetClosedLoopBundleRequest getClosedLoopBundleRequest = (GetClosedLoopBundleRequest) dcl.m8163a(parcel, GetClosedLoopBundleRequest.CREATOR);
                IBinder readStrongBinder49 = parcel.readStrongBinder();
                if (readStrongBinder49 != null) {
                    IInterface queryLocalInterface49 = readStrongBinder49.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    if (queryLocalInterface49 instanceof alix) {
                        alix = (alix) queryLocalInterface49;
                    } else {
                        alix = new aliv(readStrongBinder49);
                    }
                }
                mo40426l(alix);
                break;
            case 53:
                GetTransactionsRequest getTransactionsRequest2 = (GetTransactionsRequest) dcl.m8163a(parcel, GetTransactionsRequest.CREATOR);
                IBinder readStrongBinder50 = parcel.readStrongBinder();
                if (readStrongBinder50 != null) {
                    IInterface queryLocalInterface50 = readStrongBinder50.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    if (queryLocalInterface50 instanceof alix) {
                        alix = (alix) queryLocalInterface50;
                    } else {
                        alix = new aliv(readStrongBinder50);
                    }
                }
                mo40431q(alix);
                break;
            case 55:
                GetOnboardingInfoRequest getOnboardingInfoRequest = (GetOnboardingInfoRequest) dcl.m8163a(parcel, GetOnboardingInfoRequest.CREATOR);
                IBinder readStrongBinder51 = parcel.readStrongBinder();
                if (readStrongBinder51 != null) {
                    IInterface queryLocalInterface51 = readStrongBinder51.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    if (queryLocalInterface51 instanceof alix) {
                        alix = (alix) queryLocalInterface51;
                    } else {
                        alix = new aliv(readStrongBinder51);
                    }
                }
                mo40432r(alix);
                break;
            case FelicaException.TYPE_ACTIVATE_FAILED:
                UpdateClosedLoopBundleRequest updateClosedLoopBundleRequest = (UpdateClosedLoopBundleRequest) dcl.m8163a(parcel, UpdateClosedLoopBundleRequest.CREATOR);
                IBinder readStrongBinder52 = parcel.readStrongBinder();
                if (readStrongBinder52 != null) {
                    IInterface queryLocalInterface52 = readStrongBinder52.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    if (queryLocalInterface52 instanceof alix) {
                        alix = (alix) queryLocalInterface52;
                    } else {
                        alix = new aliv(readStrongBinder52);
                    }
                }
                mo40406ah(alix);
                break;
            case 57:
                ViewTransactionListRequest viewTransactionListRequest = (ViewTransactionListRequest) dcl.m8163a(parcel, ViewTransactionListRequest.CREATOR);
                IBinder readStrongBinder53 = parcel.readStrongBinder();
                if (readStrongBinder53 != null) {
                    IInterface queryLocalInterface53 = readStrongBinder53.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    if (queryLocalInterface53 instanceof alix) {
                        alix = (alix) queryLocalInterface53;
                    } else {
                        alix = new aliv(readStrongBinder53);
                    }
                }
                mo40415aq(alix);
                break;
            case FelicaException.TYPE_OFFLINE_CANCELED:
                SetOnboardingInfoRequest setOnboardingInfoRequest = (SetOnboardingInfoRequest) dcl.m8163a(parcel, SetOnboardingInfoRequest.CREATOR);
                IBinder readStrongBinder54 = parcel.readStrongBinder();
                if (readStrongBinder54 != null) {
                    IInterface queryLocalInterface54 = readStrongBinder54.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    if (queryLocalInterface54 instanceof alix) {
                        alix = (alix) queryLocalInterface54;
                    } else {
                        alix = new aliv(readStrongBinder54);
                    }
                }
                mo40389W(alix);
                break;
            case FelicaException.TYPE_NOW_EXECUTING_FALP:
                MigrateViewValuableDeepLinksRequest migrateViewValuableDeepLinksRequest = (MigrateViewValuableDeepLinksRequest) dcl.m8163a(parcel, MigrateViewValuableDeepLinksRequest.CREATOR);
                IBinder readStrongBinder55 = parcel.readStrongBinder();
                if (readStrongBinder55 != null) {
                    IInterface queryLocalInterface55 = readStrongBinder55.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    if (queryLocalInterface55 instanceof alix) {
                        alix = (alix) queryLocalInterface55;
                    } else {
                        alix = new aliv(readStrongBinder55);
                    }
                }
                mo40380N(alix);
                break;
            case FelicaException.TYPE_MFC_NOT_FOUND:
                IsViewValuableDeepLinksMigratedRequest isViewValuableDeepLinksMigratedRequest = (IsViewValuableDeepLinksMigratedRequest) dcl.m8163a(parcel, IsViewValuableDeepLinksMigratedRequest.CREATOR);
                IBinder readStrongBinder56 = parcel.readStrongBinder();
                if (readStrongBinder56 != null) {
                    IInterface queryLocalInterface56 = readStrongBinder56.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    if (queryLocalInterface56 instanceof alix) {
                        alix = (alix) queryLocalInterface56;
                    } else {
                        alix = new aliv(readStrongBinder56);
                    }
                }
                mo40374H(alix);
                break;
            case FelicaException.TYPE_INITIATE_ADHOC_ERROR:
                MigrateSaveValuableDeepLinksRequest migrateSaveValuableDeepLinksRequest = (MigrateSaveValuableDeepLinksRequest) dcl.m8163a(parcel, MigrateSaveValuableDeepLinksRequest.CREATOR);
                IBinder readStrongBinder57 = parcel.readStrongBinder();
                if (readStrongBinder57 != null) {
                    IInterface queryLocalInterface57 = readStrongBinder57.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    if (queryLocalInterface57 instanceof alix) {
                        alix = (alix) queryLocalInterface57;
                    } else {
                        alix = new aliv(readStrongBinder57);
                    }
                }
                mo40378L(alix);
                break;
            case 62:
                IsSaveValuableDeepLinksMigratedRequest isSaveValuableDeepLinksMigratedRequest = (IsSaveValuableDeepLinksMigratedRequest) dcl.m8163a(parcel, IsSaveValuableDeepLinksMigratedRequest.CREATOR);
                IBinder readStrongBinder58 = parcel.readStrongBinder();
                if (readStrongBinder58 != null) {
                    IInterface queryLocalInterface58 = readStrongBinder58.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    if (queryLocalInterface58 instanceof alix) {
                        alix = (alix) queryLocalInterface58;
                    } else {
                        alix = new aliv(readStrongBinder58);
                    }
                }
                mo40372F(alix);
                break;
            case 63:
                MigrateAddSignUpValuableDeepLinksRequest migrateAddSignUpValuableDeepLinksRequest = (MigrateAddSignUpValuableDeepLinksRequest) dcl.m8163a(parcel, MigrateAddSignUpValuableDeepLinksRequest.CREATOR);
                IBinder readStrongBinder59 = parcel.readStrongBinder();
                if (readStrongBinder59 != null) {
                    IInterface queryLocalInterface59 = readStrongBinder59.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    if (queryLocalInterface59 instanceof alix) {
                        alix = (alix) queryLocalInterface59;
                    } else {
                        alix = new aliv(readStrongBinder59);
                    }
                }
                mo40375I(alix);
                break;
            case 64:
                IsAddSignUpValuableDeepLinksMigratedRequest isAddSignUpValuableDeepLinksMigratedRequest = (IsAddSignUpValuableDeepLinksMigratedRequest) dcl.m8163a(parcel, IsAddSignUpValuableDeepLinksMigratedRequest.CREATOR);
                IBinder readStrongBinder60 = parcel.readStrongBinder();
                if (readStrongBinder60 != null) {
                    IInterface queryLocalInterface60 = readStrongBinder60.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    if (queryLocalInterface60 instanceof alix) {
                        alix = (alix) queryLocalInterface60;
                    } else {
                        alix = new aliv(readStrongBinder60);
                    }
                }
                mo40368B(alix);
                break;
            case KeyInformation.AES128_DES56:
                GetPayCardArtRequest getPayCardArtRequest = (GetPayCardArtRequest) dcl.m8163a(parcel, GetPayCardArtRequest.CREATOR);
                IBinder readStrongBinder61 = parcel.readStrongBinder();
                if (readStrongBinder61 != null) {
                    IInterface queryLocalInterface61 = readStrongBinder61.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    if (queryLocalInterface61 instanceof alix) {
                        alix = (alix) queryLocalInterface61;
                    } else {
                        alix = new aliv(readStrongBinder61);
                    }
                }
                mo40394a(getPayCardArtRequest, alix);
                break;
            case 66:
                StartClosedLoopHceMigrationRequest startClosedLoopHceMigrationRequest = (StartClosedLoopHceMigrationRequest) dcl.m8163a(parcel, StartClosedLoopHceMigrationRequest.CREATOR);
                IBinder readStrongBinder62 = parcel.readStrongBinder();
                if (readStrongBinder62 != null) {
                    IInterface queryLocalInterface62 = readStrongBinder62.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    if (queryLocalInterface62 instanceof alix) {
                        alix = (alix) queryLocalInterface62;
                    } else {
                        alix = new aliv(readStrongBinder62);
                    }
                }
                mo40400ab(alix);
                break;
            case KeyInformation.AES128_DES112:
                GetLinkedValuablesRequest getLinkedValuablesRequest = (GetLinkedValuablesRequest) dcl.m8163a(parcel, GetLinkedValuablesRequest.CREATOR);
                IBinder readStrongBinder63 = parcel.readStrongBinder();
                if (readStrongBinder63 != null) {
                    IInterface queryLocalInterface63 = readStrongBinder63.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
                    if (queryLocalInterface63 instanceof alix) {
                        alix = (alix) queryLocalInterface63;
                    } else {
                        alix = new aliv(readStrongBinder63);
                    }
                }
                mo40430p(alix);
                break;
            case 68:
                CheckPayFeaturesAvailableRequest checkPayFeaturesAvailableRequest = (CheckPayFeaturesAvailableRequest) dcl.m8163a(parcel, CheckPayFeaturesAvailableRequest.CREATOR);
                mo40393a(aliw.m61061a(parcel.readStrongBinder()));
                break;
            case 69:
                GetSettingsRequest getSettingsRequest = (GetSettingsRequest) dcl.m8163a(parcel, GetSettingsRequest.CREATOR);
                mo40436v(aliw.m61061a(parcel.readStrongBinder()));
                break;
            case 70:
                UpdateSettingsRequest updateSettingsRequest = (UpdateSettingsRequest) dcl.m8163a(parcel, UpdateSettingsRequest.CREATOR);
                mo40408aj(aliw.m61061a(parcel.readStrongBinder()));
                break;
            case 71:
                MigratePassesScheduledNotificationsRequest migratePassesScheduledNotificationsRequest = (MigratePassesScheduledNotificationsRequest) dcl.m8163a(parcel, MigratePassesScheduledNotificationsRequest.CREATOR);
                mo40377K(aliw.m61061a(parcel.readStrongBinder()));
                break;
            case 72:
                IsPassesScheduledNotificationsMigratedRequest isPassesScheduledNotificationsMigratedRequest = (IsPassesScheduledNotificationsMigratedRequest) dcl.m8163a(parcel, IsPassesScheduledNotificationsMigratedRequest.CREATOR);
                mo40370D(aliw.m61061a(parcel.readStrongBinder()));
                break;
            case 73:
                SetPassesUpdateNotificationsEnabledRequest setPassesUpdateNotificationsEnabledRequest = (SetPassesUpdateNotificationsEnabledRequest) dcl.m8163a(parcel, SetPassesUpdateNotificationsEnabledRequest.CREATOR);
                mo40390X(aliw.m61061a(parcel.readStrongBinder()));
                break;
            case 74:
                IsPassesUpdateNotificationsEnabledRequest isPassesUpdateNotificationsEnabledRequest = (IsPassesUpdateNotificationsEnabledRequest) dcl.m8163a(parcel, IsPassesUpdateNotificationsEnabledRequest.CREATOR);
                mo40371E(aliw.m61061a(parcel.readStrongBinder()));
                break;
            case 75:
                mo40397a((RequestPayModuleRequest) dcl.m8163a(parcel, RequestPayModuleRequest.CREATOR), aliw.m61061a(parcel.readStrongBinder()));
                break;
            case 76:
                GetAttestationSignalRequest getAttestationSignalRequest = (GetAttestationSignalRequest) dcl.m8163a(parcel, GetAttestationSignalRequest.CREATOR);
                mo40423i(aliw.m61061a(parcel.readStrongBinder()));
                break;
            case 77:
                SavePurchasedCardRequest savePurchasedCardRequest = (SavePurchasedCardRequest) dcl.m8163a(parcel, SavePurchasedCardRequest.CREATOR);
                mo40386T(aliw.m61061a(parcel.readStrongBinder()));
                break;
            case 78:
                GetCardCentricBundleRequest getCardCentricBundleRequest = (GetCardCentricBundleRequest) dcl.m8163a(parcel, GetCardCentricBundleRequest.CREATOR);
                mo40425k(aliw.m61061a(parcel.readStrongBinder()));
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
