package p000;

import android.os.Parcel;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.internal.ApplicationStatus;
import com.google.android.gms.cast.internal.DeviceStatus;

/* renamed from: pts */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class pts extends dck implements ptt {
    public pts() {
        super("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                mo23001a(parcel.readInt());
                return true;
            case 2:
                mo23002a((ApplicationMetadata) dcl.m8163a(parcel, ApplicationMetadata.CREATOR), parcel.readString(), parcel.readString(), dcl.m8167a(parcel));
                return true;
            case 3:
                mo23012d(parcel.readInt());
                return true;
            case 4:
                mo23005a(parcel.readString(), parcel.readDouble(), dcl.m8167a(parcel));
                return true;
            case 5:
                mo23008a(parcel.readString(), parcel.readString());
                return true;
            case 6:
                mo23009a(parcel.readString(), parcel.createByteArray());
                return true;
            case 7:
                mo23014f(parcel.readInt());
                return true;
            case 8:
                mo23013e(parcel.readInt());
                return true;
            case 9:
                mo23015g(parcel.readInt());
                return true;
            case 10:
                mo23007a(parcel.readString(), parcel.readLong(), parcel.readInt());
                return true;
            case 11:
                mo23006a(parcel.readString(), parcel.readLong());
                return true;
            case 12:
                mo23003a((ApplicationStatus) dcl.m8163a(parcel, ApplicationStatus.CREATOR));
                return true;
            case 13:
                mo23004a((DeviceStatus) dcl.m8163a(parcel, DeviceStatus.CREATOR));
                return true;
            case 14:
                mo23010b(parcel.readInt());
                return true;
            case 15:
                mo23011c(parcel.readInt());
                return true;
            default:
                return false;
        }
    }
}
