package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mdisync.SyncOptions;
import com.google.android.gms.mdisync.internal.SyncRequest;

/* renamed from: afvr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afvr implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SyncRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        byte[] bArr = null;
        SyncOptions syncOptions = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                i = sed.m35010g(parcel, readInt);
            } else if (a == 2) {
                bArr = sed.m35023t(parcel, readInt);
            } else if (a != 3) {
                sed.m35002b(parcel, readInt);
            } else {
                syncOptions = (SyncOptions) sed.m34998a(parcel, readInt, SyncOptions.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new SyncRequest(i, bArr, syncOptions);
    }
}
