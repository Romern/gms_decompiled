package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tapandpay.firstparty.PassInfo;
import com.google.android.gms.tapandpay.firstparty.TransmissionEvent;
import com.google.android.gms.tapandpay.firstparty.TransmissionFailureUiInfo;

/* renamed from: aspf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aspf implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new TransmissionEvent[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        PassInfo[] passInfoArr = null;
        TransmissionFailureUiInfo transmissionFailureUiInfo = null;
        int i = 0;
        boolean z = false;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                i = sed.m35010g(parcel, readInt);
            } else if (a == 2) {
                passInfoArr = (PassInfo[]) sed.m35004b(parcel, readInt, PassInfo.CREATOR);
            } else if (a == 3) {
                z = sed.m35006c(parcel, readInt);
            } else if (a == 4) {
                i2 = sed.m35010g(parcel, readInt);
            } else if (a != 5) {
                sed.m35002b(parcel, readInt);
            } else {
                transmissionFailureUiInfo = (TransmissionFailureUiInfo) sed.m34998a(parcel, readInt, TransmissionFailureUiInfo.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new TransmissionEvent(i, passInfoArr, z, i2, transmissionFailureUiInfo);
    }
}
