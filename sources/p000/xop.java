package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.StateUpdate;

/* renamed from: xop */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xop implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new StateUpdate.Type[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return StateUpdate.Type.m23442a(parcel.readString());
        } catch (xoq e) {
            throw new IllegalArgumentException(e);
        }
    }
}
