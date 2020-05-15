package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaQueueContainerMetadata;
import com.google.android.gms.cast.MediaQueueData;
import com.google.android.gms.cast.MediaQueueItem;
import java.util.ArrayList;

/* renamed from: pgk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pgk implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MediaQueueData[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        MediaQueueContainerMetadata mediaQueueContainerMetadata = null;
        ArrayList arrayList = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 3:
                    str2 = sed.m35020q(parcel2, readInt);
                    break;
                case 4:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 5:
                    str3 = sed.m35020q(parcel2, readInt);
                    break;
                case 6:
                    mediaQueueContainerMetadata = (MediaQueueContainerMetadata) sed.m34998a(parcel2, readInt, MediaQueueContainerMetadata.CREATOR);
                    break;
                case 7:
                    i2 = sed.m35010g(parcel2, readInt);
                    break;
                case 8:
                    arrayList = sed.m35005c(parcel2, readInt, MediaQueueItem.CREATOR);
                    break;
                case 9:
                    i3 = sed.m35010g(parcel2, readInt);
                    break;
                case 10:
                    j = sed.m35012i(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new MediaQueueData(str, str2, i, str3, mediaQueueContainerMetadata, i2, arrayList, i3, j);
    }
}
