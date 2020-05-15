package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;

/* renamed from: xov */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xov implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AttestationConveyancePreference[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return AttestationConveyancePreference.m23444a(parcel.readString());
        } catch (xow e) {
            throw new RuntimeException(e);
        }
    }
}
