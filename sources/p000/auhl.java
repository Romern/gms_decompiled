package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.thunderbird.state.DeviceState;

/* renamed from: auhl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auhl implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new DeviceState[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 2:
                    str2 = sed.m35020q(parcel, readInt);
                    break;
                case 3:
                    str3 = sed.m35020q(parcel, readInt);
                    break;
                case 4:
                    str4 = sed.m35020q(parcel, readInt);
                    break;
                case 5:
                default:
                    sed.m35002b(parcel, readInt);
                    break;
                case 6:
                    str5 = sed.m35020q(parcel, readInt);
                    break;
                case 7:
                    str6 = sed.m35020q(parcel, readInt);
                    break;
                case 8:
                    str7 = sed.m35020q(parcel, readInt);
                    break;
                case 9:
                    i = sed.m35010g(parcel, readInt);
                    break;
                case 10:
                    z = sed.m35006c(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new DeviceState(i, str, str2, str3, str4, z, str5, str6, str7);
    }
}
