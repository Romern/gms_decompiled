package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.dataservice.WebSetupConfigRequest;
import com.google.android.gms.auth.firstparty.shared.AppDescription;

/* renamed from: iyi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iyi implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new WebSetupConfigRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        int i = 0;
        AppDescription appDescription = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                i = sed.m35010g(parcel, readInt);
            } else if (a != 2) {
                sed.m35002b(parcel, readInt);
            } else {
                appDescription = (AppDescription) sed.m34998a(parcel, readInt, AppDescription.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new WebSetupConfigRequest(i, appDescription);
    }
}