package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.smartdevice.setup.accounts.DeviceSignals;
import com.google.android.gms.smartdevice.setup.accounts.UserPresence;
import java.util.HashSet;

/* renamed from: aruh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aruh implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new DeviceSignals[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        UserPresence userPresence = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    str = sed.m35020q(parcel, readInt);
                    hashSet.add(2);
                    break;
                case 3:
                    str2 = sed.m35020q(parcel, readInt);
                    hashSet.add(3);
                    break;
                case 4:
                    str3 = sed.m35020q(parcel, readInt);
                    hashSet.add(4);
                    break;
                case 5:
                    str4 = sed.m35020q(parcel, readInt);
                    hashSet.add(5);
                    break;
                case 6:
                    str5 = sed.m35020q(parcel, readInt);
                    hashSet.add(6);
                    break;
                case 7:
                    str6 = sed.m35020q(parcel, readInt);
                    hashSet.add(7);
                    break;
                case 8:
                    userPresence = (UserPresence) sed.m34998a(parcel, readInt, UserPresence.CREATOR);
                    hashSet.add(8);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new DeviceSignals(hashSet, str, str2, str3, str4, str5, str6, userPresence);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel);
    }
}
