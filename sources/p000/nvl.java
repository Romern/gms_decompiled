package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.car.RadioProperties;
import java.util.ArrayList;

/* renamed from: nvl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nvl implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new RadioProperties[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        boolean z2 = false;
        boolean z3 = false;
        int i6 = 0;
        boolean z4 = false;
        boolean z5 = false;
        int i7 = 0;
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
                    arrayList = sed.m35005c(parcel2, readInt, RadioProperties.ChannelRange.CREATOR);
                    break;
                case 4:
                    arrayList2 = sed.m34990B(parcel2, readInt);
                    break;
                case 5:
                    i3 = sed.m35010g(parcel2, readInt);
                    break;
                case 6:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 7:
                    i4 = sed.m35010g(parcel2, readInt);
                    break;
                case 8:
                    i5 = sed.m35010g(parcel2, readInt);
                    break;
                case 9:
                    z2 = sed.m35006c(parcel2, readInt);
                    break;
                case 10:
                    z3 = sed.m35006c(parcel2, readInt);
                    break;
                case 11:
                    i6 = sed.m35010g(parcel2, readInt);
                    break;
                case 12:
                    z4 = sed.m35006c(parcel2, readInt);
                    break;
                case 13:
                    z5 = sed.m35006c(parcel2, readInt);
                    break;
                case 14:
                    i7 = sed.m35010g(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new RadioProperties(i, i2, arrayList, arrayList2, i3, z, i4, i5, z2, z3, i6, z4, z5, i7);
    }
}
