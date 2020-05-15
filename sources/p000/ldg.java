package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.autofill.metrics.MetricsContext;
import com.google.android.gms.autofill.operation.UserFieldTypeManager;
import com.google.android.gms.autofill.service.common.ClientState;
import com.google.android.gms.autofill.service.common.DetectionHistory;
import com.google.android.gms.autofill.util.PaymentsUtils$CardNetwork;

/* renamed from: ldg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ldg implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ClientState clientState = new ClientState();
        byte[] createByteArray = parcel.createByteArray();
        if (createByteArray != null) {
            clientState.f11669a = createByteArray;
        }
        PaymentsUtils$CardNetwork[] paymentsUtils$CardNetworkArr = (PaymentsUtils$CardNetwork[]) parcel.createTypedArray(PaymentsUtils$CardNetwork.CREATOR);
        if (paymentsUtils$CardNetworkArr != null) {
            clientState.f11670b = paymentsUtils$CardNetworkArr;
        }
        clientState.f11671c = (DetectionHistory) parcel.readTypedObject(DetectionHistory.CREATOR);
        clientState.f11672d = (UserFieldTypeManager) parcel.readTypedObject(UserFieldTypeManager.CREATOR);
        if (parcel.readInt() != 0) {
            clientState.f11673e = (MetricsContext) parcel.readParcelable(MetricsContext.class.getClassLoader());
        }
        return clientState;
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ClientState[i];
    }
}
