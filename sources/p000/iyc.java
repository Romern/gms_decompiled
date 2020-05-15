package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import com.google.android.gms.auth.firstparty.shared.FACLConfig;
import com.google.android.gms.auth.firstparty.shared.PACLConfig;

/* renamed from: iyc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iyc implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new TokenRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        Bundle bundle = new Bundle();
        String str = iyb.UNKNOWN.toString();
        String str2 = null;
        String str3 = null;
        FACLConfig fACLConfig = null;
        PACLConfig pACLConfig = null;
        AppDescription appDescription = null;
        CaptchaSolution captchaSolution = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = "com.google";
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = true;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 2:
                    str2 = sed.m35020q(parcel2, readInt);
                    break;
                case 3:
                    str3 = sed.m35020q(parcel2, readInt);
                    break;
                case 4:
                    bundle = sed.m35022s(parcel2, readInt);
                    break;
                case 5:
                    fACLConfig = (FACLConfig) sed.m34998a(parcel2, readInt, FACLConfig.CREATOR);
                    break;
                case 6:
                    pACLConfig = (PACLConfig) sed.m34998a(parcel2, readInt, PACLConfig.CREATOR);
                    break;
                case 7:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 8:
                    z2 = sed.m35006c(parcel2, readInt);
                    break;
                case 9:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 10:
                    appDescription = (AppDescription) sed.m34998a(parcel2, readInt, AppDescription.CREATOR);
                    break;
                case 11:
                    captchaSolution = (CaptchaSolution) sed.m34998a(parcel2, readInt, CaptchaSolution.CREATOR);
                    break;
                case 12:
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
                case 13:
                    z3 = sed.m35006c(parcel2, readInt);
                    break;
                case 14:
                    z4 = sed.m35006c(parcel2, readInt);
                    break;
                case 15:
                    str7 = sed.m35020q(parcel2, readInt);
                    break;
                case 16:
                    i2 = sed.m35010g(parcel2, readInt);
                    break;
                case 17:
                    str4 = sed.m35020q(parcel2, readInt);
                    break;
                case 18:
                    str5 = sed.m35020q(parcel2, readInt);
                    break;
                case 19:
                    str6 = sed.m35020q(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new TokenRequest(i, str2, str3, bundle, fACLConfig, pACLConfig, z, z2, str, appDescription, captchaSolution, z3, z4, str7, i2, str4, str5, str6);
    }
}
