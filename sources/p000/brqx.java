package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.api.model.MfaInfo;
import com.google.firebase.auth.api.model.ResetPasswordResponse;

/* renamed from: brqx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brqx implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ResetPasswordResponse[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        MfaInfo mfaInfo = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                str = sed.m35020q(parcel, readInt);
            } else if (a == 3) {
                str2 = sed.m35020q(parcel, readInt);
            } else if (a == 4) {
                str3 = sed.m35020q(parcel, readInt);
            } else if (a != 5) {
                sed.m35002b(parcel, readInt);
            } else {
                mfaInfo = (MfaInfo) sed.m34998a(parcel, readInt, MfaInfo.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new ResetPasswordResponse(str, str2, str3, mfaInfo);
    }
}
