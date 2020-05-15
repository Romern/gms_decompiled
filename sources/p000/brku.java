package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.auth.api.aidlrequests.UpdateProfileAidlRequest;

/* renamed from: brku */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brku implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new UpdateProfileAidlRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        UserProfileChangeRequest userProfileChangeRequest = null;
        String str = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                userProfileChangeRequest = (UserProfileChangeRequest) sed.m34998a(parcel, readInt, UserProfileChangeRequest.CREATOR);
            } else if (a != 2) {
                sed.m35002b(parcel, readInt);
            } else {
                str = sed.m35020q(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new UpdateProfileAidlRequest(userProfileChangeRequest, str);
    }
}
