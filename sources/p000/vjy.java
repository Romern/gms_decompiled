package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.realtime.internal.ParcelableCollaborator;

/* renamed from: vjy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vjy implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ParcelableCollaborator[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    z = sed.m35006c(parcel, readInt);
                    break;
                case 3:
                    z2 = sed.m35006c(parcel, readInt);
                    break;
                case 4:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 5:
                    str2 = sed.m35020q(parcel, readInt);
                    break;
                case 6:
                    str3 = sed.m35020q(parcel, readInt);
                    break;
                case 7:
                    str4 = sed.m35020q(parcel, readInt);
                    break;
                case 8:
                    str5 = sed.m35020q(parcel, readInt);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new ParcelableCollaborator(z, z2, str, str2, str3, str4, str5);
    }
}
