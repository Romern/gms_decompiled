package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.facs.cache.GetActivityControlsSettingsResult;

/* renamed from: wfj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wfj implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GetActivityControlsSettingsResult[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        byte[] bArr = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (sed.m34995a(readInt) != 1) {
                sed.m35002b(parcel, readInt);
            } else {
                bArr = sed.m35023t(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new GetActivityControlsSettingsResult(bArr);
    }
}
