package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.common.people.data.AudienceMember;
import java.util.ArrayList;

/* renamed from: sfe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sfe implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Audience[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        ArrayList arrayList = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                arrayList = sed.m35005c(parcel, readInt, AudienceMember.CREATOR);
            } else if (a == 2) {
                i2 = sed.m35010g(parcel, readInt);
            } else if (a == 3) {
                z = sed.m35006c(parcel, readInt);
            } else if (a == 4) {
                z2 = sed.m35006c(parcel, readInt);
            } else if (a != 1000) {
                sed.m35002b(parcel, readInt);
            } else {
                i = sed.m35010g(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new Audience(i, arrayList, i2, z, z2);
    }
}
