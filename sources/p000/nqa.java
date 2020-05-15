package p000;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Surface;
import com.google.android.gms.car.DrawingSpec;

/* renamed from: nqa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nqa implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new DrawingSpec[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        Surface surface = null;
        Rect rect = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                i = sed.m35010g(parcel, readInt);
            } else if (a == 2) {
                i2 = sed.m35010g(parcel, readInt);
            } else if (a == 3) {
                i3 = sed.m35010g(parcel, readInt);
            } else if (a == 4) {
                surface = (Surface) sed.m34998a(parcel, readInt, Surface.CREATOR);
            } else if (a != 5) {
                sed.m35002b(parcel, readInt);
            } else {
                rect = (Rect) sed.m34998a(parcel, readInt, Rect.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new DrawingSpec(i, i2, i3, surface, rect);
    }
}
