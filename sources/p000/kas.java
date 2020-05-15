package p000;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.uncertifieddevice.UncertifiedDeviceServiceResponse;

/* renamed from: kas */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kas implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new UncertifiedDeviceServiceResponse[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        int i = 0;
        PendingIntent pendingIntent = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                i = sed.m35010g(parcel, readInt);
            } else if (a == 2) {
                z = sed.m35006c(parcel, readInt);
            } else if (a != 3) {
                sed.m35002b(parcel, readInt);
            } else {
                pendingIntent = (PendingIntent) sed.m34998a(parcel, readInt, PendingIntent.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new UncertifiedDeviceServiceResponse(i, z, pendingIntent);
    }
}
