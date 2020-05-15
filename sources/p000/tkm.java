package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.contextmanager.fence.internal.FenceQueryRequestImpl;

/* renamed from: tkm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tkm implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new FenceQueryRequestImpl[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        FenceQueryRequestImpl.QueryFenceOperation queryFenceOperation = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (sed.m34995a(readInt) != 2) {
                sed.m35002b(parcel, readInt);
            } else {
                queryFenceOperation = (FenceQueryRequestImpl.QueryFenceOperation) sed.m34998a(parcel, readInt, FenceQueryRequestImpl.QueryFenceOperation.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new FenceQueryRequestImpl(queryFenceOperation);
    }
}
