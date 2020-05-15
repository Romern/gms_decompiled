package p000;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.backup.ParcelableBackupDataInput;

/* renamed from: lut */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lut implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ParcelableBackupDataInput[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (sed.m34995a(readInt) != 1) {
                sed.m35002b(parcel, readInt);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) sed.m34998a(parcel, readInt, ParcelFileDescriptor.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new ParcelableBackupDataInput(parcelFileDescriptor);
    }
}
