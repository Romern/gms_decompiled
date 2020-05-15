package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.internal.ParcelableTransferPreferences;
import com.google.android.gms.drive.internal.SetPinnedDownloadPreferencesRequest;

/* renamed from: uut */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uut implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SetPinnedDownloadPreferencesRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        ParcelableTransferPreferences parcelableTransferPreferences = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (sed.m34995a(readInt) != 2) {
                sed.m35002b(parcel, readInt);
            } else {
                parcelableTransferPreferences = (ParcelableTransferPreferences) sed.m34998a(parcel, readInt, ParcelableTransferPreferences.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new SetPinnedDownloadPreferencesRequest(parcelableTransferPreferences);
    }
}
