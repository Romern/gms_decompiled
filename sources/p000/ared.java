package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.smartdevice.d2d.SourceDevice;
import com.google.android.gms.smartdevice.d2d.TargetConnectionArgs;
import java.util.HashSet;

/* renamed from: ared */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ared implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new TargetConnectionArgs[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        SourceDevice sourceDevice = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (sed.m34995a(readInt) != 2) {
                sed.m35002b(parcel, readInt);
            } else {
                sourceDevice = (SourceDevice) sed.m34998a(parcel, readInt, SourceDevice.CREATOR);
                hashSet.add(2);
            }
        }
        if (parcel.dataPosition() == b) {
            return new TargetConnectionArgs(hashSet, sourceDevice);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel);
    }
}
