package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.vision.text.internal.client.BoundingBoxParcel;
import com.google.android.gms.vision.text.internal.client.LineBoxParcel;
import com.google.android.gms.vision.text.internal.client.WordBoxParcel;

/* renamed from: avzz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avzz implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LineBoxParcel[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        WordBoxParcel[] wordBoxParcelArr = null;
        BoundingBoxParcel boundingBoxParcel = null;
        BoundingBoxParcel boundingBoxParcel2 = null;
        BoundingBoxParcel boundingBoxParcel3 = null;
        String str = null;
        String str2 = null;
        float f = 0.0f;
        int i = 0;
        boolean z = false;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    wordBoxParcelArr = (WordBoxParcel[]) sed.m35004b(parcel2, readInt, WordBoxParcel.CREATOR);
                    break;
                case 3:
                    boundingBoxParcel = (BoundingBoxParcel) sed.m34998a(parcel2, readInt, BoundingBoxParcel.CREATOR);
                    break;
                case 4:
                    boundingBoxParcel2 = (BoundingBoxParcel) sed.m34998a(parcel2, readInt, BoundingBoxParcel.CREATOR);
                    break;
                case 5:
                    boundingBoxParcel3 = (BoundingBoxParcel) sed.m34998a(parcel2, readInt, BoundingBoxParcel.CREATOR);
                    break;
                case 6:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 7:
                    f = sed.m35015l(parcel2, readInt);
                    break;
                case 8:
                    str2 = sed.m35020q(parcel2, readInt);
                    break;
                case 9:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 10:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 11:
                    i2 = sed.m35010g(parcel2, readInt);
                    break;
                case 12:
                    i3 = sed.m35010g(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new LineBoxParcel(wordBoxParcelArr, boundingBoxParcel, boundingBoxParcel2, boundingBoxParcel3, str, f, str2, i, z, i2, i3);
    }
}
