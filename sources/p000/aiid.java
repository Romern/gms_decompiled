package p000;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.nearby.internal.connection.ParcelablePayload;

/* renamed from: aiid */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aiid implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ParcelablePayload[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        byte[] bArr = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        String str = null;
        ParcelFileDescriptor parcelFileDescriptor2 = null;
        Uri uri = null;
        long j = 0;
        long j2 = -1;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    j = sed.m35012i(parcel2, readInt);
                    break;
                case 2:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 3:
                    bArr = sed.m35023t(parcel2, readInt);
                    break;
                case 4:
                    parcelFileDescriptor = (ParcelFileDescriptor) sed.m34998a(parcel2, readInt, ParcelFileDescriptor.CREATOR);
                    break;
                case 5:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 6:
                    j2 = sed.m35012i(parcel2, readInt);
                    break;
                case 7:
                    parcelFileDescriptor2 = (ParcelFileDescriptor) sed.m34998a(parcel2, readInt, ParcelFileDescriptor.CREATOR);
                    break;
                case 8:
                    uri = (Uri) sed.m34998a(parcel2, readInt, Uri.CREATOR);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new ParcelablePayload(j, i, bArr, parcelFileDescriptor, str, j2, parcelFileDescriptor2, uri);
    }
}
