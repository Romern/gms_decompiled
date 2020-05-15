package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.dataservice.GetAndAdvanceOtpCounterResponse;

/* renamed from: iwr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iwr implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GetAndAdvanceOtpCounterResponse[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        int i = 0;
        Long l = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                i = sed.m35010g(parcel, readInt);
            } else if (a != 2) {
                sed.m35002b(parcel, readInt);
            } else {
                l = sed.m35013j(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new GetAndAdvanceOtpCounterResponse(i, l);
    }
}
