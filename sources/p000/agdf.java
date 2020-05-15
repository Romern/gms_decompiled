package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;
import com.google.android.gms.measurement.internal.EventParcel;
import com.google.android.gms.measurement.internal.UserAttributeParcel;

/* renamed from: agdf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agdf implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ConditionalUserPropertyParcel[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        String str = null;
        String str2 = null;
        UserAttributeParcel userAttributeParcel = null;
        String str3 = null;
        EventParcel eventParcel = null;
        EventParcel eventParcel2 = null;
        EventParcel eventParcel3 = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 3:
                    str2 = sed.m35020q(parcel2, readInt);
                    break;
                case 4:
                    userAttributeParcel = (UserAttributeParcel) sed.m34998a(parcel2, readInt, UserAttributeParcel.CREATOR);
                    break;
                case 5:
                    j = sed.m35012i(parcel2, readInt);
                    break;
                case 6:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 7:
                    str3 = sed.m35020q(parcel2, readInt);
                    break;
                case 8:
                    eventParcel = (EventParcel) sed.m34998a(parcel2, readInt, EventParcel.CREATOR);
                    break;
                case 9:
                    j2 = sed.m35012i(parcel2, readInt);
                    break;
                case 10:
                    eventParcel2 = (EventParcel) sed.m34998a(parcel2, readInt, EventParcel.CREATOR);
                    break;
                case 11:
                    j3 = sed.m35012i(parcel2, readInt);
                    break;
                case 12:
                    eventParcel3 = (EventParcel) sed.m34998a(parcel2, readInt, EventParcel.CREATOR);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new ConditionalUserPropertyParcel(str, str2, userAttributeParcel, j, z, str3, eventParcel, j2, eventParcel2, j3, eventParcel3);
    }
}
