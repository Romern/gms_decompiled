package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.config.internal.FetchConfigIpcResponse;

/* renamed from: swv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class swv implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new FetchConfigIpcResponse[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        DataHolder dataHolder = null;
        DataHolder dataHolder2 = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                i = sed.m35010g(parcel, readInt);
            } else if (a == 3) {
                dataHolder = (DataHolder) sed.m34998a(parcel, readInt, DataHolder.CREATOR);
            } else if (a == 4) {
                j = sed.m35012i(parcel, readInt);
            } else if (a != 5) {
                sed.m35002b(parcel, readInt);
            } else {
                dataHolder2 = (DataHolder) sed.m34998a(parcel, readInt, DataHolder.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new FetchConfigIpcResponse(i, dataHolder, j, dataHolder2);
    }
}
