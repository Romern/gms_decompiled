package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.plus.model.posts.Settings;

/* renamed from: anxt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anxt implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Settings[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        Audience audience = null;
        Audience audience2 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a != 1000) {
                switch (a) {
                    case 1:
                        audience = (Audience) sed.m34998a(parcel, readInt, Audience.CREATOR);
                        continue;
                    case 2:
                        audience2 = (Audience) sed.m34998a(parcel, readInt, Audience.CREATOR);
                        continue;
                    case 3:
                        z = sed.m35006c(parcel, readInt);
                        continue;
                    case 4:
                        z2 = sed.m35006c(parcel, readInt);
                        continue;
                    case 5:
                        i2 = sed.m35010g(parcel, readInt);
                        continue;
                    case 6:
                        i3 = sed.m35010g(parcel, readInt);
                        continue;
                    case 7:
                        i4 = sed.m35010g(parcel, readInt);
                        continue;
                    default:
                        sed.m35002b(parcel, readInt);
                        continue;
                }
            } else {
                i = sed.m35010g(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new Settings(i, audience, audience2, z, z2, i2, i3, i4);
    }
}
