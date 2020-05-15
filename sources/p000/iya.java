package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.dataservice.PasswordSettings;
import com.google.android.gms.auth.firstparty.dataservice.PinSettings;
import com.google.android.gms.auth.firstparty.dataservice.ReauthSettingsResponse;

/* renamed from: iya */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iya implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ReauthSettingsResponse[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        PasswordSettings passwordSettings = null;
        PinSettings pinSettings = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                i = sed.m35010g(parcel, readInt);
            } else if (a == 2) {
                i2 = sed.m35010g(parcel, readInt);
            } else if (a == 3) {
                passwordSettings = (PasswordSettings) sed.m34998a(parcel, readInt, PasswordSettings.CREATOR);
            } else if (a != 4) {
                sed.m35002b(parcel, readInt);
            } else {
                pinSettings = (PinSettings) sed.m34998a(parcel, readInt, PinSettings.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new ReauthSettingsResponse(i, i2, passwordSettings, pinSettings);
    }
}
