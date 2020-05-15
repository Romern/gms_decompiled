package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.dataservice.ConsentResult;
import com.google.android.gms.auth.firstparty.shared.FACLConfig;

/* renamed from: iwp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iwp implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ConsentResult[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        FACLConfig fACLConfig = null;
        String str2 = null;
        String str3 = null;
        String str4 = "com.google.android.gms.auth.firstparty.shared.Status.UNKNOWN.toString()";
        String str5 = "com.google.android.gms.auth.firstparty.shared.Consent.UNKNOWN.toString()";
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    i = sed.m35010g(parcel, readInt);
                    break;
                case 2:
                    str4 = sed.m35020q(parcel, readInt);
                    break;
                case 3:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 4:
                    fACLConfig = (FACLConfig) sed.m34998a(parcel, readInt, FACLConfig.CREATOR);
                    break;
                case 5:
                    str5 = sed.m35020q(parcel, readInt);
                    break;
                case 6:
                    str2 = sed.m35020q(parcel, readInt);
                    break;
                case 7:
                    str3 = sed.m35020q(parcel, readInt);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new ConsentResult(i, str4, str, fACLConfig, str5, str2, str3);
    }
}
