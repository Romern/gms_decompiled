package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.u2f.api.StateUpdate;

/* renamed from: xxn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xxn implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new StateUpdate.Type[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return StateUpdate.Type.m23569a(parcel.readString());
        } catch (xxo e) {
            throw new RuntimeException(e);
        }
    }
}
