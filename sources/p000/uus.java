package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.internal.FileUploadPreferencesImpl;
import com.google.android.gms.drive.internal.SetFileUploadPreferencesRequest;

/* renamed from: uus */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uus implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SetFileUploadPreferencesRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        FileUploadPreferencesImpl fileUploadPreferencesImpl = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (sed.m34995a(readInt) != 2) {
                sed.m35002b(parcel, readInt);
            } else {
                fileUploadPreferencesImpl = (FileUploadPreferencesImpl) sed.m34998a(parcel, readInt, FileUploadPreferencesImpl.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new SetFileUploadPreferencesRequest(fileUploadPreferencesImpl);
    }
}
