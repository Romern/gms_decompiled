package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.userlocation.PlaceEstimate;
import com.google.android.gms.userlocation.Position;
import com.google.android.gms.userlocation.SemanticLocation;
import com.google.android.gms.userlocation.TransitEstimate;
import java.util.ArrayList;

/* renamed from: avwe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avwe implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SemanticLocation[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        TransitEstimate transitEstimate = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        Position position = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    i = sed.m35010g(parcel, readInt);
                    break;
                case 2:
                    j = sed.m35012i(parcel, readInt);
                    break;
                case 3:
                    transitEstimate = (TransitEstimate) sed.m34998a(parcel, readInt, TransitEstimate.CREATOR);
                    break;
                case 4:
                    arrayList = sed.m35005c(parcel, readInt, PlaceEstimate.CREATOR);
                    break;
                case 5:
                    arrayList2 = sed.m35005c(parcel, readInt, PlaceEstimate.CREATOR);
                    break;
                case 6:
                    position = (Position) sed.m34998a(parcel, readInt, Position.CREATOR);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new SemanticLocation(i, j, transitEstimate, arrayList, arrayList2, position);
    }
}
