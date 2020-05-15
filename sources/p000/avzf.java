package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.vision.face.internal.client.FaceSettingsParcel;

/* renamed from: avzf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avzf implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new FaceSettingsParcel[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        boolean z2 = false;
        float f = -1.0f;
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
                    i3 = sed.m35010g(parcel, readInt);
                    break;
                case 5:
                    z = sed.m35006c(parcel, readInt);
                    break;
                case 6:
                    z2 = sed.m35006c(parcel, readInt);
                    break;
                case 7:
                    f = sed.m35015l(parcel, readInt);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new FaceSettingsParcel(i, i2, i3, z, z2, f);
    }
}
