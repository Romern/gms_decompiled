package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mdh.SyncPolicy;
import com.google.android.gms.mdh.SyncSubPolicy;

/* renamed from: aflb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aflb implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SyncPolicy[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        SyncSubPolicy syncSubPolicy = null;
        SyncSubPolicy syncSubPolicy2 = null;
        SyncSubPolicy syncSubPolicy3 = null;
        SyncSubPolicy syncSubPolicy4 = null;
        Integer num = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    i = sed.m35010g(parcel, readInt);
                    break;
                case 2:
                    syncSubPolicy = (SyncSubPolicy) sed.m34998a(parcel, readInt, SyncSubPolicy.CREATOR);
                    break;
                case 3:
                    syncSubPolicy2 = (SyncSubPolicy) sed.m34998a(parcel, readInt, SyncSubPolicy.CREATOR);
                    break;
                case 4:
                    syncSubPolicy3 = (SyncSubPolicy) sed.m34998a(parcel, readInt, SyncSubPolicy.CREATOR);
                    break;
                case 5:
                    syncSubPolicy4 = (SyncSubPolicy) sed.m34998a(parcel, readInt, SyncSubPolicy.CREATOR);
                    break;
                case 6:
                    num = sed.m35011h(parcel, readInt);
                    break;
                case 7:
                    z = sed.m35006c(parcel, readInt);
                    break;
                case 8:
                    z2 = sed.m35006c(parcel, readInt);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new SyncPolicy(i, syncSubPolicy, syncSubPolicy2, syncSubPolicy3, syncSubPolicy4, num, z, z2);
    }
}
