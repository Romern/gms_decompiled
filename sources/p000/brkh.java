package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.api.aidlrequests.SendVerificationCodeAidlRequest;
import com.google.firebase.auth.api.model.SendVerificationCodeRequest;

/* renamed from: brkh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brkh implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SendVerificationCodeAidlRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        SendVerificationCodeRequest sendVerificationCodeRequest = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (sed.m34995a(readInt) != 1) {
                sed.m35002b(parcel, readInt);
            } else {
                sendVerificationCodeRequest = (SendVerificationCodeRequest) sed.m34998a(parcel, readInt, SendVerificationCodeRequest.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new SendVerificationCodeAidlRequest(sendVerificationCodeRequest);
    }
}
