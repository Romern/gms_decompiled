package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.DefaultOAuthCredential;
import com.google.firebase.auth.api.model.GetAccountInfoUser;
import com.google.firebase.auth.api.model.MfaInfo;
import com.google.firebase.auth.api.model.ProviderUserInfoList;
import java.util.ArrayList;

/* renamed from: brqm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brqm implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GetAccountInfoUser[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        ProviderUserInfoList providerUserInfoList = null;
        String str5 = null;
        String str6 = null;
        DefaultOAuthCredential defaultOAuthCredential = null;
        ArrayList arrayList = null;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 3:
                    str2 = sed.m35020q(parcel2, readInt);
                    break;
                case 4:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 5:
                    str3 = sed.m35020q(parcel2, readInt);
                    break;
                case 6:
                    str4 = sed.m35020q(parcel2, readInt);
                    break;
                case 7:
                    providerUserInfoList = (ProviderUserInfoList) sed.m34998a(parcel2, readInt, ProviderUserInfoList.CREATOR);
                    break;
                case 8:
                    str5 = sed.m35020q(parcel2, readInt);
                    break;
                case 9:
                    str6 = sed.m35020q(parcel2, readInt);
                    break;
                case 10:
                    j = sed.m35012i(parcel2, readInt);
                    break;
                case 11:
                    j2 = sed.m35012i(parcel2, readInt);
                    break;
                case 12:
                    z2 = sed.m35006c(parcel2, readInt);
                    break;
                case 13:
                    defaultOAuthCredential = (DefaultOAuthCredential) sed.m34998a(parcel2, readInt, DefaultOAuthCredential.CREATOR);
                    break;
                case 14:
                    arrayList = sed.m35005c(parcel2, readInt, MfaInfo.CREATOR);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new GetAccountInfoUser(str, str2, z, str3, str4, providerUserInfoList, str5, str6, j, j2, z2, defaultOAuthCredential, arrayList);
    }
}
