package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.udc.ConsentFlowConfig;

/* renamed from: auzm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auzm implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ConsentFlowConfig[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        int i2 = 0;
        boolean z4 = false;
        int i3 = 0;
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
                    z3 = sed.m35006c(parcel, readInt);
                    break;
                case 5:
                    i = sed.m35010g(parcel, readInt);
                    break;
                case 6:
                    i2 = sed.m35010g(parcel, readInt);
                    break;
                case 7:
                    z4 = sed.m35006c(parcel, readInt);
                    break;
                case 8:
                    i3 = sed.m35010g(parcel, readInt);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new ConsentFlowConfig(z, z2, z3, i, i2, z4, i3);
    }
}
