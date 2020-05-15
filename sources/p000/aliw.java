package p000;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.pay.DataChangeListenerResponse;
import com.google.android.gms.pay.GetClosedLoopBundleResponse;
import com.google.android.gms.pay.GetOutstandingPurchaseOrderIdResponse;
import com.google.android.gms.pay.GetPayCardArtResponse;
import com.google.android.gms.pay.GetPayGlobalActionCardsResponse;
import com.google.android.gms.pay.GetSortOrderResponse;
import com.google.android.gms.pay.GetTransactionsResponse;
import com.google.android.gms.pay.PayApiError;
import com.google.android.gms.pay.ProtoSafeParcelable;
import com.google.android.gms.pay.SyncTransactionsResponse;

/* renamed from: aliw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class aliw extends dck implements alix {
    public aliw() {
        super("com.google.android.gms.pay.internal.IPayServiceCallbacks");
    }

    /* renamed from: a */
    public static alix m61061a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.pay.internal.IPayServiceCallbacks");
        if (queryLocalInterface instanceof alix) {
            return (alix) queryLocalInterface;
        }
        return new aliv(iBinder);
    }

    /* renamed from: a */
    public void mo40442a() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo40441a(Status status) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo40443a(Status status, GetPayCardArtResponse getPayCardArtResponse) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo40444a(Status status, GetPayGlobalActionCardsResponse getPayGlobalActionCardsResponse) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo40445a(Status status, GetSortOrderResponse getSortOrderResponse) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                mo40441a((Status) dcl.m8163a(parcel, Status.CREATOR));
                return true;
            case 3:
                mo40444a((Status) dcl.m8163a(parcel, Status.CREATOR), (GetPayGlobalActionCardsResponse) dcl.m8163a(parcel, GetPayGlobalActionCardsResponse.CREATOR));
                return true;
            case 4:
                Status status = (Status) dcl.m8163a(parcel, Status.CREATOR);
                PendingIntent pendingIntent = (PendingIntent) dcl.m8163a(parcel, PendingIntent.CREATOR);
                throw new UnsupportedOperationException();
            case 5:
                Status status2 = (Status) dcl.m8163a(parcel, Status.CREATOR);
                ProtoSafeParcelable protoSafeParcelable = (ProtoSafeParcelable) dcl.m8163a(parcel, ProtoSafeParcelable.CREATOR);
                throw new UnsupportedOperationException();
            case 6:
                DataChangeListenerResponse dataChangeListenerResponse = (DataChangeListenerResponse) dcl.m8163a(parcel, DataChangeListenerResponse.CREATOR);
                throw new UnsupportedOperationException();
            case 7:
                mo40445a((Status) dcl.m8163a(parcel, Status.CREATOR), (GetSortOrderResponse) dcl.m8163a(parcel, GetSortOrderResponse.CREATOR));
                return true;
            case 8:
                Status status3 = (Status) dcl.m8163a(parcel, Status.CREATOR);
                dcl.m8167a(parcel);
                throw new UnsupportedOperationException();
            case 9:
                Status status4 = (Status) dcl.m8163a(parcel, Status.CREATOR);
                GetTransactionsResponse getTransactionsResponse = (GetTransactionsResponse) dcl.m8163a(parcel, GetTransactionsResponse.CREATOR);
                throw new UnsupportedOperationException();
            case 10:
                PayApiError payApiError = (PayApiError) dcl.m8163a(parcel, PayApiError.CREATOR);
                mo40442a();
                return true;
            case 11:
                Status status5 = (Status) dcl.m8163a(parcel, Status.CREATOR);
                GetOutstandingPurchaseOrderIdResponse getOutstandingPurchaseOrderIdResponse = (GetOutstandingPurchaseOrderIdResponse) dcl.m8163a(parcel, GetOutstandingPurchaseOrderIdResponse.CREATOR);
                throw new UnsupportedOperationException();
            case 12:
                Status status6 = (Status) dcl.m8163a(parcel, Status.CREATOR);
                GetClosedLoopBundleResponse getClosedLoopBundleResponse = (GetClosedLoopBundleResponse) dcl.m8163a(parcel, GetClosedLoopBundleResponse.CREATOR);
                throw new UnsupportedOperationException();
            case 13:
                mo40443a((Status) dcl.m8163a(parcel, Status.CREATOR), (GetPayCardArtResponse) dcl.m8163a(parcel, GetPayCardArtResponse.CREATOR));
                return true;
            case 14:
                Status status7 = (Status) dcl.m8163a(parcel, Status.CREATOR);
                SyncTransactionsResponse syncTransactionsResponse = (SyncTransactionsResponse) dcl.m8163a(parcel, SyncTransactionsResponse.CREATOR);
                throw new UnsupportedOperationException();
            default:
                return false;
        }
    }
}
