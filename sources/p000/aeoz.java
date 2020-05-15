package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.places.personalized.UserPlace;
import java.util.ArrayList;

/* renamed from: aeoz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeoz implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new UserPlace[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                str = sed.m35020q(parcel, readInt);
            } else if (a != 2) {
                sed.m35002b(parcel, readInt);
            } else {
                arrayList = sed.m34990B(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new UserPlace(str, arrayList);
    }
}
