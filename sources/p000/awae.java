package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.vision.text.internal.client.BoundingBoxParcel;
import com.google.android.gms.vision.text.internal.client.SymbolBoxParcel;
import com.google.android.gms.vision.text.internal.client.WordBoxParcel;

/* renamed from: awae */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awae implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new WordBoxParcel[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        SymbolBoxParcel[] symbolBoxParcelArr = null;
        BoundingBoxParcel boundingBoxParcel = null;
        BoundingBoxParcel boundingBoxParcel2 = null;
        String str = null;
        String str2 = null;
        float f = 0.0f;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    symbolBoxParcelArr = (SymbolBoxParcel[]) sed.m35004b(parcel, readInt, SymbolBoxParcel.CREATOR);
                    break;
                case 3:
                    boundingBoxParcel = (BoundingBoxParcel) sed.m34998a(parcel, readInt, BoundingBoxParcel.CREATOR);
                    break;
                case 4:
                    boundingBoxParcel2 = (BoundingBoxParcel) sed.m34998a(parcel, readInt, BoundingBoxParcel.CREATOR);
                    break;
                case 5:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 6:
                    f = sed.m35015l(parcel, readInt);
                    break;
                case 7:
                    str2 = sed.m35020q(parcel, readInt);
                    break;
                case 8:
                    z = sed.m35006c(parcel, readInt);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new WordBoxParcel(symbolBoxParcelArr, boundingBoxParcel, boundingBoxParcel2, str, f, str2, z);
    }
}
