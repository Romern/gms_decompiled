package p000;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.vision.face.internal.client.ContourParcel;

/* renamed from: avzd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avzd implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ContourParcel[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        PointF[] pointFArr = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                pointFArr = (PointF[]) sed.m35004b(parcel, readInt, PointF.CREATOR);
            } else if (a != 3) {
                sed.m35002b(parcel, readInt);
            } else {
                i = sed.m35010g(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new ContourParcel(pointFArr, i);
    }
}
