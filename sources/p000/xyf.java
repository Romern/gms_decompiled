package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.u2f.api.common.ProtocolVersion;

/* renamed from: xyf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xyf implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ProtocolVersion[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return ProtocolVersion.m23585a(parcel.readString());
        } catch (xyg e) {
            throw new RuntimeException(e);
        }
    }
}
