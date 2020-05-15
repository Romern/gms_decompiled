package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.vision.face.internal.client.ContourParcel;
import com.google.android.gms.vision.face.internal.client.FaceParcel;
import com.google.android.gms.vision.face.internal.client.LandmarkParcel;

/* renamed from: avze */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avze implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new FaceParcel[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        LandmarkParcel[] landmarkParcelArr = null;
        ContourParcel[] contourParcelArr = null;
        int i = 0;
        int i2 = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = Float.MAX_VALUE;
        float f6 = Float.MAX_VALUE;
        float f7 = Float.MAX_VALUE;
        float f8 = 0.0f;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = -1.0f;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 2:
                    i2 = sed.m35010g(parcel2, readInt);
                    break;
                case 3:
                    f = sed.m35015l(parcel2, readInt);
                    break;
                case 4:
                    f2 = sed.m35015l(parcel2, readInt);
                    break;
                case 5:
                    f3 = sed.m35015l(parcel2, readInt);
                    break;
                case 6:
                    f4 = sed.m35015l(parcel2, readInt);
                    break;
                case 7:
                    f5 = sed.m35015l(parcel2, readInt);
                    break;
                case 8:
                    f6 = sed.m35015l(parcel2, readInt);
                    break;
                case 9:
                    landmarkParcelArr = (LandmarkParcel[]) sed.m35004b(parcel2, readInt, LandmarkParcel.CREATOR);
                    break;
                case 10:
                    f8 = sed.m35015l(parcel2, readInt);
                    break;
                case 11:
                    f9 = sed.m35015l(parcel2, readInt);
                    break;
                case 12:
                    f10 = sed.m35015l(parcel2, readInt);
                    break;
                case 13:
                    contourParcelArr = (ContourParcel[]) sed.m35004b(parcel2, readInt, ContourParcel.CREATOR);
                    break;
                case 14:
                    f7 = sed.m35015l(parcel2, readInt);
                    break;
                case 15:
                    f11 = sed.m35015l(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new FaceParcel(i, i2, f, f2, f3, f4, f5, f6, f7, landmarkParcelArr, f8, f9, f10, contourParcelArr, f11);
    }
}
