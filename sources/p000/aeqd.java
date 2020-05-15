package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.reporting.ReportingState;

/* renamed from: aeqd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeqd implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ReportingState[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        Integer num = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        int i3 = 0;
        int i4 = 0;
        boolean z3 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    i = sed.m35010g(parcel, readInt);
                    break;
                case 3:
                    i2 = sed.m35010g(parcel, readInt);
                    break;
                case 4:
                    z = sed.m35006c(parcel, readInt);
                    break;
                case 5:
                    z2 = sed.m35006c(parcel, readInt);
                    break;
                case 6:
                default:
                    sed.m35002b(parcel, readInt);
                    break;
                case 7:
                    i3 = sed.m35010g(parcel, readInt);
                    break;
                case 8:
                    num = sed.m35011h(parcel, readInt);
                    break;
                case 9:
                    i4 = sed.m35010g(parcel, readInt);
                    break;
                case 10:
                    z3 = sed.m35006c(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new ReportingState(i, i2, z, z2, i3, i4, num, z3);
    }
}
