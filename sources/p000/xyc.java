package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.u2f.api.common.ErrorCode;

/* renamed from: xyc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xyc implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ErrorCode[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ErrorCode.m23582a(parcel.readInt());
    }
}
