package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.CreateFileRequest;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

/* renamed from: urp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class urp implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CreateFileRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        Integer num = null;
        DriveId driveId = null;
        MetadataBundle metadataBundle = null;
        Contents contents = null;
        String str = null;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    driveId = (DriveId) sed.m34998a(parcel, readInt, DriveId.CREATOR);
                    break;
                case 3:
                    metadataBundle = (MetadataBundle) sed.m34998a(parcel, readInt, MetadataBundle.CREATOR);
                    break;
                case 4:
                    contents = (Contents) sed.m34998a(parcel, readInt, Contents.CREATOR);
                    break;
                case 5:
                    num = sed.m35011h(parcel, readInt);
                    break;
                case 6:
                    z = sed.m35006c(parcel, readInt);
                    break;
                case 7:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 8:
                    i = sed.m35010g(parcel, readInt);
                    break;
                case 9:
                    i2 = sed.m35010g(parcel, readInt);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new CreateFileRequest(driveId, metadataBundle, contents, num.intValue(), z, str, i, i2);
    }
}
