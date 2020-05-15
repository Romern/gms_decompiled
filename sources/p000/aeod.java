package p000;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.places.internal.PlaceExtendedDetailsEntity;
import java.util.ArrayList;

/* renamed from: aeod */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeod implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PlaceExtendedDetailsEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        ArrayList arrayList = null;
        String str = null;
        Uri uri = null;
        float f = 0.0f;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                arrayList = sed.m34990B(parcel, readInt);
            } else if (a == 2) {
                str = sed.m35020q(parcel, readInt);
            } else if (a == 3) {
                uri = (Uri) sed.m34998a(parcel, readInt, Uri.CREATOR);
            } else if (a == 4) {
                f = sed.m35015l(parcel, readInt);
            } else if (a != 5) {
                sed.m35002b(parcel, readInt);
            } else {
                i = sed.m35010g(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new PlaceExtendedDetailsEntity(arrayList, str, uri, f, i);
    }
}
