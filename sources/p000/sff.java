package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.people.data.AudienceMember;

/* renamed from: sff */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sff implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AudienceMember[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Bundle bundle = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a != 1000) {
                switch (a) {
                    case 1:
                        i2 = sed.m35010g(parcel, readInt);
                        continue;
                    case 2:
                        i3 = sed.m35010g(parcel, readInt);
                        continue;
                    case 3:
                        str = sed.m35020q(parcel, readInt);
                        continue;
                    case 4:
                        str2 = sed.m35020q(parcel, readInt);
                        continue;
                    case 5:
                        str3 = sed.m35020q(parcel, readInt);
                        continue;
                    case 6:
                        str4 = sed.m35020q(parcel, readInt);
                        continue;
                    case 7:
                        bundle = sed.m35022s(parcel, readInt);
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
        return new AudienceMember(i, i2, i3, str, str2, str3, str4, bundle);
    }
}
