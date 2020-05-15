package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mdisync.internal.SyncRequest;
import com.google.android.gms.mdisync.internal.TeleportingSyncRequest;

/* renamed from: afvu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afvu implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new TeleportingSyncRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        SyncRequest syncRequest = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (sed.m34995a(readInt) != 1) {
                sed.m35002b(parcel, readInt);
            } else {
                syncRequest = (SyncRequest) sed.m34998a(parcel, readInt, SyncRequest.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new TeleportingSyncRequest(syncRequest);
    }
}
