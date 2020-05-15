package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationRequirement;

/* renamed from: xqq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xqq implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new UserVerificationRequirement[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return UserVerificationRequirement.m23501a(parcel.readString());
        } catch (xqr e) {
            throw new RuntimeException(e);
        }
    }
}
