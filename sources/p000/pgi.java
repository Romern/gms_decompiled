package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.MediaQueueContainerMetadata;
import com.google.android.gms.common.images.WebImage;
import java.util.ArrayList;

/* renamed from: pgi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pgi implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MediaQueueContainerMetadata[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        double d = 0.0d;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                i = sed.m35010g(parcel, readInt);
            } else if (a == 3) {
                str = sed.m35020q(parcel, readInt);
            } else if (a == 4) {
                arrayList = sed.m35005c(parcel, readInt, MediaMetadata.CREATOR);
            } else if (a == 5) {
                arrayList2 = sed.m35005c(parcel, readInt, WebImage.CREATOR);
            } else if (a != 6) {
                sed.m35002b(parcel, readInt);
            } else {
                d = sed.m35017n(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new MediaQueueContainerMetadata(i, str, arrayList, arrayList2, d);
    }
}
