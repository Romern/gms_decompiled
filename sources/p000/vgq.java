package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.query.internal.HasFilter;

/* renamed from: vgq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vgq implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new HasFilter[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        MetadataBundle metadataBundle = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (sed.m34995a(readInt) != 1) {
                sed.m35002b(parcel, readInt);
            } else {
                metadataBundle = (MetadataBundle) sed.m34998a(parcel, readInt, MetadataBundle.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new HasFilter(metadataBundle);
    }
}
