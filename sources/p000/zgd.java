package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.result.SyncInfoResult;

/* renamed from: zgd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zgd implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SyncInfoResult[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        Status status = null;
        long j = 0;
        Boolean bool = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                status = (Status) sed.m34998a(parcel, readInt, Status.CREATOR);
            } else if (a == 2) {
                j = sed.m35012i(parcel, readInt);
            } else if (a != 3) {
                sed.m35002b(parcel, readInt);
            } else {
                bool = sed.m35007d(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new SyncInfoResult(status, j, bool);
    }
}
