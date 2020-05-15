package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.DefaultOAuthCredential;
import com.google.firebase.auth.api.aidlresponses.OnFailedMfaSignInAidlResponse;
import com.google.firebase.auth.api.model.MfaInfo;
import java.util.ArrayList;

/* renamed from: brkx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brkx implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new OnFailedMfaSignInAidlResponse[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        ArrayList arrayList = null;
        DefaultOAuthCredential defaultOAuthCredential = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                str = sed.m35020q(parcel, readInt);
            } else if (a == 2) {
                arrayList = sed.m35005c(parcel, readInt, MfaInfo.CREATOR);
            } else if (a != 3) {
                sed.m35002b(parcel, readInt);
            } else {
                defaultOAuthCredential = (DefaultOAuthCredential) sed.m34998a(parcel, readInt, DefaultOAuthCredential.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new OnFailedMfaSignInAidlResponse(str, arrayList, defaultOAuthCredential);
    }
}
