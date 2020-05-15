package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.u2f.api.common.ChannelIdValue;

/* renamed from: xxx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xxx implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ChannelIdValue.ChannelIdValueType[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return ChannelIdValue.m23581a(parcel.readInt());
        } catch (xxy e) {
            throw new RuntimeException(e);
        }
    }
}
