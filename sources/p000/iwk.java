package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.dataservice.CheckRealNameRequest;
import com.google.android.gms.auth.firstparty.shared.AppDescription;

/* renamed from: iwk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iwk implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CheckRealNameRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        AppDescription appDescription = null;
        String str = null;
        String str2 = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                i = sed.m35010g(parcel, readInt);
            } else if (a == 2) {
                appDescription = (AppDescription) sed.m34998a(parcel, readInt, AppDescription.CREATOR);
            } else if (a == 3) {
                str = sed.m35020q(parcel, readInt);
            } else if (a != 4) {
                sed.m35002b(parcel, readInt);
            } else {
                str2 = sed.m35020q(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new CheckRealNameRequest(i, appDescription, str, str2);
    }
}
