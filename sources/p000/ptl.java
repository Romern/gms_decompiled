package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.EqualizerSettings;
import com.google.android.gms.cast.internal.DeviceStatus;

/* renamed from: ptl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ptl implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new DeviceStatus[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        ApplicationMetadata applicationMetadata = null;
        EqualizerSettings equalizerSettings = null;
        double d = 0.0d;
        double d2 = 0.0d;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    d = sed.m35017n(parcel2, readInt);
                    break;
                case 3:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 4:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 5:
                    applicationMetadata = (ApplicationMetadata) sed.m34998a(parcel2, readInt, ApplicationMetadata.CREATOR);
                    break;
                case 6:
                    i2 = sed.m35010g(parcel2, readInt);
                    break;
                case 7:
                    equalizerSettings = (EqualizerSettings) sed.m34998a(parcel2, readInt, EqualizerSettings.CREATOR);
                    break;
                case 8:
                    d2 = sed.m35017n(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new DeviceStatus(d, z, i, applicationMetadata, i2, equalizerSettings, d2);
    }
}
