package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.thunderbird.state.ActivationInfo;
import com.google.android.gms.thunderbird.state.DeviceState;
import com.google.android.gms.thunderbird.state.EmergencyInfo;
import java.util.ArrayList;

/* renamed from: auhn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auhn implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new EmergencyInfo[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        ActivationInfo activationInfo = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 9) {
                activationInfo = (ActivationInfo) sed.m34998a(parcel, readInt, ActivationInfo.CREATOR);
            } else if (a != 10) {
                sed.m35002b(parcel, readInt);
            } else {
                arrayList = sed.m35005c(parcel, readInt, DeviceState.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new EmergencyInfo(activationInfo, arrayList);
    }
}
