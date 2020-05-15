package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.vision.internal.client.FrameMetadataParcel;

/* renamed from: avzm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avzm implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new FrameMetadataParcel[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        long j = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                i = sed.m35010g(parcel, readInt);
            } else if (a == 3) {
                i2 = sed.m35010g(parcel, readInt);
            } else if (a == 4) {
                i3 = sed.m35010g(parcel, readInt);
            } else if (a == 5) {
                j = sed.m35012i(parcel, readInt);
            } else if (a != 6) {
                sed.m35002b(parcel, readInt);
            } else {
                i4 = sed.m35010g(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new FrameMetadataParcel(i, i2, i3, j, i4);
    }
}
