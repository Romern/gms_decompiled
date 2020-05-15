package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mobilesubscription.serviceconfig.GetEsimConfigRequest;
import com.google.android.gms.mobilesubscription.serviceconfig.UserKey;

/* renamed from: ahap */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahap implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GetEsimConfigRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        UserKey userKey = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String[] strArr = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a != 63) {
                switch (a) {
                    case 1:
                        str = sed.m35020q(parcel, readInt);
                        continue;
                    case 2:
                        userKey = (UserKey) sed.m34998a(parcel, readInt, UserKey.CREATOR);
                        continue;
                    case 3:
                        str2 = sed.m35020q(parcel, readInt);
                        continue;
                    case 4:
                        str3 = sed.m35020q(parcel, readInt);
                        continue;
                    case 5:
                        str4 = sed.m35020q(parcel, readInt);
                        continue;
                    case 6:
                        str5 = sed.m35020q(parcel, readInt);
                        continue;
                    case 7:
                        strArr = sed.m34989A(parcel, readInt);
                        continue;
                    default:
                        sed.m35002b(parcel, readInt);
                        continue;
                }
            } else {
                bundle = sed.m35022s(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new GetEsimConfigRequest(str, userKey, str2, str3, str4, str5, strArr, bundle);
    }
}
