package p000;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.awareness.snapshot.internal.AwarenessPlaceEntity;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;

/* renamed from: lro */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lro implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AwarenessPlaceEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        String str = null;
        ArrayList arrayList = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        ArrayList arrayList2 = null;
        LatLng latLng = null;
        LatLngBounds latLngBounds = null;
        String str5 = null;
        Uri uri = null;
        String str6 = null;
        float f = 0.0f;
        boolean z = false;
        float f2 = 0.0f;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                str = sed.m35020q(parcel2, readInt);
            } else if (a == 17) {
                arrayList2 = sed.m34992D(parcel2, readInt);
            } else if (a == 23) {
                str6 = sed.m35020q(parcel2, readInt);
            } else if (a == 14) {
                str3 = sed.m35020q(parcel2, readInt);
            } else if (a == 15) {
                str4 = sed.m35020q(parcel2, readInt);
            } else if (a == 19) {
                str2 = sed.m35020q(parcel2, readInt);
            } else if (a != 20) {
                switch (a) {
                    case 4:
                        latLng = (LatLng) sed.m34998a(parcel2, readInt, LatLng.CREATOR);
                        continue;
                    case 5:
                        f = sed.m35015l(parcel2, readInt);
                        continue;
                    case 6:
                        latLngBounds = (LatLngBounds) sed.m34998a(parcel2, readInt, LatLngBounds.CREATOR);
                        continue;
                    case 7:
                        str5 = sed.m35020q(parcel2, readInt);
                        continue;
                    case 8:
                        uri = (Uri) sed.m34998a(parcel2, readInt, Uri.CREATOR);
                        continue;
                    case 9:
                        z = sed.m35006c(parcel2, readInt);
                        continue;
                    case 10:
                        f2 = sed.m35015l(parcel2, readInt);
                        continue;
                    case 11:
                        i = sed.m35010g(parcel2, readInt);
                        continue;
                    default:
                        sed.m35002b(parcel2, readInt);
                        continue;
                }
            } else {
                arrayList = sed.m34990B(parcel2, readInt);
            }
        }
        sed.m34994F(parcel2, b);
        return new AwarenessPlaceEntity(str, arrayList, str2, str3, str4, arrayList2, latLng, f, latLngBounds, str5, uri, z, f2, i, str6);
    }
}
