package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.mobiledataplan.MdpCarrierPlanIdRequest;
import com.google.android.gms.mobiledataplan.MdpDataPlanStatusRequest;
import com.google.android.gms.mobiledataplan.MdpPurchaseOfferRequest;
import com.google.android.gms.mobiledataplan.MdpUpsellOfferRequest;
import com.google.android.gms.mobiledataplan.consent.GetConsentInformationRequest;
import com.google.android.gms.mobiledataplan.consent.SetConsentStatusRequest;
import com.google.android.gms.mobiledataplan.internal.EventListenerRequest;

/* renamed from: agrh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class agrh extends dck implements agri {
    public agrh() {
        super("com.google.android.gms.mobiledataplan.internal.IMobileDataPlanService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        agrf agrf = null;
        switch (i) {
            case 1:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.mobiledataplan.internal.IMobileDataPlanCallbacks");
                    if (queryLocalInterface instanceof agrf) {
                        agrf = (agrf) queryLocalInterface;
                    } else {
                        agrf = new agrd(readStrongBinder);
                    }
                }
                mo35970a(agrf, (MdpCarrierPlanIdRequest) dcl.m8163a(parcel, MdpCarrierPlanIdRequest.CREATOR));
                break;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.mobiledataplan.internal.IMobileDataPlanCallbacks");
                    agrf = queryLocalInterface2 instanceof agrf ? (agrf) queryLocalInterface2 : new agrd(readStrongBinder2);
                }
                mo35971a(agrf, (MdpDataPlanStatusRequest) dcl.m8163a(parcel, MdpDataPlanStatusRequest.CREATOR));
                break;
            case 3:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.mobiledataplan.internal.IMobileDataPlanCallbacks");
                    if (queryLocalInterface3 instanceof agrf) {
                        agrf = (agrf) queryLocalInterface3;
                    } else {
                        agrf = new agrd(readStrongBinder3);
                    }
                }
                mo35973a(agrf, (MdpUpsellOfferRequest) dcl.m8163a(parcel, MdpUpsellOfferRequest.CREATOR));
                break;
            case 4:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.mobiledataplan.internal.IMobileDataPlanCallbacks");
                    if (queryLocalInterface4 instanceof agrf) {
                        agrf = (agrf) queryLocalInterface4;
                    } else {
                        agrf = new agrd(readStrongBinder4);
                    }
                }
                mo35972a(agrf, (MdpPurchaseOfferRequest) dcl.m8163a(parcel, MdpPurchaseOfferRequest.CREATOR));
                break;
            case 5:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.mobiledataplan.internal.IMobileDataPlanCallbacks");
                    if (queryLocalInterface5 instanceof agrf) {
                        agrf = (agrf) queryLocalInterface5;
                    } else {
                        agrf = new agrd(readStrongBinder5);
                    }
                }
                mo35976a(agrf, (EventListenerRequest) dcl.m8163a(parcel, EventListenerRequest.CREATOR));
                break;
            case 6:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.mobiledataplan.internal.IMobileDataPlanCallbacks");
                    if (queryLocalInterface6 instanceof agrf) {
                        agrf = (agrf) queryLocalInterface6;
                    } else {
                        agrf = new agrd(readStrongBinder6);
                    }
                }
                mo35974a(agrf, (GetConsentInformationRequest) dcl.m8163a(parcel, GetConsentInformationRequest.CREATOR));
                break;
            case 7:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.mobiledataplan.internal.IMobileDataPlanCallbacks");
                    if (queryLocalInterface7 instanceof agrf) {
                        agrf = (agrf) queryLocalInterface7;
                    } else {
                        agrf = new agrd(readStrongBinder7);
                    }
                }
                mo35975a(agrf, (SetConsentStatusRequest) dcl.m8163a(parcel, SetConsentStatusRequest.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
